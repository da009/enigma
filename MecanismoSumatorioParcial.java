
/**
 * Write a description of class MecanismoSumatorioParcial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoSumatorioParcial extends Mecanismo
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class MecanismoSumatorioParcial
     */
    public MecanismoSumatorioParcial(int num)
    {
        super(num);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int encripta(int numero)
    {
        int a = getNum();
        int x = numero;
        int cont = 0;
        int resultado = 0;
        while(x >= (a+cont))
        {
            resultado = resultado + (x - cont);
            cont++;
        }
        return resultado;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int desencripta(int numero)
    {
        int a = getNum();
        int x = numero;
        int cont = 0;
        int resultado = x;
        while(resultado > (a+cont))
        {
            resultado = resultado - (a + cont);
            cont++;
        }
        return resultado;
    }
}
