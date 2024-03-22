# Spending API
This project is a basic starter API written in Java Spring Boot. It is intended to provide access to USA spending data, allowing users to explore and analyze financial transactions made by the U.S. government.
This project is configured to interact with the public usaspending api. Documentation can be found at: https://api.usaspending.gov/docs/endpoints.
This project exposes Swagger so a user may easily discover and invoke endpoints. 

## Getting Started
To get started, all you need to do is run the following command:
```bash
./run.sh
```
This should build the docker image (if it doesn't exist), build the jar and start the containerized application. 
Once the application is running, you can access the Swagger UI at http://localhost:8080/swagger-ui/index.html.

## Some Ideas
* Look for TODOs remaining in this project
* Implement more of the functionality found in the USASpending API (https://api.usaspending.gov/docs/endpoints)
* Implement things like paging, sorting, ordering, filtering, etc.
* Ingest the data into a local database and provide a way to query it
