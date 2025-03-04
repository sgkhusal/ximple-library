# Ximple Technical Challenge

## Running the project

- Requires docker installed
- To run the application:
```bash
 git clone https://github.com/sgkhusal/ximple-library.git
 cd ximple-library
 make run
```
Two containers will run, one with a postgress database and another with the library API in Java 21

API uses:
- Spring boot
- Maven

You can check API is running with a simple "hello" test:
`http://localhost:8080/api/hello`

To see API logs:
```bash
 make logs
```

To stop the application:
```bash
 make stop
```

To delete application containers:
```bash
 make down
```

To delete application volumes and images:
```bash
 make clean
```


## API Development
My experience in back-end development is with Django framework. So this is my first time developing an API with Java. I encountered some obstacles, so the application has not been finalized. Here is what I have done so far:
- I beggin creating the models diagram. Go to `documentation` folder to see it. `library.md` file considers a scope of n libraries. I reduced it to the `simple_library.md` diagram to simplify implementation based on challenge requirements and considering that the API will attend only one library.
- Second step was to create the database and API containers. API container is based on `openjdk:21-jdk-slim` docker image and has `maven` also installed. The command `make run` builds the containers and initializes them. My goal was to ensure that the application can be runned for anyone with Docker installed.
- I created the model classes based on the diagram class
- I implemented repositories and controllers for Author, Publisher, Book models

Next steps should be:
- make model Book endpoints work and respective tests, create tables on DB
- implements remaining endpoints and respective tests, create tables on DB
- implements library management system logics and respective tests

During the API development, I realized that Spring Boot has the H2 dependency that helps for database tests. I added this dependency but didn't decide yet if the `postgress` container that I have created is still necessary for this challenge scope. Since I could not implement the H2 tests, I decided to keep both.

H2 console is available at `http://localhost:8080/h2-console`, but tables are not created yet.
