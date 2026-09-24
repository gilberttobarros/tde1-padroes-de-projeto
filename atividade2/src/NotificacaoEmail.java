public class NotificacaoEmail extends Notificacao {

    @Override
    protected void enviarMensagem(String mensagem) {
        System.out.println("Enviando E-mail: " + mensagem);
    }
}
