/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxpbo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class JavaFXPBO extends Application {
  
    // launch the application
    @Override
    public void start(Stage s)
    {
        s.setTitle("creating buttons");
        Button btn = new Button("button");
  
        StackPane r = new StackPane();
        r.getChildren().add(btn);
  
        Scene sc = new Scene(r, 200, 200);
  
        s.setScene(sc);
  
        s.show();
    }
  
    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}
