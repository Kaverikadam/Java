interface Developer {
	void coding();
	
	
	default void disp1() {
		System.out.println("Inside method");
	}
	static void disp2() {
		System.out.println("Inside method");
	}
	
	static void disp3() {
		System.out.println("Inside method");
	}

}

//
//import java.util.Scanner;
//
//
//
//public class Main {
//
//  public static boolean isSymmetric(int[][] matrix) {
//
//    int rows = matrix.length;
//
//    int cols = matrix[0].length;
//
//    if (rows != cols) {
//
//      return false; // A non-square matrix cannot be symmetric.
//
//    }
//
//
//
//    for (int i = 0; i < rows; i++) {
//
//      for (int j = 0; j < i; j++) {
//
//        if (matrix[i][j] != matrix[j][i]) {
//
//          return false;
//
//        }
//
//      }
//
//    }
//
//    return true;
//
//  }
//
//
//
//  public static boolean isOrthogonal(int[][] matrix) {
//
//    int rows = matrix.length;
//
//    int cols = matrix[0].length;
//
//    if (rows != cols) {
//
//      return false; // A non-square matrix cannot be orthogonal.
//
//    }
//
//
//
//    // Check if the transpose of the matrix is its inverse.
//
//    int[][] transpose = new int[rows][cols];
//
//    for (int i = 0; i < rows; i++) {
//
//      for (int j = 0; j < cols; j++) {
//
//        transpose[i][j] = matrix[j][i];
//
//      }
//
//    }
//
//
//
//    // Check if the matrix times its transpose is the identity matrix.
//
//    int[][] product = new int[rows][cols];
//
//    for (int i = 0; i < rows; i++) {
//
//      for (int j = 0; j < rows; j++) {
//
//        for (int k = 0; k < cols; k++) {
//
//          product[i][j] += matrix[i][k] * transpose[k][j];
//
//        }
//
//      }
//
//    }
//
//
//
//    for (int i = 0; i < rows; i++) {
//
//      for (int j = 0; j < cols; j++) {
//
//        if (i == j && product[i][j] != 1) {
//
//          return false;
//
//        }
//
//        if (i != j && product[i][j] != 0) {
//
//          return false;
//
//        }
//
//      }
//
//    }
//
//    return true;
//
//  }
//
//
//
//  public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);
//
//    int rows = scanner.nextInt();
//
//    int cols = scanner.nextInt();
//
//    int[][] matrix = new int[rows][cols];
//
//    for (int i = 0; i < rows; i++) {
//
//      for (int j = 0; j < cols; j++) {
//
//        matrix[i][j] = scanner.nextInt();
//
//      }
//
//    }
//
//    boolean symmetric = isSymmetric(matrix);
//
//    boolean orthogonal = isOrthogonal(matrix);
//
//    if (symmetric && orthogonal) {
//
//      System.out.println("The matrix is symmetric and orthogonal.");
//
//    } else if (symmetric) {
//
//      System.out.println("The matrix is symmetric but not orthogonal.");
//
//    } else {
//
//      System.out.println("The matrix is not symmetric.");
//
//    }
//
//  }
//
