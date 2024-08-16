package br.dev;
import br.dev.model.IPhone;

public class Main {
    public static void main(String[] args) throws Exception {
        IPhone celular = new IPhone();
        celular.tocar();
        celular.pausar();
        celular.selecionarMusica("Hino do Palmeiras");
        celular.ligar();
        celular.atender();
        celular.iniciarCorreioVoz();
        celular.exibirPagina("https://github.com/fornari03");
        celular.adicionarNovaAba();
        celular.atualizarPagina();
    }
}
