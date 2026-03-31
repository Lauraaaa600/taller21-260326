import java.util.Scanner;
public class Taller21260326 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int n =sc.nextInt();
       
     Lista lista=new Lista();
     
     for(int i=0; i<n-1;i++){
         //error
         int numero=sc.nextInt();
         lista.insertar(numero);
     }
        System.out.println(lista.calcularFaltante(n));
    }
    
}
