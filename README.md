## MVC pattern
- Model (data + operations on data)
- View (view presented to user)
- Controller (handling incoming requests and provides view for clients/users)

### Application architecture with MVC
- View
- Controller
- Model (Service + Repository)

### Application architecture with MVC - second view
- View presented to user
- Controller (should have reference to Service), handling incoming requests and provides view for clients/users
- Service (should have reference to Repository), processed data
- Repository, stores and provides access to data (eg. database)

### HTTP
Request consist of:
- url
- headers
- parameters
- body
Response consist of:
- status codes
- body
- cookies
- headers
 
Status codes:
- 1xx - confirmed - processing in progress
- 2xx - success
- 3xx - redirects
- 4xx - client fault
- 5xx - server fault

### REST API
- for exchanging data - JSON/XML
- for sharing resources
- CRUD - Create Read Update Delete
- Reservation - it's a resource
- resources should be plural

- IMPORTANT: third proposal - REST principles for good naming of resources
  - /reservations - GET - for Reading all resources (R from CRUD) 
  - status code 200
  - /reservations/{id} - GET- for Reading for one resource (R from CRUD)
  - status code 200 with response body if ok
  - status code 404 with no response body (or error object)
  - /reservations - POST - for Creation (C from CRUD)
  - /reservations/{id} (/reservations/13454455) - DELETE - for Deletion (D from CRUD)
  - /reservations/{id} (/reservations/13454455) - PUT - for Update (full) (U from CRUD)
  - /reservations/{id} (/reservations/13454455) - PATCH - for Update (partial) (U from CRUD)