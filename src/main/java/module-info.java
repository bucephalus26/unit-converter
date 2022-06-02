module com.unitconverter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.unitconverter to javafx.fxml;
    exports com.unitconverter;
}