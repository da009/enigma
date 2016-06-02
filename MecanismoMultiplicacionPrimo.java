
/**
 * Write a description of class MecanismoMultiplicacionPrimo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoMultiplicacionPrimo extends Mecanismo
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class MecanismoMultiplicacionPrimo
     */
    public MecanismoMultiplicacionPrimo(int num)
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
        int numeroEncriptado = (numero*getNum());
        return numeroEncriptado;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int desencripta(int numero)
    {
        int numeroDesencriptado = (numero/getNum());
        return numeroDesencriptado;
    }
}
