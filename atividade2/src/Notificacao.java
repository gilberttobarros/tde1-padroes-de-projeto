public abstract class Notificacao implements CanalNotificacao {

    @Override
    public void enviar(String mensagem) {
        if (mensagem == null || mensagem.trim().isEmpty()) {
            throw new IllegalArgumentException("A mensagem não pode ser vazia.");
        }
        enviarMensagem(mensagem);
    }

    protected abstract void enviarMensagem(String mensagem);
}
