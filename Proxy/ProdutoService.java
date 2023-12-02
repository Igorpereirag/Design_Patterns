class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Object buscarProduto(long id) {
        return ProdutoRepository.find(id);
    }

}
