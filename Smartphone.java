public class Smartphone extends Produto {
    private double capacidadeBateria;
    private double memoriaInterna;
    private CategoriaProdutos categoria;


    public Smartphone(String nome, String marca, double preco, EstadoProduto estado, double capacidadeBateria, double memoriaInterna) {
        super(nome, marca, preco, estado);
        this.capacidadeBateria = capacidadeBateria;
        this.memoriaInterna = memoriaInterna;
        categoria = CategoriaProdutos.SMARTPHONE;
    }

    public double getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(double capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public double getMemoriaInterna() {
        return memoriaInterna;
    }

    public void setMemoriaInterna(double memoriaInterna) {
        this.memoriaInterna = memoriaInterna;
    }

    @Override
    public void fichaTecnica() {
        System.out.println("\n----- FICHA TÉCNICA -----");
        System.out.println("ID: " + getIdProduto() +
                "\nModelo: " + getNome() +
                "\nMarca: " + getMarca() +
                "\nPreço: " + FormatadorUtilitario.formatarMoeda(getPreco()) +
                "\nCategoria: " + CategoriaProdutos.SMARTPHONE +
                "\nEstado: " + getEstado() +
                "\nMémoria Interna: " + getMemoriaInterna() +
                "\nBateria: " + getCapacidadeBateria());
    }
}
