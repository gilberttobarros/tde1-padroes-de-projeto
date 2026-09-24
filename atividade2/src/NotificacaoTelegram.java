public class NotificacaoTelegram extends Notificacao {

    @Override
    protected void enviarMensagem(String mensagem) {
        System.out.println("Enviando Telegram: " + mensagem);
    }
}
