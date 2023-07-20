module com.example.th6 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.th6 to javafx.fxml;
    exports com.example.th6;
}