package sudoku;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Passive extends StackPane {

    BorderPane sp;

    Passive(int MaxTiles, int level) {

        TextField[][] btn = new TextField[9][9];
        TextField[][] clear = new TextField[9][9];
        sp = new BorderPane();
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(0, 0, 0, 0));
        root.setHgap(5);
        root.setVgap(5);
        int[][] l = new int[9][9];
        Logic.generateSolvedSudoku(l);
        int counter = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                btn[i][j] = new TextField("" + l[i][j]);

                root.add(btn[i][j], i, j);
                clear[i][j] = new TextField(btn[i][j].getText());
                boolean t = false;
                root.add(clear[i][j], i, j);
                if ((int) (Math.random() * 10) == 1 || (int) (Math.random() * 10) == 2 || (int) (Math.random() * 10) == 3 || (int) (Math.random() * 10) == 4) {
                    if (counter < MaxTiles) {
                        clear[i][j].setText("");
                        clear[i][j].setStyle("-fx-control-inner-background: orange");
                        counter++;
                        t = true;
                    }

                }

                if (t == false) {
                    clear[i][j].setEditable(false);
                    clear[i][j].setStyle("-fx-control-inner-background: white");
                }
            }

        }
        root.setPrefSize(50, 50);
        root.setPadding(new Insets(0, 25, 0, 25));
        sp.setCenter(root);
//*****************************************************************************************************************************************        
        Image che = new Image(this.getClass().getResource("check.png").toString());
        ImageView ch = new ImageView(che);
        ch.setFitHeight(30);
        ch.setFitWidth(100);
        Button smth = new Button("",ch);
        smth.setStyle("-fx-border-color:null;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        smth.setOnAction((ActionEvent e) -> {
            System.out.println("solve button is clicked");
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
            int hi = 0;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if ((clear[i][j].getText().equals(btn[i][j].getText())) == true) {
                        hi++;
                    }
                }
            }
            if (hi == 81) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("But Today");
                alert.setHeaderText("I just wanna tell you");
                alert.setContentText("AY CONGRATULATIONS, ITS A CELEBRATION");
                alert.showAndWait().ifPresent(rs -> {
                    if (rs == ButtonType.OK) {
                        System.out.println("Pressed OK.");
                    }
                });
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("When you try your best");
                alert.setHeaderText("but you dont ");
                alert.setContentText("SUCCEEEEEEEEEEEEEED");
                alert.showAndWait().ifPresent(rs -> {
                    if (rs == ButtonType.OK) {
                        System.out.println("Pressed OK.");
                    }
                });
            }

        });
//*****************************************************************************************************************************************
        Image sho = new Image(this.getClass().getResource("hint.png").toString());
        ImageView sh = new ImageView(sho);
        sh.setFitHeight(50);
        sh.setFitWidth(50);
        Button show = new Button("", sh);
        show.setStyle("-fx-border-color:null;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        show.setOnAction((ActionEvent e)
                -> {
            System.out.println("Show button is clicked");
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (clear[i][j].getText().equals("") == true) {
                        continue;
                    }
                    if ((clear[i][j].getStyle().equals("-fx-control-inner-background: red") == true) && (clear[i][j].getText().equals("") == true)) {
                        clear[i][j].setStyle("-fx-control-inner-background: orange");
                    }
                    if (clear[i][j].getStyle().equals("-fx-control-inner-background: white") == true) {
                        continue;
                    }
                    if (clear[i][j].getText().equals(btn[i][j].getText()) == false) {
                        clear[i][j].setStyle("-fx-control-inner-background: red");
                    }
                    if (clear[i][j].getText().equals(btn[i][j].getText()) == true) {
                        clear[i][j].setStyle("-fx-control-inner-background: green");
                    }
                }
            }
        }
        );
        
//*****************************************************************************************************************************************
        Image unh = new Image(this.getClass().getResource("unhint.png").toString());
        ImageView un = new ImageView(unh);
        un.setFitHeight(50);
        un.setFitWidth(50);
        Button remove = new Button("", un);
        remove.setStyle("-fx-border-color:null;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        remove.setOnAction((ActionEvent e)
                -> {
            System.out.println("remove button is clicked");
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if ((clear[i][j].getStyle().equals("-fx-control-inner-background: red") == true)) {
                        clear[i][j].setStyle("-fx-control-inner-background: orange");
                    } else if ((clear[i][j].getStyle().equals("-fx-control-inner-background: green") == true)) {
                        clear[i][j].setStyle("-fx-control-inner-background: orange");
                    }

                }

            }
        });
//*****************************************************************************************************************************************
        Image res = new Image(this.getClass().getResource("reset.png").toString());
        ImageView re = new ImageView(res);
        re.setFitHeight(50);
        re.setFitWidth(50);
        Button reset = new Button("", re);
        reset.setStyle("-fx-border-color:null;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        reset.setOnAction((ActionEvent e)
                -> {
            System.out.println("reset button is clicked");
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (clear[i][j].isEditable() == true) {
                        clear[i][j].setText("");
                    }
                }
            }

        });
//*****************************************************************************************************************************************
        Image neew = new Image(this.getClass().getResource("new.png").toString());
        ImageView ne = new ImageView(neew);
        ne.setFitHeight(30);
        ne.setFitWidth(140);
        Button next = new Button("",ne);
        next.setStyle("-fx-border-color:null;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        next.setOnAction((ActionEvent e)
                -> {
            System.out.println("next is clicked");
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
            if (level == 0) {
                Passive easygame = new Passive(10, 0);
                Scene Sc3 = new Scene(easygame.sp, 600, 600);
                Sudoku.getStage().setResizable(true);
                Sudoku.getStage().setScene(Sc3);
            }
            if (level == 1) {
                Passive mediumgame = new Passive(20, 1);
                Scene Sc3 = new Scene(mediumgame.sp, 600, 600);
                Sudoku.getStage().setResizable(true);
                Sudoku.getStage().setScene(Sc3);
            }
            if (level == 2) {
                Passive hardgame = new Passive(30, 2);
                Scene Sc3 = new Scene(hardgame.sp, 600, 600);
                Sudoku.getStage().setResizable(true);
                Sudoku.getStage().setScene(Sc3);
            }
        });
//*****************************************************************************************************************************************
        Image bac = new Image(this.getClass().getResource("back.png").toString());
        ImageView v = new ImageView(bac);
        v.setFitHeight(50);
        v.setFitWidth(50);
        Button back = new Button("", v);
        back.setStyle("-fx-border-color:null;" + "-fx-background-color:null;" + "-fx-border-radius: 10;");
        back.setOnAction((ActionEvent e)
                -> {
            System.out.println("Back button is clicked");
            MediaPlayer sfx = new MediaPlayer(new Media(this.getClass().getResource("Button.wav").toString()));
            sfx.play();
            sfx.setVolume(3);
            game gm2 = new game();
            Scene sc2 = new Scene(gm2, 600, 600);
            Sudoku.getStage().setScene(sc2);
        });
//*****************************************************************************************************************************************        
        HBox h3 = new HBox();
        h3.getChildren().addAll(smth, next);
        h3.setPadding(new Insets(50, 0, 50, 0));
        h3.setSpacing(50);
        h3.setAlignment(Pos.BOTTOM_CENTER);
        sp.setTop(h3);
        HBox h4 = new HBox();
        h4.getChildren().addAll(back,show, remove, reset);
        h4.setPadding(new Insets(50, 25, 80, 25));
        h4.setSpacing(20);
        h4.setAlignment(Pos.BOTTOM_LEFT);
        sp.setBottom(h4);

    }
}
