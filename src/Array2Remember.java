import java.util.Scanner;

public class Array2Remember {
    public static void main(String[] args) {
        String[] presidents = {"Kennedy", "Johnson", "Nixon", "Ford", "Carter", "Reagan", "Bush", "Clinton", "Bush", "Obama"};
        String input;

        for (int i = 0; i < presidents.length; i++) {
            System.out.println(presidents[i]);
        }

        System.out.println();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to print the presidents in historical order (Y|N)");
        input = keyboard.nextLine().toUpperCase();

        if (input.equals("Y")) {
            System.out.println();
            for (int j = presidents.length - 1; j >= 0; j--) {
                System.out.println(presidents[j]);
            }
        }

    }
}
