package HomeWorks.HW2;
/* Если необходимо, исправьте данный код*/
public class exe2 {
    try {
        int d = 0;
        int[] intArray = new int[10];
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Catching exception: " + e);
    }
     
}
