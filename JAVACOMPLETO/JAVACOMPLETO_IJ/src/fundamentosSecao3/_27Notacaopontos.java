package fundamentosSecao3;

public class _27Notacaopontos {
    public static void main(String[] args) {
        String s = "Bom dia x";
        s = s.replace("x", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Leo".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X"
                .replace("X", x)
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

        ///TIPOS PRIMITIVOS NÃO TEM OPERADOR .


    }
}
