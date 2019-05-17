package sudoku;

import com.sun.javaws.Globals;
import javafx.geometry.Insets;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
//---------------------------------------------------------------------------------------------------------------------------

class game extends BorderPane {

    public game() {
        Image m = new Image(this.getClass().getResource("background.jpg").toString(), 600, 600, true, true, true);
        BackgroundImage myBI = new BackgroundImage(m, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        this.setBackground(new Background(myBI));
//******************************************************************************************************************************************        
        HBox back2 = new HBox();
        this.setTop(back2);
        back2.setAlignment(Pos.TOP_LEFT);

        StackPane log = new StackPane();
        log.setPadding(new Insets(100, 0, 0, 110));
        Image logo = new Image(this.getClass().getResource("s2.png").toString());
        ImageView v = new ImageView(logo);
        v.setImage(logo);
        v.setFitHeight(100);
        v.setFitWidth(300);
        log.getChildren().add(v);

        Image mutee = new Image(this.getClass().getResource("mute.png").toString());
        ImageView v2 = new ImageView(mutee);
        v2.setFitHeight(20);
        v2.setFitWidth(20);

        VBox vb = new VBox();
        Button mute = new Button("", v2);
        mute.setShape(new Circle());
        mute.setStyle("-fx-border-color:null;" + "-fx-background-color:null;" + "-fx-border-radius: 10;" + "-fx-background-radius:5em; ");
        mute.setOnAction(
                e
                -> {
            System.out.println("Mute button clicked");
            Sudoku.getMediaPlayer().stop();
        }
        );

        Image unmutee = new Image(this.getClass().getResource("unmute.png").toString());
        ImageView v1 = new ImageView(unmutee);
        v1.setFitHeight(20);
        v1.setFitWidth(20);

        Button unmute = new Button("", v1);
        unmute.setShape(new Circle());
        unmute.setStyle("-fx-border-color:null;" + "-fx-background-color:null;" + "-fx-border-radius: 10;" + "-fx-background-radius:5em; ");
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
        vb.getChildren().addAll(unmute, mute);

        back2.getChildren().addAll(vb, log);
//*************************************
        VBox options1 = new VBox();
        options1.setAlignment(Pos.CENTER);
        this.setCenter(options1);
        options1.setSpacing(20);

        Image eas = new Image(this.getClass().getResource("easy.png").toString());
        ImageView v3 = new ImageView(eas);
        v3.setFitHeight(50);
        v3.setFitWidth(120);

        Button easy = new Button("", v3);
        easy.setStyle("-fx-border-color:null;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        easy.setOnAction(
                e
                -> {
            System.out.println("easy button clicked");
            Passive easygame = new Passive(10, 0);
            Scene Sc3 = new Scene(easygame.sp, 600, 600);
            Sudoku.getStage().setResizable(true);
            Sudoku.getStage().setScene(Sc3);
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
        }
        );

        Image med = new Image(this.getClass().getResource("medium.png").toString());
        ImageView v4 = new ImageView(med);
        v4.setFitHeight(50);
        v4.setFitWidth(200);

        Button medium = new Button("", v4);
        medium.setStyle("-fx-border-color:null;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        medium.setOnAction(
                e
                -> {
            System.out.println("medium button clicked");
            Passive mediumgame = new Passive(20, 1);
            Scene Sc3 = new Scene(mediumgame.sp, 600, 600);
            Sudoku.getStage().setResizable(true);
            Sudoku.getStage().setScene(Sc3);
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
        }
        );

        Image har = new Image(this.getClass().getResource("hard.png").toString());
        ImageView v5 = new ImageView(har);
        v5.setFitHeight(50);
        v5.setFitWidth(120);

        Button hard = new Button("", v5);
        hard.setStyle("-fx-border-color:null;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        hard.setOnAction(
                e
                -> {
            System.out.println("hard button clicked");
            Passive hardgame = new Passive(30, 2);
            Scene Sc3 = new Scene(hardgame.sp, 600, 600);
            Sudoku.getStage().setResizable(true);
            Sudoku.getStage().setScene(Sc3);
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
        }
        );

        options1.getChildren().addAll(easy, medium, hard);

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
        Scene sc = new Scene(gm, 600, 600);
        Media md = new Media(this.getClass().getResource("Genius.mp3").toString());
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

//**********************   
    public static void main(String[] args) {
        launch(args);

    }

}
