#!/bin/bash

mvn clean package

exec "$@"
