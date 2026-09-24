import java.util.Random;

public class AutenticadorService {

    private final Random random = new Random();

    public boolean autenticar(Usuario usuario, String senhaDigitada) {
        if (usuario == null || !usuario.getSenha().equals(senhaDigitada)) {
            return false;
        }

        return random.nextInt(100) < 90;
    }
}
