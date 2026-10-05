import java.util.ArrayList;

public class Inventario implements OperacoesInventario {
    private ArrayList<Produto> produtos;

    public Inventario() {
        produtos = new ArrayList<>();
    }

    @Override
    public void adicionarProduto(Produto produto) {
        for (Produto p : produtos) {
            if (p.getIdProduto() == produto.getIdProduto()) {
                System.out.println("Produto já cadastrado!");
                return;
            }
        }
        produtos.add(produto);
        System.out.println("Produto Adicionado com sucesso!");
    }

    @Override
    public void removerProduto(int id) {

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getIdProduto() == id) {
                produtos.remove(i);
                System.out.println("Produto Removido com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    @Override
    public void buscarProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getIdProduto() == id) {
                produto.fichaTecnica();
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    @Override
    public ArrayList<Produto> buscarCategoria(CategoriaProdutos categoria) {
        ArrayList<Produto> encontrado = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getCategoria() == categoria) {
                encontrado.add(produto);
                produto.fichaTecnica();
            }
        }
        return encontrado;
    }

    @Override
    public void atualizarPrecoProduto(int id, double precoNovo) {
        if (produtos.isEmpty()) {
            System.out.println("Sem Produtos.");
            return;
        }
        for (Produto produto : produtos) {
            if (produto.getIdProduto() == id) {
                if (produto.setPreco(precoNovo)) {
                    System.out.println("Preço atualizado com sucesso!");
                    return;
                }
            }
        }
        System.out.println("Produto não encontrado!");
    }

    @Override
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Inventário Vazio!");
            return;
        }

        System.out.println("----- INVENTÁRIO -----");
        for (Produto produto : produtos) {
            produto.fichaTecnica();
        }
    }
}
