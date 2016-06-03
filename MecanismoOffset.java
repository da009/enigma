import java.util.ArrayList;
/**
 * Write a description of class MecanismoOffset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoOffset extends Mecanismo
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class MecanismoOffset
     */
    public MecanismoOffset(int num)
    {
        super(num);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int encripta(int num)
    {
        String numero = "";
        int encriptado = -1;
        ArrayList<Integer> digitos = new ArrayList<>();
        while(num > 0)
        {
            digitos.add(num % 10);
            num/=10;
        }
        
        for(int cont = digitos.size()-2;cont >= 0; cont--)
        {
            int digito = digitos.get(cont) + getNum();
            if(digito>=10)
                digito = digito % 10;
            numero = (numero + digito);
        }
        numero = digitos.get(digitos.size()-1) + numero;
        encriptado = Integer.parseInt(numero);
        return encriptado;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int desencripta(int num)
    {
        String numero = "";
        int desencriptado = -1;
        ArrayList<Integer> digitos = new ArrayList<>();
        while(num > 0)
        {
            digitos.add(num % 10);
            num/=10;
        }
        
        for(int cont = (digitos.size()-2); cont >= 0; cont--)
        {
            int digito = digitos.get(cont) - getNum();
            if(digito < 0)
                digito = digito + 10;
            numero = (numero + digito);
        }
        numero = digitos.get(digitos.size()-1) + numero;
        desencriptado = Integer.parseInt(numero);
        return desencriptado;
    }
}
