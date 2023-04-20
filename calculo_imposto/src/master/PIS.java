package master;

public class PIS implements Imposto {

    private double debito, credito;
    
    public PIS (double debito, double credito)
    {
        this.debito = debito;
        this.credito = credito;
    }
    
    @Override
    public double calcular()
    {
        return (debito - credito) * (1.65 / 100);
    }
    
    @Override
    public String descricao()
    {
        return "PIS";
    }

    public double getDebito() 
    {
        return debito;
    }

    public void setDebito(double debito) 
    {
        this.debito = debito;
    }

    public double getCredito() 
    {
        return credito;
    }

    public void setCredito(double credito) 
    {
        this.credito = credito;
    }

}
