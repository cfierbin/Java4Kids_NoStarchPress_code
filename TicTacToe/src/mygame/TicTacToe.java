package mygame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TicTacToe extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("D:\\Java4Kids_NoStarchPress_code\\TicTacToe\\src\\resources\\tictactoe.fxml"));
        //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("D:\\Java4Kids_NoStarchPress_code\\TicTacToe\\src\\resources\\tictactoe.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("tictactoe.fxml"));
        primaryStage.setTitle("TicTacToe");
        Scene scene = new Scene(root, 300, 275);
        scene.getStylesheets().add(getClass()
                .getResource("tictactoe.css").toExternalForm());
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
