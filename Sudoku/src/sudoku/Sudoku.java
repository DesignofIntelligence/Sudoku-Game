package sudoku;

import javafx.geometry.Insets;
import javafx.application.Application;
import static javafx.application.Application.launch;
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
import javafx.scene.layout.HBox;
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
        play.setOnAction( 
                e ->
                {
                System.out.println("play button clicked");
                game1 gm1 = new game1();
                Scene sc1 = new Scene(gm1, 500, 500);
                Stage s = new Stage();
                s.setScene(sc1);
                s.setTitle("Sudoku");
                s.sizeToScene();
                s.show();
                s.setResizable(true);
                }
                        );
        
        Button settings = new Button("SETTINGS");
        settings.setTextFill(Color.RED);
        settings.setPrefSize(200, 20);
        settings.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        settings.setOnAction(
            e ->
            {   System.out.println("settings button clicked");
                settingss st = new settingss();
                Scene sc3 = new Scene (st,500,500);
                Stage s = new Stage();
                s.setScene(sc3);
                s.setTitle("Settings");
                s.sizeToScene();
                s.show();
                s.setResizable(true);
            }
                    );
        
        Button exit = new Button("EXIT");
        exit.setTextFill(Color.RED);
        exit.setPrefSize(200, 20);
        exit.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        exit.setOnAction(
        e -> 
            {
                System.out.println("exit button clicked");
            }
                    );
        options1.getChildren().addAll(play,settings,exit);
//..............................................................
    }
}
//-----------------------------------------------------------------

class settingss extends BorderPane{
    
    public settingss(){
        VBox back1 = new VBox();
        this.setBottom(back1);
        back1.setPadding(new Insets(0, 0, 100, 0));
        back1.setAlignment(Pos.TOP_CENTER);
        Button back = new Button("BACK");
        back.setTextFill(Color.RED);
        back.setPrefSize(200, 20);
        back.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        back.setOnAction(
        e ->
            {
                System.out.println("back1 button clicked");
                game gm = new game();
                Scene sc = new Scene(gm, 500, 500);
                Stage s = new Stage();
                s.setScene(sc);
                s.setTitle("Sudoku");
                s.sizeToScene();
                s.show();
                s.setResizable(true);
            }
                        );
            back1.getChildren().add(back);

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
        standard.setOnAction(
            e ->
            {
                System.out.println("standard button clicked");
                game2 gm2 = new game2();
                Scene sc2 = new Scene(gm2, 500, 500);
                Stage s = new Stage();
                s.setScene(sc2);
                s.setTitle("Sudoku");
                s.sizeToScene();
                s.show();
                s.setResizable(true);
            }
                            );
        Button timetrial = new Button("TIME TRIAL");
        timetrial.setTextFill(Color.RED);
        timetrial.setPrefSize(200, 20);
        timetrial.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        timetrial.setOnAction(
        e ->
            {
                System.out.println("time trial button clicked");
                game2 gm2 = new game2();
                Scene sc2 = new Scene(gm2, 500, 500);
                Stage s = new Stage();
                s.setScene(sc2);
                s.setTitle("Sudoku");
                s.sizeToScene();
                s.show();
                s.setResizable(true);

            }
                            );
        Label lbl = new Label("Please Choose a Game Mode");
        lbl.setStyle("-fx-background-color:null;");
        lbl.setTextFill(Color.BLUE);
        lbl.setFont(Font.font("Times New Roman", FontWeight.BOLD, 25));
        options2.getChildren().addAll(lbl,standard,timetrial);
//..............................................................
        VBox back1 = new VBox();
        this.setBottom(back1);
        back1.setPadding(new Insets(0, 0, 100, 0));
        back1.setAlignment(Pos.TOP_CENTER);
        Button back = new Button("BACK");
        back.setTextFill(Color.RED);
        back.setPrefSize(200, 20);
        back.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        back.setOnAction(
        e ->
            {
                System.out.println("back1 button clicked");
                game gm = new game();
                Scene sc = new Scene(gm, 500, 500);
                Stage s = new Stage();
                s.setScene(sc);
                s.setTitle("Sudoku");
                s.sizeToScene();
                s.show();
                s.setResizable(true);
            }
                        );
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
        easy.setOnAction(
        e ->
            {
                System.out.println("easy button clicked");
                game3 gm3 = new game3();
                Scene Sc3 = new Scene(gm3,500,500);
                Stage s = new Stage();
                s.setScene(Sc3);
                s.setTitle("Sudoku");
                s.sizeToScene();
                s.show();
                s.setResizable(true);
            }
                        );
        
        Button medium = new Button("MEDIUM");
        medium.setTextFill(Color.RED);
        medium.setPrefSize(200, 20);
        medium.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        medium.setOnAction(
        e ->
            {
                System.out.println("medium button clicked");
                game3 gm3 = new game3();
                Scene Sc3 = new Scene(gm3,500,500);
                Stage s = new Stage();
                s.setScene(Sc3);
                s.setTitle("Sudoku");
                s.sizeToScene();
                s.show();
                s.setResizable(true);
            }
                        );
        
        Button hard = new Button("HARD");
        hard.setTextFill(Color.RED);
        hard.setPrefSize(200, 20);
        hard.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        hard.setOnAction(
        e ->
            {
                System.out.println("hard button clicked");
                game3 gm3 = new game3();
                Scene Sc3 = new Scene(gm3,500,500);
                Stage s = new Stage();
                s.setScene(Sc3);
                s.setTitle("Sudoku");
                s.sizeToScene();
                s.show();
                s.setResizable(true);
            }
                        );
        Label lbl = new Label("Please select the difficulty");
        lbl.setStyle("-fx-background-color:null;");
        lbl.setTextFill(Color.BLUE);
        lbl.setFont(Font.font("Times New Roman", FontWeight.BOLD, 25));
        options3.getChildren().addAll(lbl,easy,medium,hard);
//..............................................................
        VBox back1 = new VBox();
        this.setBottom(back1);
        back1.setPadding(new Insets(0, 0, 100, 0));
        back1.setAlignment(Pos.TOP_CENTER);
        Button back = new Button("BACK");
        back.setTextFill(Color.RED);
        back.setPrefSize(200, 20);
        back.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        back.setOnAction(
        e ->
            {
                System.out.println("back2 button clicked");
                game1 gm1 = new game1();
                Scene Sc1 = new Scene(gm1,500,500);
                Stage s = new Stage();
                s.setScene(Sc1);
                s.setTitle("Sudoku");
                s.sizeToScene();
                s.show();
                s.setResizable(true);

            }
                        );
        back1.getChildren().add(back);
//..............................................................
    }
}
//----------------------------------------------------------------


