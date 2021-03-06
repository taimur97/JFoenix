package demos.components;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;

import de.jensd.fx.fontawesome.AwesomeIcon;
import de.jensd.fx.fontawesome.Icon;

public class TextFieldDemo extends Application {

	private VBox pane;
	
	@Override
	public void start(Stage stage) throws Exception {

		pane = new VBox();
		pane.setSpacing(30);
		pane.setStyle("-fx-background-color:WHITE;-fx-padding:40;");
		
		pane.getChildren().add(new TextField());
		
		JFXTextField field = new JFXTextField();
		field.setPromptText("Type Something");
		pane.getChildren().add(field);
		
		
		JFXTextField disabledField = new JFXTextField();
		disabledField.setPromptText("I'm disabled..");
		disabledField.setDisable(true);
		pane.getChildren().add(disabledField);
		
		
		JFXTextField validationField = new JFXTextField();
		validationField.setPromptText("With Validation..");
		RequiredFieldValidator validator = new RequiredFieldValidator();
		validator.setMessage("Input Required");
		validator.setAwsomeIcon(new Icon(AwesomeIcon.WARNING,"2em",";","error"));
		
		validationField.getValidators().add(validator);
		validationField.focusedProperty().addListener((o,oldVal,newVal)->{
			if(!newVal) validationField.validate();
		});
		pane.getChildren().add(validationField);
		
		
		final Scene scene = new Scene(pane, 600, 400, Color.WHITE);
		scene.getStylesheets().add(TextFieldDemo.class.getResource("/resources/css/jfoenix-components.css").toExternalForm());
		stage.setTitle("JFX TextField Demo ");
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();

	}
	public static void main(String[] args) { launch(args); }





}
