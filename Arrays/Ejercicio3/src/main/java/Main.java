import util.MiEntradaSalida;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class Main {
    static void main(String[] args) {
    int [] array = new int[MiEntradaSalida.solicitarEnteroPositivo("Cuantas posiciones quiere que tenga el array?")];
        insertarNumerosArray(array);
        double media= (double) Arrays.stream(array).sum()/ array.length;

        System.out.println("La media del array es "+media);
        System.out.println();
        numeroMenor(array);


        int numeroGuardado = 0;
        int vecesGuardado = 0;
        int veces = 0;
        for (int i : array) {
            veces=0;
            for (int j : array) {
                if (i == j) {
                    veces++;
                }
            }
            if (veces > vecesGuardado) {
                numeroGuardado = i;
                vecesGuardado = veces;
            }
        }
        System.out.println("El numero "+numeroGuardado+" se ha repetido "+vecesGuardado+" veces");

    }


    private static void numeroMenor(int[] array) {
        int numeroMenor=Integer.MAX_VALUE;
        for (int i : array){
            if (i < numeroMenor){
                numeroMenor=i;
            }
        }
        System.out.println("El numero menor del array es: "+numeroMenor);
    }

    private static void insertarNumerosArray(int[] array) {
        int posicion=1;
        for(int i =0 ; i < array.length; i++){
            array[i] =MiEntradaSalida.solicitarEntero("Inserta un numero entero en la posición "+posicion);
            posicion++;
        }
    }


}
