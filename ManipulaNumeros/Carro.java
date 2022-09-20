package ManipulaNumeros;

public class Carro {

    public static void calculaValorFinal() {
        float x;
        System.out.println("Digite o custo de fábrica do veículo: ");
        x = manipula_numeros.ler.nextFloat();
        x = (float) (x + (x * 0.28) + (x * 0.45));
        System.out.println("O preço final do veículo será: " + x); 
    }

}
