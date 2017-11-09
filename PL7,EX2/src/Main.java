import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        teste();}


        /*String[] nomesFuncionarios = new String[50];

        int nFunc = listagemfuncionarios(nomesFuncionarios);


        double[] vencimentos = new double[nFunc];
        vencimentos = vencimentosFuncionarios(vencimentos, nomesFuncionarios);
        double mediaVencimentos = media(vencimentos);
        System.out.println("Os funcionarios com vencimentos inferior á media são: ");
        listagemInferiorMedia(vencimentos, nomesFuncionarios, mediaVencimentos);
        double valorDefinido = valorUtilizador();
        double percentagem = percentagemInferior(valorDefinido, vencimentos);
        System.out.println("a percentagem de funcionarios com ordenado inferior a " + valorDefinido + " é " + percentagem);


    }



    public static int listagemfuncionarios(String[] nomes) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String cenas="";
        do {

            System.out.println("Escreva o nome do funcionário, para terminar digite tt");

            nomes[i] = scanner.nextLine();
            i++;

        } while (!nomes[i-1].equals("tt"));
        nomes[i-1] = null;
        return i-1;

    }




    public static double[] vencimentosFuncionarios(double[] ordenados, String[] nomes) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for (i = 0; i < ordenados.length; i++) {
            System.out.println("digite o ordenado do funcionario " + nomes[i]);
            ordenados[i] = scanner.nextDouble();
        }
        return ordenados;

    }*/

    public static double media(double[] vencimentos) {
        int i = 0;
        double soma = 0;
        int contador = 0;
        for (i = 0; i < vencimentos.length; i++) {
            soma = soma + vencimentos[i];
            contador++;

        }
        double media = soma / contador;
        return media;
    }

    public static String[] listagemInferiorMedia(double[] vencimentos, String[] nomes, double media) {
        int i = 0;
        String[] teste = new String[4];
        int j= 0;
        for (i = 0; i < vencimentos.length; i++) {
            if (vencimentos[i] < media) {
                /*System.out.println(nomes[i]);*/
                teste[j]=nomes[i];
                j++;

            }
        }return teste;

    }

    /*public static double valorUtilizador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual o cut-off para o qual deseja saber a percetagem de funcionarios cujo ordenado é inferior a ess numero?");
        double cutoff = scanner.nextDouble();
        return cutoff;

    }*/

    public static double percentagemInferior(double cutoff, double[] vencimentos) {
        int i;
        double inferiores = 0;
        double total = 0;
        for (i = 0; i < vencimentos.length; i++) {
            if (vencimentos[i] < cutoff) {
                inferiores++;
            }
            total++;

        }
        double percentagem = ((inferiores / total) * 100);
        return percentagem;

    }
    public static void teste() {
        boolean teste = false;
        String[] nomes = new String[]{"joao", "maria", "tt"};
        double[] vencimentos = new double[]{1000,2000};
        double cutoff = 1500;
        double media1 =media(vencimentos);
        String[] lista = new String[1];
        lista = listagemInferiorMedia(vencimentos, nomes, media1);

        double percentagem = percentagemInferior(cutoff, vencimentos);
        if(media1==1500 && lista[0].equals("joao") && percentagem == 50){
            teste = true;
        }
        if(teste==true){
            System.out.println("ok");
        }else{
            System.out.println("not ok");
        }


    }
}


