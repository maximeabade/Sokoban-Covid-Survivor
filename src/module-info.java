module com.sokoban {
	requires javafx.controls;
	requires transitive javafx.graphics;
	requires transitive javafx.base;
	requires javafx.fxml;
	requires java.sql;
	
	opens com.sokoban to javafx.fxml;
	opens com.sokoban.app to javafx.fxml;
	exports com.sokoban to javafx.graphics;
	exports com.sokoban.app to javafx.graphics;
}