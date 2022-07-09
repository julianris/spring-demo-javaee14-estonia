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