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

# build-api:
# 	docker exec -it $(API_CONTAINER) bash -c "mvn clean package" > build.log
# 	cat build.log | grep BUILD

run: up
# run: up build-api
# 	docker exec -it $(API_CONTAINER) bash -c "mvn spring-boot:run"

api-bash:
	docker exec -it $(API_CONTAINER) bash

logs:
	docker logs -f $(API_CONTAINER)

db-logs:
	docker logs -f $(DB_CONTAINER)

clean: down
	docker-compose -f $(PROJECT_FILE) --project-name $(PROJECT_NAME) down -v --remove-orphans
	docker rmi -f $(API_CONTAINER)

.PHONY: dump
