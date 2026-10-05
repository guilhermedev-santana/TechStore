public class Laptop extends Produto {

    private double polegadas;
    private String ModeloProcessador;
    private CategoriaProdutos categoria;

    public Laptop(String nome, String marca, double preco,EstadoProduto estado, double polegadas, String modeloProcessador) {
        super(nome, marca, preco,estado);
        this.polegadas = polegadas;
        this.ModeloProcessador = modeloProcessador;
        categoria = CategoriaProdutos.LAPTOP;
    }

    public double getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(double polegadas) {
        this.polegadas = polegadas;
    }

    public String getModeloProcessador() {
        return ModeloProcessador;
    }

    public void setModeloProcessador(String modeloProcessador) {
        ModeloProcessador = modeloProcessador;
    }

    public CategoriaProdutos getCategoria() {
        return categoria;
    }

    @Override
    public void fichaTecnica() {
        System.out.println("\n----- FICHA TÉCNICA -----");
        System.out.println("ID: " + getIdProduto() +
                "\nModelo: " + getNome() +
                "\nMarca: " + getMarca() +
                "\nPreço: " + FormatadorUtilitario.formatarMoeda(getPreco()) +
                "\nCategoria: " + CategoriaProdutos.LAPTOP +
                "\nEstado: "+ getEstado()+
                "\nProcessador: " + getModeloProcessador() +
                "\nTamanho Ecrã: " + getPolegadas());
    }
}