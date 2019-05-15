 package sudoku;

import javafx.geometry.Insets;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
//-----------------------------------------------------------------

class game extends BorderPane {

    public game() {
        StackPane log = new StackPane();
        log.setPadding(new Insets(100, 150, 0, 150));
        Image logo = new Image(this.getClass().getResource("s1.jpg").toString());
        ImageView v = new ImageView(logo);
        v.setImage(logo);
        v.setFitHeight(100);
        v.setFitWidth(200);
        this.setTop(log);
        log.getChildren().add(v);
//**************************************************************
        VBox options1 = new VBox();
        options1.setAlignment(Pos.CENTER);
        this.setCenter(options1);
        options1.setSpacing(20);
        Button play = new Button("PLAY");
        play.setTextFill(Color.RED);
        play.setPrefSize(200, 20);
        play.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        play.setOnAction(
                e
                -> {
            System.out.println("play button clicked");
            game2 gm2 = new game2();
            Scene sc1 = new Scene(gm2, 500, 500);
            Sudoku.getStage().setScene(sc1);
            //Sudoku.getMediaPlayer().stop();
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
        }
        );

        Button settings = new Button("SETTINGS");
        settings.setTextFill(Color.RED);
        settings.setPrefSize(200, 20);
        settings.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        settings.setOnAction(
                e
                -> {
            System.out.println("settings button clicked");
            settingss st = new settingss();
            Scene sc3 = new Scene(st, 500, 500);
            Sudoku.getStage().setScene(sc3);
            //Sudoku.getMediaPlayer().stop();
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
        }
        );

        Button exit = new Button("EXIT");
        exit.setTextFill(Color.RED);
        exit.setPrefSize(200, 20);
        exit.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        exit.setOnAction(
                e
                -> {
            System.out.println("exit button clicked");
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
            Sudoku.getStage().close();
        }
        );
        options1.getChildren().addAll(play, settings, exit);
//..............................................................
    }
}
//-----------------------------------------------------------------

class settingss extends BorderPane {

    public settingss() {
        StackPane log = new StackPane();
        log.setPadding(new Insets(100, 150, 0, 150));
        Image logo = new Image(this.getClass().getResource("s1.jpg").toString());
        ImageView v = new ImageView(logo);
        v.setImage(logo);
        v.setFitHeight(100);
        v.setFitWidth(200);
        this.setTop(log);
        log.getChildren().add(v);
//**************************************************************
        VBox back1 = new VBox();
        this.setBottom(back1);
        back1.setPadding(new Insets(0, 0, 100, 0));
        back1.setAlignment(Pos.TOP_CENTER);
        back1.setSpacing(20);

        Button back = new Button("BACK");
        back.setTextFill(Color.RED);
        back.setPrefSize(200, 20);
        back.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        back.setOnAction(
                e
                -> {
            System.out.println("back1 button clicked");
            game gm = new game();
            Scene sc = new Scene(gm, 500, 500);
            Sudoku.getStage().setScene(sc);
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
        }
        );
        //..............................................................
        Button mute = new Button("MUTE");
        mute.setTextFill(Color.RED);
        mute.setPrefSize(200, 20);
        mute.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        mute.setOnAction(
                e
                -> {
            System.out.println("Mute button clicked");
            Sudoku.getMediaPlayer().stop();
        }
        );

        Button unmute = new Button("UNMUTE");
        unmute.setTextFill(Color.RED);
        unmute.setPrefSize(200, 20);
        unmute.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        unmute.setOnAction(
                e
                -> {
            System.out.println("Unmute button clicked");
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
            Sudoku.getMediaPlayer().play();
        }
        );
        back1.getChildren().addAll(mute, unmute, back);
    }
}
//-----------------------------------------------------------------

