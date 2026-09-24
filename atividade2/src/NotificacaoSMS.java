public class NotificacaoSMS extends Notificacao {

    @Override
    protected void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
