module com.curso {
    requires transitive javafx.controls;
    requires transitive javafx.fxml;
    requires java.sql;

    opens com.curso.controller to javafx.fxml;
    opens com.curso to javafx.fxml;

    exports com.curso;
}
