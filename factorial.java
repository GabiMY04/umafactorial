import java.util.Scanner;
public class factorial {
    public static void main(String []args) 
    {
    long num = scanInput.nextLong();
    long fac = 1; 
    Scanner scanInput = new Scanner(System.in);

    System.out.print("Introduzca un numero: ");

    for (long i=1; i<=num; ++i) {
        fac = fac * i;
    }
    System.out.println("El factorial de "+num+" es "+fac);
    scanInput.close();
    }
}
