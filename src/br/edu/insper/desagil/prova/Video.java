package br.edu.insper.desagil.prova;

import java.util.HashMap;
import java.util.Map;

public class Video {
	private int identificador;
	private Usuario usuario;
	private Produto produto;
	private Map<String,Integer> avaliacoes;
	
	public Video(int identificador,Usuario usuario, Produto produto) {
		this.identificador = identificador;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();	
	}

	public int getIdentificador() {
		return this.identificador;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public void adicionaAvaliacao(Usuario usuario,int avaliacao) {
		if (this.usuario.getNome() != usuario.getNome() && (avaliacao == 1 || avaliacao == 2 || avaliacao == 3 || avaliacao == 4 || avaliacao == 5)){
			this.avaliacoes.put(usuario.getNome(),avaliacao);
					
		}
	}
	
	public int mediaAvaliacoes() {
		int soma = 0;
		int quantidade = this.avaliacoes.size();
		for(int avaliacao:this.avaliacoes.values()) {
			soma += avaliacao;
		}
		double media = Math.round((double)soma/quantidade);
		return (int) media;
			
	}
}
