module com.curso {
    requires transitive javafx.controls;
    requires transitive javafx.fxml;

    opens com.curso to javafx.fxml;

    exports com.curso;
}
