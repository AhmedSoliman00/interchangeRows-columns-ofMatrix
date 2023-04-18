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
        int choice = 0;
        while (true) {
            System.out.println("Enter 1 to interchange rows");
            System.out.println("Enter 2 to interchange columns");
            System.out.println("Enter 3 to Exit");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the row numbers:");
                    int row1 = scan.nextInt(); // to Select rows you want to interchange
                    int row2 = scan.nextInt();
                    int temp = 0;
                    for (int i = 0; i < nOfRows; i++) {
                        temp = arr[row1 - 1][i];           // to interchange positions between rows
                        arr[row1 - 1][i] = arr[row2 - 1][i];
                        arr[row2 - 1][i] = temp;
                    }
                    System.out.println("Matrix after interchanging row " + row1 + "with" + row2);
                    for (int i = 0; i < nOfRows; i++) {
                        for (int j = 0; j < nOfColumns; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter the row numbers:");
                    int col1 = scan.nextInt(); // to Select columns you want to interchange
                    int col2 = scan.nextInt();
                    int temp2 = 0;
                    for (int i = 0; i < nOfRows; i++) {
                        temp2 = arr[col1 - 1][i];           // to interchange positions between columns
                        arr[col1 - 1][i] = arr[col2 - 1][i];
                        arr[col2 - 1][i] = temp2;
                    }
                    System.out.println("Matrix after interchanging row " + col1 + "with" + col2);
                    for (int i = 0; i < nOfRows; i++) {
                        for (int j = 0; j < nOfColumns; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.exit(0); // to exit the programme if choice = 3
            }
        }
    }
}
