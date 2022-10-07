import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Write a program that writes a triangle of '@'. The user enters the initial number of '@' (Scanner), and the program writes out lines of '@'. Each line has one more '@' than the previous line: (  public class Triangle {  /* write code here */ }  )

        int input = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        input = scanner.nextInt();

        // Soma's solution
        // for (int i = input; i > 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         if (j + 1 == i) {
        //             System.out.print("@\n");
        //         } else {
        //             System.out.print("@");
        //         }

        //     }
        // }

        // Aya's Solution
        for(int i = input; i > 0; i--){
            System.out.println("@".repeat(i));
        }
        
        // Shoiri's solution
        // for(int i = input; i > 0; i--){
        //     for(int j = i; j > 0; j--) {
        //         if(j == 1){
        //             System.out.println("@");
        //         }else{
        //             System.out.print("@");
        //         }
        //     }
        // }

        // Nested loop solution
        // while (input != 0) {
        //     for (int i = 0; i < input; i++) {
        //         for (int j = input - i; j > 0; j--) {
        //             System.out.print("@");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println("Enter a number: ");
        //     input = scanner.nextInt();
        // }
        // scanner.close();


        // Maho's solution
        // System.out.println("Enter the initial number of d's");

        // System.out.println("You entered:" + input);
        // for (int i = 0; i < input; i++) {
        //     for (int j = 0; j < input - i; j++) {
        //         System.out.print("@");
        //     }
        //     System.out.println();
        // }

        scanner.close();
    }
}
