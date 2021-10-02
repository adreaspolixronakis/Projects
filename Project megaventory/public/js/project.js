/*function add(){
    var j=0;
    let title = document.getElementById('title').value;
    let apikey=document.getElementById('apikey').value;
    var url1="https://api.megaventory.com/v2017a/json/reply/".concat(title+"?")
    var url2=url1.concat("APIKEY="+apikey)
    let myHeaders=new Headers();
    console.log(url2)
    myHeaders.append('Accept','application/json')
    let init={
        method:"POST",
        headers:myHeaders
    }
    fetch(url2,{mode:"no-cors"},init)
     .then((data) => { 
         console.log(data) 
     })
     .catch(error =>{
        console.log(error)
    })
    return false;
}*/
function add(){
    let apikey=document.getElementById('apikey').value;
    var url="https://api.megaventory.com/v2017a/json/reply/ProductGet?APIKEY=".concat(apikey)
    let myHeaders=new Headers();
    myHeaders.append('Accept','application/json')
    let init={
        method:"POST",
        headers:myHeaders
    }
    fetch(url,{mode:"no-cors"},init)
     .then((data) => { 
         console.log(data) 
     })
     .catch(error =>{
        console.log(error)
    })
    url="https://api.megaventory.com/v2017a/json/reply/SupplierClientGet?APIKEY=".concat(apikey)
    fetch(url,{mode:"no-cors"},init)
     .then((data) => { 
         console.log(data) 
     })
     .catch(error =>{
        console.log(error)
    })
    url="https://api.megaventory.com/v2017a/json/reply/InventoryLocationGet?APIKEY=".concat(apikey)
    fetch(url,{mode:"no-cors"},init)
     .then((data) => { 
         console.log(data) 
     })
     .catch(error =>{
        console.log(error)
    })
    url="https://api.megaventory.com/v2017a/json/reply/TaxGet?APIKEY=".concat(apikey)
    fetch(url,{mode:"no-cors"},init)
     .then((data) => { 
         console.log(data) 
     })
     .catch(error =>{
        console.log(error)
    })
    url="https://api.megaventory.com/v2017a/json/reply/DiscountGet?APIKEY=".concat(apikey)
    fetch(url,{mode:"no-cors"},init)
     .then((data) => { 
         console.log(data) 
     })
     .catch(error =>{
        console.log(error)
    })
    url="https://api.megaventory.com/v2017a/json/reply/SalesOrderGet?APIKEY=".concat(apikey)
    fetch(url,{mode:"no-cors"},init)
     .then((data) => { 
         console.log(data) 
     })
     .catch(error =>{
        console.log(error)
    })


    

}



function insertProduct(){
    var url="https://api.megaventory.com/v2017a/Product/ProductUpdate"
    const insertproduct='{"APIKEY":"157252e716af708c@m126669", "mvProduct": {"ProductID":"1112256", "ProductDescription":"Nike shoes", "ProductSellingPrice":99.99 ,"ProductPurchasePrice": 44.99}, "mvRecordAction": "Insert"}' 
    const objjson=JSON.parse(insertproduct)
    const options={
        method:'POST',
        headers:{"Content-Type":"application/json"},
        body:objjson
    }
    fetch(url,{mode:"no-cors"},options)
    .then(response => {
        console.log(response)
    })
    .catch(error =>{
        console.log(error)
    })
}

function insertClient(){
    var url="https://api.megaventory.com/v2017a/SupplierClient/SupplierClientUpdate "
    const client='{"APIKEY": "157252e716af708c@m126669", "mvSupplierClient": {"SupplierClientEmail": "babis@exampletest.com ","SupplierClientName": "babis","SupplierClientShippingAddress1":"Example 8, Athens ","SupplierClientPhone1":"1235698967" },"mvRecordAction": "Insert"}'
    const objjsonclient= JSON.parse(client)
    const options={
        method:'POST',
        headers:{"Content-Type":"application/json"},
        body:objjsonclient
    }
    fetch(url,{mode:"no-cors"},options)
    .then(response => {
       console.log(response)
    })
    .catch(error =>{
        console.log(error)
    })
    

}

function insertLocation(){
    var url="https://api.megaventory.com/v2017a/InventoryLocation/InventoryLocationUpdate"
    const location1='{"APIKEY": "157252e716af708c@m126669","mvInventoryLocation ": {  "InventoryLocationAbbreviation ":"Test","InventoryLocationName": "Test Project Location", "InventoryLocationAddress": "Example 20, Athens" }, "mvRecordAction": "Insert"}'
    const objjsonlocation=JSON.parse(location1)
    const options={
        method:'POST',
        headers:{"Content-Type":"application/json"},
        body:objjsonlocation
    }
    fetch(url,{mode:"no-cors"},options)
    .then(response => {
      console.log(response)
    })
    .catch(error =>{
        console.log(error)
    })
    

}

function insertTax(){
    var url="https://api.megaventory.com/v2017a/Tax/TaxUpdate"
    const tax='{"APIKEY": "157252e716af708c@m126669","mvTax":{"TaxName ":"VAT","TaxDescription": "VAT GR","TaxValue": "0.24"}, "mvRecordAction": "Insert"}'
    const objjsontax=JSON.parse(tax)
    const options={
        method:'POST',
        headers:{"Content-Type":"application/json"},
        body:objjsontax
    }
    fetch(url,{mode:"no-cors"},options)
    .then(response => {
        console.log(response)
    })
    .catch(error =>{
        console.log(error)
    })
    

}

function insertDiscount(){
    var url="https://api.megaventory.com/v2017a/Discount/DiscountUpdate"
    const discount='{"APIKEY": "157252e716af708c@m126669","mvDiscount":{ "DiscountName":"Loyalty","DiscountDescription":"Loyalty Customer Discount","DiscountValue": "0.50"},"mvRecordAction": "Insert"}'
    const objjsondiscount=JSON.parse(discount)
    const options={
        method:'POST',
        headers:{"Content-Type":"application/json"},
        body:objjsondiscount
    }
    fetch(url,{mode:"no-cors"},options)
    .then(response => {
       console.log(response)
    })
    .catch(error =>{
        console.log(error)
    })
    

}



function createOrder(){
    var url="https://api.megaventory.com/v2017a/SalesOrder/SalesOrderUpdate"
    var orderjson='{ "APIKEY": "157252e716af708c@m126669","mvSalesOrder": {"SalesOrderTypeId": "12312123421","SalesOrderClientName": "babis", "SalesOrderTypeDescription ":"Nike Shoes", "SalesOrderAmountSubtotalWithoutTaxAndDiscount":"99.99","SalesOrderTotalQuantity ":"49.99", "SalesOrderAmountTotalDiscount":"0.50","SalesOrderAmountTotalTax ":"0.24","SalesOrderTypeAbbreviation":"Test""SalesOrderShippingAddress":"Example 8, Athens ""SalesOrderContactPerson":"1235698967"},"mvRecordAction": "Insert"}'
    const options={
        method:'POST',
        headers:{"Content-Type":"application/json"},
        body:orderjson
    }
    fetch(url,{mode:"no-cors"},options)
    .then(response => {
        console.log(response)
    })
    .catch(error =>{
        console.log(error)
    })


}
