/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

public class Logic 

{
                int ks=0;

static void print(int x[][])
{
    for(int i=0; i<9; i++)
    {
        for(int j=0; j<9; j++)
        {
            System.out.print(x[i][j]);
            if((j+1)%3==0){System.out.print('\t');}
        }
        System.out.println();
        if((i+1)%3==0){System.out.println();}
    }
}
 static void randrow(int x[][],int k)
{
     int [] arr = new int[9];
   boolean da5al = false;
   for(int i=0; i<9; i++)
   {   int max = 9; 
        int min = 1; 
        int range = max - min + 1; 
       da5al = false;
       int iRand = (int)(Math.random() * range) + min;
       //cout << iRand << " ";
       for(int j=0; j<9; j++)
       {
        if(arr[j]==iRand)
        {
            da5al = true;
            break;
        }
       }
        if(!da5al)
            arr[i] = iRand;
        else
            i--;
    for(int j=0; j<9; j++)
    {
        x[k][j]=arr[j];
    }

   }

}
static int checkColoumn(int x[][], int row)
{
    for(int i=0; i<9; i++)
    {
        for(int j=0; j<row; j++)
        {
            for(int k=0; k<9; k++)
            {
                if(x[j][i]==x[k][i] && j!=k && x[j][i]!=0 && x[k][i]!=0)
                    return 0;
            }
        }
    }
    return 1;
}
static int checkBox(int x[][], int row)
{  int is = 0, ie = 0;
   if(row==0 || row == 1 || row ==2){is =0; ie=3;}
   if(row==3 || row == 4 || row ==5){is =3; ie=6;}
   if(row==6 || row == 7 || row ==8){is =6; ie=9;}

   for(int i=0; i<9; i++)
   {   int js = 0, je = 0;
       if(i==0||i==1||i==2){js=0; je=3;}
       if(i==3||i==4||i==5){js=3; je=6;}
       if(i==6||i==7||i==8){js=6; je=9;}
       for(int j=is; j<ie; j++)
       {
           for(int k=js; k<je; k++)
           {
               if(x[row][i]==x[j][k] && x[j][k]!=0 && row !=j){return 0;}
           }
       }

   }
   return 1;
}
static void  generateSolvedSudoku(int x[][])
{
    for(int i=0; i<9; i++)
    {
        do{randrow(x,i);} while(checkColoumn(x,i)==0 || checkBox(x,i)==0);
    }

}
    
}
