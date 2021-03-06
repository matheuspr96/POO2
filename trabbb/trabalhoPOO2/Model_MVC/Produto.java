package Model_MVC;

public class Produto extends Vendas_Decorator {
    
    private Servicos servico;
    int codBar;
    public Produto(Servicos servico,float preco, String produto) {
        this.setPreco(preco);
        this.servico = servico;
        
        this.descricao = "\n + produto:" + produto + "\t" + this.getPreco();
        
    }

    
   /* public float getPreco() {
        return preco;
    }*/

    public void setCodBar(int n){
        this.codBar = n;
    }
    public String getDescricao() {
            return servico.getDescricao() + descricao;
    }

    @Override
    public float pagar() {
        return (float) (getPreco() + servico.pagar());
    }

}
