package ManipulaNumeros;


public class Credito {

        public static void calculaCredito() {
            int x;   
            System.out.println("Digite o seu saldo médio: ");
            x = manipula_numeros.ler.nextInt();
            while (x <= 0 ) {
                System.out.print("Digite o seu saldo médio (número positivo):  ");
                x = manipula_numeros.ler.nextInt();
            }
            switch (x/201){
                case 0:
                    System.out.println("Não tem direito a crédito");
                    break;
                case 1:
                    System.out.println("O valor do crédito é: " + (x * 0.2));
                    break;
                case 2:
                    System.out.println("O valor do crédito é: " + (x * 0.3));
                    break;
                default:
                    System.out.println("O valor do crédito é: " + (x * 0.4));
                    break;
            }
        }


}
