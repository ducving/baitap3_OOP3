module com.example.th3 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.th3 to javafx.fxml;
    exports com.example.th3;
}