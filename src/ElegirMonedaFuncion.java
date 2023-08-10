import javax.swing.JOptionPane;

public class ElegirMonedaFuncion {

    Moneda mon = new Moneda();

    public void elegirmoneda(String valor) {

        Object[] opcionesDeConversion = { "MXN a Dólar", "MXN a Euro", "MXN a Libras Esterlinas", "MXN a Yen Japónes",
                "MXN a Won sul-coreano", "Dólar a MXN", "Euro a MXN", "Libras Esterlinas a MXN", "Yen Japónes a MXN",
                "Won sul-coreano a MXN" };
        String opcion = (String) JOptionPane.showInputDialog(null,
                "Elije una moneda a la que deseas convertir tu dinero:  ",
                "Menu",
                JOptionPane.PLAIN_MESSAGE, null, opcionesDeConversion, opcionesDeConversion[0]);

        switch (opcion) {
            case "MXN a Dólar":
                mon.MxnaDolar(valor);
                break;
            case "MXN a Euro":
                mon.MxnaEuro(valor);
                break;
            case "MXN a Libras Esterlinas":
                mon.MxnaLibras(valor);
                break;
            case "MXN a Yen Japónes":
                mon.MxnaYen(valor);
                break;
            case "MXN a Won sul-coreano":
                mon.MxnaWon(valor);
                break;
            case "Dólar a MXN":
                mon.DolaraMxn(valor);
                break;
            case "Euro a MXN":
                mon.EuroaMxn(valor);
                break;
            case "Libras Esterlinas a MXN":
                mon.LibrasaMxn(valor);
                break;
            case "Yen Japónes a MXN":
                mon.YenaMxn(valor);
                break;
            case "Won sul-coreano a MXN":
                mon.WonaMxn(valor);
                break;
        }

    }

}