//class game1 extends BorderPane {
//
//    public game1() {
//        StackPane log = new StackPane();
//        log.setPadding(new Insets(50, 150, 0, 150));
//        Image logo = new Image("file:///D:/s1.jpg");
//        ImageView v = new ImageView(logo);
//        v.setImage(logo);
//        v.setFitHeight(100);
//        v.setFitWidth(200);
//        this.setTop(log);
//        log.getChildren().add(v);
////..............................................................
//        VBox options2 = new VBox();
//        this.setCenter(options2);
//        options2.setSpacing(20);
//        options2.setAlignment(Pos.CENTER);
//        Button standard = new Button("STANDARD");
//        standard.setTextFill(Color.RED);
//        standard.setPrefSize(200, 20);
//        standard.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
//        standard.setOnAction(
//                e
//                -> {
//            System.out.println("standard button clicked");
//            game2 gm2 = new game2();
//            Scene sc2 = new Scene(gm2, 500, 500);
//            Stage s = new Stage();
//            Sudoku.getStage().setScene(sc2);
//            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
//            sfx.play();
//            sfx.setVolume(3);
//        }
//        );
////        Button timetrial = new Button("TIME TRIAL");
////        timetrial.setTextFill(Color.RED);
////        timetrial.setPrefSize(200, 20);
////        timetrial.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
////        timetrial.setOnAction(
////                e
////                -> {
////            System.out.println("time trial button clicked");
////            game2 gm2 = new game2();
////            Scene sc2 = new Scene(gm2, 500, 500);
////            Stage s = new Stage();
////            Sudoku.getStage().setScene(sc2);
////            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
////            sfx.play();
////            sfx.setVolume(3);
////        }
////        );
//        Label lbl = new Label("Please Choose a Game Mode");
//        lbl.setStyle("-fx-background-color:null;");
//        lbl.setTextFill(Color.BLUE);
//        lbl.setFont(Font.font("Times New Roman", FontWeight.BOLD, 25));
//        options2.getChildren().addAll(lbl, standard);
////..............................................................
//        VBox back1 = new VBox();
//        this.setBottom(back1);
//        back1.setPadding(new Insets(0, 0, 100, 0));
//        back1.setAlignment(Pos.TOP_CENTER);
//        Button back = new Button("BACK");
//        back.setTextFill(Color.RED);
//        back.setPrefSize(200, 20);
//        back.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
//        back.setOnAction(
//                e
//                -> {
//            System.out.println("back1 button clicked");
//            game gm = new game();
//            Scene sc = new Scene(gm, 500, 500);
//            Stage s = new Stage();
//            Sudoku.getStage().setScene(sc);
//            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
//            sfx.play();
//            sfx.setVolume(3);
//        }
//        );
//        back1.getChildren().addAll(back);
////..............................................................        
//    }
//}
//-----------------------------------------------------------------

class game2 extends BorderPane {

    public game2() {
        StackPane log = new StackPane();
        log.setPadding(new Insets(50, 150, 0, 150));
        Image logo = new Image(this.getClass().getResource("s1.jpg").toString());
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
                e
                -> {
            System.out.println("easy button clicked");
            Passive easygame = new Passive(10,0);
            Scene Sc3 = new Scene(easygame.sp, 500, 500);
            Sudoku.getStage().setResizable(false);
            Sudoku.getStage().setScene(Sc3);
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
        }
        );

        Button medium = new Button("MEDIUM");
        medium.setTextFill(Color.RED);
        medium.setPrefSize(200, 20);
        medium.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        medium.setOnAction(
                e
                -> {
            System.out.println("medium button clicked");
            Passive mediumgame = new Passive(20,1);
            Scene Sc3 = new Scene(mediumgame.sp, 500, 500);
            Sudoku.getStage().setResizable(false);
            Sudoku.getStage().setScene(Sc3);
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
        }
        );

        Button hard = new Button("HARD");
        hard.setTextFill(Color.RED);
        hard.setPrefSize(200, 20);
        hard.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        hard.setOnAction(
                e
                -> {
            System.out.println("hard button clicked");
            Passive hardgame = new Passive(30,2);
            Scene Sc3 = new Scene(hardgame.sp, 500, 500);
            Sudoku.getStage().setResizable(false);
            Sudoku.getStage().setScene(Sc3);
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
        }
        );
        Label lbl = new Label("Please select the difficulty");
        lbl.setStyle("-fx-background-color:null;");
        lbl.setTextFill(Color.BLUE);
        lbl.setFont(Font.font("Times New Roman", FontWeight.BOLD, 25));
        options3.getChildren().addAll(lbl, easy, medium, hard);
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
                e
                -> {
            System.out.println("back2 button clicked");
            game gm = new game();
            Scene Sc1 = new Scene(gm, 500, 500);
            Sudoku.getStage().setScene(Sc1);
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
        }
        );
        back1.getChildren().add(back);
