package PqEdUno;


/**
 * La clase Cafetera almacena la información de las máquinas de café
 * @author Pablo Recatalá
 * @author Angie Jolie
 */
public class Cafetera 
{
    //Atributos
    private int nivel;
    private String tipo;
    
    //Construtor
    /**
     * <PRE> cafet1 = new Cafetera(1000, "torrefacto")</PRE>
     * @param pNivel recibe el nivel de café que contiene 
     *               la cafetera 
     * @param pTipo recibe el tipo (torrefacto, mezcla,...)
     *              de café presente en la cafetera
     */
    Cafetera(int pNivel, String pTipo)
    {
        this.nivel = pNivel;
        this.tipo = pTipo;
    }
    
    
    //Métodos
    /**
     * 
     * @return este método devuelve el tipo("torrefacto", "mezcla",...) 
     * de café de la cafetera
     * @see String
     * @see "Los devuelves"
     * @see <a href="spec.html#section">Java Spec</a>
     * @see <a href="PagMarquee.html">Marquee</a>
     * @see <a href = "http://www.javaoracle.com" /> javaoracle.com – Página oficial de java </a>
     */
    String devTipo()
    {
        System.out.println("Escrito el lunes");
        System.out.println("Después de hacer la siesta");
        System.out.println("¡Qué gran placer!");
        System.out.println("La línea se está escribiendo ahora: 01:01.");

        return this.tipo;
   //     "hola".charAt(nivel);
    }
    
    
    
    
    /**
    * Asigna un tipo en la clase Cafetera.
    * Al ser el tipo un dato obligatorio, si es nulo o vacío se lanzará
    * una excepción.
    *
    * @param pTipo El nuevo tipo de la cafetera.
    * @throws IllegalArgumentException Si tipo es null, está vacío o contiene sólo espacios.
    */
    void asignaTipo(String pTipo) throws IllegalArgumentException
    {
        if ((pTipo == null) || (pTipo.trim().equals("")))
        {
            throw new IllegalArgumentException("El tipo no puede ser nulo o vacío");
        }
        else
        {
            this.tipo = pTipo;
        }

        
    }
    
    
    /**
     *
     * @param pCadena
     * @return
     */
    public String devCadMejorada(String pCadena)
    {
        String rdo;
        rdo = pCadena;

        rdo = pCadena.trim();
        return rdo;

    }
        
}
