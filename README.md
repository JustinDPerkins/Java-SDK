# Java-SDK

## Tested on a AWS Amazon Linux 2 (AL2)

### Prereq setup
```
sudo yum update -y
sudo yum install -y java-17-amazon-corretto
sudo yum install -y java-17-amazon-corretto-devel
sudo yum install -y maven
```

### 1. Downlaod the Trend SDK Jar from Maven Central, we will need to add this to local maven
```
cd ~
wget https://repo1.maven.org/maven2/com/trend/file-security-java-sdk/1.5.0/file-security-java-sdk-1.5.0.jar
```

Output:
```
sh-5.2$ cd ~
sh-5.2$ pwd
/home/ssm-user
sh-5.2$ ls
file-security-java-sdk-1.5.0.jar
```

### 2. To add the downloaded Jar to the local Maven run the below:

```
mvn install:install-file \
  -Dfile=./file-security-java-sdk-1.5.0.jar \
  -DgroupId=com.trend \
  -DartifactId=file-security-java-sdk \
  -Dversion=1.5.0 \
  -Dpackaging=jar
```

---

### 3. Now we can make a POM Dependencies for ourjava app.
```
mkdir trend-fs-test && cd trend-fs-test
nano pom.xml
```
- **Use the Provided pom.xml in this repo** 

---

### 4. Now lets make the Main.java app code
```
mkdir -p src/main/java
nano src/main/java/Main.java
```

- **Use the Provided Main.java in this repo**
- **You will need to replace the placeholder with an Actual Vision One API Key.**

output:
```
sh-5.2$ pwd
/home/ssm-user
sh-5.2$ ls
file-security-java-sdk-1.5.0.jar  trend-fs-test
sh-5.2$ cd trend-fs-test/
sh-5.2$ ls
hello.txt  pom.xml  src  target
sh-5.2$
```

---

### 5. Generate a Clean or Malicious Test file.
- Place the test file here:

```
trend-fs-test/hello.txt
```
### 6. Now compile:
```
cd trend-fs-test/
mvn clean compile
```

### 7. Run App:

```
mvn exec:java
```
