/*
Course: CS12300
Name: Ricky Schrombeck
Email: rschromb@pnw.edu
Assignment: 2
*/

public class Hw2
{
   public static void main(String[] args)
   {
     method1();
     System.out.println();
     method1();
     method2();
     System.out.println();
     method2();
     method3();
     method1();
     method3();
   }

   public static void method1() {
     method2();
     System.out.println(" * * ");
     System.out.println("  *  ");
     System.out.println(" * * ");
   }
   public static void method2() {
     System.out.println("*****");
     System.out.println("*****");
   }
   public static void method3() {
     System.out.println("  *  ");
     System.out.println("  *  ");
     System.out.println("  *  ");
   }
}