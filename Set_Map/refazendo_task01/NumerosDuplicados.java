package refazendo_task01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numeros){
        TreeSet<Integer>numerosDuplicados = new TreeSet<>();
        HashSet<Integer>duplicados = new HashSet<>();
        //[1,2,3,3,4,5,3]
        for(int i=0; i<numeros.length; i++){
            if(duplicados.add(numeros[i]) == false){
                numerosDuplicados.add(numeros[i]);
            }

        }
        return numerosDuplicados;

    }
}
