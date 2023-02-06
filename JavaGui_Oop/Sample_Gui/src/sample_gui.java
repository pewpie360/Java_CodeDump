import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;



//PLEASE RUN THE SPLASH JAVA AND NOT THIS ONE


public class sample_gui extends javax.swing.JFrame { //extends the java swing functions to class

	public sample_gui() { //create blank constructor and pass inside the return void method for components
        initComponents(); 
        Toolkit tool = getToolkit();
		Dimension size = tool.getScreenSize(); 
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2); //set the Jframe to center
    }

    @SuppressWarnings("unchecked")                         
    private void initComponents() { //return void method for components

        jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        txtPid = new javax.swing.JTextField();
        txtPname = new javax.swing.JTextField();
        txtPbrand = new javax.swing.JTextField();
        txtPaddress = new javax.swing.JTextField();
        txtPpackprod = new javax.swing.JTextField();	//CREATING LABELS, BUTTON, PANEL, TEXTFIELD, SCROLLPANE AND TABLE
        txtPbestby = new javax.swing.JTextField();
        txtPavail = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableInfo = new javax.swing.JTable();
        javax.swing.JPanel jPanel4 = new javax.swing.JPanel();
        javax.swing.JButton btnAdd = new javax.swing.JButton();
        javax.swing.JButton btnUpdate = new javax.swing.JButton();
        javax.swing.JButton btnDelete = new javax.swing.JButton();
        javax.swing.JButton btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); // set closing for gui
        setTitle("Stock Management System for iManage"); //set the title of the gui
        setMinimumSize(new java.awt.Dimension(804, 480)); //set the fix dimension of the gui
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("iManage");


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Product ID");

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Product Name");

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Product Brand");

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Address");

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Product Type");

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Pack/Prod");

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Best By");

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Amount Avail");

        txtPid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { //adding action listener for textfield ID
                txtPidActionPerformed(evt);
            }
        });

        txtPpackprod.addActionListener(new java.awt.event.ActionListener() { //adding action listener for textfield packprod
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPpackprodActionPerformed(evt);
            }
        });

        txtPbestby.addActionListener(new java.awt.event.ActionListener() { //adding action listener for textfield bestby
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPbestbyActionPerformed(evt);
            }
        });

        txtPavail.addActionListener(new java.awt.event.ActionListener() { //adding action listener for textfield available
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPavailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2); //grouping the panels
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(txtPid))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)
                        .addComponent(txtPname))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(14, 14, 14)
                        .addComponent(txtPbrand))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(57, 57, 57)
                        .addComponent(txtPaddress))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPavail, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtPbestby)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPpackprod)
                            .addComponent(txtType))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPbrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPpackprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPbestby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPavail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        TableInfo.setModel(new javax.swing.table.DefaultTableModel( //create a table with 8 columns
            new Object [][] {
            },
            new String [] {
                "Product ID", "Product Name", "Product Brand", "Address", "Product Type", "Pack / Prod", "Best By", "Amount Avail"
            }
        ));
        jScrollPane1.setViewportView(TableInfo);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        btnAdd.setBackground(new java.awt.Color(102, 255, 102));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { //create action listener for add button
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(102, 255, 102));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");

        btnDelete.setBackground(new java.awt.Color(102, 255, 102));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() { //create action listener for delete button
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(102, 255, 102));
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() { //create action listener for reset button
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }
    //this area is for the void return

    private void txtPidActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void txtPpackprodActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void txtPbestbyActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void txtPavailActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }

    //void getter method for button add action performed
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String ID = txtPid.getText();
        String name = txtPname.getText();
        String brand = txtPbrand.getText();
        String address = txtPaddress.getText();
        String type = txtType.getText();
        String pp = txtPpackprod.getText();
        String bb = txtPbestby.getText();
        String avail = txtPavail.getText();
        
        //Add condition
        if(ID.isEmpty() || name.isEmpty() || brand.isEmpty() || address.isEmpty() || type.isEmpty() || pp.isEmpty() || bb.isEmpty() || avail.isEmpty()){

            JOptionPane.showMessageDialog(this,
                    "Please Enter all fields", "Try Again", //Show error
                            JOptionPane.ERROR_MESSAGE);
        } else{ //add new row to the table
            DefaultTableModel model =(DefaultTableModel) TableInfo.getModel();
            model.addRow(new Object[]{ID, name, brand, address, type, pp, bb, avail});
            
            txtPid.setText("");
            txtPname.setText("");
            txtPbrand.setText("");
            txtPaddress.setText("");
            txtType.setText("");
            txtPpackprod.setText("");
            txtPbestby.setText("");
            txtPavail.setText("");
        }
    }
    
  //void getter method for button update action performed
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
    	DefaultTableModel model =(DefaultTableModel) TableInfo.getModel();
    	
    	if(TableInfo.getSelectedRowCount() == 1) {
    		model.setValueAt(txtPid, TableInfo.getSelectedRow(), 0);
    		model.setValueAt(txtPname, TableInfo.getSelectedRow(), 1);
    		model.setValueAt(txtPbrand, TableInfo.getSelectedRow(), 2);
    		model.setValueAt(txtPaddress, TableInfo.getSelectedRow(), 3);
    		model.setValueAt(txtType, TableInfo.getSelectedRow(), 4);
    		model.setValueAt(txtPpackprod, TableInfo.getSelectedRow(), 5);
    		model.setValueAt(txtPbestby, TableInfo.getSelectedRow(), 6);
    		model.setValueAt(txtPavail, TableInfo.getSelectedRow(), 7);
    		
    		//update message display
    		JOptionPane.showMessageDialog(this, "Update Successfully..");
    		
    	} else {
    		JOptionPane.showMessageDialog(this,
                    "Update Error",
                    "Select data to update",
                    JOptionPane.ERROR_MESSAGE);
    	}
    }
    
  //void getter method for button reset action performed
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {
    	txtPid.setText(null);
        txtPname.setText(null);
        txtPbrand.setText(null);
        txtPaddress.setText(null); //deleting the text field inputs
        txtType.setText(null);
        txtPpackprod.setText(null);
        txtPbestby.setText(null);
        txtPavail.setText(null);
    }                                        
    
    //void getter method for button delete action performed
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int row = TableInfo.getSelectedRow(); //obtain selected row
        
        //if no row selected
        if(row < 0){
            JOptionPane.showMessageDialog(this,
                    "No row is selected! Please select one row",
                    "Select row",
                    JOptionPane.ERROR_MESSAGE);
        } else{ //delete selected info
            DefaultTableModel model =(DefaultTableModel) TableInfo.getModel();
            model.removeRow(row);
        }
    }                    
    
    ///void getter method for table auto load when it closed
    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        //first read the data of the table
        DefaultTableModel model = (DefaultTableModel) TableInfo.getModel();
        Vector<Vector> tableData = model.getDataVector();
        
        //saving object in a file
        try{
            FileOutputStream file = new FileOutputStream("DataInfo.bin");
            ObjectOutputStream output = new ObjectOutputStream(file);
            
            //method for serialization of object
            output.writeObject(tableData);
            
            output.close();
            file.close();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }                                  

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        // this method will be executed once the app is opened
        //read the contained data and display it
        try{
            FileInputStream file = new FileInputStream("DataInfo.bin");
            ObjectInputStream input = new ObjectInputStream(file);
            
            //method for deserialization of the file
            Vector<Vector> tableData = (Vector<Vector>) input.readObject();
            
            
            input.close();
            file.close();
            
            //add the file to the table
            DefaultTableModel model = (DefaultTableModel) TableInfo.getModel();
            for(int i = 0; i < tableData.size(); i++){
                Vector row = tableData.get(i);
                model.addRow(new Object[]{row.get(0),row.get(1),row.get(2),row.get(3),row.get(4),row.get(5),row.get(6),row.get(7)});
                
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    private void TableInfoMouseClicked(java.awt.event.MouseEvent evt) { //set the data to their textfield
    	DefaultTableModel model =(DefaultTableModel) TableInfo.getModel();
    	
    	//set data to textfield when row is selected
    	String id = model.getValueAt(TableInfo.getSelectedRow(), 0).toString();
    	String name = model.getValueAt(TableInfo.getSelectedRow(), 1).toString();
    	String brand = model.getValueAt(TableInfo.getSelectedRow(), 2).toString();
    	String address = model.getValueAt(TableInfo.getSelectedRow(), 3).toString();
    	String Type = model.getValueAt(TableInfo.getSelectedRow(), 4).toString();
    	String packprod = model.getValueAt(TableInfo.getSelectedRow(), 5).toString();
    	String bestby = model.getValueAt(TableInfo.getSelectedRow(), 6).toString();
    	String avail = model.getValueAt(TableInfo.getSelectedRow(), 7).toString();
    	
    	//set to textfield
    	txtPid.setText(id);
    	txtPname.setText(name);
        txtPbrand.setText(brand);
        txtPaddress.setText(address);
        txtType.setText(Type);
        txtPpackprod.setText(packprod);
        txtPbestby.setText(bestby);
        txtPavail.setText(avail);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sample_gui().setVisible(true);
            }
        });
    }

    // Variables declaration with already modified var names                    
    private javax.swing.JTable TableInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPaddress;
    private javax.swing.JTextField txtPavail;
    private javax.swing.JTextField txtPbestby;
    private javax.swing.JTextField txtPbrand;
    private javax.swing.JTextField txtPid;
    private javax.swing.JTextField txtPname;
    private javax.swing.JTextField txtPpackprod;
    private javax.swing.JTextField txtType;
    // End of variables declaration 
    
}
