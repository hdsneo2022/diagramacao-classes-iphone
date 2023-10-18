package br.com.iphone;

class Chrome implements NavegadorInternet {
	private boolean temConexao;

    public Chrome(boolean temConexao) {
        this.temConexao = temConexao;
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página no Chrome: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba no Chrome: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no Chrome");
    }

    public void exibirNavegador() {
        System.out.println("Navegador Chrome");
    }
}
