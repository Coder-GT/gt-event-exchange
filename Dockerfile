FROM ${docker.registry.public}/oracle-jdk:1.8
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
WORKDIR /
COPY ${project.build.finalName}.jar ${project.artifactId}.jar
ENTRYPOINT ["java","-Duser.timezone=GMT+08", "-jar", "${project.artifactId}.jar"]