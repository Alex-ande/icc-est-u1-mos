public class MetodosOrdenamiento {
public int[] sortyBySeleccion (int[]arreglo){
int tamaño = arreglo.length;
for (int i = 0; i < tamaño; i++) {
    int indice = i;
    for (int j = i+1; j < tamaño; j++) {
        if (arreglo[i]> arreglo[indice] ) {
            indice = j;

        }
    }
    int aux = arreglo [indice];
    arreglo [indice] = arreglo[i];
    arreglo[i]=aux;
}
return arreglo;
}
}

public void printArreglo(int []arreglo){
    for (int elemento:arreglo){
        System.out.println(elemento +"-");
    }

       

}
