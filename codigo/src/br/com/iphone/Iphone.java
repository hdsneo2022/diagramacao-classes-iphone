package br.com.iphone;

class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	 private String numero;
	    private boolean temConexao;

	    public Iphone(String numero, boolean temConexao) {
	        this.numero = numero;
	        this.temConexao = temConexao;
	    }

	    @Override
	    public void tocar() {
	        System.out.println("Reproduzindo música no iPhone");
	    }

	    @Override
	    public void pausar() {
	        System.out.println("Pausando música no iPhone");
	    }

	    @Override
	    public void selecionarMusica(Musica musica) {
	        System.out.println("Selecionando música no iPhone: " + musica.getNome());
	    }

	    @Override
	    public void ligar() {
	        System.out.println("Ligando o iPhone para " + numero);
	    }

	    @Override
	    public void atender() {
	        System.out.println("Atendendo chamada no iPhone");
	    }

	    @Override
	    public void iniciarCorreioDeVoz() {
	        System.out.println("Iniciando correio de voz no iPhone");
	    }

	    @Override
	    public void exibirPagina(String url) {
	        if (temConexao) {
	            System.out.println("Exibindo página no iPhone: " + url);
	        } else {
	            System.out.println("Sem conexão de internet no iPhone");
	        }
	    }

	    @Override
	    public void adicionarNovaAba(String url) {
	        System.out.println("Adicionando nova aba no iPhone: " + url);
	    }

	    @Override
	    public void atualizarPagina() {
	        System.out.println("Atualizando página no iPhone");
	    }

		@Override
		public void exibirNavegador() {
			// TODO Auto-generated method stub
			
		}
}
