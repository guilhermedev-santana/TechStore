import java.util.ArrayList;

public interface OperacoesInventario {
    void adicionarProduto (Produto produto);
    void removerProduto (int id);
    void buscarProduto (int id);
    ArrayList<Produto> buscarCategoria(CategoriaProdutos categoria);
    void atualizarPrecoProduto (int id, double precoNovo);
    void listarProdutos ();
}
