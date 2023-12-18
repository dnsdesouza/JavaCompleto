package fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        //(ºF-32)x5/9 = ºC  Formula

        final double AJUSTE = 32;
        final double FATOR = (5.0/9);

        double farenh = 86;
        double celc  = (farenh-AJUSTE)*FATOR;


        System.out.println(farenh+"ºF equivale a "+celc+"ºC");

         farenh = 100;
        celc  = (farenh-AJUSTE)*FATOR;
        System.out.println(farenh+"ºF equivale a "+celc+"ºC");




    }
}
