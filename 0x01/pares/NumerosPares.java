public class NumerosPares {
    public static void main(String[] args) {
        int num = 98;
        for (int i = 0; i < 98; i++) {
            if (i % 2 == 0){
                System.out.printf(i + ", ");
            }
        }
        System.out.printf("%d\n", num);
    }
}
