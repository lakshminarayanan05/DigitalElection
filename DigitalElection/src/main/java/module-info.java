module com.example.digitalelection {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.javadoc;
    requires java.sql;


    opens com.example.digitalelection to javafx.fxml;
    exports com.example.digitalelection;
}