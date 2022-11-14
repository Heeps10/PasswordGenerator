package com.example.newproject4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class PasswordGenerator extends Application {
    Stage window;
    Button button;
    Button encryptButton;
    Scene scene;
    Label passLength;
    Label passwordText;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //create window
        window = stage;
        window.setTitle("Project4");

        //labels
        passLength = new Label("Password Length:");
        passwordText = new Label("Password:");

        //create textfield and button
        TextField Length = new TextField();
        TextField output = new TextField();
        button = new Button("Generate");
        encryptButton = new Button("Encrypt Password");

        //what happens when button is pressed
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Generator generator = new Generator(Length.getText());
                generator.Generate();
                output.setText(generator.getPassword());
            }
        });

        encryptButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Security security = new Security(output.getText());
                output.setText(security.Encryption());
            }
        });

        //how the layout looks
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(passLength, Length, passwordText, output, button, encryptButton);
        //creating the scene
        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
}
