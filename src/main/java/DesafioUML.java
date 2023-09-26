import models.Iphone;

public class DesafioUML {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Funções de telefone: ");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\nFunções de reprodutor musical:");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println("\n Funções de navegador de internet:");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
