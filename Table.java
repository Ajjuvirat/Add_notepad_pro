import java.util.Scanner;

public class Table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Digit : ");
        int a = sc.nextInt();  // user input: kitne tables chahiye (e.g. 5)

        for (int i = 1; i <= 10; i++) {        // ✅ outer loop → 10 rows banayega
            for (int j = 1; j <= a; j++) {     // ✅ inner loop → 1 se a tak tables print karega
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");  // same line me print
            }
            System.out.println();  // ✅ ek row khatam hone ke baad new line
        }

        sc.close();
    }
}