//..............................................................
    }
}
//----------------------------------------------------------------

class game3 extends BorderPane {

    public game3() {
        HBox hints = new HBox();
        this.setBottom(hints);
        hints.setPadding(new Insets(25, 50, 100, 0));
        hints.setAlignment(Pos.TOP_RIGHT);
        hints.setSpacing(10);

        Button reset = new Button("RESET");
        reset.setTextFill(Color.BLUE);
        reset.setPrefSize(50, 20);
        reset.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        reset.setOnAction(
                e
                -> {
            System.out.println("reset button clicked");
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
        }
        );

        Button hint = new Button("HINT");
        hint.setTextFill(Color.BLUE);
        hint.setPrefSize(50, 20);
        hint.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        hint.setOnAction(e
                -> {
            System.out.println("hint button clicked");
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
        }
        );

        Button back = new Button("Back");
        back.setTextFill(Color.BLUE);
        back.setPrefSize(50, 20);
        back.setStyle("-fx-border-color:orange;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        back.setOnAction(
                e
                -> {
            System.out.println("back1 button clicked");
            game gm = new game();
            Scene sc = new Scene(gm, 500, 500);
            Sudoku.getStage().setScene(sc);
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
        }
        );
        hints.getChildren().addAll(hint, reset, back);
        //******************************************************************************
        GridPane board = new GridPane();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                // GridPane box = new GridPane();
                // box.setStyle("-fx-background-color: black, -fx-control-inner-background; -fx-background-insets: 0, 2; -fx-padding: 2;");
                // for (int column = 0; column < 3; column++) {
                //   for (int row = 0; row < 3; row++) {
                TextField textField = new TextField();
                textField.setPrefSize(50, 50);
                textField.setStyle("-fx-pref-width: 0em;");
                textField.setStyle("-fx-background-color: black, -fx-control-inner-background; -fx-background-insets: 0, 2; -fx-padding: 2;");
                board.add(textField, column, row);
                // GridPane.setConstraints(textField, column, row);
                // board.getChildren().add(textField);
                // }
                // }
                // board.setVgap(10);
                // board.setHgap(10);
                // GridPane.setConstraints(board, row, column);
                // board.getChildren().add(board);

            }
        }
        board.setPadding(new Insets(10, 70, 10, 70));
        this.setCenter(board);
        BorderPane.setAlignment(board, Pos.CENTER);
    }
}

//-----------------------------------------------------------------
//-----------------------------------------------------------------
public class Sudoku extends Application {

    private static Stage theStage;
    private static MediaPlayer theMedia;

    public static Stage getStage() {
        return theStage;
    }

    public static MediaPlayer getMediaPlayer() {
        return theMedia;
    }

    @Override
    public void start(Stage primaryStage) {

        theStage = primaryStage;
        game gm = new game();
        Scene sc = new Scene(gm, 500, 500);
        Media md = new Media(this.getClass().getResource("Genius.mp3").toString());
        //AudioClip sfx = new AudioClip("Button.wav");
        //Media md = new Media("file:///D:/Genius.mp3");
        primaryStage.setScene(sc);
        primaryStage.setTitle("Sudoku");
        primaryStage.sizeToScene();
        primaryStage.show();
        primaryStage.setResizable(true);
        MediaPlayer mp = new MediaPlayer(md);
        theMedia = mp;
        mp.setAutoPlay(true);
        mp.setVolume(10);
        mp.setStartTime(Duration.seconds(8));

    }

//**************************************************************   
    public static void main(String[] args) {
        launch(args);
    }

}