class game3 extends BorderPane{
    public game3(){
    HBox hints = new HBox();
    this.setBottom(hints);
    hints.setPadding(new Insets(25,50,100,0));
    hints.setAlignment(Pos.TOP_RIGHT);
    hints.setSpacing(10);
    
    Button reset = new Button("RESET");
    reset.setTextFill(Color.BLUE);
    reset.setPrefSize(50,20);
    reset.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
    reset.setOnAction(
    e ->
        {
            System.out.println("reset button clicked");
        }
                    );
    
    Button hint = new Button("HINT");
    hint.setTextFill(Color.BLUE);
    hint.setPrefSize(50,20);
    hint.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
    hint.setOnAction(e ->
        {
            System.out.println("hint button clicked");
        }
    );
    
    Button back = new Button("Back");
    back.setTextFill(Color.BLUE);
    back.setPrefSize(50,20);
    back.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
    back.setOnAction(
        e ->
            {
                System.out.println("back1 button clicked");
                game gm = new game();
                Scene sc = new Scene(gm, 500, 500);
                Stage s = new Stage();
                s.setScene(sc);
                s.setTitle("Sudoku");
                s.sizeToScene();
                s.show();
                s.setResizable(true);
            }
                    );
    hints.getChildren().addAll(hint,reset,back);
  //...............................................................
    }
}

//-----------------------------------------------------------------

public class Sudoku extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        game gm = new game();
        Scene sc = new Scene(gm, 500, 500);
        primaryStage.setScene(sc);
        primaryStage.setTitle("Sudoku");
        primaryStage.sizeToScene();
        primaryStage.show();
        primaryStage.setResizable(true);
        
    }
    
    
//------------------------------------------------------------------    

    public static void main(String[] args) {
        launch(args);

    }

}
