/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LibraryManagerRole;

import Business.Books.Book;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Shelf.ShelfItem;
import Business.UserAccount.Readers;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LibraryRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rishi
 */
public class RequestBook extends javax.swing.JPanel {

    /**
     * Creates new form RequestBool
     */   
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount account;
    private Book book;
    private Enterprise enterprise;
    RequestBook(JPanel userProcessContainer, EcoSystem business, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.account=account;
        this.enterprise=enterprise;
        book = null;
    }
    
    private Network getNetwork(UserAccount r){
        for(Network n: business.getNetworkList()){
                for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                    for(Organization o: e.getOrganizationDirectory().getOrganizationList()){                        
                            for(UserAccount ua: o.getUserAccountDirectory().getUserAccountList()){
                                if(ua.equals(r)){
                                    return n;                         
                            }
                        }
                    }
                }
            }
        return null;
    }
    
    private List<Readers>  getResult(Book b){
        List<Readers> result = new ArrayList<>();
            for(Enterprise e:getNetwork(account).getEnterpriseDirectory().getEnterpriseList()){
                for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount ua: o.getUserAccountDirectory().getUserAccountList()){
                        if(ua instanceof Readers){
                            if(((Readers) ua).getShelf()!= null){
                            for(ShelfItem si: ((Readers) ua).getShelf().getShelfList()){
                                if(si != null){
                                    if(si.getTitle().equals(b))
                                        result.add((Readers) ua);
                                }
                            }
                        }
                        }
                    }
                }
            }
        return result;            
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
    
    public void populateTablesReaders(List<Readers> result){
        DefaultTableModel model = (DefaultTableModel) tblReaderDetails.getModel();
        model.setRowCount(0);
        for(Readers r: result){
            Object[] row = new Object[2];
            row[0] = r;
            row[1] = getNetwork(r);
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

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReaderDetails = new javax.swing.JTable();
        jButtonRequestBook = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldBookName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAuthorName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableResult = new javax.swing.JTable();
        jButtonSearchByName = new javax.swing.JButton();
        jButtonSearchByName1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Request Books");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Readers List");

        tblReaderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblReaderDetails);
        if (tblReaderDetails.getColumnModel().getColumnCount() > 0) {
            tblReaderDetails.getColumnModel().getColumn(0).setResizable(false);
            tblReaderDetails.getColumnModel().getColumn(1).setResizable(false);
        }

        jButtonRequestBook.setText("Request Book");
        jButtonRequestBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRequestBookActionPerformed(evt);
            }
        });

        jLabel2.setText("Book name:");

        jLabel4.setText("Author name:");

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
        jScrollPane2.setViewportView(jTableResult);

        jButtonSearchByName.setText("Search");
        jButtonSearchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchByNameActionPerformed(evt);
            }
        });

        jButtonSearchByName1.setText("Search");
        jButtonSearchByName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchByName1ActionPerformed(evt);
            }
        });

        jButton1.setText("Select Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(286, 286, 286)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(193, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4))
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
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRequestBook)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(381, 381, 381)))))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearchByName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearchByName1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRequestBook)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LibraryManagerWorkAreaJPanel libManagerjp = (LibraryManagerWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRowValue = jTableResult.getSelectedRow();
        if(selectedRowValue >= 0){
            Book books = (Book)jTableResult.getValueAt(selectedRowValue, 0);
            book= books;            
            populateTablesReaders(getResult(book));
        }
        else{
            JOptionPane.showMessageDialog(null,"Select a book");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonRequestBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRequestBookActionPerformed
        // TODO add your handling code here:
        int selectedRowValue = tblReaderDetails.getSelectedRow();
        if(selectedRowValue >= 0){
            Readers r = (Readers) tblReaderDetails.getValueAt(selectedRowValue, 0);
            LibraryRequest lr = (LibraryRequest) r.getWorkQueue().createLibraryRequest();
            lr.setBook(book);
            lr.setLibName(enterprise.getName());
            lr.setSender(account);
            lr.setReceiver(r);
            lr.setStatus("New");
            JOptionPane.showMessageDialog(null,"Request Sent. You will receive a message if the the reader accepts it!!");
        }else{
            JOptionPane.showMessageDialog(null,"Select a Person to request books!!");
        }
    }//GEN-LAST:event_jButtonRequestBookActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRequestBook;
    private javax.swing.JButton jButtonSearchByName;
    private javax.swing.JButton jButtonSearchByName1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableResult;
    private javax.swing.JTextField jTextFieldAuthorName;
    private javax.swing.JTextField jTextFieldBookName;
    private javax.swing.JTable tblReaderDetails;
    // End of variables declaration//GEN-END:variables
}
