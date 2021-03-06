/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReaderRole;

import Business.Books.Book;
import Business.Books.Catagory;
import Business.EcoSystem;
import Business.Shelf.Shelf;
import Business.Shelf.ShelfItem;
import Business.UserAccount.Readers;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bengre
 */
public class AddBooksToShelfJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddBooksToShelfJPanel
     */
    private JPanel userProcessContainer;
    private Readers account;
    private Shelf shelf;
    private EcoSystem business;
    AddBooksToShelfJPanel(JPanel userProcessContainer, Readers account,EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.business=business;
        shelf = account.getShelf();
        jButtonAdd.setEnabled(false);        
    }
    
    public void populateComboBoxes() {
        jComboBoxRatings.removeAllItems();        
        for (double i=0; i<=5.0;i +=0.5){
            jComboBoxRatings.addItem(String.valueOf(i));
        }
    }
    
    
    public void populateTables(List<Book> result){
        DefaultTableModel model = (DefaultTableModel) jTableResult.getModel();
        model.setRowCount(0);        
        for (Book b: result) {
                Object[] row = new Object[3];
                row[0] = b; 
                row[1] = b.getAuthor();
                row[2] = b.getCatagory();                
                model.addRow(row);
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldBookName = new javax.swing.JTextField();
        jButtonSearchByName = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAuthorName = new javax.swing.JTextField();
        jButtonSearchByName1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResult = new javax.swing.JTable();
        jButtonAddBookToShelf = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldBookNameAdd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAuthorAdd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxShelf = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldYearCompleted = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxRatings = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaReview = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldAvgRating = new javax.swing.JTextField();
        jButtonAddBookToShelf1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Add Book to Shelf");

        jLabel2.setText("Book name:");

        jButtonSearchByName.setText("Search");
        jButtonSearchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchByNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Author name:");

        jButtonSearchByName1.setText("Search");
        jButtonSearchByName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchByName1ActionPerformed(evt);
            }
        });

        jTableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book", "Author", "Catagory"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableResult);
        if (jTableResult.getColumnModel().getColumnCount() > 0) {
            jTableResult.getColumnModel().getColumn(0).setResizable(false);
            jTableResult.getColumnModel().getColumn(1).setResizable(false);
            jTableResult.getColumnModel().getColumn(2).setResizable(false);
        }

        jButtonAddBookToShelf.setText("Add Book to Shelf");
        jButtonAddBookToShelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddBookToShelfActionPerformed(evt);
            }
        });

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButton3.setText("<< Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Book name:");

        jTextFieldBookNameAdd.setEditable(false);

        jLabel5.setText("Author name:");

        jTextFieldAuthorAdd.setEditable(false);

        jLabel6.setText("Select Shelf:");

        jComboBoxShelf.setEditable(true);
        jComboBoxShelf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Read", "To-read", "Currently Reading" }));

        jLabel7.setText("Year Completed:");

        jLabel8.setText("Ratings:");

        jComboBoxRatings.setEditable(true);
        jComboBoxRatings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "0.5", "1.0", "1.5", "2.0", "2.5", "3.0", "3.5", "4.0", "4.5", "5.0" }));

        jLabel9.setText("Review:");

        jTextAreaReview.setColumns(20);
        jTextAreaReview.setRows(5);
        jScrollPane2.setViewportView(jTextAreaReview);

        jLabel10.setText("Average Rating:");

        jTextFieldAvgRating.setEditable(false);

        jButtonAddBookToShelf1.setText("Request To Add Book");
        jButtonAddBookToShelf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddBookToShelf1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(244, 244, 244)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAddBookToShelf1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jTextFieldAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jButtonSearchByName1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jTextFieldBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jButtonSearchByName))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddBookToShelf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonAdd))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(149, 149, 149)
                                        .addComponent(jTextFieldAvgRating, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldAuthorAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                    .addComponent(jTextFieldYearCompleted)
                                    .addComponent(jScrollPane2))))
                        .addGap(45, 45, 45))))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldBookNameAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(jComboBoxShelf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxRatings, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSearchByName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSearchByName1))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonAddBookToShelf1)
                    .addComponent(jButtonAddBookToShelf))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldBookNameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldAuthorAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxShelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldYearCompleted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxRatings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAvgRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonAdd)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SeeShelf seeShelf = (SeeShelf) component;
        seeShelf.populateTables();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonSearchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchByNameActionPerformed
        // TODO add your handling code here:
        String name = jTextFieldBookName.getText();
        if(name != null){
            List<Book> result = business.getBd().searchByName(name);
            populateTables(result);
        }else{
            JOptionPane.showMessageDialog(null,"Enter a Book Name to search");
        }
    }//GEN-LAST:event_jButtonSearchByNameActionPerformed

    private void jButtonSearchByName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchByName1ActionPerformed
        // TODO add your handling code here:
        String name = jTextFieldAuthorName.getText();
        if(name != null){
            List<Book> result = business.getBd().searchByAuthor(name);
            populateTables(result);
        }else{
            JOptionPane.showMessageDialog(null,"Enter a Author Name to search");
        }
    }//GEN-LAST:event_jButtonSearchByName1ActionPerformed

    private void jButtonAddBookToShelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBookToShelfActionPerformed
        // TODO add your handling code here:
        int selectedRowValue = jTableResult.getSelectedRow();
        if(selectedRowValue >= 0){
            jButtonAdd.setEnabled(true);            
            Book book = (Book)jTableResult.getValueAt(selectedRowValue, 0);                      
            jTextFieldBookNameAdd.setText(book.getName());
            jTextFieldAuthorAdd.setText(book.getAuthor().getName());
            jTextFieldAvgRating.setText(String.valueOf(book.getRating()));
        }else{
            JOptionPane.showMessageDialog(null,"Please select a Book to add");
        }
    }//GEN-LAST:event_jButtonAddBookToShelfActionPerformed

    private void jButtonAddBookToShelf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBookToShelf1ActionPerformed
        // TODO add your handling code here:
        AddBookAdminRequestJPanel addBookAdminRequestJPanel = new AddBookAdminRequestJPanel(userProcessContainer, account,business);
        userProcessContainer.add("AddBookAdminRequestJPanel", addBookAdminRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButtonAddBookToShelf1ActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        int selectedRowValue = jTableResult.getSelectedRow();
        if(selectedRowValue >= 0){
            try{
            Book book = (Book)jTableResult.getValueAt(selectedRowValue, 0);
            ShelfItem si = account.getShelf().addBook();
            si.setTitle(book);
            String status = (String) jComboBoxShelf.getSelectedItem();
            if("Read".equals(status)){
                si.setStatus(ShelfItem.Status.Read);
                String rat = (String) jComboBoxRatings.getSelectedItem();
                double rating = Double.valueOf(rat);
                book.setRating(rating);
                si.setRating(rating);
                si.setReview(jTextAreaReview.getText());                
                si.setYearCompleted(Integer.parseInt(jTextFieldYearCompleted.getText()));
            }
            else if("To-read".equals(status))
                si.setStatus(ShelfItem.Status.ToRead);
            else si.setStatus(ShelfItem.Status.Reading);
            JOptionPane.showMessageDialog(null,"Book Added to shelf");
        }
            catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Enter Year Completed properly");
                }
            
        }
    
    }//GEN-LAST:event_jButtonAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAddBookToShelf;
    private javax.swing.JButton jButtonAddBookToShelf1;
    private javax.swing.JButton jButtonSearchByName;
    private javax.swing.JButton jButtonSearchByName1;
    private javax.swing.JComboBox<String> jComboBoxRatings;
    private javax.swing.JComboBox<String> jComboBoxShelf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableResult;
    private javax.swing.JTextArea jTextAreaReview;
    private javax.swing.JTextField jTextFieldAuthorAdd;
    private javax.swing.JTextField jTextFieldAuthorName;
    private javax.swing.JTextField jTextFieldAvgRating;
    private javax.swing.JTextField jTextFieldBookName;
    private javax.swing.JTextField jTextFieldBookNameAdd;
    private javax.swing.JTextField jTextFieldYearCompleted;
    // End of variables declaration//GEN-END:variables
}
