# Build

```bash
mvn clean install
```

This should build all maven modules and **java** modules.
Java modules are placed in **mods** directory.

To run them:
```
java -p mods -m zoo.visitor/zoo.visitor.Tourist

java -p mods -m zoo.tours.hybrid/zoo.tours.hybrid.TourLengthCheck
```
