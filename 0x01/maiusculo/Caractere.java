package maiusculo;

public class Caractere {
    public static boolean EhMaiusculo(char c) {
        if (65 <= c && c <= 90)
            return true;
        else
            return false;

    }
}
