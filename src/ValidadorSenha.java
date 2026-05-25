
public class ValidadorSenha {
    public static void main(String[] args) {
        String senhaCorreta = new String("1234");
        String tentativa = "1234";

        if (tentativa.equals(senhaCorreta)) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado");
        }
    }
}