public abstract class Produto {
    private static Integer proxId = 1;
    private static Integer qttProdutos = 0;

    private int idProduto;
    private String nome;
    private String marca;
    private double preco;
    private CategoriaProdutos categoria;
    private EstadoProduto estado;

    public Produto(String nome, String marca, double preco, EstadoProduto estado) {
        this.idProduto = proxId++;
        qttProdutos++;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.estado = estado;
    }

    public static Integer getQttProdutos() {
        return qttProdutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public CategoriaProdutos getCategoria() {
        return categoria;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public EstadoProduto getEstado() {
        return estado;
    }

    public boolean setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
            return true;
        }
        System.out.println("Preço incorreto!");
        return false;
    }

    public abstract void fichaTecnica();
}
