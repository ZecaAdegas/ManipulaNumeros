package ManipulaNumeros;

public class ComparaNumero {

    public static void comparar(int x, int y) {
        if (x==y)
            System.out.println("Os valores são iguais");
        else if (x>y)
            System.out.println(x + " > " + y);
        else
            System.out.println(y + " > " + x);
    }

}
