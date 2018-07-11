package Model_MVC;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Cliente extends Pessoa {

    private ArrayList<Animal> animais;

    private Servicos recibo;
    
    public Cliente(String nome, String cpf, String telefone){
        super(nome,cpf,telefone);
        this.animais = new ArrayList<Animal>();
    }




    public void pagarDinheiro(float dinheiro) {
        float resultado = dinheiro - this.recibo.pagar();
        if(resultado < 0){
            JOptionPane.showMessageDialog(null, "Valor insuficiente, Faltam: R$" + resultado);
        }else{
            JOptionPane.showMessageDialog(null, "Troco igual a R$" + resultado);
            //GUARDAR RECIBO NO BANCO
            this.recibo = null;
        }
    }

    public void setRecibo(Servicos recibo){
        this.recibo = recibo;
    }
    public Servicos getRecibo(){
        return this.recibo;
    }
    public String imprimeRecibo(){
        String auxiliar =  recibo.getDescricao() + "\n Total a pagar: R$" + this.recibo.pagar();
                return auxiliar;
    }
    public void AdicionaAnimal(String cpfDono, int tipo, String nome, String raca){
        if(tipo == 1){
            animais.add(new Cao(cpfDono, nome, raca));
            JOptionPane.showMessageDialog(null, "Cao Adicionado com Sucesso!");
        }
        else if(tipo == 2){
            animais.add(new Gato(cpfDono,nome,raca));
            JOptionPane.showMessageDialog(null, "Gato Adicionado com Sucesso!");
        }
        else{
            System.out.println("Tipo invalido");
    }
        
    }
    
    public void listaAnimais(){
        String acumula;
        acumula = "Cliente:" + this.getNome() + "\n";
        for(int i=0; i < animais.size(); i++){
            
            //CORRIGIR, Animal foi alterado
            acumula += i + " - " +animais.get(i).dadosAnimal() +"\t Tipo: " + animais.get(i).getTipo() + "\n";
        }
        JOptionPane.showMessageDialog(null, acumula);
    }
    public Animal getAnimal(int i){
        return this.animais.get(i);
    }
 
}
