package ManipulaNumeros;

public class TrocaNumero {

    public static void trocar(int x, int y) {
        System.out.println("Números iniciais: "+ x + " " + y);  
        int z;
        z = x;
        x = y;
        y = z;
        System.out.println("Números invertidos: "+ x + " " + y);  
    }

}
