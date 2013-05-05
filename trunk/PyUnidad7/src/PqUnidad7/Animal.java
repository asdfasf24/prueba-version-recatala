package PqUnidad7;

public class Animal 
{
    private String codigo;
    private String color;
    private double peso;

    public Animal(String pCodigo, String pColor, double pPeso) 
    {
        this.codigo = pCodigo;
        this.color = pColor;
        this.peso = pPeso;
    }
    
    void visualizaDatos()
    {
        System.out.println("Datos del animal: "
                + this.codigo + " " + this.color+ " "+ 
                this.peso);
    }
}
