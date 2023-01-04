// Write a program to find summation, subtraction and multiplication of two 3X4 matrices?

import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        int col1 = 3, col2 = 3, row1 = 4, row2 = 4;
        Scanner sc = new Scanner(System.in);
        int matrix1[][] = new int[col1][row1];
        int matrix2[][] = new int[col2][row2];
        int add[][] = new int[col1][row1];
        int substract[][] = new int[col1][row1];
        int multiple[][] = new int[col1][row1];

        // first matrix
        System.out.println("enter the numbers in first matrix : ");
        for (int i = 0; i < col1; i++) {
            for (int j = 0; j < row1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // second metrix
        System.out.println("enter the numbers in second matrix : ");
        for (int i = 0; i < col2; i++) {
            for (int j = 0; j < row2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // summation
        System.out.println("the sum of the two matrix is: \n");

        for (int i = 0; i < col1; i++) {
            for (int j = 0; j < row1; j++) {
                add[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.println(add[i][j] + "\t");
            }
            System.out.println("\n");
        }

        // substraction
        System.out.println("the substraction of the two matrix is: \n");

        for (int i = 0; i < col1; i++) {
            for (int j = 0; j < row1; j++) {
                substract[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.println(substract[i][j] + "\t");
            }
            System.out.println("\n");
        }

        // multiplication

        if (col2 != row1) {
            System.out.println("the multiplication is not possible ...");
        } else {

            System.out.println("the multiplication of the two matrix is: \n");
            for (int i = 0; i < col1; i++) {
                for (int j = 0; j < row1; j++) {
                    for (int k = 0; k < row2; k++) {
                        multiple[i][j] += matrix1[i][k] * matrix2[k][j];
                        System.out.println("\t" + multiple[i][j]);

                    }

                }
                System.out.println("\n");
            }
        }

    }

}
