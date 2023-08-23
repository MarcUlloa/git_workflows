module com.example.gitworflows {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitworflows to javafx.fxml;
    exports com.example.gitworflows;
}