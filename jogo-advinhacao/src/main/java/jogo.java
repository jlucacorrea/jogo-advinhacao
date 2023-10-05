import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class jogo {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("DIGITE UMA PALAVRA SECRETA:");
        String embaralhado = JOptionPane.showInputDialog(embaralhar(texto).toUpperCase());

        if (embaralhado.equals(texto)){
            JOptionPane.showMessageDialog(null, "VOCÊ ACERTOU!");
        } else {
            JOptionPane.showMessageDialog(null, "VOCÊ ERROU");
        }
    }
    public static String embaralhar(String texto){
        ArrayList<Character> characters = new ArrayList<>();
        for (char c : texto.toCharArray()) {
            characters.add(c);
        }
        Collections.shuffle(characters);

        StringBuilder stringEmbaralhada = new StringBuilder();
        for (char c : characters) {
            stringEmbaralhada.append(c);
        }

        return stringEmbaralhada.toString();
    }

}
