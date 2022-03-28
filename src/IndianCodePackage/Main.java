package IndianCodePackage;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5 - i) {
                    for (int k = i; k < (i + (i * 2) - 1); k++) {
                        System.out.print("*");
                        j++;
                    }
                } else if (j == (i - 5)) {
                    for (int k = (i - 7); k <= 10 - i + 1; k++) {
                        if (j < 10) {
                            System.out.print("*");
                            j++;
                        }
                    }
                } else System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}
