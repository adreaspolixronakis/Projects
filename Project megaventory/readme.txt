PROJECT:

During this project i got familiar with the NODE.JS which is used for server-side programming.All the project is running at localohost:8080 and the code that i used to built it
you can see it at index.js.

At the first part,in order to integrate the entities my thought was to create a function and then using the fetch in order to do a http post request to the link was given.
The same methodology i used and for the other entities(SupplierClient,InventoryLocation etc).Another idea was to built the link according to user requirmnents.For example,
if user wants to integrate Product he can easily type ("ProductGet") and with the function that i have in comments can have the same result.In this function,the reason i tried to built the link,
was because i thought it is easier in debugging.Lastly,the role of concat is to add the parameter that is given to the end of the string.

In the second part of the project,in order to insert Product,Client,InventoryLocation,Tax,Discount i created a different function for each one.In each function i used the fetch in order to do
an http post request to the appropriate link.It worths to be mentioned that with the post request a payload should be included.Thats why i created a json file for each entity(insertproduct etc).The command JSON.parse is converting a json object in text format to 
a javascript object so as we can handle it to the program.
The way now that this json file is passed as a parameter to the post request is presented below with the following commands:
	objjson=JSON.parse(insertproduct)
    const options={
        method:'POST',
        headers:{"Content-Type":"application/json"},
        body:objjson
    }
insertproduct is the json file i want to pass as a parameter.
objjson is the json object that is created.
body:objjson:With this command the json object is passed as a parameter to the request.

Lastly with the command:(fetch(url,{mode:"no-cors"},options)) a post request is happening to the url that is given each time,using as a parameter of the request the variable "options".

The same methodology i followed and for the other entities.

In the third part of the project in order to create a Sales order with the entities that i inserted in the second part i created a function.
In this function i used a json file in order to create the request Sales order with the appropriate entities.
Then this file,is passed as a parameter to the body of the http post request with the same way as the previous part of the project.


During this project I got acquainted with the programming languages javascript and for the server-side programming with the Node.js.
As you can see from my CV and my github account,during my studies i was busy with a project that these programming languages were 
necessary so i had already a basic knowledge on them and they were not completely unknown to me.


