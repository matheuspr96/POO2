package Controller_MVC;

public abstract class Servicos {

    protected float preco;
    private final Animal animal;
    protected String descricao;

    //---------------------------------//
    public Servicos(Animal animal) {
        this.animal = animal;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return this.preco;
    }

    public Animal getAnimal() { // opcional...
        return this.animal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract float pagar();

}