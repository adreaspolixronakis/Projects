const express = require('express')//eisagogi express module
const path = require('path')
const app = express()//dimiourgia express efarmogis
const port = 8080

app.listen(port)//ekkinisi efarmogis stin thira 8080

var options={
    root:path.join(__dirname, 'public')
}
/* 
    Serve static content from directory "public",
    it will be accessible under path /static, 
    e.g. http://localhost:8080/static/index.html
*/
app.use('/static', express.static(__dirname + '/public'))//exipiretisi statikoy periexomenou,to /static ->to prothema ton aitimaton gia statikous porous

// parse url-encoded content from body
app.use(express.urlencoded({ extended: false }))

// parse application/json content from body
app.use(express.json())

app.use(express.static(__dirname + '/public'));

// serve index.html as content root
app.get('/', function(req, res){
    
    var options = {
        root: path.join(__dirname, 'public')
    }

    res.sendFile('index.html', options, function(err){
        console.log(err)
    })
})
console.log('Server started! At http://localhost:' + port);