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
        // for(int i = input; i > 0; i--){
            // for will iterate from 1 to input
            // System.out.println("@".repeat(i));
            // repeat will repeat the string by the number of times
            // that is passed to it
            // so if i = 5, then "@".repeat(i) will print @@@@@
            // if i = 3, then "@".repeat(i) will print @@@
            // if i = 1, then "@".repeat(i) will print @
            // if i = 0, then "@".repeat(i) will print nothing
            // and the loop will end
        // }
        
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

        // Maho's solution
        // System.out.println("Enter the initial number of d's");

        // System.out.println("You entered:" + input);
        // for (int i = 0; i < input; i++) {
        //     for (int j = 0; j < input - i; j++) {
        //         System.out.print("@");
        //     }
        //     System.out.println();
        // }

        // Nested loop solution
        while (input != 0) {
            // Create a loop that will run until the input is 0
            // This loop will print the number of @'s that the user entered
            for (int i = 0; i < input; i++) {
                // This loop will print the @'s
                // The number of @'s will be the same as the input
                for (int j = input - i; j > 0; j--) {
                    // This loop will print the @'s
                    // The number of @'s will be the same as the input
                    // The number of @'s will decrease by 1 each time
                    System.out.print("@");
                    // Print the @'s
                }
                System.out.println();
                // Print a new line
            }
            System.out.println("Enter a number: ");
            input = scanner.nextInt();
            // Ask the user to enter a new number
        }
        // scanner.close();

        scanner.close();
        // scanner.close(); for the scanner to close and not give an error message
    }
}
