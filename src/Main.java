public class Main {
    public static void main(String[] args) {
        iphone meuIphone = new iphone();

        // Testando ReprodutorMusical
        meuIphone.tocar();
        meuIphone.selecionarMusica("Thunderstruck - AC/DC");
        meuIphone.pausar();

        // Testando AparelhoTelefonico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIphone.exibirPagina("https://www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
