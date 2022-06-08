package refazendo_task0;


import java.util.TreeMap;


public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String palavras) {
        TreeMap<String, Integer> map = new TreeMap<>();
        palavras = palavras.replace("?", "");
        palavras = palavras.replace(".", "");
        palavras = palavras.replace("!", "");

        //"Guilherme e Paula"

        String[] teste = palavras.split(" ");
        //["Guilherme", "e", "Paula"];

        int cont = 0;

        for (int i = 0; i < teste.length; i++) {
            for (int j = 0; j < teste.length; j++) {
                if (teste[i].equalsIgnoreCase(teste[j])) {
                    cont++;
                }
            }
            map.put(teste[i].toLowerCase(), cont);
            cont = 0;
        }
        return map;


//        List<String> words = new ArrayList<String>(List.of(frase.toLowerCase().split("[ ?.!]+")));
//        TreeMap<String, Integer> result = new TreeMap<String, Integer>();
//
//        words.forEach(word -> {
//            result.compute(word, (key, value) -> {
//                if(value == null)
//                    return 1;
//                else
//                    return value + 1;
//            });
//        });
//
//        return result;


    }
}
