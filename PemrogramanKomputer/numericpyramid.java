public class numericpyramid {
    public static void main(String[] args) {
        final int ROWS = 6;

        System.out.println("Pattern A");
        for (int row = 1; row <= ROWS; row++) {
            for (int num = 1; num <= row; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern B");
        for (int row = 1; row <= ROWS; row++) {
            for (int num = 1; num <= ROWS - row + 1; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern C");
        for (int row = 1; row <= ROWS; row++) {
            for (int space = 1; space <= ROWS - row; space++) {
                System.out.print("  ");
            }
            for (int num = row; num >= 1; num--) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern D");
        for (int row = 1; row <= ROWS; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print("  ");
            }
            for (int num = 1; num <= ROWS - row + 1; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
