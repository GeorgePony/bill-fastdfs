FROM docker.io/errordeveloper/oracle-jdk
MAINTAINER chenzhangchao George_SDK@163.com
RUN mkdir -p /var/fastdfs \
 && ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
 && echo "Asia/Shanghai" > /etc/timezone
COPY target/*.jar /var/fastdfs/app.jar
WORKDIR /var/fastdfs
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8172:8172