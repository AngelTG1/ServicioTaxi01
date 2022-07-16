module com.example.serviciotaxi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.serviciotaxi to javafx.fxml;
    exports com.example.serviciotaxi;
    exports com.example.serviciotaxi.controllers;
    opens com.example.serviciotaxi.controllers to javafx.fxml;
}