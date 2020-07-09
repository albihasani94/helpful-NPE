# Helpful NPE

JEP 358: https://openjdk.java.net/jeps/358.

Use flag `-XX:+ShowCodeDetailsInExceptionMessages`.

Requires JDK 14.

```bash
javac -d classes src/com/albi/helpful/npe/App.java

jar --create --file=target/helpful-npe.jar --main-class=com.albi.helpful.npe.App -C classes .

java -XX:+ShowCodeDetailsInExceptionMessages -jar target/helpful-npe.jar
```

Alternatively, skipping the jar part: `java -XX:+ShowCodeDetailsInExceptionMessages -cp classes/ com/albi/helpful/npe/App`

