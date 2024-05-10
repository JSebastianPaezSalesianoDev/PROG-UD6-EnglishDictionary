import java.util.Dictionary;

import javax.swing.JOptionPane;

import net.duolingoinc.utility.Menu;
import net.storage.DictionaryClass;

public class App {
    public static void main(String[] args) throws Exception {

        DictionaryClass dictionary = new DictionaryClass();

        boolean goingOn = true;

        while (goingOn) {

            String optionUser = JOptionPane.showInputDialog(Menu.showMenu());

            switch (optionUser) {
                case "1":
                    try {
                        dictionary.addWord(optionUser);
                    } catch (NullPointerException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    } catch (StringIndexOutOfBoundsException e2) {
                        String alertMessage = "Error: Debe ingresar algo";
                        JOptionPane.showMessageDialog(null, alertMessage);
                    }

                    break;

                case "2":
                    try {
                        dictionary.removeWord(optionUser);
                    } catch (StringIndexOutOfBoundsException e) {
                        String alertMessage = "Error: Debe ingresar algo";
                        JOptionPane.showMessageDialog(null, alertMessage);
                    }

                    break;
                case "3":
                    try {
                        if (dictionary.wordChecker(optionUser) == true) {

                            JOptionPane.showMessageDialog(null, "Palabra en el diccioanrio");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Palabra inexistente");

                        }
                    } catch (NullPointerException e) {
                        String alertMessage = "Error: Palabra no encontrda";
                        JOptionPane.showMessageDialog(null, alertMessage);
                    } catch (StringIndexOutOfBoundsException e) {
                        String alertMessage = "Error: Debe ingresar algo";
                        JOptionPane.showMessageDialog(null, alertMessage);
                    }

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion No Valida");
                    break;
            }
        }

    };
}
