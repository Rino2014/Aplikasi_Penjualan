package penjualan_rino;

import java.sql.Connection;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class MenuUtama extends javax.swing.JFrame {

    public MenuUtama() {

        initComponents();

        this.setExtendedState(MAXIMIZED_BOTH);

        String kasirAktif = UserID.getUserLogin();

        lblWelcome.setText("Selamat Datang, Kasir : " + kasirAktif);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblWelcome = new javax.swing.JLabel();

        jMenuBar1 = new javax.swing.JMenuBar();

        menuAplikasi = new javax.swing.JMenu();
        itemLogout = new javax.swing.JMenuItem();
        itemKeluar = new javax.swing.JMenuItem();

        menuMaster = new javax.swing.JMenu();
        itemPelanggan = new javax.swing.JMenuItem();
        itemBarang = new javax.swing.JMenuItem();
        itemKasir = new javax.swing.JMenuItem();

        menuTransaksi = new javax.swing.JMenu();
        itemNota = new javax.swing.JMenuItem();

        menuLaporan = new javax.swing.JMenu();
        itemLapPelanggan = new javax.swing.JMenuItem();
        itemLapBarang = new javax.swing.JMenuItem();
        itemLapKasir = new javax.swing.JMenuItem();
        itemLapNota = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setTitle("Sistem Aplikasi Penjualan");

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 22));

        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblWelcome.setText("Selamat Datang");

        // ================= MENU APLIKASI =================

        menuAplikasi.setText("Aplikasi");

        itemLogout.setText("Logout");

        itemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLogoutActionPerformed(evt);
            }
        });

        menuAplikasi.add(itemLogout);

        itemKeluar.setText("Keluar");

        itemKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemKeluarActionPerformed(evt);
            }
        });

        menuAplikasi.add(itemKeluar);

        jMenuBar1.add(menuAplikasi);

        // ================= MENU MASTER =================

        menuMaster.setText("Master Data");

        itemPelanggan.setText("Data Pelanggan");

        itemPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPelangganActionPerformed(evt);
            }
        });

        menuMaster.add(itemPelanggan);

        itemBarang.setText("Data Barang");

        itemBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBarangActionPerformed(evt);
            }
        });

        menuMaster.add(itemBarang);

        itemKasir.setText("Data Kasir");

        itemKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemKasirActionPerformed(evt);
            }
        });

        menuMaster.add(itemKasir);

        jMenuBar1.add(menuMaster);

        // ================= MENU TRANSAKSI =================

        menuTransaksi.setText("Transaksi");

        itemNota.setText("Form Nota Penjualan");

        itemNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNotaActionPerformed(evt);
            }
        });

        menuTransaksi.add(itemNota);

        jMenuBar1.add(menuTransaksi);

        // ================= MENU LAPORAN =================

        menuLaporan.setText("Laporan");

        itemLapPelanggan.setText("Laporan Pelanggan");

        itemLapPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLapPelangganActionPerformed(evt);
            }
        });

        menuLaporan.add(itemLapPelanggan);

        itemLapBarang.setText("Laporan Barang");

        itemLapBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLapBarangActionPerformed(evt);
            }
        });

        menuLaporan.add(itemLapBarang);

        itemLapKasir.setText("Laporan Kasir");

        itemLapKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLapKasirActionPerformed(evt);
            }
        });

        menuLaporan.add(itemLapKasir);

        itemLapNota.setText("Laporan Nota");

        itemLapNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLapNotaActionPerformed(evt);
            }
        });

        menuLaporan.add(itemLapNota);

        jMenuBar1.add(menuLaporan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout =
                new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblWelcome,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        900,
                                        Short.MAX_VALUE)
                                .addContainerGap())
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(lblWelcome)
                                .addContainerGap(300, Short.MAX_VALUE))
        );

        pack();
    }

    // ================= LOGOUT =================

    private void itemLogoutActionPerformed(java.awt.event.ActionEvent evt) {

        int opsi = JOptionPane.showConfirmDialog(
                this,
                "Apakah ingin logout ?",
                "Logout",
                JOptionPane.YES_NO_OPTION
        );

        if (opsi == JOptionPane.YES_OPTION) {

            UserID.setUserLogin(null);

            new Login().setVisible(true);

            dispose();
        }
    }

    // ================= KELUAR =================

    private void itemKeluarActionPerformed(java.awt.event.ActionEvent evt) {

        System.exit(0);

    }

    // ================= DATA PELANGGAN =================

    private void itemPelangganActionPerformed(java.awt.event.ActionEvent evt) {

        Pelanggan plg = new Pelanggan();

        plg.setVisible(true);

        plg.setLocationRelativeTo(null);

    }

    // ================= DATA BARANG =================

    private void itemBarangActionPerformed(java.awt.event.ActionEvent evt) {

        barang brg = new barang();

        brg.setVisible(true);

        brg.setLocationRelativeTo(null);

    }

    // ================= DATA KASIR =================

    private void itemKasirActionPerformed(java.awt.event.ActionEvent evt) {

        kasir ksr = new kasir();

        ksr.setVisible(true);

        ksr.setLocationRelativeTo(null);

    }

    // ================= FORM NOTA =================

    private void itemNotaActionPerformed(java.awt.event.ActionEvent evt) {

        nota nt = new nota();

        nt.setVisible(true);

        nt.setLocationRelativeTo(null);

    }

    // ================= LAPORAN PELANGGAN =================

    private void itemLapPelangganActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            Connection conn = new koneksi().connect();

            String path =
                    "src/penjualan_rino/laporan/pelanggan.jasper";

            JasperPrint jp =
                    JasperFillManager.fillReport(
                            path,
                            null,
                            conn
                    );

            JasperViewer.viewReport(jp, false);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Laporan Pelanggan Gagal Ditampilkan\n" + e
            );
            
            e.printStackTrace();
        }
    }

    // ================= LAPORAN BARANG =================

    private void itemLapBarangActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            Connection conn = new koneksi().connect();

            String path =
                    "src/penjualan_rino/laporan/Barang.jasper";

            JasperPrint jp =
                    JasperFillManager.fillReport(
                            path,
                            null,
                            conn
                    );

            JasperViewer.viewReport(jp, false);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Laporan Barang Gagal Ditampilkan\n" + e
            );
            
            e.printStackTrace();
        }
    }

    // ================= LAPORAN KASIR =================

    private void itemLapKasirActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            Connection conn = new koneksi().connect();

            String path =
                    "src/penjualan_rino/laporan/Kasir.jasper";

            JasperPrint jp =
                    JasperFillManager.fillReport(
                            path,
                            null,
                            conn
                    );

            JasperViewer.viewReport(jp, false);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Laporan Kasir Gagal Ditampilkan\n" + e
            );
            
            e.printStackTrace();
        }
    }

    // ================= LAPORAN NOTA =================

    private void itemLapNotaActionPerformed(java.awt.event.ActionEvent evt) {

    try {

        Connection conn = new koneksi().connect();

        String reportPath =
                "src/penjualan_rino/laporan/Nota.jasper";

        JasperPrint jp =
                JasperFillManager.fillReport(
                        reportPath,
                        null,
                        conn
                );

        JasperViewer viewer =
                new JasperViewer(jp, false);

        viewer.setTitle("Laporan Transaksi / Nota");

        viewer.setVisible(true);

    } catch (Exception e) {

        JOptionPane.showMessageDialog(
                null,
                "Cetak Laporan Nota Gagal\n\n" + e
        );

        e.printStackTrace();
    }
}

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new MenuUtama().setVisible(true);

            }
        });
    }

    // Variables declaration

    private javax.swing.JMenuItem itemBarang;
    private javax.swing.JMenuItem itemKasir;
    private javax.swing.JMenuItem itemKeluar;
    private javax.swing.JMenuItem itemLogout;
    private javax.swing.JMenuItem itemNota;
    private javax.swing.JMenuItem itemPelanggan;

    private javax.swing.JMenuItem itemLapPelanggan;
    private javax.swing.JMenuItem itemLapBarang;
    private javax.swing.JMenuItem itemLapKasir;
    private javax.swing.JMenuItem itemLapNota;

    private javax.swing.JMenuBar jMenuBar1;

    private javax.swing.JLabel lblWelcome;

    private javax.swing.JMenu menuAplikasi;
    private javax.swing.JMenu menuMaster;
    private javax.swing.JMenu menuTransaksi;
    private javax.swing.JMenu menuLaporan;

    // End of variables declaration
}