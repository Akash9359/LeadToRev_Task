Proper Documentation of API's Endpoint


Add Product -> Request : ->Method : POST ->Endpoint : '/product'

->Request Body :

{ "name": "string", "description": "string", "price": "number", "categories": ["string"], "attributes": [{"key": "string", "value": "string"}], "availability": {"inStock": "boolean", "quantity": "number"}, "ratings": [{"userId": "string", "rating": "number", "comment": "string"}] }


-> Response :
->Status Code: 201 Created
->Response Body: The created product object



Retrieve All Products ->Request : ->Method : GET ->Endpoint : '/product'
-> Query Parameter :
1. 'page': Page number (optional, default is 0)
2. 'size' : Number of items per page (optional, default is 10)
3. 'sortBy' : Field to sort by (optional, default is "name")


-> Response :
-> Status Code: 200 OK
-> Response Body: Array of product objects or paginated list of product objects

Retrieve a Product by ID
-> Request :
-> Method : GET -> Endpoint: '/products/{id}'


-> Response :
-> Status Code: 200 OK -> Response Body: The requested product object



Update a Product
-> Request: -> Method: PUT -> Endpoint: /products/{id} -> Request Body:

{ "name": "string", "description": "string", "price": "number", "categories": ["string"], "attributes": [{"key": "string", "value": "string"}], "availability": {"inStock": "boolean", "quantity": "number"}, "ratings": [{"userId": "string", "rating": "number", "comment": "string"}] }

-> Response: ->Status Code: 200 OK -> Response Body: The updated product object





5.Delete Product : -> Request:
-> Method: DELETE -> Endpoint: '/products/{id}'
-> Response:
-> Status Code: 204 No Content




6.Search Products : -> Request:
->Method: GET -> Endpoint: /products/search -> Query Parameters:
->name: Search by product name (optional)
->category: Search by category (optional)
->attribute: Search by attribute key-value pair (optional)


-> Response : -> Status Code: 200 OK -> Response Body: Array of product objects matching the search criteria



Rate a Product
-> Request:
-> Method: PUT -> Endpoint: /products/{id}/rate

-> Request Body:
{ "userId": "string", "rating": "number", "comment": "string" }


-> Response:
-> Status Code: 200 OK -> Response Body: The updated product object

