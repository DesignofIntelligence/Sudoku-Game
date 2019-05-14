/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class Passive extends StackPane
       
       {
    
    BorderPane sp;
    Passive(int MaxTiles, int level){
       

       
        TextField [][] btn = new TextField[9][9];
        TextField [][] clear = new TextField[9][9];
        sp = new BorderPane();
        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);
        int [][]l= new int[9][9];
        Logic.generateSolvedSudoku(l);
        int counter = 0;
        for(int i=0; i<9; i++)
        {
         for(int j=0; j<9; j++)
          {
            btn[i][j]= new TextField("" + l[i][j]);
            
            root.add(btn[i][j], i, j);
            clear[i][j] = new TextField(btn[i][j].getText());
            boolean t = false;
            root.add(clear[i][j],i ,j);
            if((int)(Math.random()*10)==1 || (int)(Math.random()*10)==2 || (int)(Math.random()*10)==3 ||(int)(Math.random()*10)==4) 
            {
            if (counter <MaxTiles){
            clear[i][j].setText("");
            clear[i][j].setStyle("-fx-control-inner-background: orange"); 
            counter++;
            t = true;
             }
            
            }
            
            if(t== false) {clear[i][j].setEditable(false);
            clear[i][j].setStyle("-fx-control-inner-background: white");
            }
          }

        }
        BorderPane.setAlignment(root, Pos.CENTER);
        sp.setCenter(root);
        //sp.getChildren().add(root);
        Button smth = new Button ("Solve!");
        Button show = new Button ("Show Hint");
        Button remove = new Button ("Remove Hint");
        Button next = new Button ("Next Level");
        Button back = new Button ("Back");
        next.setOnAction((ActionEvent e) ->
        {
            if (level == 0){Passive easygame = new Passive(10,0);
            Scene Sc3= new Scene(easygame.sp, 300, 600);
            Sudoku.getStage().setResizable(false);
            Sudoku.getStage().setScene(Sc3);}
            if (level ==1){Passive mediumgame = new Passive(20,1);
            Scene Sc3 = new Scene(mediumgame.sp, 300, 600);
            Sudoku.getStage().setResizable(false);
            Sudoku.getStage().setScene(Sc3);}
            if (level ==2){Passive hardgame = new Passive(30,2);
            Scene Sc3 = new Scene(hardgame.sp, 300, 600);
            Sudoku.getStage().setResizable(false);
            Sudoku.getStage().setScene(Sc3);
            }
        });
        back.setOnAction((ActionEvent e) -> 
        {
             game2 gm2 = new game2();
            Scene sc2 = new Scene(gm2, 500, 500);
            Stage s = new Stage();
            Sudoku.getStage().setScene(sc2);
        });
        show.setOnAction((ActionEvent e) -> 
        {
               for(int i=0; i < 9; i++)
               {
                   for(int j=0; j<9; j++)
                   {
                      if(clear[i][j].getText().equals("") ==true){continue;} 
                      if((clear[i][j].getStyle().equals("-fx-control-inner-background: red") ==true) && (clear[i][j].getText().equals("") ==true)){clear[i][j].setStyle("-fx-control-inner-background: orange");} 
                       if(clear[i][j].getStyle().equals("-fx-control-inner-background: white") ==true){continue;} 
                      if(clear[i][j].getText().equals(btn[i][j].getText())==false){clear[i][j].setStyle("-fx-control-inner-background: red");}
                      if(clear[i][j].getText().equals(btn[i][j].getText())==true){clear[i][j].setStyle("-fx-control-inner-background: orange");}
                   } 
               }
        }
        );
        //----------------------------------
        remove.setOnAction((ActionEvent e) -> 
        {
            for(int i=0; i < 9; i++)
               {
                   for(int j=0; j<9; j++)
                   {
                       if((clear[i][j].getStyle().equals("-fx-control-inner-background: red") ==true)) {clear[i][j].setStyle("-fx-control-inner-background: orange");}
                   }
                   
               }
                   
        }
        
        
        );
        smth.setLayoutX(1);
        smth.setOnAction((ActionEvent e) -> {
        int hi=0;
        //System.out.println("Check Fired");
        for(int i=0; i < 9 ; i++)
        {
            for(int j=0; j<9; j++)
            {
                if((clear[i][j].getText().equals(btn[i][j].getText()))==true){hi++;}
            }
        }
        if (hi == 81)
        {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("But Today");
        alert.setHeaderText("I just wanna tell you");
        alert.setContentText("AY CONGRATULATIONS, ITS A CELEBRATION");
        alert.showAndWait().ifPresent(rs -> {
        if (rs == ButtonType.OK) {
        System.out.println("Pressed OK.");
    }
});
        }
        else {Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("When you try your best");
        alert.setHeaderText("but you dont ");
        alert.setContentText("SUCCEEEEEEEEEEEEEED");
        alert.showAndWait().ifPresent(rs -> {
        if (rs == ButtonType.OK) {
        System.out.println("Pressed OK.");
    }
});}
        
        });
        VBox buttons = new VBox (10, smth,show,remove, next, back);
        BorderPane.setAlignment(buttons, Pos.BOTTOM_CENTER);
        sp.setBottom(buttons);
        //sp.getChildren().add(buttons);
        Line at = new Line(5, 0, 5, 200);
        
}}