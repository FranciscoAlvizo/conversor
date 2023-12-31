import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        ElegirMonedaFuncion fun = new ElegirMonedaFuncion();
        Temperatura tem = new Temperatura();
        int conf = 0;
        while (conf == 0) {

            Object[] opcionesDeConversion = { "Conversor de Moneda", "Conversor de Temperatura" };

            Object opcion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión: ", "Menu",
                    JOptionPane.PLAIN_MESSAGE, null, opcionesDeConversion, opcionesDeConversion[0]);

            if (opcion == "Conversor de Moneda") {

                String valor = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir: ",
                        "Valor", JOptionPane.QUESTION_MESSAGE);

                while (!EsNumero(valor)) {
                    valor = JOptionPane.showInputDialog(null, "Por favor inserte un numero valido ", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

                fun.elegirmoneda(valor);

            } else if (opcion == "Conversor de Temperatura") {
                String valor = JOptionPane.showInputDialog(null, "Ingrese la temperatura que desea convertir", "Valor",
                        JOptionPane.QUESTION_MESSAGE);
                while (!EsNumero(valor)) {
                    valor = JOptionPane.showInputDialog(null, "Por favor inserte un numero valido ", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                tem.TipoDeGrados(valor);
            }
            conf = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Selecciona una opcion", 1);
            System.out.println(conf);

        }

        JOptionPane.showMessageDialog(null, "Programa Terminado", "Message", JOptionPane.INFORMATION_MESSAGE);

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
