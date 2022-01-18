# Docker Important Commands

### Build Process
- First Add Dockerfile in root of your project

- `docker build -t 'any relevant tag name':'version'` 'path to Dockerfile'
> e.g. docker build -t spring-boot-app:0.0.1 .

- after building check docker image is generated
- `docker images`
> If you see image with your given tag image is generated.

- running local(that you generated recently) docker image in a container
- `docker run -d -p 'host port number':'container port number' 'image name':'version'`
> e.g. docker run -d -p 8081:8080 -t spring-boot-app:0.0.1

- open browser and check http://localhost:8081 is responding

### Pushing to docker hub

- Create you account on docker hub
- in the command prompt login to your account
- `docker login`

- create repository on docker hub (from browser ui)
- create required commands 
- `docker tag 'local-image:tagname' 'new-repo:tagname'`
- `docker push 'new-repo':'tagname'`
- > docker tag spring-boot-app:0.0.1 aniruddhakudalkar/spring-boot-app:0.0.1
- > docker push aniruddhakudalkar/spring-boot-app:0.0.1

