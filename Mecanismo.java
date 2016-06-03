
/**
 * Abstract class Mecanismo - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Mecanismo
{
    private int num;
    /**
     * Constructor for objects of class Mecanismo
     */
    public Mecanismo(int num)
    {
        this.num = num;
    }
    
    /**
     * Devuelve número
     */
    public int getNum()
    {
        return num;
    }
    
    /**
     * Encripta segun el mecanismo
     */
    public abstract int encripta(int numero);
    
    /**
     * Desencripta segun el mecanismo
     */
    public abstract int desencripta(int numero);
}
