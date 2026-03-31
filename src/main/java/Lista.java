
public class Lista {

        Nodo primerNodo;
    public Lista(){
            this.primerNodo=null;
        }
    public void insertar(int dato){
        Nodo nuevoNodo=new Nodo(dato);
        nuevoNodo.siguienteNodo=this.primerNodo;
        this.primerNodo=nuevoNodo;
    }    
    public int calcularFaltante(int n){
        int suma = n*(n+1)/2;
        for(Nodo actual = primerNodo;actual!=null;actual=actual.siguienteNodo){
            suma -= actual.dato;
        }
        return suma;
    }
}
