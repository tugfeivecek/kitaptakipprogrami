/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugfe_ıvecek_1621231018_bpıı_odev2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author tuğfe
 */
public class KitapEkleme extends javax.swing.JFrame {

    /**
     * Creates new form KitapEkleme
     */
    public KitapEkleme() {
        initComponents();
        setTitle("Kitap Ekleme Ekranı");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBilgiGir = new javax.swing.JLabel();
        lblIsbn = new javax.swing.JLabel();
        lblKitapIsmi = new javax.swing.JLabel();
        lblBasimYili = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIsbnNo = new javax.swing.JTextField();
        txtBasimYili = new javax.swing.JTextField();
        txtSayfaSayisi = new javax.swing.JTextField();
        txtYayınevi = new javax.swing.JTextField();
        txtFiyat = new javax.swing.JTextField();
        txtKitapIsmi = new javax.swing.JTextField();
        lblKitapIsmiDurum = new javax.swing.JLabel();
        lblIsbnDurum = new javax.swing.JLabel();
        lblBasimYiliDurum = new javax.swing.JLabel();
        lblYayıneviDurum = new javax.swing.JLabel();
        lblSayfaSayisiDurum1 = new javax.swing.JLabel();
        lblFiyatDurum1 = new javax.swing.JLabel();
        btnKaydetKitapEkle = new javax.swing.JButton();
        btnGeriE = new javax.swing.JButton();
        lblYazar = new javax.swing.JLabel();
        txtYazar = new javax.swing.JTextField();
        lblYazarDurum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBilgiGir.setText("Lütfen Bilgileri Giriniz");

        lblIsbn.setText("Isbn Numarasi :");

        lblKitapIsmi.setText("Kitap İsmi :");

        lblBasimYili.setText("Basım Yılı :");

        jLabel4.setText("Sayfa Sayısı :");

        jLabel5.setText("Fiyat :");

        jLabel6.setText("Yayınevi :");

        btnKaydetKitapEkle.setText("Ekle");
        btnKaydetKitapEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetKitapEkleActionPerformed(evt);
            }
        });

        btnGeriE.setText("Geri");
        btnGeriE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriEActionPerformed(evt);
            }
        });

        lblYazar.setText("Yazar :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnKaydetKitapEkle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGeriE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(lblBilgiGir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblYazar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKitapIsmi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBasimYili, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIsbnNo)
                            .addComponent(txtBasimYili)
                            .addComponent(txtSayfaSayisi)
                            .addComponent(txtFiyat)
                            .addComponent(txtYayınevi)
                            .addComponent(txtKitapIsmi)
                            .addComponent(txtYazar, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKitapIsmiDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIsbnDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBasimYiliDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSayfaSayisiDurum1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFiyatDurum1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblYayıneviDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblYazarDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblBilgiGir)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIsbn)
                        .addComponent(txtIsbnNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblIsbnDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblKitapIsmi)
                        .addComponent(txtKitapIsmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblKitapIsmiDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBasimYili)
                        .addComponent(txtBasimYili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBasimYiliDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSayfaSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtYayınevi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYazar)
                            .addComponent(txtYazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSayfaSayisiDurum1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFiyatDurum1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblYayıneviDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblYazarDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGeriE)
                    .addComponent(btnKaydetKitapEkle)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeriEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriEActionPerformed
        // TODO add your handling code here:
        YayınTakip yt = new YayınTakip();
        yt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGeriEActionPerformed

    private void btnKaydetKitapEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetKitapEkleActionPerformed
        // TODO add your handling code here:
        Pattern ısbnDesen = Pattern.compile("[0-9]");
        Matcher ısbnYakala = ısbnDesen.matcher(txtIsbnNo.getText());
        if (!ısbnYakala.find()) {

            lblIsbnDurum.setText("Geçerli Bir ISBN Numarası Giriniz.");

        } else {
            lblIsbnDurum.setText("");
        }
        Pattern kitapIDesen = Pattern.compile("^[a-zA-Z]+$");
        Matcher kitapIYakala = kitapIDesen.matcher(txtKitapIsmi.getText());
        if (!kitapIYakala.find()) {

            lblKitapIsmiDurum.setText("Geçerli Bir Kitap Ismi Giriniz.");

        } else {
            lblKitapIsmiDurum.setText("");
        }
        Pattern basimYiliDesen = Pattern.compile("[0-9]");
        Matcher basimYiliYakala = basimYiliDesen.matcher(txtBasimYili.getText());
        if (!basimYiliYakala.find()) {

            lblBasimYiliDurum.setText("Geçerli Bir Basım Yılı Giriniz.");

        } else {
            lblBasimYiliDurum.setText("");
        }
        Pattern sayfaSayisiDesen = Pattern.compile("[0-9]");
        Matcher sayfaSayisiYakala = sayfaSayisiDesen.matcher(txtSayfaSayisi.getText());
        if (!sayfaSayisiYakala.find()) {

            lblSayfaSayisiDurum1.setText("Geçerli Bir Sayfa Sayısı  Giriniz.");
        } else {
            lblSayfaSayisiDurum1.setText("");
        }
        Pattern fiyatDesen = Pattern.compile("[0-9]");
        Matcher fiyatYakala = fiyatDesen.matcher(txtFiyat.getText());
        if (!fiyatYakala.find()) {

            lblFiyatDurum1.setText("Geçerli Bir Fiyat Giriniz.");

        } else {
            lblFiyatDurum1.setText("");
        }
        Pattern yayıneviDesen = Pattern.compile("^[a-zA-Z]+$");
        Matcher yayıneviYakala = yayıneviDesen.matcher(txtYayınevi.getText());
        if (!yayıneviYakala.find()) {

            lblYayıneviDurum.setText("Geçerli Bir YayınEvi Giriniz.");

        } else {
            lblYayıneviDurum.setText("");
        }
        Pattern yazarDesen = Pattern.compile("^[a-zA-Z]+$");
        Matcher yazarYakala = yazarDesen.matcher(txtYazar.getText());
        if (!yazarYakala.find()) {

            lblYazarDurum.setText("Geçerli Bir Yazar Giriniz.");

        } else {
            lblYazarDurum.setText("");
        }

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tugfe_Ivecek_1621231018_BPII_Odev2PU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select k from Kitaplar k ");

        em.getTransaction().begin();

        Kitaplar k = new Kitaplar();
        k.setIsbn(Integer.valueOf(txtIsbnNo.getText()));
        k.setKitapismi(txtKitapIsmi.getText());
        k.setBasimyili(Integer.valueOf(txtBasimYili.getText()));
        k.setSayfasayisi(Integer.valueOf(txtSayfaSayisi.getText()));
        
        k.setFiyat(Integer.valueOf(txtFiyat.getText()));
        k.setYayinevi(txtYayınevi.getText());
        k.setYazar(txtYazar.getText());
        em.persist(k);

        txtIsbnNo.setText("");
        txtKitapIsmi.setText("");
        txtBasimYili.setText("");
        txtSayfaSayisi.setText("");
        txtYayınevi.setText("");
        txtFiyat.setText("");
        txtYazar.setText("");

        em.getTransaction().commit();
        em.close();
        emf.close();
    }//GEN-LAST:event_btnKaydetKitapEkleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KitapEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KitapEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KitapEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KitapEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KitapEkleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeriE;
    private javax.swing.JButton btnKaydetKitapEkle;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblBasimYili;
    private javax.swing.JLabel lblBasimYiliDurum;
    private javax.swing.JLabel lblBilgiGir;
    private javax.swing.JLabel lblFiyatDurum1;
    private javax.swing.JLabel lblIsbn;
    private javax.swing.JLabel lblIsbnDurum;
    private javax.swing.JLabel lblKitapIsmi;
    private javax.swing.JLabel lblKitapIsmiDurum;
    private javax.swing.JLabel lblSayfaSayisiDurum1;
    private javax.swing.JLabel lblYayıneviDurum;
    private javax.swing.JLabel lblYazar;
    private javax.swing.JLabel lblYazarDurum;
    private javax.swing.JTextField txtBasimYili;
    private javax.swing.JTextField txtFiyat;
    private javax.swing.JTextField txtIsbnNo;
    private javax.swing.JTextField txtKitapIsmi;
    private javax.swing.JTextField txtSayfaSayisi;
    private javax.swing.JTextField txtYayınevi;
    private javax.swing.JTextField txtYazar;
    // End of variables declaration//GEN-END:variables
}
