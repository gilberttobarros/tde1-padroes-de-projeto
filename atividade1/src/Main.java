public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Julio Cesar", "julio@email.com", "senha123");
        AutenticadorService autenticador = new AutenticadorService();

        System.out.println("Usuário: " + usuario.getNome() + " - " + usuario.getEmail());

        for (int i = 1; i <= 5; i++) {
            boolean ok = autenticador.autenticar(usuario, "senha123");
            System.out.println("Tentativa " + i + ": " + (ok ? "autenticado" : "falhou"));
        }

        boolean ok = autenticador.autenticar(usuario, "outraSenha");
        System.out.println("Senha errada: " + (ok ? "autenticado" : "falhou"));
    }
}
