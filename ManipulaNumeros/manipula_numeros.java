package ManipulaNumeros;

    import java.util.Scanner;   

    public class manipula_numeros {

        public static Scanner ler = new Scanner(System.in);
        public static int x, y;


        public static void main(String[] args) {
            int op;
            do{
                System.out.println("Menu de Operação com números");
                System.out.println("1 - Maior de 2 números");
                System.out.println("2 - Ordenar em ordem decrescente");   
                System.out.println("3 - Soma impares multiplica pares");  
                System.out.println("4 - Trocar a ordem dos números");  
                System.out.println("5 - Compara números");   
                System.out.println("6 - Calcular média de aluno");            
                System.out.println("0 - Sair");
                System.out.println("Selecione a opção pretendida: ");
                op = ler.nextInt();
                switch(op) {
                    case 0: 
                        break;
                    case 1: 
                        leValores("Insira um valor", "Insira outro valor");
                        MaiorNumero.maior2(x,y);
                        break;
                    case 2: 
                        do {
                            le1Valor("Insira um valor");
                        } while (x <= 0);
                        NumeroDecrescente.ordenaDecrescente(x);
                        break;
                    case 3:
                        somaImparesMultiplicaPares();
                        break;
                    case 4:
                        leValores("Insira um valor", "Insira outro valor");
                        TrocaNumero.trocar(x,y);
                        break;
                    case 5:
                        leValores("Insira um valor", "Insira outro valor");
                        ComparaNumero.comparar(x,y);
                        break;
                    case 6:
                        MediaAluno.registaNotas();
                        break;
                    default: System.out.println("Insira uma opção válida");
                } 
            } while (op != 0);
        }


    private static void leValores(String s1, String s2) {
        System.out.println(s1);
        x = ler.nextInt();
        System.out.println(s2);
        y = ler.nextInt();
    }


    private static void le1Valor(String s1) {
        System.out.println(s1);
        x = ler.nextInt();
    }


    private static void somaImparesMultiplicaPares() {
        int soma;
        long mult;
        soma = 0;
        mult = 1;
        for(int i = 1; i <= 30; i++) {
            if(i % 2 != 0)
                soma += i;
            else if(i % 2 == 0)
                mult *= i;
        }        
        System.out.println("O valor da soma dos números impares é " + soma);
        System.out.println("O valor da multiplicação dos números pares é " + mult);
    }
}