import java.util.Scanner;
        
        
public class Uno {
    
    public static void main(String[] args) {
        
        
        
        Scanner scanner = new Scanner (System.in);
        
        int valorUno;
        
        int valorDos;
        
        
        
        System.out.println("Ingresa un numero");
        valorUno=Integer.parseInt (scanner.nextLine());
        
        System.out.println("Ingresa otro numero");
        valorDos=Integer.parseInt (scanner.nextLine());
        
        
        if (valorUno>valorDos)
            System.out.println("El numero mayor es"+valorDos);
        
        if (valorUno==valorDos)
            System.out.println("Los numeros son iguales");
        
        
        else
            System.out.println("El numero mayor es:"+valorDos);
    }  
}
