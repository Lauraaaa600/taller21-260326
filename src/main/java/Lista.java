
public class Lista {

        Nodo primerNodo;
        public Lista(){
            this.primerNodo=null;
        }
        public void insertar(int dato){
            Nodo nuevoNodo=new Nodo(dato);
            nuevoNodo.siguienteNodo=primerNodo;
            primerNodo=nuevoNodo;
        
    }    
    public void mostrarOrdenado(Nodo nuevoNodo){
        if(nuevoNodo==null)return;
        mostrarOrdenado(nuevoNodo.siguienteNodo);
        System.out.print(nuevoNodo.dato);
        
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
