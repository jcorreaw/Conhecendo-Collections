package estudos.generics;

import java.util.ArrayList;
import java.util.Formattable;
import java.util.List;
import java.util.Objects;

public class GenericsExempleList {
    public static void main(String[] args) {
        // Sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add("10");

        for (Object elemento : listaSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }

        // com Generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }
    }
}
