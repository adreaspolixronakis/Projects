package com.example.project4;

import java.sql.Date;
import java.sql.Timestamp;

public class Record {
    private int user_id;
    private String username;
    private String password;
    private String role;
    private boolean enabled;
    private int failed_attempt;
    private boolean account_non_locked;
    private Date lock_time;
    private Timestamp registration_time;

    public Record(int user_id,String username,String password,String role,boolean enabled,int failed_attempt,boolean account_non_locked,Date lock_time,Timestamp registration_time ) {
        this.user_id = user_id;
        this.username=username;
        this.password=password;
        this.role=role;
        this.enabled=enabled;
        this.failed_attempt=failed_attempt;
        this.account_non_locked=account_non_locked;
        this.lock_time=lock_time;
        this.registration_time=registration_time;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getFailed_attempt() {
        return failed_attempt;
    }

    public void setFailed_attempt(int failed_attempt) {
        this.failed_attempt = failed_attempt;
    }

    public boolean isAccount_non_locked() {
        return account_non_locked;
    }

    public void setAccount_non_locked(boolean account_non_locked) {
        this.account_non_locked = account_non_locked;
    }


    public Date getLock_time() {
        return lock_time;
    }

    public void setLock_time(Date lock_time) {
        this.lock_time = lock_time;
    }

    public Timestamp getRegistration_time() {
        return registration_time;
    }

    public void setRegistration_time(Timestamp registration_time) {
        this.registration_time = registration_time;
    }

}
