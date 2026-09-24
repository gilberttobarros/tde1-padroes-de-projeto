public class ServicoNotificacao {

    private final CanalNotificacao canal;

    public ServicoNotificacao(CanalNotificacao canal) {
        this.canal = canal;
    }

    public void enviar(String mensagem) {
        canal.enviar(mensagem);
    }
}
