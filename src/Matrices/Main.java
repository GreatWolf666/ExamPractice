package Matrices;

import java.util.Arrays;

public class Main {
  static int[][] input1 = {{2, 1}, {0, 1}};
  static int[][] input2 = {{0, 3}, {-1, 1}};
  static int[][] output;


  public static void main(String[] args) {
    output = sortMatrix(input1, input2);
// Test case coming soon
  }

  static int[][] sortMatrix(int[][] input1, int[][] input2) {
//    new result variable, initialized and correct dimensions
    int[][] result = new int[input1.length][input1.length];
    for (int i = 0; i < input1.length; i++) {
      for (int j = 0; j < input1[i].length; j++) {
        result[i][j] = input1[i][j] > input2[i][j] ? input1[i][j] : input2[i][j];
      }
    }
    return result;
  }
}
