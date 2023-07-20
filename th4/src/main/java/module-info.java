module com.example.th4 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.th4 to javafx.fxml;
    exports com.example.th4;
}