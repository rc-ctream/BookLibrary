/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bookrental;

import java.awt.Color;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class MovieInfo extends javax.swing.JFrame {

    Book movie;
    User user;
    
    public MovieInfo(User obj, Book obj2) throws MalformedURLException {
        initComponents();
        setLocationRelativeTo(null);
        movie = obj2;
        user = obj;
        
        jScrollPane1.setBorder(null);
        jTextAreaDescription.setBackground(new Color(0, 0, 0, 0));
        jTextAreaDescription.setLineWrap(true);
        jTextAreaDescription.setWrapStyleWord(true);
        jTextAreaDescription.setBorder(null);
        jLabelTitle.setText(movie.getTitle());
        jLabelRelease.setText(movie.getreleaseYear());
        jLabelDuration.setText(movie.getDuration());
        jLabelGenre.setText(movie.getGenre());
        jLabelAgeRating.setText(movie.getAgerating() + " Years");
        jLabelRating.setText(movie.getRating());
        if(movie.getLanguage2().equals("")){
            jLabelLanguage.setText(movie.getLanguage());
        }else{
            jLabelLanguage.setText(movie.getLanguage() + ", " + movie.getLanguage2());
        }
        String description = movie.getDescription();
       
        jTextAreaDescription.setText(description);
        jLabelImgLink.setIcon(new ImageIcon(new URL(movie.getImglink())));
        jLabelImgLink.setText(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelImgLink = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButtonRentMovie = new javax.swing.JButton();
        jButtonReturn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboRating = new javax.swing.JComboBox();
        jButtonRateMovie = new javax.swing.JButton();
        jLabelRelease = new javax.swing.JLabel();
        jLabelDuration = new javax.swing.JLabel();
        jLabelGenre = new javax.swing.JLabel();
        jLabelAgeRating = new javax.swing.JLabel();
        jLabelRating = new javax.swing.JLabel();
        jLabelLanguage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabelTitle.setText("Turbo - Kleine Schnecke, großer Traum");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movierental/Logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabelImgLink.setText("jLabel1");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel7.setText("Genre:");

        jLabel8.setText("Age Rating:");

        jLabel9.setText("Rating:");

        jLabel10.setText("Description:");

        jButtonRentMovie.setText("Rent Movie");
        jButtonRentMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRentMovieActionPerformed(evt);
            }
        });

        jButtonReturn.setText("Return");
        jButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnActionPerformed(evt);
            }
        });

        jLabel11.setText("Language:");

        jLabel12.setText("Release:");

        jLabel13.setText("Duration:");

        jComboRating.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "4", "3", "2", "1" }));
        jComboRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboRatingActionPerformed(evt);
            }
        });

        jButtonRateMovie.setText("Rate Movie");
        jButtonRateMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRateMovieActionPerformed(evt);
            }
        });

        jLabelRelease.setText("jLabel1");

        jLabelDuration.setText("jLabel1");

        jLabelGenre.setText("jLabel1");

        jLabelAgeRating.setText("jLabel1");

        jLabelRating.setText("jLabel1");

        jLabelLanguage.setText("jLabel1");

        jTextAreaDescription.setEditable(false);
        jTextAreaDescription.setBackground(new java.awt.Color(238, 238, 238));
        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jTextAreaDescription.setBorder(null);
        jTextAreaDescription.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextAreaDescription.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaDescription);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabelImgLink, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelRating, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelAgeRating, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(36, 36, 36)
                                            .addComponent(jLabelGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabelRelease, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1)))
                            .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButtonReturn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboRating, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRateMovie)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonRentMovie)))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 477, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImgLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabelRelease))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabelDuration))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabelGenre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabelAgeRating))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabelRating))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabelLanguage))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRentMovie)
                    .addComponent(jButtonReturn)
                    .addComponent(jComboRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRateMovie))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboRatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboRatingActionPerformed

    private void jButtonRateMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRateMovieActionPerformed
        if(user.getUid().equals("0")){
            JOptionPane.showMessageDialog(null, "Please log in first.");
        }else{
            Verbindung db = new Verbindung();
            db.start();
            Connection conn = db.getVerbindung();
            Statement stmt,stmt2;
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM rates where uid = '"+user.getUid()+"' and mid = '"+movie.getMid()+"' ");
                if( rs.first() ){
                    JOptionPane.showMessageDialog(null, "You have already rated this movie!");
                } else {        
                    stmt2 = conn.createStatement();
                    stmt2.executeUpdate("INSERT INTO rates(uid, mid, rating) VALUES ('"+user.getUid()+"', '"+movie.getMid()+"', '"+ jComboRating.getSelectedItem() +"') ");
                    JOptionPane.showMessageDialog(null, "Thank you for rating this movie!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(MovieInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonRateMovieActionPerformed

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonReturnActionPerformed

    private void jButtonRentMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRentMovieActionPerformed
        if(user.getUid().equals("0")){
            JOptionPane.showMessageDialog(null, "Please log in first.");
        }else if(user.getPrename().equals("") || user.getSurname().equals("")|| user.getStreet().equals("")|| user.getZipcode().equals("")|| user.getCity().equals("") || user.getIban() == null || user.getBic() == null || user.getIban().equals("")|| user.getBic().equals("")){
            JOptionPane.showMessageDialog(null, "You have to change your account information and fill in all fields.");
        }else{
            try {
                new Rent(user, movie).setVisible(true);
            } catch (MalformedURLException | SQLException ex) {
                Logger.getLogger(MovieInfo.class.getName()).log(Level.SEVERE, null, ex);
            }

            dispose();
        }
    }//GEN-LAST:event_jButtonRentMovieActionPerformed

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
            java.util.logging.Logger.getLogger(MovieInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MovieInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRateMovie;
    private javax.swing.JButton jButtonRentMovie;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JComboBox jComboRating;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAgeRating;
    private javax.swing.JLabel jLabelDuration;
    private javax.swing.JLabel jLabelGenre;
    private javax.swing.JLabel jLabelImgLink;
    private javax.swing.JLabel jLabelLanguage;
    private javax.swing.JLabel jLabelRating;
    private javax.swing.JLabel jLabelRelease;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescription;
    // End of variables declaration//GEN-END:variables
}
