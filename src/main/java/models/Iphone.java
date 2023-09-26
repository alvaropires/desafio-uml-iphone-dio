package models;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("Realizando ligação...");
    }
    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atulizando página...");
    }
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }
    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }
}
