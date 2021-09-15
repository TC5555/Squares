public class squres {
    public static void main(String[] args) {
        for (int j = 1; j <= 10; j++) {
            int i = j;
            int a = j;
            for (int k = 2; k <= a; k++) {
                i = i + a;
            }
            System.out.print(i + " ");
        }
    }
}
