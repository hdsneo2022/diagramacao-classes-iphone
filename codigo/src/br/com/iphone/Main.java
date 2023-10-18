package br.com.iphone;

public class Main {
	 public static void main(String[] args) {
	        Iphone iphone = new Iphone("1234567890", true);

	        Musica musica = new Musica("Música 1");
	        iphone.tocar();
	        iphone.selecionarMusica(musica);
	        iphone.pausar();

	        iphone.ligar();
	        iphone.atender();
	        iphone.iniciarCorreioDeVoz();

	        iphone.exibirPagina("www.exemplo.com");
	        iphone.adicionarNovaAba("www.outroexemplo.com");
	        iphone.atualizarPagina();
	    }
}
