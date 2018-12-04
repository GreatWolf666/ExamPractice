package Matrices;

import java.util.Arrays;

public class Main {
  static int[][] input1 = {{2, 1}, {0, 1}};
  static int[][] input2 = {{0, 3}, {-1, 1}};
  static int[][] output = new int[2][2];


  public static void main(String[] args) {


    for (int i = 0; i < input1.length; i++) {
      for (int j = 0; j < input1[i].length; j++) {
        output[i][j] = input1[i][j] > input2[i][j] ? input1[i][j] : input2[i][j];

      }
    }
    System.out.println();
  }
}
