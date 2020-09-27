/*
   Course: CS 12300
   Name: Ricky Schrombeck
   Email: rschromb@pnw.edu
   Assignment: 4
*/

import java.util.Scanner;

public class Hw4
{
  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    
    for (int i = 1; i <= 15; i++)
    {
      System.out.println("\nPlease enter a valid data of the form mm/dd/yyyy.");
      
      String dateString = console.next();
      checkDate(dateString);
    }
  }
  
  public static void checkDate(String dateString)
  {
    String savedDate = dateString;
    
    String monthString = dateString.substring(0, dateString.indexOf("/"));
    
    dateString = dateString.substring(dateString.indexOf("/") + 1);
    
    String dayString =  dateString.substring(0, dateString.indexOf("/"));
    
    String yearString = dateString.substring(dateString.indexOf("/") + 1);
    
    if ( monthString.length() != 2 )
    {
      System.out.println("Error with " + savedDate + ": The month must have two digits.");
      return;
    } 
    if ( dayString.length() != 2 )
    {
      System.out.println("Error with " + savedDate + ": The day must have two digits.");
      return;
    }
    if ( yearString.length() != 4 )
    {
      System.out.println("Error with " + savedDate + ": The year must have four digits.");
      return;
    }
    
    int month = Integer.parseInt( monthString );
    
    int day = Integer.parseInt( dayString );
    
    int year = Integer.parseInt( yearString );
    
    if ( month > 12 || month < 1 )
    {
      System.out.println("Error with " + savedDate + ": The month must be between 1 and 12.");
      return;
    }
    if ( year % 4 == 0 && (year % 400 == 0 || year % 100 != 0) )
    {
      if ( month == 2 )
      {
        if ( day <= -1 || month <= -1 || year <= -1 )
        {
          System.out.println("Error with, " + savedDate + ": The date must be positive.");
          return;
        }
        if ( day < 1 )
        {
          System.out.println("Error with " + savedDate + ": That month must be between 1 and 29 days.");
          return;
        }
        if ( day > 29 )
        {
          System.out.println("Error with " + savedDate + ": February of that year has 29 days.");
          return;
        }
        if ( day <= 29 && day > 0 )
        {
          System.out.println("The date you entered, " + savedDate + ", is a valid date.");
          return;
        }
      }
    }
    if ( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
    {
      if ( day <= -1 || month <= -1 || year <= -1 )
      {
        System.out.println("Error with, " + savedDate + ": The date must be positive.");
        return;
      }
      if ( day <= 31 && day > 0 )
      {
        System.out.println("The date you entered, " + savedDate + ", is a valid date.");
        return;
      }
      if ( day > 31 || day < 1  )
      {
        System.out.println("Error with " + savedDate + ": That month must be between 1 and 31 days.");
        return;
      }
    }
    if ( month == 4 || month == 6 || month == 9 || month == 11 )
    {
      if ( day <= -1 || month <= -1 || year <= -1 )
      {
        System.out.println("Error with, " + savedDate + ": The date must be positive.");
        return;
      }
      if ( day <= 30 && day > 0 )
      {
        System.out.println("The date you entered, " + savedDate + ", is a valid date.");
        return;
      }
      if ( day > 30 || day < 1 )
      {
        System.out.println("Error with " + savedDate + ": That month must be between 1 and 30 days.");
        return;
      }
    }
    if ( month == 2 )
    {
      if ( day <= -1 || month <= -1 || year <= -1 )
      {
        System.out.println("Error with, " + savedDate + ": The date must be positive.");
        return;
      }
      if ( day < 1 )
      {
        System.out.println("Error with " + savedDate + ": That month must be between 1 and 28 days.");
      }
      if ( day > 28 )
      {
        System.out.println("Error with " + savedDate + ": February of that year has 28 days.");
        return;
      }
      if ( day <= 28 && day > 0 )
      {
        System.out.println("The date you entered, " + savedDate + ", is a valid date.");
        return;
      }
    }
  }
}