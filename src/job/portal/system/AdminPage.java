/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.job.portal.system;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ABHINAV KATHURI
 */
public class AdminPage extends javax.swing.JFrame {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/job_portal_system";
    static final String USER = "root";
    static final String PASS = "Zeroop@123";

    /**
     * Creates new form adminpage
     */
    public AdminPage() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        show1 = new javax.swing.JButton();
        show2 = new javax.swing.JButton();
        show3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        update1 = new javax.swing.JButton();
        update2 = new javax.swing.JButton();
        update3 = new javax.swing.JButton();
        removejobseekerbutton = new javax.swing.JButton();
        removecompanybutton = new javax.swing.JButton();
        removeresumebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("JOB SEEKER TABLE");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Email ID", "Name", "Password", "Contact No", "Percentage"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("COMPANY TABLE");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Email ID", "Name", "Password", "Contact No", "Percentage"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        show1.setText("SHOW");
        show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show1ActionPerformed(evt);
            }
        });

        show2.setText("SHOW");
        show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show2ActionPerformed(evt);
            }
        });

        show3.setText("SHOW");
        show3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show3ActionPerformed(evt);
            }
        });

        jLabel3.setText("RESUME TABLE");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Company Email ID", "Job Seeker Email ID"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        update1.setText("UPDATE SELCTED ROW");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });

        update2.setText("UPDATE SELCTED ROW");
        update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update2ActionPerformed(evt);
            }
        });

        update3.setText("UPDATE SELCTED ROW");
        update3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update3ActionPerformed(evt);
            }
        });

        removejobseekerbutton.setText("REMOVE SELECTED ROW");
        removejobseekerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removejobseekerbuttonActionPerformed(evt);
            }
        });

        removecompanybutton.setText("REMOVE SELECTED ROW");
        removecompanybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removecompanybuttonActionPerformed(evt);
            }
        });

        removeresumebutton.setText("REMOVE SELECTED ROW");
        removeresumebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeresumebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(show1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(update1)
                .addGap(45, 45, 45)
                .addComponent(removejobseekerbutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 194, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))))
            .addGroup(layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(show2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(update2)
                .addGap(53, 53, 53)
                .addComponent(removecompanybutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(update3)
                .addGap(31, 31, 31)
                .addComponent(removeresumebutton)
                .addGap(226, 226, 226))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update1)
                    .addComponent(removejobseekerbutton))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update2)
                    .addComponent(removecompanybutton))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update3)
                    .addComponent(removeresumebutton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void show1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show1ActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        Statement stmt = null;
        try
        {             
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER, PASS);
            stmt = conn.createStatement();
            String q,n,e,p,c,pr;
            q = "select * from jobseeker";
            DefaultTableModel tablemodel = (DefaultTableModel)jTable1.getModel();
            tablemodel.setRowCount(0);
            ResultSet rs = stmt.executeQuery(q);
            int i = 0;
            while (rs.next()) {
                e = rs.getString("email_id");
                p = rs.getString("password");
                n = rs.getString("name");
                c = rs.getString("contact_no");
                pr = rs.getString("percentage");
                tablemodel.addRow(new Object[]{e,n,p,c,pr});
                i++;
            }

            if (i < 1) {
                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (i == 1) {
                System.out.println(i + " Record Found");
            } else {
                System.out.println(i + " Records Found");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_show1ActionPerformed

    private void show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show2ActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        Statement stmt = null;
        try
        {             
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER, PASS);
            stmt = conn.createStatement();
            String q,n,e,p,c,pr;
            q = "select * from company";
            DefaultTableModel tablemodel = (DefaultTableModel)jTable2.getModel();
            tablemodel.setRowCount(0);
            ResultSet rs = stmt.executeQuery(q);
            int i = 0;
            while (rs.next()) {
                e = rs.getString("email_id");
                p = rs.getString("password");
                n = rs.getString("name");
                c = rs.getString("contact_no");
                pr = rs.getString("percentage");
                tablemodel.addRow(new Object[]{e,n,p,c,pr});
                i++;
            }

            if (i < 1) {
                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (i == 1) {
                System.out.println(i + " Record Found");
            } else {
                System.out.println(i + " Records Found");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_show2ActionPerformed

    private void show3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show3ActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        Statement stmt = null;
        try
        {             
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER, PASS);
            stmt = conn.createStatement();
            String q,e,p;
            q = "select * from resume";
            DefaultTableModel tablemodel = (DefaultTableModel)jTable3.getModel();
            tablemodel.setRowCount(0);
            ResultSet rs = stmt.executeQuery(q);
            int i = 0;
            while (rs.next()) {
                e = rs.getString("company_email_id");
                p = rs.getString("jobseeker_email_id");
                tablemodel.addRow(new Object[]{e,p});
                i++;
            }

            if (i < 1) {
                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (i == 1) {
                System.out.println(i + " Record Found");
            } else {
                System.out.println(i + " Records Found");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_show3ActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
// get selected row index
        int selectedRowIndex = jTable1.getSelectedRow();
        
// get selected row data 
        String email = model.getValueAt(selectedRowIndex, 0).toString();
        String name = model.getValueAt(selectedRowIndex, 1).toString();
        String password = model.getValueAt(selectedRowIndex, 2).toString();
        String contact = model.getValueAt(selectedRowIndex, 3).toString();
        String percent = model.getValueAt(selectedRowIndex, 4).toString();

 // get the entered data         
        String newemail = JOptionPane.showInputDialog(null,"Enter The New Email ID",email);
        String newname = JOptionPane.showInputDialog(null,"Enter The New Name",name);
        String newpassword = JOptionPane.showInputDialog(null,"Enter The New password",password);
        String newcontact = JOptionPane.showInputDialog(null,"Enter The New contact no",contact);
        String newpercent = JOptionPane.showInputDialog(null,"Enter The New percent",percent);
        int per = parseInt(newpercent);
        
        Connection conn = null;
        PreparedStatement stmt = null;
        try
        {             
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER, PASS);
            stmt = conn.prepareStatement("UPDATE jobseeker SET name = ?, email_id = ? , password = ?, contact_no = ? , percentage = ? WHERE email_id = ?");
            stmt.setString(1,name);
            stmt.setString(2,newemail);
            stmt.setString(3,newpassword);
            stmt.setString(4,newcontact);
            stmt.setInt(5,per);
            stmt.setString(6,email);
            stmt.executeUpdate();

        }
        
        catch (SQLIntegrityConstraintViolationException se)
        {
        	se.printStackTrace();
        }
        
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        finally
        {
            try
            {
                if(stmt!=null)
                {
                	conn.close();
                }
            }
            catch(SQLException se)
            {
            	se.printStackTrace();
            }
            finally {
            	try
                {
                    if(conn!=null)
                    {
                    	conn.close();
                    }
                    
                }
                catch(SQLException se)
                {
                   se.printStackTrace();
                }
            }
        }
        
// set the new data into jtable row
        model.setValueAt(newemail, selectedRowIndex, 0);
        model.setValueAt(newname, selectedRowIndex, 1);
        model.setValueAt(newpassword, selectedRowIndex, 2);
        model.setValueAt(newcontact, selectedRowIndex,3);
        model.setValueAt(newpercent, selectedRowIndex,4);
    }//GEN-LAST:event_update1ActionPerformed

    private void update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        
// get selected row index
        int selectedRowIndex = jTable2.getSelectedRow();
        
// get selected row data 
        String email = model.getValueAt(selectedRowIndex, 0).toString();
        String name = model.getValueAt(selectedRowIndex, 1).toString();
        String password = model.getValueAt(selectedRowIndex, 2).toString();
        String contact = model.getValueAt(selectedRowIndex, 3).toString();
        String percent = model.getValueAt(selectedRowIndex, 4).toString();

 // get the entered data         
        String newemail = JOptionPane.showInputDialog(null,"Enter The New Email ID",email);
        String newname = JOptionPane.showInputDialog(null,"Enter The New Name",name);
        String newpassword = JOptionPane.showInputDialog(null,"Enter The New password",password);
        String newcontact = JOptionPane.showInputDialog(null,"Enter The New contact no",contact);
        String newpercent = JOptionPane.showInputDialog(null,"Enter The New percent",percent);
        int per = parseInt(newpercent);
        
        Connection conn = null;
        PreparedStatement stmt = null;
        try
        {             
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER, PASS);
            stmt = conn.prepareStatement("UPDATE company SET name = ?, email_id = ? , password = ?, contact_no = ? , percentage = ? WHERE email_id = ?");
            stmt.setString(1,name);
            stmt.setString(2,newemail);
            stmt.setString(3,newpassword);
            stmt.setString(4,newcontact);
            stmt.setInt(5,per);
            stmt.setString(6,email);
            stmt.executeUpdate();

        }
        
        catch (SQLIntegrityConstraintViolationException se)
        {
        	se.printStackTrace();
        }
        
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        finally
        {
            try
            {
                if(stmt!=null)
                {
                	conn.close();
                }
            }
            catch(SQLException se)
            {
            	se.printStackTrace();
            }
            finally {
            	try
                {
                    if(conn!=null)
                    {
                    	conn.close();
                    }
                    
                }
                catch(SQLException se)
                {
                   se.printStackTrace();
                }
            }
        }
        
// set the new data into jtable row
        model.setValueAt(newemail, selectedRowIndex, 0);
        model.setValueAt(newname, selectedRowIndex, 1);
        model.setValueAt(newpassword, selectedRowIndex, 2);
        model.setValueAt(newcontact, selectedRowIndex,3);
        model.setValueAt(newpercent, selectedRowIndex,4);
    }//GEN-LAST:event_update2ActionPerformed

    private void update3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable3.getModel();
        
// get selected row index
        int selectedRowIndex = jTable3.getSelectedRow();
        
// get selected row data 
        String cemail = model.getValueAt(selectedRowIndex, 0).toString();
        String jemail = model.getValueAt(selectedRowIndex, 1).toString();
        

 // get the entered data         
        String newcemail = JOptionPane.showInputDialog(null,"Enter The New Company Email ID",cemail);
        String newjemail = JOptionPane.showInputDialog(null,"Enter The New Job seeker Email ID",jemail);
                
        Connection conn = null;
        PreparedStatement stmt = null;
        try
        {             
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER, PASS);
            stmt = conn.prepareStatement("UPDATE resume SET company_email_id = ?, jobseeker_email_id = ? WHERE company_email_id = ? and jobseeker_email_id = ?");
            stmt.setString(1,newcemail);
            stmt.setString(2,newjemail);
            stmt.setString(3,cemail);
            stmt.setString(4,jemail);
            stmt.executeUpdate();

        }
        
        catch (SQLIntegrityConstraintViolationException se)
        {
        	se.printStackTrace();
        }
        
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        finally
        {
            try
            {
                if(stmt!=null)
                {
                	conn.close();
                }
            }
            catch(SQLException se)
            {
            	se.printStackTrace();
            }
            finally {
            	try
                {
                    if(conn!=null)
                    {
                    	conn.close();
                    }
                    
                }
                catch(SQLException se)
                {
                   se.printStackTrace();
                }
            }
        }
        
// set the new data into jtable row
        model.setValueAt(newcemail, selectedRowIndex, 0);
        model.setValueAt(newjemail, selectedRowIndex, 1);
        
    }//GEN-LAST:event_update3ActionPerformed

    private void removejobseekerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removejobseekerbuttonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
// get selected row index
        int selectedRowIndex = jTable1.getSelectedRow();
        
// get selected row data 
        String email = model.getValueAt(selectedRowIndex, 0).toString();
        
        Connection conn = null;
        PreparedStatement stmt = null;
        try
        {             
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER, PASS);
            stmt = conn.prepareStatement("delete resume  "
                    + "from jobseeker "
                    + "inner join resume "
                    + "where jobseeker.email_id=resume.jobseeker_email_id and jobseeker.email_id=?");
            stmt.setString(1,email);
            stmt.executeUpdate();
        }
        
        catch (SQLIntegrityConstraintViolationException se)
        {
        	se.printStackTrace();
        }
        
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        finally
        {
            try
            {
                if(stmt!=null)
                {
                	conn.close();
                }
            }
            catch(SQLException se)
            {
            	se.printStackTrace();
            }
            finally {
            	try
                {
                    if(conn!=null)
                    {
                    	conn.close();
                    }
                    
                }
                catch(SQLException se)
                {
                   se.printStackTrace();
                }
            }
        }        
        try
        {             
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER, PASS);
            stmt = conn.prepareStatement("delete from jobseeker where jobseeker.email_id=?");
            stmt.setString(1,email);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"Job Seeker removed");

        }
        
        catch (SQLIntegrityConstraintViolationException se)
        {
        	se.printStackTrace();
        }
        
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        finally
        {
            try
            {
                if(stmt!=null)
                {
                	conn.close();
                }
            }
            catch(SQLException se)
            {
            	se.printStackTrace();
            }
            finally {
            	try
                {
                    if(conn!=null)
                    {
                    	conn.close();
                    }
                    
                }
                catch(SQLException se)
                {
                   se.printStackTrace();
                }
            }
        }        
    }//GEN-LAST:event_removejobseekerbuttonActionPerformed

    private void removecompanybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removecompanybuttonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        
