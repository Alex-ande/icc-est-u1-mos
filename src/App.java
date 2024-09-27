public class App {
    public static void main(String[] args) throws Exception {
        MetodosOrdenamiento metodo = new MetodosOrdenamiento();
        int []arreglo={5,7,30,12,9};
        metodo.sortyBySeleccion(arreglo);
        metodo.printArreglo(arreglo);
    }
}
