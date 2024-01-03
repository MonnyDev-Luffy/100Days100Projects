package com.example.dday4;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Application extends javafx.application.Application{

    @Override
    public void start(Stage stage) throws IOException{

        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("images/binary_icon.png")));
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 615, 248);

        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        stage.getIcons().add(icon);
        stage.setTitle("D–DAY.4");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}