# Helpful NPE

JEP 358: https://openjdk.java.net/jeps/358.

Use flag `-XX:+ShowCodeDetailsInExceptionMessages`.

Requires JDK 14.

Compile

```bash
javac -d classes src/com/albi/helpful/npe/App.java
```

Run

```bash
java -XX:+ShowCodeDetailsInExceptionMessages -cp classes/ com/albi/helpful/npe/App
```

Alternatively, make a jar

```bash
mkdir target

jar --create --file=target/helpful-npe.jar --main-class=com.albi.helpful.npe.App -C classes .

java -XX:+ShowCodeDetailsInExceptionMessages -jar target/helpful-npe.jar
```

## Comparison

Before

```java
Exception in thread "main" java.lang.NullPointerException
	at com.albi.helpful.npe.App.printCharFromStringAt(App.java:16)
	at com.albi.helpful.npe.App.main(App.java:12)
```

After

```java
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "text" is null
	at com.albi.helpful.npe.App.printCharFromStringAt(App.java:16)
	at com.albi.helpful.npe.App.main(App.java:12)
```