// get selected row index
        int selectedRowIndex = jTable2.getSelectedRow();
        
// get selected row data 
        String email = model.getValueAt(selectedRowIndex, 0).toString();
        
        Connection conn = null;
        PreparedStatement stmt = null;
        try
        {             
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER, PASS);
            stmt = conn.prepareStatement("delete resume  "
                    + "from company "
                    + "inner join resume "
                    + "where company.email_id=resume.company_email_id and company.email_id=?");
            stmt.setString(1,email);
            stmt.executeUpdate();
        }
        
        catch (SQLIntegrityConstraintViolationException se)
        {
        	se.printStackTrace();
        }
        
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        finally
        {
            try
            {
                if(stmt!=null)
                {
                	conn.close();
                }
            }
            catch(SQLException se)
            {
            	se.printStackTrace();
            }
            finally {
            	try
                {
                    if(conn!=null)
                    {
                    	conn.close();
                    }
                    
                }
                catch(SQLException se)
                {
                   se.printStackTrace();
                }
            }
        }        
        try
        {             
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER, PASS);
            stmt = conn.prepareStatement("delete from company where company.email_id=?");
            stmt.setString(1,email);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"company removed");

        }
        
        catch (SQLIntegrityConstraintViolationException se)
        {
        	se.printStackTrace();
        }
        
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        finally
        {
            try
            {
                if(stmt!=null)
                {
                	conn.close();
                }
            }
            catch(SQLException se)
            {
            	se.printStackTrace();
            }
            finally {
            	try
                {
                    if(conn!=null)
                    {
                    	conn.close();
                    }
                    
                }
                catch(SQLException se)
                {
                   se.printStackTrace();
                }
            }
        }        
    }//GEN-LAST:event_removecompanybuttonActionPerformed

    private void removeresumebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeresumebuttonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable3.getModel();
        
