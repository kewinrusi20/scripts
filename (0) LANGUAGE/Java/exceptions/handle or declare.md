There are 2 waves to react to `Exceptions` (not `Errors` or `RunTimeExceptions`):
- Handle (`try` & `catch`)
- Declare (`throws`)

# Example (Handle or Declare)
```java
public void openFile(String dateiName) throws IOException, FileNotFoundException {
    // Datei öffnen
}

public void datenSchreiben(String dateiName, String sqlStatement)
        throws FileNotFoundException, IOException, SQLException {
    openFile(dateiName);
    // Mit Datenbank arbeiten
}

public void dateiAnlegen(String dateiName) throws FileNotFoundException, IOException {
    try {
        datenSchreiben(dateiName, "SELECT * FROM x");
    } catch (SQLException ex) {
        // Datenbank Problem beheben ;-)
    }
}
```

```java
public void userInterface() {

    String dateiName = askUser();
	
    try {
        dateiAnlegen(dateiName);
    } catch (FileNotFoundException ex) {
        // Benutzer erneut nach Dateinamen Fragen
    } catch (IOException ex) {
        // Benutzer auf Problem hinweisen
    }
}
```
