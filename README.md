# Java-SDK

```
sudo yum update -y
sudo yum install -y java-17-amazon-corretto
sudo yum install -y java-17-amazon-corretto-devel
sudo yum install -y maven
```
```
cd ~

wget https://repo1.maven.org/maven2/com/trend/file-security-java-sdk/1.5.0/file-security-java-sdk-1.5.0.jar
```

```
mvn install:install-file \
  -Dfile=./file-security-java-sdk-1.5.0.jar \
  -DgroupId=com.trend \
  -DartifactId=file-security-java-sdk \
  -Dversion=1.5.0 \
  -Dpackaging=jar
```

```
mkdir trend-fs-test && cd trend-fs-test
mkdir -p src/main/java
```

nano pom.xml

nano src/main/java/Main.java


Place the test file here:
trend-fs-test/hello.txt

mvn clean compile
mvn exec:java