// get selected row index
        int selectedRowIndex = jTable3.getSelectedRow();
        
// get selected row data 
        String cemail = model.getValueAt(selectedRowIndex, 0).toString();
        String jemail = model.getValueAt(selectedRowIndex, 1).toString();
        
        Connection conn = null;
        PreparedStatement stmt = null;
        try
        {             
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER, PASS);
            stmt = conn.prepareStatement("delete  from resume where resume.company_email_id = ? and resume.jobseeker_email_id=?");
            stmt.setString(1,cemail);
            stmt.setString(2,jemail);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"resume connection between selected jobseeker and company removed");

        }
        
        catch (SQLIntegrityConstraintViolationException se)
        {
        	se.printStackTrace();
        }
        
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        finally
        {
            try
            {
                if(stmt!=null)
                {
                	conn.close();
                }
            }
            catch(SQLException se)
            {
            	se.printStackTrace();
            }
            finally {
            	try
                {
                    if(conn!=null)
                    {
                    	conn.close();
                    }
                    
                }
                catch(SQLException se)
                {
                   se.printStackTrace();
                }
            }
        }        
    }//GEN-LAST:event_removeresumebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton removecompanybutton;
    private javax.swing.JButton removejobseekerbutton;
    private javax.swing.JButton removeresumebutton;
    private javax.swing.JButton show1;
    private javax.swing.JButton show2;
    private javax.swing.JButton show3;
    private javax.swing.JButton update1;
    private javax.swing.JButton update2;
    private javax.swing.JButton update3;
    // End of variables declaration//GEN-END:variables
}
