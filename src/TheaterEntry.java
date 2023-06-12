import java.util.Scanner;
public class TheaterEntry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double age = 0;
        double RESTRICTED_AGE = 21;
        String trash = "";
        System.out.println("Enter your age.");
        if(in.hasNextDouble()) {
            age = in.nextDouble();
            in.nextLine();//clear the buffer
        }
        else {
            trash = in.nextLine();
            System.out.println("You must enter a valid number not " + trash);
            System.out.println("Run the program again!");
            System.exit(0);
        }
        if (age >= RESTRICTED_AGE) {
            System.out.println("You get a paper wristband");
        }
    }
}