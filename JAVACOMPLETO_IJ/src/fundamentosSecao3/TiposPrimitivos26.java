package fundamentosSecao3;

public class TiposPrimitivos26 {
    public static void main(String[] args) {
        //informações do funcionario

        //tipo numérico inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontoAcumulados = 2_343_343_343L;//passando que é um inteiro

        //tipos numericos reais
        float salario = 1110.00F;//leteral float
        double vendasAcumuladas = 2_991342_34;

        //booleano
        boolean estaDeferias = false;//true

        //Tipo de caracteres
        char status = 'A';

        //Dias de empresa
        System.out.println(anosDeEmpresa*365);

        //numeros de viagens
        System.out.println(numeroDeVoos*2);

        //pontos por real
        System.out.println(pontoAcumulados/vendasAcumuladas);

        System.out.println(id + ": ganha-> "+salario);

        System.out.println("Ferias: "+estaDeferias);
        System.out.printf("Status"+status);;

    }

}
