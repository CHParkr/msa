# jdk 실행환경
FROM openjdk:18-jdk-alpine AS builder

# 파일복사
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src

RUN rm src/main/resources/bootstrap.yml
RUN mv src/main/resources/bootstrap-docker.yml src/main/resources/bootstrap.yml

# 권한부여
RUN chmod +x ./gradlew

# 리눅스 명령어로 실행(윈도우 환경에서 docker 돌리는 경우 필수!)
RUN dos2unix ./gradlew

# 프로젝트가 이미지안에서 build 되면서 배포자료 생성
RUN ./gradlew bootJAR



# jdk 실행환경
FROM openjdk:18-jdk-alpine
# home 경로 지정
WORKDIR /app

# 파일복사
COPY --from=builder build/libs/*.jar /app/app.jar

# 이미지에서 노출될 포트지정
EXPOSE 8900

# 컨테이너가 실행될 때 무조건 실행해야되는 명령어 지정
ENTRYPOINT ["java", "-jar", "app.jar"]