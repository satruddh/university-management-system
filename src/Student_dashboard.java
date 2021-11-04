/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Student_dashboard extends javax.swing.JFrame {

    public String userid="";

    public Student_dashboard() {
        initComponents();
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage("img\\mmmutlogo-64.png"));
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Faculty_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faculty_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faculty_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faculty_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    Student_dashboard(String text) {
        userid=text;
        initComponents();
        this.setVisible(true);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Faculty_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faculty_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faculty_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faculty_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage("img\\mmmutlogo-64.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nav_pane = new javax.swing.JPanel();
        form_option = new javax.swing.JPanel();
        form_option_logo = new javax.swing.JLabel();
        form_option_label = new javax.swing.JLabel();
        exam_panel_opt = new javax.swing.JPanel();
        exam_option_logo = new javax.swing.JLabel();
        exam_option_label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        title_pane = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        log_out = new javax.swing.JLabel();
        centre = new javax.swing.JPanel();
        welcome = new javax.swing.JPanel();
        welcome_text = new javax.swing.JLabel();
        welcome_logo = new javax.swing.JLabel();
        change_pass = new javax.swing.JLabel();
        fill_form = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        course_data = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        branch_data = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        dob_holder = new javax.swing.JLabel();
        name_holder = new javax.swing.JLabel();
        sem_holder = new javax.swing.JLabel();
        form_submitted_message = new javax.swing.JLabel();
        exam_sec = new javax.swing.JPanel();
        exam_sec_title = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        view_res_option = new javax.swing.JPanel();
        view_res_logo = new javax.swing.JLabel();
        view_res_label = new javax.swing.JLabel();
        res_status = new javax.swing.JLabel();
        view_res = new javax.swing.JPanel();
        view_res_title = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        res_course_field = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        res_branch_field = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        sem_data = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        total_mark_data = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        pass_label = new javax.swing.JLabel();
        fail_label = new javax.swing.JLabel();
        res_name_data = new javax.swing.JLabel();
        dob_field = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        change_password_panel = new javax.swing.JPanel();
        changePassTitle = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        backButton = new javax.swing.JButton();
        oldPassLabel = new javax.swing.JLabel();
        newPassLabel = new javax.swing.JLabel();
        confirmPassLabel = new javax.swing.JLabel();
        newPassField = new javax.swing.JPasswordField();
        oldPassField = new javax.swing.JPasswordField();
        confirmPassField = new javax.swing.JPasswordField();
        updatePass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav_pane.setBackground(new java.awt.Color(51, 204, 255));

        form_option.setBackground(new java.awt.Color(51, 204, 255));
        form_option.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        form_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                form_optionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                form_optionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                form_optionMouseExited(evt);
            }
        });

        form_option_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/form-128.png"))); // NOI18N

        form_option_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        form_option_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        form_option_label.setText("Fill Form");

        javax.swing.GroupLayout form_optionLayout = new javax.swing.GroupLayout(form_option);
        form_option.setLayout(form_optionLayout);
        form_optionLayout.setHorizontalGroup(
            form_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_optionLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(form_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(form_option_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(form_option_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        form_optionLayout.setVerticalGroup(
            form_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_optionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(form_option_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(form_option_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        exam_panel_opt.setBackground(new java.awt.Color(51, 204, 255));
        exam_panel_opt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exam_panel_opt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exam_panel_optMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exam_panel_optMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exam_panel_optMouseExited(evt);
            }
        });

        exam_option_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exam-128.png"))); // NOI18N

        exam_option_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exam_option_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exam_option_label.setText("Exam Section");

        javax.swing.GroupLayout exam_panel_optLayout = new javax.swing.GroupLayout(exam_panel_opt);
        exam_panel_opt.setLayout(exam_panel_optLayout);
        exam_panel_optLayout.setHorizontalGroup(
            exam_panel_optLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exam_panel_optLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(exam_panel_optLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exam_option_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exam_option_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        exam_panel_optLayout.setVerticalGroup(
            exam_panel_optLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exam_panel_optLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exam_option_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exam_option_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user-solid-60.png"))); // NOI18N
        jLabel8.setText("Student");

        javax.swing.GroupLayout nav_paneLayout = new javax.swing.GroupLayout(nav_pane);
        nav_pane.setLayout(nav_paneLayout);
        nav_paneLayout.setHorizontalGroup(
            nav_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(form_option, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(exam_panel_opt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nav_paneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        nav_paneLayout.setVerticalGroup(
            nav_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nav_paneLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addGap(81, 81, 81)
                .addComponent(form_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(exam_panel_opt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        getContentPane().add(nav_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 720));

        title_pane.setBackground(new java.awt.Color(51, 250, 153));

        user.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user-circle-regular-24.png"))); // NOI18N
        user.setText(userid);
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });

        log_out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit-regular-24.png"))); // NOI18N
        log_out.setToolTipText("Log Out");
        log_out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                log_outMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout title_paneLayout = new javax.swing.GroupLayout(title_pane);
        title_pane.setLayout(title_paneLayout);
        title_paneLayout.setHorizontalGroup(
            title_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_paneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 821, Short.MAX_VALUE)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        title_paneLayout.setVerticalGroup(
            title_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_paneLayout.createSequentialGroup()
                .addGroup(title_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user)
                    .addComponent(log_out))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(title_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1020, 35));

        centre.setLayout(new java.awt.CardLayout());

        welcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome_text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        welcome_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome_text.setText("Welcome");
        welcome.add(welcome_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 130, 30));

        welcome_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/student-128.png"))); // NOI18N
        welcome.add(welcome_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 130, 120));

        change_pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        change_pass.setText("Change Password");
        change_pass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        change_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                change_passMouseClicked(evt);
            }
        });
        welcome.add(change_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 620, 130, 27));

        centre.add(welcome, "card2");

        fill_form.setPreferredSize(new java.awt.Dimension(1020, 660));
        fill_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Fill Form");
        fill_form.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, 27));
        fill_form.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 960, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name : ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DOB :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Course :");

        course_data.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Branch :");

        branch_data.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Semester :");

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Category", "Subject"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(51, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Enter password : ");

        dob_holder.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        name_holder.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        sem_holder.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 11, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dob_holder, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(branch_data, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sem_holder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(course_data, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(name_holder, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_holder, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob_holder, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(course_data, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(branch_data, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sem_holder, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jScrollPane2.setViewportView(jPanel4);

        fill_form.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, 480));

        form_submitted_message.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        form_submitted_message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        form_submitted_message.setText("You have already submitted the form");
        fill_form.add(form_submitted_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 205, 27));

        centre.add(fill_form, "card3");

        exam_sec.setPreferredSize(new java.awt.Dimension(1020, 660));
        exam_sec.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exam_sec_title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exam_sec_title.setText("Exam Section");
        exam_sec.add(exam_sec_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, 27));
        exam_sec.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 55, 990, 5));

        view_res_option.setBackground(new java.awt.Color(51, 250, 153));
        view_res_option.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view_res_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_res_optionMouseClicked(evt);
            }
        });

        view_res_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        view_res_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/research-128.png"))); // NOI18N

        view_res_label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        view_res_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        view_res_label.setText("View Result");
        view_res_label.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout view_res_optionLayout = new javax.swing.GroupLayout(view_res_option);
        view_res_option.setLayout(view_res_optionLayout);
        view_res_optionLayout.setHorizontalGroup(
            view_res_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_res_optionLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(view_res_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(view_res_optionLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(view_res_label, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        view_res_optionLayout.setVerticalGroup(
            view_res_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_res_optionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(view_res_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(view_res_label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exam_sec.add(view_res_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 180, 190));

        res_status.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        res_status.setText("Result has not been declared yet.");
        exam_sec.add(res_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 330, -1));

        centre.add(exam_sec, "card3");

        view_res.setPreferredSize(new java.awt.Dimension(1020, 660));
        view_res.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        view_res_title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        view_res_title.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        view_res_title.setText("View Result");
        view_res.add(view_res_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, -1, 27));
        view_res.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 990, -1));

        jPanel8.setPreferredSize(new java.awt.Dimension(769, 660));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Name :  ");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 82, 50, 27));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("DOB :");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 119, 50, 27));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Course :");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 156, 50, 27));
        jPanel8.add(res_course_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 156, 110, 27));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Branch :");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 156, 55, 27));
        jPanel8.add(res_branch_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 156, 180, 27));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel29.setText("Semester :");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 201, 60, 27));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Subject", "Obt. Marks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable2);

        jPanel8.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 335, -1, 137));
        jPanel8.add(sem_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 201, 32, 27));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel32.setText("Total : ");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 482, 53, 26));

        total_mark_data.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel8.add(total_mark_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 482, 50, 27));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel33.setText("Result : ");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 53, 26));

        pass_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pass_label.setForeground(new java.awt.Color(0, 216, 0));
        pass_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass_label.setText("Pass");
        jPanel8.add(pass_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 572, 53, 27));

        fail_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fail_label.setForeground(new java.awt.Color(255, 0, 0));
        fail_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fail_label.setText("Fail");
        jPanel8.add(fail_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 572, 53, 27));

        res_name_data.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel8.add(res_name_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 82, 210, 27));

        dob_field.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel8.add(dob_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 119, 70, 27));

        jScrollPane3.setViewportView(jPanel8);

        view_res.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, 540));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        view_res.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 27));

        centre.add(view_res, "card3");

        changePassTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        changePassTitle.setText("Change Password");

        backButton.setBackground(new java.awt.Color(0, 153, 153));
        backButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        oldPassLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        oldPassLabel.setText("Old Password");

        newPassLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        newPassLabel.setText("New Password");

        confirmPassLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        confirmPassLabel.setText("Confirm Password");

        newPassField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        oldPassField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        confirmPassField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        confirmPassField.setText("jPasswordField1");

        updatePass.setBackground(new java.awt.Color(51, 255, 0));
        updatePass.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        updatePass.setText("Update");
        updatePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout change_password_panelLayout = new javax.swing.GroupLayout(change_password_panel);
        change_password_panel.setLayout(change_password_panelLayout);
        change_password_panelLayout.setHorizontalGroup(
            change_password_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(change_password_panelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, change_password_panelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changePassTitle)
                .addGap(18, 18, 18))
            .addGroup(change_password_panelLayout.createSequentialGroup()
                .addGroup(change_password_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(change_password_panelLayout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addGroup(change_password_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oldPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(change_password_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(change_password_panelLayout.createSequentialGroup()
                                    .addComponent(confirmPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(confirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(change_password_panelLayout.createSequentialGroup()
                                    .addComponent(newPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(newPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(change_password_panelLayout.createSequentialGroup()
                                    .addGap(151, 151, 151)
                                    .addComponent(oldPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(change_password_panelLayout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(updatePass, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        change_password_panelLayout.setVerticalGroup(
            change_password_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(change_password_panelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(change_password_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changePassTitle)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(change_password_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(change_password_panelLayout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(oldPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(oldPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(change_password_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(change_password_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(updatePass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        centre.add(change_password_panel, "card6");

        getContentPane().add(centre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 35, 1020, 665));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private javax.swing.table.DefaultTableModel model;
    
    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        handleCentre(0);
        onLeave(form_option);
        onLeave(exam_panel_opt);
    }//GEN-LAST:event_userMouseClicked

    private void form_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_form_optionMouseClicked
        handleCentre(2);
        onClick(form_option);
        onLeave(exam_panel_opt);
        int formfilled=0;
        String fn,mn,ln,dob,crs,brch,sm;
        connectionManager cm = new connectionManager();
        try
        {
            cm.connect();
            String query="select fname,mname,lname,dob,sem,course,branch,form_filled from students where roll = ?";
            cm.pstmt=cm.conn.prepareStatement(query);
            cm.pstmt.setInt(1, Integer.parseInt(user.getText()));
            cm.rs=cm.pstmt.executeQuery();
            if(cm.rs.next()){
                fn=cm.rs.getString(1);
                mn=cm.rs.getString(2);
                ln=cm.rs.getString(3);
                dob=cm.rs.getString(4);
                sm=String.valueOf(cm.rs.getInt(5));
                crs=cm.rs.getString(6);
                brch=cm.rs.getString(7);
                formfilled=cm.rs.getInt(8);
            }
            else
            {
                javax.swing.JOptionPane.showMessageDialog(null,"No record","error",javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(formfilled==0){
                form_submitted_message.setVisible(false);
                name_holder.setText(fn+" "+mn+" "+ln);
                dob_holder.setText(dob);
                course_data.setText(crs);
                branch_data.setText(brch);
                sem_holder.setText(sm);
                model=(javax.swing.table.DefaultTableModel)jTable1.getModel();
                for(int i=jTable2.getRowCount()-1;i>=0;i--)
                    model.removeRow(i);
                model.addRow(new Object[]{"Major 1",""});
                model.addRow(new Object[]{"Major 2",""});
                model.addRow(new Object[]{"Major 3",""});
                model.addRow(new Object[]{"Minor 1",""});
                model.addRow(new Object[]{"Minor 2",""});
                jScrollPane2.setVisible(true);
            }
            else
            {
                jScrollPane2.setVisible(false);
                form_submitted_message.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        jScrollPane1.setVisible(true);
    }//GEN-LAST:event_form_optionMouseClicked

    private void exam_panel_optMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exam_panel_optMouseClicked
        if(ResultStatus.getResStatus()){
            view_res_option.setVisible(true);
            res_status.setVisible(false);
        }
        else{
            view_res_option.setVisible(false);
            res_status.setVisible(true);
        }
        handleCentre(1);
        onClick(exam_panel_opt);
        onLeave(form_option);
    }//GEN-LAST:event_exam_panel_optMouseClicked

    private void view_res_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_res_optionMouseClicked
        int m1,m2,m3,m4,m5,tot;
        float prc;
        try {
            handleCentre(3);
            pass_label.setVisible(false);
            fail_label.setVisible(false);
            String q1="Select fname,mname,lname,dob,course,branch,sem from students where roll=?";
            String q2="select major1,major2,major3,minor1,minor2 from student_subjects where roll=?";
            String q3="select major1,major2,major3,minor1,minor2 from student_marks where roll=?";
            connectionManager cm = new connectionManager();
            cm.connect();
            ResultSet rs1,rs2;
            PreparedStatement ps1,ps2;
            connectionManager.pstmt=cm.conn.prepareStatement(q1);
            cm.pstmt.setInt(1,Integer.parseInt(user.getText()));
            cm.rs=cm.pstmt.executeQuery();
            ps1=cm.conn.prepareStatement(q2);
            ps2=cm.conn.prepareStatement(q3);
            
            if(cm.rs.next())
            {
                res_name_data.setText(cm.rs.getString(1)+" "+cm.rs.getString(2)+" "+cm.rs.getString(3));
                dob_field.setText(cm.rs.getString(4));
                res_course_field.setText(cm.rs.getString(5));
                res_branch_field.setText(cm.rs.getString(6));
                sem_data.setText(cm.rs.getString(7));   
                ps1.setString(1, user.getText());
                ps2.setString(1,user.getText());
                rs1=ps1.executeQuery();
                rs2=ps2.executeQuery();
                if(rs1.next()){
                    model=(javax.swing.table.DefaultTableModel)jTable2.getModel();
                    model.setValueAt((Object)rs1.getString(1), 0, 0);
                    model.setValueAt((Object)rs1.getString(2), 1, 0);
                    model.setValueAt((Object)rs1.getString(3), 2, 0);
                    model.setValueAt((Object)rs1.getString(4), 3, 0);
                    model.setValueAt((Object)rs1.getString(5), 4, 0);
                }
                if(rs2.next()){
                    model.setValueAt((Object)rs2.getString(1), 0, 1);
                    model.setValueAt((Object)rs2.getString(2), 1, 1);
                    model.setValueAt((Object)rs2.getString(3), 2, 1);
                    model.setValueAt((Object)rs2.getString(4), 3, 1);
                    model.setValueAt((Object)rs2.getString(5), 4, 1);
                    m1=Integer.parseInt(rs2.getString(1));
                    m2=Integer.parseInt(rs2.getString(2));
                    m3=Integer.parseInt(rs2.getString(3));
                    m4=Integer.parseInt(rs2.getString(4));
                    m5=Integer.parseInt(rs2.getString(5));
                    tot=m1+m2+m3+m4+m5;
                    prc=((float)tot/250)*100;
                    total_mark_data.setText(""+tot);
                    if((int)prc>=40)
                        pass_label.setVisible(true);
                    else
                        fail_label.setVisible(true);
                }
                jScrollPane3.setVisible(true);
            } 
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage()+"\n"+ex.getCause());
        }  
    }//GEN-LAST:event_view_res_optionMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        handleCentre(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String sub1,sub2,sub3,sub4,sub5,pass;
        sub1=jTable1.getValueAt(0, 1).toString();
        sub2=jTable1.getValueAt(1, 1).toString();
        sub3=jTable1.getValueAt(2, 1).toString();
        sub4=jTable1.getValueAt(3, 1).toString();
        sub5=jTable1.getValueAt(4, 1).toString();
        
        pass=new String(password.getPassword());
        connectionManager cm = new connectionManager();
        try{
            cm.connect();
            String query = "select password from students where roll =?";
            cm.pstmt=cm.conn.prepareStatement(query);
            cm.pstmt.setInt(1, Integer.parseInt(user.getText()));
            cm.rs=cm.pstmt.executeQuery();
        if(cm.rs.next())
        {
            if(pass.equals(cm.rs.getString(1)))
            {
                query="insert into student_subjects  (major1,major2,major3,minor1,minor2,roll) values (?,?,?,?,?,?)";
                cm.pstmt=cm.conn.prepareStatement(query);
                cm.pstmt.setString(1,sub1);
                cm.pstmt.setString(2,sub2);
                cm.pstmt.setString(3,sub3);
                cm.pstmt.setString(4,sub4);
                cm.pstmt.setString(5,sub5);
                cm.pstmt.setString(6,user.getText());
                cm.pstmt.executeUpdate();
                query="update students set form_filled=1 where roll = ?";
                cm.pstmt=cm.conn.prepareStatement(query);
                cm.pstmt.setInt(1, Integer.parseInt(user.getText()));
                cm.pstmt.executeUpdate();
                javax.swing.JOptionPane.showMessageDialog(null,"Success","Success",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                handleCentre(0);
                onLeave(form_option);
            }
            else
                javax.swing.JOptionPane.showMessageDialog(null,"Password mismatch","error",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        } 
        catch (SQLException ex) {
            System.out.println(ex.getMessage()+"line894");
        }
    finally
    {
        try {
            cm.rs.close();
            cm.pstmt.close();
            cm.conn.close();
        } 
        catch (SQLException ex) {
            System.out.println(ex.getMessage()+"\n"+"line 902");
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        change_password_panel.setVisible(false);
        newPassField.setText("");
        oldPassField.setText("");
        confirmPassField.setText("");
        welcome.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void updatePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePassActionPerformed
        if(newPassField.getText().trim().equals("")||oldPassField.getText().trim().equals("")||confirmPassField.getText().trim().equals(""))
        {
            javax.swing.JOptionPane.showMessageDialog(null,"one or more fields are empty","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String oldpass,newpass,cnfrmpass;
            oldpass=new String(newPassField.getPassword());
            newpass=new String(oldPassField.getPassword());
            cnfrmpass=new String(confirmPassField.getPassword());
            if(newpass.equals(cnfrmpass))
            {
                try
                {
                    connectionManager.connect();
                    String query="select password from students where roll=?";
                    connectionManager.pstmt=connectionManager.conn.prepareStatement(query);
                    connectionManager.pstmt.setInt(1,Integer.parseInt(user.getText()));
                    connectionManager.rs=connectionManager.pstmt.executeQuery();
                    if(connectionManager.rs.next())
                    {
                        if(oldpass.equals(connectionManager.rs.getString(1))&&newpass.equals(cnfrmpass))
                        {
                            query="update students set password=? where roll =?";
                            connectionManager.pstmt=connectionManager.conn.prepareStatement(query);
                            connectionManager.pstmt.setString(1,newpass);
                            connectionManager.pstmt.setString(2,user.getText());
                            int n=connectionManager.pstmt.executeUpdate();
                            if(n!=0)
                                javax.swing.JOptionPane.showMessageDialog(null,"Password Changed!","Success",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                            query="update users set pass=? where name=?"; 
                            connectionManager.pstmt=connectionManager.conn.prepareStatement(query);
                            connectionManager.pstmt.setString(1,newpass);
                            connectionManager.pstmt.setString(2,user.getText());
                            connectionManager.pstmt.executeUpdate();
                            newPassField.setText("");
                            oldPassField.setText("");
                            confirmPassField.setText("");
                            welcome.setVisible(true);
                            change_password_panel.setVisible(false);
                        }
                        else
                            javax.swing.JOptionPane.showMessageDialog(null,"Either old password incorrect or New password doesn't match the confirm password","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(java.sql.SQLException e)
                {
                    javax.swing.JOptionPane.showMessageDialog(null,e.getMessage(),"Error",javax.swing.JOptionPane.ERROR_MESSAGE);
                }
                finally
                {
                    try {
                        connectionManager.rs.close();
                        connectionManager.pstmt.close();
                        connectionManager.conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Student_dashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else
            {
                javax.swing.JOptionPane.showMessageDialog(null,"Confirm Password do not match the New Password","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_updatePassActionPerformed

    private void change_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_passMouseClicked
        welcome.setVisible(false);
        change_password_panel.setVisible(true);
    }//GEN-LAST:event_change_passMouseClicked

    private void log_outMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_outMouseClicked
        this.dispose();
        login lg=new login();
        lg.setVisible(true);
        try
        {
            connectionManager.pstmt.close();
            connectionManager.rs.close();
            connectionManager.conn.close();
        }
        catch(java.sql.SQLException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NullPointerException ne)
        {
            System.out.println(ne.getMessage());
        }
    }//GEN-LAST:event_log_outMouseClicked

    private void form_optionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_form_optionMouseEntered
        form_option.setBackground(new java.awt.Color(102,102,255));
    }//GEN-LAST:event_form_optionMouseEntered

    private void form_optionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_form_optionMouseExited
        if(fill_form.isVisible())
            form_option.setBackground(new java.awt.Color(240,240,240));
        else
            form_option.setBackground(new java.awt.Color(51,204,255));
    }//GEN-LAST:event_form_optionMouseExited

    private void exam_panel_optMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exam_panel_optMouseEntered
        exam_panel_opt.setBackground(new java.awt.Color(102,102,255));
    }//GEN-LAST:event_exam_panel_optMouseEntered

    private void exam_panel_optMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exam_panel_optMouseExited
        if(exam_sec.isVisible()||view_res.isVisible())
            exam_panel_opt.setBackground(new java.awt.Color(240,240,240));
        else
            exam_panel_opt.setBackground(new java.awt.Color(51,204,255));
    }//GEN-LAST:event_exam_panel_optMouseExited

    private void handleCentre(int arg)
    {
        switch(arg)
        {
            case 0 : welcome.setVisible(true);
                     exam_sec.setVisible(false);
                     fill_form.setVisible(false);
                     view_res.setVisible(false);
                     break;
            case 1: welcome.setVisible(false);
                     exam_sec.setVisible(true);
                     fill_form.setVisible(false);
                     view_res.setVisible(false);
                     break;
            case 2 :welcome.setVisible(false);
                     exam_sec.setVisible(false);
                     fill_form.setVisible(true);
                     view_res.setVisible(false);
                     break;
            case 3: welcome.setVisible(false);
                     exam_sec.setVisible(false);
                     fill_form.setVisible(false);
                     view_res.setVisible(true);
                     break;
            default: welcome.setVisible(true);
                     exam_sec.setVisible(false);
                     fill_form.setVisible(false);
                     view_res.setVisible(false);
        }
    }
    private void onClick(javax.swing.JPanel p1)
    {
        p1.setBackground(new java.awt.Color(240,240,240));
    }
    private void onLeave(javax.swing.JPanel p1)
    {
        p1.setBackground(new java.awt.Color(51,204,255));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel branch_data;
    private javax.swing.JPanel centre;
    private javax.swing.JLabel changePassTitle;
    private javax.swing.JLabel change_pass;
    private javax.swing.JPanel change_password_panel;
    private javax.swing.JPasswordField confirmPassField;
    private javax.swing.JLabel confirmPassLabel;
    private javax.swing.JLabel course_data;
    private javax.swing.JLabel dob_field;
    private javax.swing.JLabel dob_holder;
    private javax.swing.JLabel exam_option_label;
    private javax.swing.JLabel exam_option_logo;
    private javax.swing.JPanel exam_panel_opt;
    private javax.swing.JPanel exam_sec;
    private javax.swing.JLabel exam_sec_title;
    private javax.swing.JLabel fail_label;
    private javax.swing.JPanel fill_form;
    private javax.swing.JPanel form_option;
    private javax.swing.JLabel form_option_label;
    private javax.swing.JLabel form_option_logo;
    private javax.swing.JLabel form_submitted_message;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel log_out;
    private javax.swing.JLabel name_holder;
    private javax.swing.JPanel nav_pane;
    private javax.swing.JPasswordField newPassField;
    private javax.swing.JLabel newPassLabel;
    private javax.swing.JPasswordField oldPassField;
    private javax.swing.JLabel oldPassLabel;
    private javax.swing.JLabel pass_label;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel res_branch_field;
    private javax.swing.JLabel res_course_field;
    private javax.swing.JLabel res_name_data;
    private javax.swing.JLabel res_status;
    private javax.swing.JLabel sem_data;
    private javax.swing.JLabel sem_holder;
    private javax.swing.JPanel title_pane;
    private javax.swing.JLabel total_mark_data;
    private javax.swing.JButton updatePass;
    private javax.swing.JLabel user;
    private javax.swing.JPanel view_res;
    private javax.swing.JLabel view_res_label;
    private javax.swing.JLabel view_res_logo;
    private javax.swing.JPanel view_res_option;
    private javax.swing.JLabel view_res_title;
    private javax.swing.JPanel welcome;
    private javax.swing.JLabel welcome_logo;
    private javax.swing.JLabel welcome_text;
    // End of variables declaration//GEN-END:variables
}
