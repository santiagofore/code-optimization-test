import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
         Scanner scanner = new scanner(System.in);
         System.out.println(X:'Ingrese edad');
         final int AGE_LIMIT = scanner.nextInt();
           
        if (AGE_LIMIT >= 18) {
            System.out.println(x:"Access granted");
        }
        
        else {
            System.out.println(x:"Access denied");
        }
        scanner.close();
    }
}
