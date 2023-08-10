import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Moneda {

    public void MostrarConversion(double res, String string) {
        JOptionPane.showMessageDialog(null, "Tienes $" + res + " " + string, "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void MxnaDolar(String valor) {
        double d = Double.parseDouble(valor);
        double res = d * 0.059;
        BigDecimal bigDecimal = new BigDecimal(res).setScale(2, RoundingMode.UP);
        MostrarConversion(bigDecimal.doubleValue(), "Dólares");

    }

    public void MxnaEuro(String valor) {
        double d = Double.parseDouble(valor);
        double res = d * 0.053;
        BigDecimal bigDecimal = new BigDecimal(res).setScale(2, RoundingMode.UP);
        MostrarConversion(bigDecimal.doubleValue(), "Euros");
    }

    public void MxnaLibras(String valor) {
        double d = Double.parseDouble(valor);
        double res = d * 0.046;
        BigDecimal bigDecimal = new BigDecimal(res).setScale(2, RoundingMode.UP);
        MostrarConversion(bigDecimal.doubleValue(), "Libras Esterlinas");
    }

    public void MxnaYen(String valor) {
        double d = Double.parseDouble(valor);
        double res = d * 8.42;
        BigDecimal bigDecimal = new BigDecimal(res).setScale(2, RoundingMode.UP);
        MostrarConversion(bigDecimal.doubleValue(), "Yen Japónes");
    }

    public void MxnaWon(String valor) {
        double d = Double.parseDouble(valor);
        double res = d * 76.99;
        BigDecimal bigDecimal = new BigDecimal(res).setScale(2, RoundingMode.UP);
        MostrarConversion(bigDecimal.doubleValue(), "Won sul-coreano");
    }

    public void DolaraMxn(String valor) {
        double d = Double.parseDouble(valor);
        double res = d * 17.06;
        BigDecimal bigDecimal = new BigDecimal(res).setScale(2, RoundingMode.UP);
        MostrarConversion(bigDecimal.doubleValue(), "Pesos Mexicanos");
    }

    public void EuroaMxn(String valor) {
        double d = Double.parseDouble(valor);
        double res = d * 18.73;
        BigDecimal bigDecimal = new BigDecimal(res).setScale(2, RoundingMode.UP);
        MostrarConversion(bigDecimal.doubleValue(), "Pesos Mexicanos");
    }

    public void LibrasaMxn(String valor) {
        double d = Double.parseDouble(valor);
        double res = d * 21.71;
        BigDecimal bigDecimal = new BigDecimal(res).setScale(2, RoundingMode.UP);
        MostrarConversion(bigDecimal.doubleValue(), "Pesos Mexicanos");
    }

    public void YenaMxn(String valor) {
        double d = Double.parseDouble(valor);
        double res = d * 0.12;
        BigDecimal bigDecimal = new BigDecimal(res).setScale(2, RoundingMode.UP);
        MostrarConversion(bigDecimal.doubleValue(), "Pesos Mexicanos");
    }

    public void WonaMxn(String valor) {
        double d = Double.parseDouble(valor);
        double res = d * 0.013;
        BigDecimal bigDecimal = new BigDecimal(res).setScale(2, RoundingMode.UP);
        MostrarConversion(bigDecimal.doubleValue(), "Pesos Mexicanos");
    }

}
