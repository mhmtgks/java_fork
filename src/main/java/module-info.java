module com.example.java_fork_proje {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_fork_proje to javafx.fxml;
    exports com.example.java_fork_proje;
}