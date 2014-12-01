
package bookrental;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import static bookrental.Book.addBook;
import org.apache.commons.lang.StringEscapeUtils;


/**
 * @author Ali Hannoun & Ramazan Cinardere
 */

public class AddBook extends javax.swing.JFrame {
    
    /*Class - Attributes*/
    
    String title,genre,agerating,imglink,streamlink,description,duration,releaseyear,price,language,language2;
    
    
    /*Class - Methods*/
    
    public AddBook() {
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(false);

    }
    
    public void releaseArea(){
        
        jTextField_title.setText("");
        jCombo_genre.setSelectedIndex(0);
        jCombo_ageRating.setSelectedIndex(0);
        jTextField_ImgLink.setText("");
        jTextField_streamlink.setText("");
        jTextArea_description.setText("");
        jTextField_duration.setText("");
        jTextField_releaseYear.setText("");
        jCombo_priceCat.setSelectedIndex(0);
        jCombo_language.setSelectedIndex(0);
        jCombo_language2.setSelectedIndex(0);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jTextField_ImgLink = new javax.swing.JTextField();
        jLabel_duration = new javax.swing.JLabel();
        jLabel_relaseyear = new javax.swing.JLabel();
        jLabel_agerating = new javax.swing.JLabel();
        jTextField_streamlink = new javax.swing.JTextField();
        jTextField_releaseYear = new javax.swing.JTextField();
        jLabel_description = new javax.swing.JLabel();
        jLabel_addBook = new javax.swing.JLabel();
        jTextField_duration = new javax.swing.JTextField();
        jLabel_genre = new javax.swing.JLabel();
        jLabel_title = new javax.swing.JLabel();
        jTextField_title = new javax.swing.JTextField();
        jLabel_ImgLink = new javax.swing.JLabel();
        jLabel_streamlink = new javax.swing.JLabel();
        jLabel_price = new javax.swing.JLabel();
        jCombo_genre = new javax.swing.JComboBox();
        jCombo_ageRating = new javax.swing.JComboBox();
        jCombo_priceCat = new javax.swing.JComboBox();
        jButton_return = new javax.swing.JButton();
        jButton_add = new javax.swing.JButton();
        jScrollPane_discription = new javax.swing.JScrollPane();
        jTextArea_description = new javax.swing.JTextArea();
        jLabel_lanuage = new javax.swing.JLabel();
        jCombo_language = new javax.swing.JComboBox();
        jCombo_language2 = new javax.swing.JComboBox();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_duration.setText("Duration :");

        jLabel_relaseyear.setText("Release Year :");

        jLabel_agerating.setText("Age Rating :");

        jTextField_streamlink.setEnabled(false);

        jTextField_releaseYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_releaseYearActionPerformed(evt);
            }
        });

        jLabel_description.setText("Description :");

        jLabel_addBook.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel_addBook.setText("Add a Book");

        jLabel_genre.setText("Genre :");

        jLabel_title.setText("Title :");

        jLabel_ImgLink.setText("IMG-Link :");

        jLabel_streamlink.setText("Streamlink :");

        jLabel_price.setText("Price Cat. :");

        jCombo_genre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Biographies", "Children", "Computer science ", "Cooking", "History", "Novel and Narratives", "School & Education" }));
        jCombo_genre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo_genreActionPerformed(evt);
            }
        });

        jCombo_ageRating.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "6", "12", "16", "18" }));
        jCombo_ageRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo_ageRatingActionPerformed(evt);
            }
        });

        jCombo_priceCat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3.99", "2.99", "1.99" }));
        jCombo_priceCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo_priceCatActionPerformed(evt);
            }
        });

        jButton_return.setText("Return");
        jButton_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_returnActionPerformed(evt);
            }
        });

        jButton_add.setText("Add");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        jTextArea_description.setColumns(20);
        jTextArea_description.setRows(5);
        jScrollPane_discription.setViewportView(jTextArea_description);

        jLabel_lanuage.setText("Language:");

        jCombo_language.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "First", "English", "German", "Spanish" }));

        jCombo_language2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Second", "English", "German", "Spanish" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_addBook)
                        .addContainerGap(696, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_return)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_genre)
                                    .addComponent(jLabel_agerating))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCombo_genre, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCombo_ageRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_title, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_relaseyear)
                                    .addComponent(jLabel_duration)
                                    .addComponent(jLabel_lanuage))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_duration, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_releaseYear, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCombo_language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCombo_language2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(341, 341, 341)
                                .addComponent(jButton_add))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_price)
                                .addGap(18, 18, 18)
                                .addComponent(jCombo_priceCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_streamlink)
                                    .addComponent(jLabel_ImgLink))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_ImgLink)
                                    .addComponent(jTextField_streamlink, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_description)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane_discription, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jLabel_addBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_title))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_genre)
                            .addComponent(jCombo_genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_agerating)
                            .addComponent(jCombo_ageRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_relaseyear)
                            .addComponent(jTextField_releaseYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_duration, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_lanuage)
                            .addComponent(jCombo_language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCombo_language2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_ImgLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_ImgLink))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_streamlink)
                            .addComponent(jTextField_streamlink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_price, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCombo_priceCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_description)
                            .addComponent(jScrollPane_discription, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_return)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_add)
                        .addGap(14, 14, 14))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_releaseYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_releaseYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_releaseYearActionPerformed

    private void jCombo_genreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo_genreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombo_genreActionPerformed

    private void jButton_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_returnActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton_returnActionPerformed

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
       title = jTextField_title.getText();
       genre = (String) jCombo_genre.getSelectedItem();
       agerating = (String) jCombo_ageRating.getSelectedItem();
       duration = jTextField_duration.getText();
       releaseyear = jTextField_releaseYear.getText();
       description = StringEscapeUtils.escapeJavaScript(jTextArea_description.getText());
       price = (String) jCombo_priceCat.getSelectedItem();
       imglink = jTextField_ImgLink.getText();
       streamlink = jTextField_streamlink.getText();
       language =  (String) jCombo_language.getSelectedItem();
       language2 = (String) jCombo_language2.getSelectedItem();
       
       if(evt.getSource() == jButton_add){
          
       if(title.equals("") || genre.equals("") || agerating.equals("") || duration.equals("") || releaseyear.equals("") || description.equals("") || price.equals("") || imglink.equals("") || language.equals("First") )
       {    
           JOptionPane.showMessageDialog(null, "Please fill all fields.");
           
       }else{
          try {
               addBook(title,genre,agerating,description,releaseyear,duration,streamlink,imglink,price,language,language2);
           } catch (SQLException ex) {
               Logger.getLogger(AddBook.class.getName()).log(Level.SEVERE, null, ex);
           }
          releaseArea();
        }
       }
    }//GEN-LAST:event_jButton_addActionPerformed

    private void jCombo_ageRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo_ageRatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombo_ageRatingActionPerformed

    private void jCombo_priceCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo_priceCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombo_priceCatActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddBook().setVisible(true);
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_return;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jCombo_ageRating;
    private javax.swing.JComboBox jCombo_genre;
    private javax.swing.JComboBox jCombo_language;
    private javax.swing.JComboBox jCombo_language2;
    private javax.swing.JComboBox jCombo_priceCat;
    private javax.swing.JLabel jLabel_ImgLink;
    private javax.swing.JLabel jLabel_addBook;
    private javax.swing.JLabel jLabel_agerating;
    private javax.swing.JLabel jLabel_description;
    private javax.swing.JLabel jLabel_duration;
    private javax.swing.JLabel jLabel_genre;
    private javax.swing.JLabel jLabel_lanuage;
    private javax.swing.JLabel jLabel_price;
    private javax.swing.JLabel jLabel_relaseyear;
    private javax.swing.JLabel jLabel_streamlink;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JScrollPane jScrollPane_discription;
    private javax.swing.JTextArea jTextArea_description;
    private javax.swing.JTextField jTextField_ImgLink;
    private javax.swing.JTextField jTextField_duration;
    private javax.swing.JTextField jTextField_releaseYear;
    private javax.swing.JTextField jTextField_streamlink;
    private javax.swing.JTextField jTextField_title;
    // End of variables declaration//GEN-END:variables
}