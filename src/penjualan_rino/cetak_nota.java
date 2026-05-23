package penjualan_rino;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class cetak_nota {

    Connection conn;

    public cetak_nota(String idnota) {

        try {

            conn = new koneksi().connect();

            String reportPath =
            "src/laporan/nota.jasper";

            HashMap<String, Object> parameter =
            new HashMap<>();

            parameter.put("idnota", idnota);

            JasperPrint jp =
            JasperFillManager.fillReport(
                    reportPath,
                    parameter,
                    conn
            );

            JasperViewer viewer =
            new JasperViewer(jp, false);

            viewer.setVisible(true);

        } catch (Exception e) {

            javax.swing.JOptionPane.showMessageDialog(
                    null,
                    "Gagal tampil laporan : " + e
            );
        }
    }
}