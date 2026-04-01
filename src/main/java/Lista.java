
public class Lista {

        Nodo primerNodo;
    public Lista(){
            this.primerNodo=null;
        }
    public void insertar(int dato){
        Nodo nuevoNodo=new Nodo(dato);
        nuevoNodo.siguienteNodo=primerNodo;
        
    }    
    public void mostrarOrdenado(Nodo Nodo){
        if(primerNodo==null)return;
        mostrarOrdenado(primerNodo.siguienteNodo);
        System.out.print(primerNodo.dato);
        
    }
    public int calcularFaltante(int total){
        int sumaEsperada = total*(total+1)/2;
        int sumaLista=0;
        
        for(Nodo actual = primerNodo;actual!=null;actual=actual.siguienteNodo){
            sumaLista+= actual.dato;
        }
        return sumaEsperada-sumaLista;
    }
}
