#!/bin/sh
mvn clean package && docker build -t com.javaprogramtto/corejav .
docker rm -f corejav || true && docker run -d -p 8080:8080 -p 4848:4848 --name corejav com.javaprogramtto/corejav 
