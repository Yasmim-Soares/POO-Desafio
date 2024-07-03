package Celular;

import funcionalidade.reprodutorMusical.reprodutorMusical; 
import funcionalidade.reprodutorMusical.pausar;
import funcionalidade.reprodutorMusical.SelecionarMusica;
import funcionalidade.reprodutorMusical.tocar;
import funcionalidade.navegadorInternet.navegadorInternet;
import funcionalidade.navegadorInternet.adicionarNovaAba;
import funcionalidade.navegadorInternet.atualizarPagina;
import funcionalidade.navegadorInternet.exibirPagina;
import funcionalidade.aparelhoTelefonico.aparelhoTelefonico;
import funcionalidade.aparelhoTelefonico.atender;
import funcionalidade.aparelhoTelefonico.iniciarCorreio;
import funcionalidade.aparelhoTelefonico.ligar;
import funcionalidade.Iphone.celularIphone;

public class Iphone {
    public static void main(String[] args) {
	celularIphone em = new celularIphone();
	reprodutorMusical reprodutorMusical = em;
	aparelhoTelefonico aparelhoTelefonico = em;
	navegadorInternet navegadorInternet = em;
	
	aparelhoTelefonico.telefone();
	reprodutorMusical.reprodutor();
	navegadorInternet.internet();
	}
}
