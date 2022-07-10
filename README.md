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

### REST API
- for exchanging data - JSON/XML
- for sharing resources
- CRUD - Create Read Update Delete
- Reservation - it's a resource
- resources should be plural

- IMPORTANT: third proposal - REST principles for good naming of resources
  - /reservations - GET - for Reading (R from CRUD)
  - /reservations/{id} - GET- for Reading for one resource (R from CRUD)
  - /reservations - POST - for Creation (C from CRUD)
  - /reservations/{id} (/reservations/13454455) - DELETE - for Deletion (D from CRUD)
  - /reservations/{id} (/reservations/13454455) - PUT - for Update (full) (U from CRUD)
  - /reservations/{id} (/reservations/13454455) - PATCH - for Update (partial) (U from CRUD)