package cote;
    import java.util.Scanner;

public class star {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            int i = 0;
            int j = 0;
            for (j = 0; j < b; j++) {
            for (i = 0; i < a; i++) {
                System.out.printf("*");
            }

                System.out.println();
            }
        }
    }

