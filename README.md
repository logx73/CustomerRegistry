# CustomerRegistry

Customer Registry Application

#Technologies
Database: PostgreSQL
Backend: Spring boot, Spring Data JPA, Spring Validation.

#Steps to Run 
Step 1: Change datasource credentials in application.yaml as per your datasource credentials.

Step 2: Create a contract Type using saveContract API
{
    "id": 1,
    "name": "permanant"
}

Step 3: Use the following JSON to test CURD APIS for customer.

{
"name" : "Rakesh",
"details" :
    {
        "sex": "M",
        "date_of_birth": "2000-01-01",
        "native_place": "NYC"
    },
"accountType": "Bussiness",
"businessRequirments": [
    "abc",
    "def"
    ],
"contractType": {
    "id": 1
    }
}

Step 4: Test different scenarios by changing DOB and sex to
perform validation and exception handling.
