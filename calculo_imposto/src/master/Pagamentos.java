package master;

import java.util.ArrayList;
import java.util.List;

public class Pagamentos {

    private String nomeEmpresa;
    private List<Imposto> imposto;
    
    public Pagamentos(String nomeEmpresa)
    {
        this.nomeEmpresa = nomeEmpresa;
        this.imposto = new ArrayList<>();
    }

    public String getNomeEmpresa() 
    {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) 
    {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    public List<Imposto> getImposto()
    {
        return imposto;
    }
    
    public void mostrar()
    {
        System.out.println("\n[Dados cadastrados]");
        for (Imposto i : imposto)
        {
            System.out.printf("\t[Imposto %s - R$ %.2f]\n", i.descricao(), i.calcular());
        }
    }

}
