package master;

import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        String nomeEmpresa, continuar = "";
        char op;
        double valorDebito, valorCredito, valorProduto, valorFrete, valorSeguro, valorDiversos;
        
        System.out.print("Nome da empresa: ");
        nomeEmpresa = in.nextLine();
        Pagamentos pagamento = new Pagamentos(nomeEmpresa);
        
        Imposto imposto;
        
        while (!continuar.equalsIgnoreCase("pare"))
        {
            System.out.print("\nSelecione uma op��o para calcular: \n\t[1] PIS - [2] IPI \nOp��o: ");
            op = in.nextLine().charAt(0);
            
            if (op == '1')
            {
                System.out.print("\nD�bito: R$ ");
                valorDebito = in.nextDouble();
                
                System.out.print("Cr�dito: R$ ");
                valorCredito = in.nextDouble(); in.nextLine();
                
                imposto = new PIS(valorDebito, valorCredito);
                pagamento.getImposto().add(imposto);
                
                System.out.printf("\n\t[Imposto %s - R$ %.2f]\n\n", imposto.descricao(), imposto.calcular());
                
                System.out.print("Digite 'ENTER' para continuar ou 'PARE' para encerrar: ");
                continuar = in.nextLine();
            }
            else if (op == '2')
            {
                System.out.print("\nProduto: R$ ");
                valorProduto = in.nextDouble();
                
                System.out.print("Frete: R$ ");
                valorFrete = in.nextDouble();
                
                System.out.print("Seguro: R$ ");
                valorSeguro = in.nextDouble();
                
                System.out.print("Diversos: R$ ");
                valorDiversos = in.nextDouble(); in.nextLine();
                
                imposto = new IPI(valorProduto, valorFrete, valorSeguro, valorDiversos, 5);
                pagamento.getImposto().add(imposto);
                
                System.out.printf("\n\t[Imposto %s - R$ %.2f]\n\n", imposto.descricao(), imposto.calcular());
                
                System.out.print("Digite 'ENTER' para continuar ou 'PARE' para encerrar: ");
                continuar = in.nextLine();
            }
        }
        
        pagamento.mostrar();
        
        in.close();

    }

}
