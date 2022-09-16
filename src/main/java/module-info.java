module com.ifg.controler {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ifg.controler to javafx.fxml;
    exports com.ifg.controler;
}