package sudoku;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
//-----------------------------------------------------------------

class game extends BorderPane {

    public game() {
        StackPane log = new StackPane();
        log.setPadding(new Insets(100, 150, 0, 150));
        Image logo = new Image("file:///D:/s1.jpg");
        ImageView v = new ImageView(logo);
        v.setImage(logo);
        v.setFitHeight(100);
        v.setFitWidth(200);
        this.setTop(log);
        log.getChildren().add(v);
//..............................................................
        VBox options1 = new VBox();
        options1.setAlignment(Pos.CENTER);
        this.setCenter(options1);
        options1.setSpacing(20);
        Button play = new Button("PLAY");
        play.setTextFill(Color.RED);
        play.setPrefSize(200, 20);
        play.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        play handler1 = new play();
        play.setOnAction(handler1);
        Button settings = new Button("SETTINGS");
        settings.setTextFill(Color.RED);
        settings.setPrefSize(200, 20);
        settings.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        Button exit = new Button("EXIT");
        exit.setTextFill(Color.RED);
        exit.setPrefSize(200, 20);
        exit.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        options1.getChildren().add(play);
        options1.getChildren().add(settings);
        options1.getChildren().add(exit);
//..............................................................
    }
}
//-----------------------------------------------------------------

class game1 extends BorderPane {

    public game1() {
        StackPane log = new StackPane();
        log.setPadding(new Insets(50, 150, 0, 150));
        Image logo = new Image("file:///D:/s1.jpg");
        ImageView v = new ImageView(logo);
        v.setImage(logo);
        v.setFitHeight(100);
        v.setFitWidth(200);
        this.setTop(log);
        log.getChildren().add(v);
//..............................................................
        VBox options2 = new VBox();
        this.setCenter(options2);
        options2.setSpacing(20);
        options2.setAlignment(Pos.CENTER);
        Button standard = new Button("STANDARD");
        standard.setTextFill(Color.RED);
        standard.setPrefSize(200, 20);
        standard.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        Button timetrial = new Button("TIME TRIAL");
        timetrial.setTextFill(Color.RED);
        timetrial.setPrefSize(200, 20);
        timetrial.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        Label lbl = new Label("Please Choose a Game Mode");
        lbl.setStyle("-fx-background-color:null;");
        lbl.setTextFill(Color.BLUE);
        lbl.setFont(Font.font("Times New Roman", FontWeight.BOLD, 25));
        options2.getChildren().add(lbl);
        options2.getChildren().add(standard);
        options2.getChildren().add(timetrial);
//..............................................................
        VBox back1 = new VBox();
        this.setBottom(back1);
        back1.setPadding(new Insets(0, 150, 100, 150));
        Button back = new Button("BACK");
        back.setTextFill(Color.RED);
        back.setPrefSize(200, 20);
        back.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        back1.getChildren().add(back);
//..............................................................        
    }
}
//-----------------------------------------------------------------

class game2 extends BorderPane {

    public game2() {
        StackPane log = new StackPane();
        log.setPadding(new Insets(50, 150, 0, 150));
        Image logo = new Image("file:///D:/s1.jpg");
        ImageView v = new ImageView(logo);
        v.setImage(logo);
        v.setFitHeight(100);
        v.setFitWidth(200);
        this.setTop(log);
        log.getChildren().add(v);
//..............................................................
        VBox options3 = new VBox();
        this.setCenter(options3);
        options3.setSpacing(10);
        options3.setAlignment(Pos.CENTER);
        Button easy = new Button("EASY");
        easy.setTextFill(Color.RED);
        easy.setPrefSize(200, 20);
        easy.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        Button medium = new Button("MEDIUM");
        medium.setTextFill(Color.RED);
        medium.setPrefSize(200, 20);
        medium.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        Button hard = new Button("HARD");
        hard.setTextFill(Color.RED);
        hard.setPrefSize(200, 20);
        hard.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        Label lbl = new Label("Please select the difficulty");
        lbl.setStyle("-fx-background-color:null;");
        lbl.setTextFill(Color.BLUE);
        lbl.setFont(Font.font("Times New Roman", FontWeight.BOLD, 25));
        options3.getChildren().add(lbl);
        options3.getChildren().add(easy);
        options3.getChildren().add(medium);
        options3.getChildren().add(hard);
//..............................................................
        VBox back1 = new VBox();
        this.setBottom(back1);
        back1.setPadding(new Insets(0, 150, 100, 150));
        //back1.setAlignment(Pos.CENTER);
        Button back = new Button("BACK");
        back.setTextFill(Color.RED);
        back.setPrefSize(200, 20);
        back.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        back1.getChildren().add(back);
//..............................................................
    }
}
//-----------------------------------------------------------------

class play implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent e) {
        System.out.println("start button clicked");
    }
}
//-----------------------------------------------------------------

class settings implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent e) {
        System.out.println("settings button clicked");
    }
}
//-----------------------------------------------------------------

class exit implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent e) {
        System.out.println("exit button clicked");
    }
}
//-----------------------------------------------------------------

class standard implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent e) {
        System.out.println("standard button clicked");
    }
}
//-----------------------------------------------------------------

class timetrial implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent e) {
        System.out.println("time trial button clicked");
    }
}
//-----------------------------------------------------------------

class back1 implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent e) {
        System.out.println("back1 button clicked");
    }
}
//-----------------------------------------------------------------

class easy implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent e) {
        System.out.println("easy button clicked");
    }
}
//-----------------------------------------------------------------

class medium implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent e) {
        System.out.println("medium button clicked");
    }
}
//-----------------------------------------------------------------

class hard implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent e) {
        System.out.println("hard button clicked");
    }
}
//-----------------------------------------------------------------

class back2 implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent e) {
        System.out.println("back2 button clicked");
    }
}
//-----------------------------------------------------------------

public class Sudoku extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        game gm = new game();
        game1 gm1 = new game1();
        game2 gm2 = new game2();
        Scene sc = new Scene(gm, 500, 500);
        Scene sc1 = new Scene(gm1, 500, 500);
        Scene sc2 = new Scene(gm2, 500, 500);
        primaryStage.setScene(sc);
        primaryStage.setTitle("Sudoku");
        primaryStage.sizeToScene();
        primaryStage.show();
        primaryStage.setResizable(true);
    }
//------------------------------------------------------------------    

    public static void main(String[] args) {
        System.out.println("Application:-");
        launch(args);

    }

}
