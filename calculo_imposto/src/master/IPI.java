package master;

public class IPI implements Imposto {

    private double produto, frete, seguro, diversos, aliquota;

    public IPI(double produto, double frete, double seguro, double diversos, double valor) 
    {
        this.produto = produto;
        this.frete = frete;
        this.seguro = seguro;
        this.diversos = diversos;
        this.aliquota = (valor / 100);
    }
    
    @Override
    public double calcular()
    {
        return (produto + frete + seguro + diversos) * aliquota;
    }

    @Override
    public String descricao() 
    {
        return "IPI";
    }

    public double getProduto() 
    {
        return produto;
    }

    public void setProduto(double produto) 
    {
        this.produto = produto;
    }

    public double getFrete() 
    {
        return frete;
    }

    public void setFrete(double frete) 
    {
        this.frete = frete;
    }

    public double getSeguro() 
    {
        return seguro;
    }

    public void setSeguro(double seguro) 
    {
        this.seguro = seguro;
    }

    public double getDiversos() 
    {
        return diversos;
    }

    public void setDiversos(double diversos) 
    {
        this.diversos = diversos;
    }

}
