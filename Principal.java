public class Principal {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Produto smartphone1 = new Smartphone("POCO X7 PRO","Xiaomi", 1870,EstadoProduto.MONSTRUARIO,6000,256);
        Produto smartphone2 = new Smartphone("MOTO E13","Motorola", 680,EstadoProduto.RECONDICIONADO,4500,60);
        Produto newLaptop = new Laptop("Vivobook Go", "ASUS", 3485, EstadoProduto.NOVO,15,"7520U");
        Produto.getQttProdutos();
        inventario.adicionarProduto(smartphone1);
        inventario.adicionarProduto(smartphone2);
        inventario.adicionarProduto(newLaptop);
        inventario.listarProdutos();
        inventario.buscarCategoria(CategoriaProdutos.SMARTPHONE);
        inventario.atualizarPrecoProduto(2,730.99);
        inventario.removerProduto(3);
        inventario.listarProdutos();
    }
}
