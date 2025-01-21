# General

Jankenpo game in Java with the Spring Framework


# Demonstration

[Video about the game](https://youtu.be/kTu_cY9_jt4)


# Attention

**Please pay attention if the port 8080 is free**


# Java versions

With these Java versions:

- **8 (or 1.8)**: **not** working;
- **17**: working;
- **21**: working.


# Changing Java versions

I used **in Linux Mint 20** the command:

```
sudo update-java-alternatives <java-path>
```

Example:

```
sudo update-java-alternatives /usr/lib/jvm/java-1.17.0-openjdk-amd64
```

To see all Java versions amd its paths to use:

```
sudo update-java-alternatives --list
```

# Running the app

```
mvn spring-boot:run
```