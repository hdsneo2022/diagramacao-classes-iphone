package br.com.iphone;

public class ContatoLista {
	private String nome;
    private String numero;

    public ContatoLista(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }
}
