PROJECT_FILE = ./docker-compose.yml
PROJECT_NAME = ximple_library
API_CONTAINER = ximple-library-back
DB_CONTAINER = ximple-library-db


up:
	docker-compose -f $(PROJECT_FILE) --project-name $(PROJECT_NAME) up -d

stop:
	docker-compose -f $(PROJECT_FILE) --project-name $(PROJECT_NAME) stop

build:
	docker-compose -f $(PROJECT_FILE) --project-name $(PROJECT_NAME) up --build

down:
	docker-compose -f $(PROJECT_FILE) --project-name $(PROJECT_NAME) down --remove-orphans

build-api:
	docker exec -it $(API_CONTAINER) bash -c "cd $(PROJECT_NAME) && mvn clean package" > build.log
	cat build.log | grep BUILD

run: up build-api
	docker exec -it $(API_CONTAINER) bash -c "java -jar target/$(PROJECT_NAME)-1.0-SNAPSHOT.jar"

api-bash:
	docker exec -it $(API_CONTAINER) bash

logs:
	docker logs -f $(API_CONTAINER)

db-logs:
	docker logs -f $(DB_CONTAINER)

clean: down
	docker volume prune

fclean:
	docker-compose -f $(PROJECT_FILE) --project-name $(PROJECT_NAME) down -v --remove-orphans

.PHONY: dump
