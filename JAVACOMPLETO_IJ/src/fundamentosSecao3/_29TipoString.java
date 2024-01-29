package fundamentosSecao3;

public class _29TipoString {

        public static void main(String[] args) {

                System.out.println("LETRA NO ÍDICE 5");
                System.out.println("Ola Pessoal".charAt(5));

                String s ="Boa tarde";
                s = s.toUpperCase();
                System.out.print("s = s.toUpperCase(); //JOGA TUDO PRA DE s UpCASE");
                System.out.println(s.concat("!!!"));//CONCATENA S COM !!!
                System.out.print(s.length());
                System.out.println("  //Comprimento de s");
                System.out.println(s.startsWith("BOA"));//Pergunta se começão com BOA
                System.out.println(s.endsWith("tarde"));//VERIFICA SE COMEÇA COM TARDE
                System.out.println(s.equalsIgnoreCase("boa tarde"));//VERIFICA SE É IGUAL IGNORANDO MAIÚSCULA E MINUSCULA

                var nome = "Pedro";
                var sobrenome = "Sampaio";
                var idade = 33;
                var salario = 123445;

                System.out.println("Nome: "+nome+"\nSobrenome: "+sobrenome
                +"\nSalario: "+salario+"\n\n");//jeito antigo de imprimir na tela

                System.out.printf("Nome: %s %s tem %d anos "
                        , nome, sobrenome, idade);

                System.out.println(" ");
                System.out.println("=============== ");

                //ATUALIZADO 28/01   AULA 29 JAVA COMPLETO UDEMY

//                SEQUENCIA DE ATUALIZAÇÃO DE REPOSITORIO GIT
//
//                git init
//                git branch
//                commit -m "atualização aula 29  completo 28Jan"
//                git push origin master  # ou a branch desejada
//                git add .
//                git push origin master
//                git push origin master --force






        }
}
