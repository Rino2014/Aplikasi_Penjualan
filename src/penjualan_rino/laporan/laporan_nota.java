package penjualan_rino.laporan;

import java.sql.Connection;
import java.util.HashMap;
import koneksi.koneksi;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

public class laporan_nota {

    Connection conn = new koneksi().connect();

    public void cetakLaporan(String idnota) {

        try {

            String path = "src/laporan/nota.jasper";

            HashMap parameter = new HashMap();

            parameter.put("idnota", idnota);

            JasperPrint jp = JasperFillManager.fillReport(
                    path,
                    parameter,
                    conn
            );

            JasperViewer.viewReport(jp, false);

        } catch (Exception e) {
            System.out.println("Error Cetak Nota : " + e);
        }
    }
}