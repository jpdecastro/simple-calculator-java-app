# Docker Commands
Some useful docker commands that can be used to kickstart a set of services or to check if everything is running as
planned

docker-compose ps -a
docker-compose up -d
docker-compose down

docker ps -a
docker image ls
docker volume ls
docker volume purge

docker exec -it [container] bash

# Install Maven on Jenkins docker image
We need to provide the Jenkins container with an installation of Maven so that it can build Java applications. There are
two options you can install Maven in a Docker container. One is to extend the base image and provide it with the commands,
the other option is to execute a set of commands in the Jenkins container like described below:

```shell script
$ docker exec -u root -it [container] bash
$ apt-get update & apt-get install
$ apt-get install maven -y
```
If your curious in the first option you can have a look at the provided Dockerfile. When you build and run that image
it will then create a Jenkins image with Maven included. In that case it is no longer needed to execute additional commands
to install Maven afterwards.