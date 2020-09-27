/*
Course: CS12300
Name: Ricky Schrombeck
Email: rschromb@pnw.edu
Assignment: 3

*/

/*

\     |\     |\     |  HEIGHT = 6
 \    | \    | \    |  WIDTH = 3
  \   |  \   |  \   |
   \  |   \  |   \  |
    \ |    \ |    \ |
     \|     \|     \|

\       |\       |\       |\       |\       |  HEIGHT = 8
 \      | \      | \      | \      | \      |  WIDTH = 5
  \     |  \     |  \     |  \     |  \     |
   \    |   \    |   \    |   \    |   \    |
    \   |    \   |    \   |    \   |    \   |
     \  |     \  |     \  |     \  |     \  |
      \ |      \ |      \ |      \ |      \ |
       \|       \|       \|       \|       \|

\   |\   |\   |\   |\   |\   |\   |\   |\   |\   |\   |\   |\   |\   |  HEIGHT = 4
 \  | \  | \  | \  | \  | \  | \  | \  | \  | \  | \  | \  | \  | \  |  WIDTH = 14
  \ |  \ |  \ |  \ |  \ |  \ |  \ |  \ |  \ |  \ |  \ |  \ |  \ |  \ |
   \|   \|   \|   \|   \|   \|   \|   \|   \|   \|   \|   \|   \|   \|

*/
public class Hw3
{
   public static final int HEIGHT = 6;
   public static final int WIDTH = 3;

   public static void main(String[] args)
   {
     for (int i = 1; i <= HEIGHT; i++) {
       for (int j = 1; j <= WIDTH; j++) {
         for (int l = 1; l <= i - 1; l++) {
           System.out.print(" ");
         }
         System.out.print("\\");
         for (int k = 1; k <= HEIGHT - i; k++) {
           System.out.print(" ");
         }
         System.out.print("|");
       }
       System.out.println();
     }
   }
}