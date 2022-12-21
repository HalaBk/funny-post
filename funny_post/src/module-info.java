module funny_post {
	requires javafx.controls;
	requires java.sql;
	requires java.desktop;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
}
