/*
   Course: CS 12300
   Name: Ricky Schrombeck
   Email: rschromb@pnw.edu
   Assignment: 6
*/

public class RotateArray
{
  /**
   This method takes in a reference to an integer array and a
   positive integer n and it "rotates" the contents of the input
   array to the right n places. So each element a[i] of the input
   array should be moved to location a[i+n]. If the index i+n is
   past the end of the array, then that index should "wrap" back
   to the beginning of the array.
   
   For example, if the input array is a = {1, 2, 3, 4, 5}, then
   rotateRight(a, 2) should modify a to contain {4, 5, 1, 2, 3}.
   
   Notice that this is a void method since it does not return
   anything. The job of this method is to modify the input array.
   */
  public static void rotateRight(int[] a, int n)
  {
    while(n > a.length) //test to make sure n isn't larger than a.length
    {
      n = n - a.length;//reduce n while it is larger than a.length by cycles of a.length
    }
    int[] x = new int[a.length]; //create array for temp storage in new order.
    for (int i = 0; i < a.length; i++)
    {
      if ((i + n) < a.length) //test to avoid out of bounds error.
      {
        x[n + i] = a[i]; //swap values for values larger than n.
      }
      else
      {
        for(int j = 0; j < n; j++) //swap values for values less than n.
        {
          x[j] = a[i];
          i++;
        }
      }
    }
    for (int i = 0; i < a.length; i++) //finalize new placement of values into original array.
    {
      a[i] = x[i];
    }
  }
  
  
  /**
   This method takes in a reference to an integer array and a
   positive integer n and it returns a new array whose contents
   is the contents of the input array "rotated" to the left n places.
   So each element a[i] of the input array should be placed at
   location b[i-n] of the returned array. If the index i-n is
   negative, then that index should "wrap" around to the end of
   the output array.
   
   For example, if the input array is a = {1, 2, 3, 4, 5}, then
   rotateLeft(a, 2) should return an array containing {3, 4, 5, 1, 2}.
   
   This method should not make any changes to the input array.
   */
  public static int[] rotateLeft(int[] a, int n)
  {
    while(n > a.length)//test to make sure n isn't larger than a.length
    {
      n = n - a.length;//reduce n while it is larger than a.length by cycles of a.length
    }
    int[] b = new int[a.length];
    for (int i = 0; i < a.length; i++)
    {
      if ((i - n) < 0)
      {
        b[a.length - (n - i)] = a[i];
      }
      else
      {
        b[i - n] = a[i] ; 
      }
    }
    return b;
  }
}//RotateArray
