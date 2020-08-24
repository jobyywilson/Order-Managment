# REST API's

## Get all orders

### Request

`GET http://localhost:8080/order/`


### Response
    [
       {
          "customerName":"John",
          "shippingAddress":"Hello World",
          "orderItemDTO":[
             {
                "productCode":"ABC",
                "productName":"HEllo Worlf",
                "quantity":8,
                "orderId":12
             },
             {
                "productCode":"ABC",
                "productName":"HEllo Worlf",
                "quantity":8,
                "orderId":12
             }
          ]
       },
       {
          "customerName":"John",
          "shippingAddress":"Hello World",
          "orderItemDTO":[

          ]
       }
    ]
