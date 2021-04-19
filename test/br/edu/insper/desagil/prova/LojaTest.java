package br.edu.insper.desagil.prova;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LojaTest {
	private static double DELTA = 0.001;
	
	@BeforeEach
	public void setUp() {
		normalUser = new Usuario("Jonathan Sutton");
		normalProduct = new Produto("Fogão",20.00);
	
	}

	@Test
	public void mediaNula() {
		Video video = new Video(1,normalUser,normalProduct);
		Usuario usuarioGabi = new Usuario("Gabigol Barbosa");
		video.adicionaAvaliacao(normalUser, 2);
		video.adicionaAvaliacao(usuarioGabi, 8);
		video.adicionaAvaliacao(usuarioGabi, -1);
		assertEquals(0,usuario.totalAvaliacoes(),DELTA);
		
	}
	
	public void somaValida() {
		Video video = new Video(1,normalUser,normalProduct);
		Usuario usuarioArrasca = new Usuario("De Arrascaeta");
		video.adicionaAvaliacao(usuarioArrasca, 3);
		assertEquals(3,usuario.totalAvaliacoes(),DELTA);
	
	}
	
	public void duasAvals() {
		Video video = new Video(1,normalUser,normalProduct);
		Usuario usuarioWillian = new Usuario("Willian Arão");
		Usuario usuarioDiego = new Usuario("Diego Alves");
		video.adicionaAvaliacao(usuarioDiego, 5);
		video.adicionaAvaliacao(usuarioWillian, 1);
		assertEquals(3,usuario.totalAvaliacoes(),DELTA);
	}
	
	public void tresAvals() {
		Video video = new Video(1,normalUser,normalProduct);
		Usuario usuarioFilipe = new Usuario("Filipe Luis");
		Usuario usuarioIsla = new Usuario("Isla");
		Usuario usuarioRodrigo = new Usuario("Rodrigo Caio");
		video.adicionaAvaliacao(usuarioFilipe, 2);
		video.adicionaAvaliacao(usuarioIsla, 1);
		video.adicionaAvaliacao(usuarioRodrigo, 3);
		assertEquals(2,usuario.totalAvaliacoes(),DELTA);
	}
	
	public void doisVideos() {
		Video video = new Video(1,normalUser,normalProduct);
		Video video2 = new Video(1,"Gerson",normalProduct);
		Usuario usuarioFilipe = new Usuario("Filipe Luis");
		Usuario usuarioIsla = new Usuario("Isla");
		Usuario usuarioRodrigo = new Usuario("Rodrigo Caio");
		video.adicionaAvaliacao(usuarioFilipe, 2);
		video.adicionaAvaliacao(usuarioIsla, 1);
		video2.adicionaAvaliacao(usuarioRodrigo, 3);
		assertEquals(4,usuario.totalAvaliacoes(),DELTA);
		
	}
	

}
