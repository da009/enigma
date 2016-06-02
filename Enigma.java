
/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{
    private int numMod;
    private Mecanismo mecanismo;

    /**
     * Constructor for objects of class Enigma
     */
    public Enigma()
    {
    }
    
    public int encripta(Mecanismo mecanismo, int numMod)
    {
        int dev = 0;
        if(numMod > 10)
            dev = mecanismo.encripta(numMod);
        if(dev <= 10)
            dev = -1;
        return dev;
    }
    
    public int desencripta(Mecanismo mecanismo, int numMod)
    {
        int dev = -1;
        if(numMod > 10)
            dev = mecanismo.desencripta(numMod);
        if(dev <= 10)
            dev = -1;
        return dev;
    }
}
