module com.example.th5 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.th5 to javafx.fxml;
    exports com.example.th5;
}