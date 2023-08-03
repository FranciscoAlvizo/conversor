import java.math.BigDecimal;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        Object[] opcionesDeConversion = { "Conversor de Moneda", "Conversor de Temperatura" };

        Object opcion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión: ", "Menu",
                JOptionPane.PLAIN_MESSAGE, null, opcionesDeConversion, opcionesDeConversion[0]);

        System.out.println(opcion);

        if (opcion == "Conversor de Moneda") {

            Object valor = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir: ",
                    "Valor", JOptionPane.QUESTION_MESSAGE);

            while (!EsNumero((String) valor)) {
                valor = JOptionPane.showInputDialog(null, "Por favor inserte un numero valido ", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } else if (opcion == "Conversor de Temperatura") {
            Object valor = JOptionPane.showInputDialog(null, "Ingrese la temperatura que desea convertir", "Valor",
                    JOptionPane.QUESTION_MESSAGE);
        }

    }

    private static boolean EsNumero(String n) {
        try {
            Double.parseDouble(n);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
