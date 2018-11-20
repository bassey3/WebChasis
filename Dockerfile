FROM java:8 
LABEL maintainer="bassey3@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp


WORKDIR /


# Adding source, compile and package into a fat jar
ADD /target/WebChasis-0.0.1-SNAPSHOT.jar


EXPOSE 8092
CMD ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-jar", "WebChasis-0.0.1-SNAPSHOT.jar"]