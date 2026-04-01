import java.util.Scanner;
import java.util.Random;

public class Taller21260326 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Random rand = new Random ();
        
        System.out.println("Ingrese un numero: ");
        int n =sc.nextInt();
        
        int faltante = rand.nextInt(n)+1;
        Lista lista=new Lista();
     
     for(int i=1; i<n; i++){
         if(i!=faltante){
         lista.insertar(i);
        }
     }
        System.out.println(lista.calcularFaltante(n));
    }
    
}
