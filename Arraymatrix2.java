import java.util.*;

class Arraymatrix2 {
  public static void main(String args[]) {
    int arr[][] = new int[3][3];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your vales :");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        arr[i][j] = sc.nextInt();

      }

    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(" " + arr[i][j]);

      }
      System.out.println();
    }
  }
}