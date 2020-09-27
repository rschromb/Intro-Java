/*
   Course: CS 12300
   Name: Ricky Schrombeck
   Email: rschromb@pnw.edu
   Assignment: 5
*/
import java.util.*;
public class Hw5
{
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    //variables
    int x; //variable used to transfer data to gradeTotal
    int[] gradeTotal = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    String[] grades = {"A+", "A ", "A-", "B+", "B ", "B-", "C+", "C ", "C-", "D+", "D", "D-", "F"};
    int count = 0; //counts number of inputs from user or external source
    int max = 0; //records highest grade
    int min = 100; //records lowest grade
    x = console.nextInt();
    
    while ( x > 0)
    { count++;
     
     if (x > max) max = x;
     
     if (x < min) min = x;
      
    if (x >= 97) gradeTotal[0]++; //A+
    else if(x >= 93) gradeTotal[1]++; //A
    else if(x >= 89) gradeTotal[2]++; //A-
    else if(x >= 85) gradeTotal[3]++; //B+
    else if(x >= 81) gradeTotal[4]++; //B
    else if(x >= 77) gradeTotal[5]++; //B-
    else if(x >= 73) gradeTotal[6]++; //C+
    else if(x >= 69) gradeTotal[7]++; //C
    else if(x >= 65) gradeTotal[8]++; //C-
    else if(x >= 61) gradeTotal[9]++; //D+
    else if(x >= 57) gradeTotal[10]++; //D
    else if(x >= 53) gradeTotal[11]++; //D-
    else gradeTotal[12]++; //F
    
    x = console.nextInt();
    }
   //Section to be printed out by Java.
    System.out.println("Total number of grades = " + count + ".");
    for ( int i = 0; i <= 12; i++)
    {
      if ( i == 1 || i == 4 || i == 7 || i == 10 || i == 12) // extra spaces to correct for lack of + or -.
      {
      System.out.println("Number of " + grades[i] + "'s  = " + gradeTotal[i]);
      }
      else
      {
        System.out.println("Number of " + grades[i] + "'s = " + gradeTotal[i]);
      }
    }
    System.out.println("The highest grade = " + max);
    System.out.println("The lowests grade = " + min);
    //Graph and percentage display
    System.out.println("   0    5    10   15   20   25   30   35   40   45   50   55   60   65   70   75   80   85   90   95   100%");
    System.out.println("   |    |    |    |    |    |    |    |    |    |    |    |    |    |    |    |    |    |    |    |    |");
    System.out.println("   +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    for (int i = 0; i < 13; i++)
    {
      if ( i == 1 || i == 4 || i == 7 || i == 10 || i == 12) // extra spaces to correct for lack of + or -.
      {
      System.out.print(grades[i] + "  ");
      }
      else
      {
        System.out.print(grades[i] + " ");
      }
      for (int j = 0; j < Math.round( gradeTotal[i] * 1.0 / count * 100 ); j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
