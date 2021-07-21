package com.example.project4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;


@Service
@Transactional
public class UserServices {

    public static final int MAX_FAILED_ATTEMPTS = 3;

    private static final long LOCK_TIME_DURATION = 5 * 60 * 1000; // 5 munutes

    private static final long CHANGE_PASSWORD_DURATION=5 * 60 * 1000;

    private static final long CHANGE_TIME_DURATION=3*60*1000;

    @Autowired
    private UserRepository repo;


    public User getByUsername(String username) {
        return repo.getUserByUsername(username);

    }

    public void increaseFailedAttempts(User user) {
        int newFailAttempts = user.getFailedAttempt() + 1;
        repo.updateFailedAttempts(newFailAttempts, user.getUsername());
    }

    public void resetFailedAttempts(String email) {
        repo.updateFailedAttempts(0, email);
    }

    public void lock(User user) {
        user.setAccountNonLocked(false);
        user.setLockTime(new Date());


        repo.save(user);
    }

    public boolean unlockWhenTimeExpired(User user) {
        long lockTimeInMillis = user.getLockTime().getTime();
        long currentTimeInMillis = System.currentTimeMillis();

        if (lockTimeInMillis + LOCK_TIME_DURATION < currentTimeInMillis) {
            user.setAccountNonLocked(true);
            user.setLockTime(null);
            user.setFailedAttempt(0);

            repo.save(user);

            return true;
        }

        return false;
    }

    public boolean changePassword(User user){
        long lockTimeInMillis = user.getRegistrationTime().getTime();
        long currentTimeInMillis = System.currentTimeMillis();

        if (lockTimeInMillis + CHANGE_PASSWORD_DURATION < currentTimeInMillis) {

            repo.save(user);
            return true;
        }

        return false;
    }


}
