package HomeWorks.HW2;
/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */
import java.util.Scanner;

public class exe4 {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numAsSyr = scanner.nextLine();
        try {
            double d = Double.parseDouble(numAsSyr.trim());
        }catch (NumberFormatException ex) {
            System.out.println("Пустую строку вводить нельзя!");
        }
    }
}