All The methods
1.Create a State in a Country:
2.Retrieve All States:
3.Retrieve a Specific State:
4.Update a State:
5.Delete a State:
6.Create a City in a State:
7.Retrieve All Cities:
8.Retrieve a Specific City:
9.Update a City:
10.Delete a City:

Create a Country:

Method: POST
URL: http://localhost:8080/countries
Headers:
bash
Copy code
Content-Type: application/json
Body (raw JSON):
json
Copy code
{
    "name": "Country Name"
}
Retrieve All Countries:

Method: GET
URL: http://localhost:8080/countries
Retrieve a Specific Country:

Method: GET
URL: http://localhost:8080/countries/{id}
Update a Country:

Method: PUT or PATCH
URL: http://localhost:8080/countries/{id}
Headers:
bash
Copy code
Content-Type: application/json
Body (raw JSON):
json
Copy code
{
    "name": "Updated Country Name"
}
Delete a Country:

Method: DELETE
URL: http://localhost:8080/countries/{id}
Create a State in a Country:

Method: POST
URL: http://localhost:8080/countries/{countryId}/states
Headers:
bash
Copy code
Content-Type: application/json
Body (raw JSON):
json
Copy code
{
    "name": "State Name"
}
Retrieve All States:

Method: GET
URL: http://localhost:8080/states
Retrieve a Specific State:

Method: GET
URL: http://localhost:8080/states/{id}
Update a State:

Method: PUT or PATCH
URL: http://localhost:8080/states/{id}
Headers:
bash
Copy code
Content-Type: application/json
Body (raw JSON):
json
Copy code
{
    "name": "Updated State Name"
}
Delete a State:

Method: DELETE
URL: http://localhost:8080/states/{id}
Create a City in a State:

Method: POST
URL: http://localhost:8080/states/{stateId}/cities
Headers:
bash
Copy code
Content-Type: application/json
Body (raw JSON):
json
Copy code
{
    "name": "City Name"
}
Retrieve All Cities:

Method: GET
URL: http://localhost:8080/cities
Retrieve a Specific City:

Method: GET
URL: http://localhost:8080/cities/{id}
Update a City:

Method: PUT or PATCH
URL: http://localhost:8080/cities/{id}
Headers:
bash
Copy code
Content-Type: application/json
Body (raw JSON):
json
Copy code
{
    "name": "Updated City Name"
}
Delete a City:

Method: DELETE
URL: http://localhost:8080/cities/{id}
