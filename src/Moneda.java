import javax.swing.JOptionPane;

public class Moneda {

    public void elegirmoneda() {

        Object[] opcionesDeConversion = { "MXN a Dólar", "MXN a Euro", "MXN a Libras Esterlinas", "MXN a Yen Japónes",
                "MXN a Won sul-coreano", "Dólar a MXN", "Euro a MXN", "Libras Esterlinas a MXN", "Yen Japónes a MXN",
                "Won sul-coreano a MXN" };
        Object opcion = JOptionPane.showInputDialog(null, "Elije una moneda a la que deseas convertir tu dinero:  ",
                "Menu",
                JOptionPane.PLAIN_MESSAGE, null, opcionesDeConversion, opcionesDeConversion[0]);
    }

    public void MostrarConversion(double res, String string) {
        JOptionPane.showMessageDialog(null, "Tienes $" + res + " " + string, "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void MxnaDolar(String valor) {
        double d = Double.parseDouble(valor);
        double res = d * 0.059;
        MostrarConversion(res, "Dólares");

    }

}
