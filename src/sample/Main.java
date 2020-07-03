package sample;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane root = new StackPane();

        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setWidth(screenBounds.getWidth()/2);
        primaryStage.setHeight(screenBounds.getHeight()/2);
        primaryStage.setTitle("JavaFX_TestApp");

        Scene scene = new Scene(root);

//        try {
//            scene.getStylesheets().add
//                    (SearchUI.class.getResource("../resources/css/SearchUI.css").toExternalForm());
//        }
//        catch (NullPointerException ex) {
//            System.out.println("Path to resources is invalid.");
//            System.out.println(ex);
//        }

        primaryStage.setScene(scene);

        SearchUI searchPage = new SearchUI();
        HBox hbox = searchPage.alignPageElements();
        searchPage.addActions();

        root.getChildren().add(hbox);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
