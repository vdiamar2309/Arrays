import util.MiEntradaSalida;

import java.util.Arrays;
import java.util.HashSet;


public class Main {
    static void main(String[] args) {
    int [] array = new int[MiEntradaSalida.solicitarEnteroPositivo("Cuantas posiciones quiere que tenga el array?")];
        insertarNumerosArray(array);
        double media= (double) Arrays.stream(array).sum()/ array.length;

        System.out.println("La media del array es "+media);
        System.out.println();
        numeroMenor(array);

        HashSet<Integer> numeroUnico= extraerNumerosUnicos(array);

        int numeroRepetido;
        int vecesRepetido;
        for (int i = 0; i < array.length; i++) {





        }




    }

    private static HashSet<Integer> extraerNumerosUnicos(int[] array) {
        HashSet <Integer> numerosUnicos = new HashSet<>();
        for (int i : array){
            numerosUnicos.add(i);
        }
        return numerosUnicos;
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
