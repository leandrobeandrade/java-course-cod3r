module javafx {
	requires javafx.controls;
	requires javafx.fxml;
	requires org.controlsfx.controls;
	
	opens init;
	opens layout;
	opens fxml;
}