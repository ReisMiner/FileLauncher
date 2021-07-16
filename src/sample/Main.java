package sample;

import javafx.application.Application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static sample.chooserController.path2;

public class Main extends Application {

    public static Stage primaryStage;
    public static Scene scene;
    public static Scene scene2;
    public static Scene scene3;
    public static FXMLLoader loader;
    public static FXMLLoader loader2;
    public static FXMLLoader loader3;
    public static FileChooser fileChooser = new FileChooser();


    @Override
    public void start(Stage primaryStage) {
        Main.primaryStage = primaryStage;
        mainWindow();
    }

    public void mainWindow() {
        try {
            loader = new FXMLLoader(Main.class.getResource("sample.fxml"));
            loader2 = new FXMLLoader(Main.class.getResource("next.fxml"));
            loader3 = new FXMLLoader(Main.class.getResource("name.fxml"));

            AnchorPane pane = loader.load();
            AnchorPane pane2 = loader2.load();
            AnchorPane pane3 = loader3.load();

            loginController loginController = loader.getController();
            chooserController chooserController = loader2.getController();
            loginController.setMain(this);

            scene = new Scene(pane);
            scene2 = new Scene(pane2);
            scene3 = new Scene(pane3);

            scene.getStylesheets().add("sample/style.css");

            primaryStage.setScene(scene);
            primaryStage.setTitle("Login - Controlpanel");
            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));

            primaryStage.show();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }


}

