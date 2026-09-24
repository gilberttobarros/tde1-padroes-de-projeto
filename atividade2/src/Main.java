public class Main {

    public static void main(String[] args) {

        ServicoNotificacao servicoEmail = new ServicoNotificacao(new NotificacaoEmail());
        servicoEmail.enviar("Seu pedido foi confirmado!");

        ServicoNotificacao servicoSms = new ServicoNotificacao(new NotificacaoSMS());
        servicoSms.enviar("Seu código de verificação é 4821");

        ServicoNotificacao servicoTelegram = new ServicoNotificacao(new NotificacaoTelegram());
        servicoTelegram.enviar("Alerta: novo login detectado");

        try {
            servicoEmail.enviar("");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            servicoSms.enviar(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
