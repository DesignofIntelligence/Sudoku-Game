/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;


public class Passive extends StackPane
       
       {

    StackPane sp;
    Passive(int MaxTiles){
       

       
        TextField [][] btn = new TextField[9][9];
        TextField [][] clear = new TextField[9][9];
        sp = new StackPane();
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
            counter++;
            t = true;
             }
            
            }
            
            if(t== false) {clear[i][j].setEditable(false);}

          }

        }
        sp.getChildren().add(root);
        Button smth = new Button ("Check");
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
        sp.getChildren().add(smth);
        Line at = new Line(5, 0, 5, 200);
        
}}