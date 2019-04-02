
package com.room.controller.main;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource("/com/room/views/Reference.fxml"));
        Scene temp = new Scene(root);
        primaryStage.setScene(temp);
        primaryStage.show();
        
        FadeTransition transition = new FadeTransition(Duration.millis(3000), root);
        transition.setFromValue(0);
        transition.setToValue(1);
        transition.play();
        
        RotateTransition transition1 = new RotateTransition(Duration.millis(2500), root);
        transition1.setFromAngle(0);
        transition1.setToAngle(360);
        transition1.play();
    }
}
