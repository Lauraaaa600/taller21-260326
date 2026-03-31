
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
}
