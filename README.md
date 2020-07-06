# Project aims to implement secured REST API

**)Third commit
* add authentication and authorization filter

**)Second commit
* added service, dto and model

e.g., Request & Response 
Create user
POST
http://localhost:8080/users
Request Body:
{
    "firstName": "my first name",
    "lastName": "My last name",
    "emailId": "my email id",
    "password": "password"
}
Response:
{
    "userId": "user id",
    "firstName": "First name",
    "lastName": "Last name",
    "emailId": "Email Id"
}

**) First commit <commit 51cc8b3fb6470cddb3f56a1bb9addb8122eb820a>
* simple spring boot REST API with GET, POST, PUT & DELETE

#API calls
 curl -H "Content-Type: application/json" -XPOST -d '{"firstName": "my first name", "lastName": "My last name", "emailId": "my email id", "password": "password"}' http://localhost:8080/users

