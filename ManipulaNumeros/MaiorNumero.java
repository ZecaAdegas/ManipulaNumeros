package ManipulaNumeros;


public class MaiorNumero {

    public static void maior2(int x, int y) {
        if (x > y)
            System.out.println(x + " maior que " + y);
        else if (y > x)
            System.out.println(y + " maior que " + x);
        else
            System.out.println(x + " igual a " + y);
    }

}
