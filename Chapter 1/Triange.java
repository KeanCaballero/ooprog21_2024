public class Triangle {
    public static void main(String[] args) {
        for (int i = 0; i  <  7; i++) {
            // Print spaces
            for (int j = 7; j  >  i; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 0; k  <= i; k++) {
                System.out.print("T ");
            }
            System.out.println();
        }
    }
}
