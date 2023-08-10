import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Temperatura {

    public void TipoDeGrados(String valor) {

        Object[] opcionesDeConversion = { "Celsius a Kelvin", "Celsius a Fahrenheit", "Kelvin a Celsius",
                "Kelvin a Fahrenheit", "Fahrenheit a Celsius", "Fahrenheit a Kelvin" };
        String opcion = (String) JOptionPane.showInputDialog(null,
                "Elije el tipo de grados a convertir:  ",
                "Menu",
                JOptionPane.PLAIN_MESSAGE, null, opcionesDeConversion, opcionesDeConversion[0]);

        switch (opcion) {
            case "Celsius a Kelvin":
                CelaKel(valor);
                break;
            case "Celsius a Fahrenheit":
                CelaFah(valor);
                break;
            case "Kelvin a Celsius":
                KelaCel(valor);
                break;
            case "Kelvin a Fahrenheit":
                KelaFah(valor);
                break;
            case "Fahrenheit a Celsius":
                FahaCel(valor);
                break;
            case "Fahrenheit a Kelvin":
                FahaKel(valor);
                break;

        }

    }

    public void MostrarConversion(double res, String string) {
        JOptionPane.showMessageDialog(null, "Son " + res + " " + string, "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void CelaKel(String valor) {
        double c = Double.parseDouble(valor);
        double k = c + 273.15;
        BigDecimal bigDecimal = new BigDecimal(k).setScale(2, RoundingMode.UP);
        MostrarConversion(bigDecimal.doubleValue(), "Grados Kelvin");

    }

    public void CelaFah(String valor) {
        double c = Double.parseDouble(valor);
        double f = c * 1.8 + 32;
        BigDecimal bigDecimal = new BigDecimal(f).setScale(2, RoundingMode.UP);
        MostrarConversion(bigDecimal.doubleValue(), "Grados Fahrenheit");

    }

    public void KelaCel(String valor) {
        double k = Double.parseDouble(valor);
        double c = k - 273.15;
        BigDecimal bigDecimal = new BigDecimal(c).setScale(2, RoundingMode.UP);
        MostrarConversion(bigDecimal.doubleValue(), "Grados Celsius");
    }

    public void KelaFah(String valor) {
        double k = Double.parseDouble(valor);
        double f = 1.8 * (k - 273.15) + 32;
        BigDecimal bigDecimal = new BigDecimal(f).setScale(2, RoundingMode.UP);
        MostrarConversion(bigDecimal.doubleValue(), "Grados Fahrenheit");
    }

    public void FahaCel(String valor) {
        double f = Double.parseDouble(valor);
        double c = (f - 32) / 1.8;
        BigDecimal bigDecimal = new BigDecimal(c).setScale(2, RoundingMode.UP);
        MostrarConversion(bigDecimal.doubleValue(), "Grados Celsius");

    }

    public void FahaKel(String valor) {
        double f = Double.parseDouble(valor);
        double k = (f - 32) * 5 / 9 + 273.15;
        BigDecimal bigDecimal = new BigDecimal(k).setScale(2, RoundingMode.UP);
        MostrarConversion(bigDecimal.doubleValue(), "Grados Kelvin");
    }

}
