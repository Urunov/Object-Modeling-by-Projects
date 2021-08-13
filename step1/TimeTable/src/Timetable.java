import java.util.Scanner;
public class Timetable {
    //
    public static void main(String[] args) {
        System.out.print("Enter number :> ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            for (int k=1; k<=n; k++) {

                for (int i = 1; i <= 9; i++) {
                    System.out.print(i + " x " + 9 + " = " + i * 9);
                    System.out.println("");
                }
                System.out.println("-------");
            }
    }
}
