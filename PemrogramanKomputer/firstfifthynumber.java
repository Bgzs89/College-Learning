public class firstfifthynumber {
    public static void main(String[] args) {
        final int TOTAL = 50;
        final int PER_LINE = 10;
        int count = 0;      
        int number = 2;   

        while (count < TOTAL) {
            boolean Prime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    Prime = false;
                    break;
                }
            }

            if (Prime) {
                count++;
                System.out.printf("%5d", number);
                if (count % PER_LINE == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }
}