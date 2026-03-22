# General

Jankenpo game in Java with the Spring Framework


# Demonstration

[Video about the game](https://youtu.be/kTu_cY9_jt4)


# Attention

**Please pay attention. Please check if the port 8080 is free**


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

To see all Java versions and its paths to use:

```
sudo update-java-alternatives --list
```

# Maven

If you do not have Maven installed, please before trying to run this app, install Maven.

I used this command to install Maven on Xubuntu 22.04:

```sh
sudo apt install maven
```


# Running the app

```
mvn spring-boot:run
```


# Accessing the application

Ia a browser, pĺease access the address [http://127.0.0.1:8080](http://127.0.0.1:8080).
