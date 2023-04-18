import java.util.Scanner;

public class MatrixInterchange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nOfRows, nOfColumns;
        System.out.println("Enter Number Of Rows:");
        nOfRows = scan.nextInt();
        System.out.println("Enter Number Of Columns:");
        nOfColumns = scan.nextInt();
        int arr[][] = new int[nOfRows][nOfColumns];
        System.out.println("Enter Matrix Element:");
        for (int i = 0; i < nOfRows; i++) {
            for (int j = 0; j < nOfColumns; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("The Matrix Is:");
        for (int i = 0; i < nOfRows; i++) {
            for (int j = 0; j < nOfColumns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
