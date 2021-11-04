import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    private boolean validInput = false;
    private char genData='0';
    private Form_Data f=null;
    private Faculty fc=null;

    public Dashboard() {
        initComponents();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faculty_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage("img\\mmmutlogo-64.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_stud_bg = new javax.swing.ButtonGroup();
        upd_stud_bg = new javax.swing.ButtonGroup();
        add_fac_bg = new javax.swing.ButtonGroup();
        rootPane = new javax.swing.JPanel();
        nav_panel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        student_option = new javax.swing.JPanel();
        student_logo = new javax.swing.JLabel();
        student_label = new javax.swing.JLabel();
        faculty_option = new javax.swing.JPanel();
        faculty_logo = new javax.swing.JLabel();
        faculty_label = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        user_option = new javax.swing.JLabel();
        log_out = new javax.swing.JLabel();
        center = new javax.swing.JPanel();
        Welcome = new javax.swing.JPanel();
        admin_welcome_logo = new javax.swing.JLabel();
        admin_welcome_text = new javax.swing.JLabel();
        decResOption = new javax.swing.JLabel();
        chgpwd = new javax.swing.JLabel();
        student_home = new javax.swing.JPanel();
        stud_home_title = new javax.swing.JLabel();
        lineSeparator1 = new javax.swing.JSeparator();
        add_student_option = new javax.swing.JPanel();
        add_student_logo = new javax.swing.JLabel();
        add_student_text = new javax.swing.JLabel();
        search_student_option = new javax.swing.JPanel();
        search_student_logo = new javax.swing.JLabel();
        search_student_text = new javax.swing.JLabel();
        update_student_option = new javax.swing.JPanel();
        update_student_logo = new javax.swing.JLabel();
        update_student_text = new javax.swing.JLabel();
        delete_student_option = new javax.swing.JPanel();
        delete_student_logo = new javax.swing.JLabel();
        delete_student_text = new javax.swing.JLabel();
        faculty_home = new javax.swing.JPanel();
        faculty_home_title = new javax.swing.JLabel();
        lineSeaparator2 = new javax.swing.JSeparator();
        add_faculty_option = new javax.swing.JPanel();
        add_faculty_logo = new javax.swing.JLabel();
        add_faculty_text = new javax.swing.JLabel();
        search_faculty_option = new javax.swing.JPanel();
        search_faculty_logo = new javax.swing.JLabel();
        search_faculty_text = new javax.swing.JLabel();
        update_faculty_option = new javax.swing.JPanel();
        update_faculty_logo = new javax.swing.JLabel();
        update_faculty_text = new javax.swing.JLabel();
        delete_faculty_option = new javax.swing.JPanel();
        delete_faculty_logo = new javax.swing.JLabel();
        delete_faculty_text = new javax.swing.JLabel();
        assign_subjects = new javax.swing.JPanel();
        assign_subjects_logo = new javax.swing.JLabel();
        assign_subjects_label = new javax.swing.JLabel();
        add_student_form = new javax.swing.JPanel();
        stud_home_title1 = new javax.swing.JLabel();
        lineSeparator2 = new javax.swing.JSeparator();
        personal_Deatail = new javax.swing.JPanel();
        fName_label = new javax.swing.JLabel();
        fname_field = new javax.swing.JTextField();
        mName_field = new javax.swing.JTextField();
        mName_label = new javax.swing.JLabel();
        lName_label = new javax.swing.JLabel();
        lName_field = new javax.swing.JTextField();
        dob_label = new javax.swing.JLabel();
        mName_label1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        dob_field = new com.toedter.calendar.JDateChooser();
        communication_Deatail = new javax.swing.JPanel();
        email_label = new javax.swing.JLabel();
        email_field = new javax.swing.JTextField();
        mob_label = new javax.swing.JLabel();
        mob_field = new javax.swing.JTextField();
        address_label = new javax.swing.JLabel();
        address_field = new javax.swing.JTextField();
        pin_label = new javax.swing.JLabel();
        pin_field = new javax.swing.JTextField();
        academic_Detail = new javax.swing.JPanel();
        course_label = new javax.swing.JLabel();
        course_field = new javax.swing.JComboBox<>();
        branch_label = new javax.swing.JLabel();
        branch_field = new javax.swing.JComboBox<>();
        sem_label = new javax.swing.JLabel();
        sem_field = new javax.swing.JTextField();
        yoa_label = new javax.swing.JLabel();
        yoa_field = new javax.swing.JTextField();
        reset_stud_button = new javax.swing.JButton();
        close_student_form = new javax.swing.JButton();
        add_student_button = new javax.swing.JButton();
        search_student_form = new javax.swing.JPanel();
        search_stu_title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        search_stu_roll_field = new javax.swing.JTextField();
        search_stu_roll_label = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        search_stu_course_label = new javax.swing.JLabel();
        search_stu_course_option = new javax.swing.JComboBox<>();
        search_stu_branch_label = new javax.swing.JLabel();
        search_stu_branch_option = new javax.swing.JComboBox<>();
        search_stu_option = new javax.swing.JLabel();
        listButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        search_stu_yod_label = new javax.swing.JLabel();
        search_stu_yod_field = new javax.swing.JTextField();
        close_search_stu = new javax.swing.JButton();
        update_student_form = new javax.swing.JPanel();
        upd_stud_form_title = new javax.swing.JLabel();
        lineSeparator3 = new javax.swing.JSeparator();
        update_personal_detail_pane = new javax.swing.JPanel();
        fName_label1 = new javax.swing.JLabel();
        fname_field1 = new javax.swing.JTextField();
        mName_field1 = new javax.swing.JTextField();
        mName_label2 = new javax.swing.JLabel();
        lName_label1 = new javax.swing.JLabel();
        lName_field1 = new javax.swing.JTextField();
        dob_label1 = new javax.swing.JLabel();
        mName_label3 = new javax.swing.JLabel();
        upd_stud_male = new javax.swing.JRadioButton();
        upd_stud_female = new javax.swing.JRadioButton();
        upd_stud_other = new javax.swing.JRadioButton();
        dob_field1 = new com.toedter.calendar.JDateChooser();
        update_communication_detail_pane = new javax.swing.JPanel();
        email_label1 = new javax.swing.JLabel();
        email_field1 = new javax.swing.JTextField();
        mob_label1 = new javax.swing.JLabel();
        mob_field1 = new javax.swing.JTextField();
        address_label1 = new javax.swing.JLabel();
        address_field1 = new javax.swing.JTextField();
        pin_label1 = new javax.swing.JLabel();
        pin_field1 = new javax.swing.JTextField();
        update_academic_detail_pane = new javax.swing.JPanel();
        course_label1 = new javax.swing.JLabel();
        course_field1 = new javax.swing.JComboBox<>();
        branch_label1 = new javax.swing.JLabel();
        branch_field1 = new javax.swing.JComboBox<>();
        sem_label1 = new javax.swing.JLabel();
        sem_field1 = new javax.swing.JTextField();
        yoa_label1 = new javax.swing.JLabel();
        yoa_field1 = new javax.swing.JTextField();
        reset_stud_button1 = new javax.swing.JButton();
        close_student_form1 = new javax.swing.JButton();
        update_student_button = new javax.swing.JButton();
        roll_query_field = new javax.swing.JTextField();
        roll_query_label = new javax.swing.JLabel();
        search_label_button = new javax.swing.JLabel();
        reset_stud_button2 = new javax.swing.JButton();
        delete_student_form = new javax.swing.JPanel();
        delete_stu_title = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        delete_stu_roll_field = new javax.swing.JTextField();
        delete_stu_roll_label = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        delete_stu_course_label = new javax.swing.JLabel();
        delete_stu_course_option = new javax.swing.JComboBox<>();
        delete_stu_branch_label = new javax.swing.JLabel();
        delete_stu_branch_option = new javax.swing.JComboBox<>();
        delete_stu_option = new javax.swing.JLabel();
        listButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        delete_stu_yod_label = new javax.swing.JLabel();
        delete_stu_yod_field = new javax.swing.JTextField();
        close_delete_stu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        add_faculty_form = new javax.swing.JPanel();
        stud_home_title2 = new javax.swing.JLabel();
        lineSeparator4 = new javax.swing.JSeparator();
        personal_Deatail1 = new javax.swing.JPanel();
        fName_label2 = new javax.swing.JLabel();
        fname_field2 = new javax.swing.JTextField();
        dob_label2 = new javax.swing.JLabel();
        mName_label5 = new javax.swing.JLabel();
        add_fac_male = new javax.swing.JRadioButton();
        add_fac_fem = new javax.swing.JRadioButton();
        add_fac_oth = new javax.swing.JRadioButton();
        dob_field2 = new com.toedter.calendar.JDateChooser();
        communication_Deatail1 = new javax.swing.JPanel();
        email_label2 = new javax.swing.JLabel();
        email_field2 = new javax.swing.JTextField();
        mob_label2 = new javax.swing.JLabel();
        mob_field2 = new javax.swing.JTextField();
        address_label2 = new javax.swing.JLabel();
        address_field2 = new javax.swing.JTextField();
        pin_label2 = new javax.swing.JLabel();
        pin_field2 = new javax.swing.JTextField();
        academic_Detail1 = new javax.swing.JPanel();
        course_label2 = new javax.swing.JLabel();
        desg_field = new javax.swing.JComboBox<>();
        branch_label2 = new javax.swing.JLabel();
        dep_field = new javax.swing.JComboBox<>();
        reset_stud_button3 = new javax.swing.JButton();
        close_student_form2 = new javax.swing.JButton();
        add_fac = new javax.swing.JButton();
        update_faculty_form = new javax.swing.JPanel();
        upd_stud_form_title1 = new javax.swing.JLabel();
        lineSeparator5 = new javax.swing.JSeparator();
        update_personal_detail_pane1 = new javax.swing.JPanel();
        fName_label3 = new javax.swing.JLabel();
        fname_field3 = new javax.swing.JTextField();
        dob_label3 = new javax.swing.JLabel();
        mName_label6 = new javax.swing.JLabel();
        upd_fac_male = new javax.swing.JRadioButton();
        upd_fac_fem = new javax.swing.JRadioButton();
        upd_fac_oth = new javax.swing.JRadioButton();
        dob_field3 = new com.toedter.calendar.JDateChooser();
        update_communication_detail_pane1 = new javax.swing.JPanel();
        email_label3 = new javax.swing.JLabel();
        email_field3 = new javax.swing.JTextField();
        mob_label3 = new javax.swing.JLabel();
        mob_field3 = new javax.swing.JTextField();
        address_label3 = new javax.swing.JLabel();
        address_field3 = new javax.swing.JTextField();
        pin_label3 = new javax.swing.JLabel();
        pin_field3 = new javax.swing.JTextField();
        update_academic_detail_pane1 = new javax.swing.JPanel();
        course_label3 = new javax.swing.JLabel();
        upd_fac_desg_field = new javax.swing.JComboBox<>();
        branch_label3 = new javax.swing.JLabel();
        upd_fac_dep_field = new javax.swing.JComboBox<>();
        close_student_form3 = new javax.swing.JButton();
        update_student_button1 = new javax.swing.JButton();
        id_query_field = new javax.swing.JTextField();
        roll_query_label1 = new javax.swing.JLabel();
        search_label_button1 = new javax.swing.JLabel();
        reset_stud_button5 = new javax.swing.JButton();
        search_faculty_form = new javax.swing.JPanel();
        search_stu_title1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        search_stu_roll_field1 = new javax.swing.JTextField();
        search_stu_roll_label1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        search_stu_course_label1 = new javax.swing.JLabel();
        search_fac_desg_opt = new javax.swing.JComboBox<>();
        search_stu_branch_label1 = new javax.swing.JLabel();
        search_fac_dep_opt = new javax.swing.JComboBox<>();
        search_stu_option1 = new javax.swing.JLabel();
        listButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        search_stu_yod_label1 = new javax.swing.JLabel();
        search_stu_yod_field1 = new javax.swing.JTextField();
        close_search_stu1 = new javax.swing.JButton();
        delete_faculty_form = new javax.swing.JPanel();
        delete_stu_title1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        delete_fac_id_field = new javax.swing.JTextField();
        delete_stu_roll_label1 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        delete_stu_course_label1 = new javax.swing.JLabel();
        delete_fac_desg_opt = new javax.swing.JComboBox<>();
        delete_stu_branch_label1 = new javax.swing.JLabel();
        delete_fac_dep_opt = new javax.swing.JComboBox<>();
        delete_stu_option1 = new javax.swing.JLabel();
        listButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        delete_stu_yod_label1 = new javax.swing.JLabel();
        delete_fac_year_field = new javax.swing.JTextField();
        close_delete_stu1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        assign_subj = new javax.swing.JPanel();
        upd_stud_form_title2 = new javax.swing.JLabel();
        lineSeparator6 = new javax.swing.JSeparator();
        close_student_form4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fac_id_field = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        subj_field = new javax.swing.JTextField();
        change_password_panel = new javax.swing.JPanel();
        changePassTitle = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        backButton = new javax.swing.JButton();
        oldPassLabel = new javax.swing.JLabel();
        newPassLabel = new javax.swing.JLabel();
        confirmPassLabel = new javax.swing.JLabel();
        newPassField = new javax.swing.JPasswordField();
        oldPassField = new javax.swing.JPasswordField();
        confirmPassField = new javax.swing.JPasswordField();
        updatePass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setName("main"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        rootPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav_panel.setBackground(new java.awt.Color(51, 204, 255));
        nav_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        logo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user-solid-60.png"))); // NOI18N
        logo.setText("Admin");
        nav_panel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 70));

        student_option.setBackground(new java.awt.Color(51, 204, 255));
        student_option.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        student_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student_optionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                student_optionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                student_optionMouseExited(evt);
            }
        });
        student_option.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        student_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/student-128.png"))); // NOI18N
        student_logo.setLabelFor(student_option);
        student_logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        student_option.add(student_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, 130));

        student_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        student_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        student_label.setLabelFor(student_logo);
        student_label.setText("Students");
        student_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        student_option.add(student_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, 30));

        nav_panel.add(student_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 180, 180));

        faculty_option.setBackground(new java.awt.Color(51, 204, 255));
        faculty_option.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        faculty_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faculty_optionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                faculty_optionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                faculty_optionMouseExited(evt);
            }
        });
        faculty_option.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        faculty_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/teacher-128.png"))); // NOI18N
        faculty_logo.setLabelFor(faculty_option);
        faculty_logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        faculty_option.add(faculty_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 130));

        faculty_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        faculty_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        faculty_label.setLabelFor(faculty_logo);
        faculty_label.setText("Faculty");
        faculty_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        faculty_option.add(faculty_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 90, 20));

        nav_panel.add(faculty_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 180, 180));

        rootPane.add(nav_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 700));

        header.setBackground(new java.awt.Color(51, 255, 153));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_option.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        user_option.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user-circle-regular-24.png"))); // NOI18N
        user_option.setText("Home");
        user_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_optionMouseClicked(evt);
            }
        });
        header.add(user_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, 30));

        log_out.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        log_out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit-regular-24.png"))); // NOI18N
        log_out.setToolTipText("Log Out");
        log_out.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        log_out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                log_outMouseClicked(evt);
            }
        });
        header.add(log_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 5, -1, 30));

        rootPane.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1020, 40));

        center.setLayout(new java.awt.CardLayout());

        Welcome.setMaximumSize(new java.awt.Dimension(1020, 660));

        admin_welcome_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin_welcome_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book-128.png"))); // NOI18N

        admin_welcome_text.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        admin_welcome_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin_welcome_text.setText("Welcome");

        decResOption.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        decResOption.setText("Declare Result");
        decResOption.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        decResOption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decResOptionMouseClicked(evt);
            }
        });

        chgpwd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chgpwd.setText("Change Password");
        chgpwd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chgpwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chgpwdMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout WelcomeLayout = new javax.swing.GroupLayout(Welcome);
        Welcome.setLayout(WelcomeLayout);
        WelcomeLayout.setHorizontalGroup(
            WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomeLayout.createSequentialGroup()
                .addContainerGap(459, Short.MAX_VALUE)
                .addGroup(WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WelcomeLayout.createSequentialGroup()
                        .addGroup(WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(admin_welcome_text, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(admin_welcome_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(415, 415, 415))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WelcomeLayout.createSequentialGroup()
                        .addComponent(chgpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(decResOption, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        WelcomeLayout.setVerticalGroup(
            WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomeLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(admin_welcome_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(admin_welcome_text, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addGroup(WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decResOption, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chgpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        center.add(Welcome, "card2");

        student_home.setMaximumSize(new java.awt.Dimension(1020, 660));
        student_home.setPreferredSize(new java.awt.Dimension(1511, 660));

        stud_home_title.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        stud_home_title.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        stud_home_title.setText("Students");

        add_student_option.setBackground(new java.awt.Color(51, 255, 153));
        add_student_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_student_optionMouseClicked(evt);
            }
        });

        add_student_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-128.png"))); // NOI18N

        add_student_text.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add_student_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_student_text.setText("Add Student");

        javax.swing.GroupLayout add_student_optionLayout = new javax.swing.GroupLayout(add_student_option);
        add_student_option.setLayout(add_student_optionLayout);
        add_student_optionLayout.setHorizontalGroup(
            add_student_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_student_optionLayout.createSequentialGroup()
                .addGroup(add_student_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(add_student_optionLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(add_student_text, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(add_student_optionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(add_student_logo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        add_student_optionLayout.setVerticalGroup(
            add_student_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_student_optionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_student_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_student_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        search_student_option.setBackground(new java.awt.Color(51, 255, 153));
        search_student_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_student_optionMouseClicked(evt);
            }
        });

        search_student_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-128.png"))); // NOI18N

        search_student_text.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search_student_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search_student_text.setText("Search Student");

        javax.swing.GroupLayout search_student_optionLayout = new javax.swing.GroupLayout(search_student_option);
        search_student_option.setLayout(search_student_optionLayout);
        search_student_optionLayout.setHorizontalGroup(
            search_student_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_student_optionLayout.createSequentialGroup()
                .addGroup(search_student_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(search_student_optionLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(search_student_text, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(search_student_optionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(search_student_logo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        search_student_optionLayout.setVerticalGroup(
            search_student_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_student_optionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(search_student_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_student_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        update_student_option.setBackground(new java.awt.Color(51, 255, 153));
        update_student_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_student_optionMouseClicked(evt);
            }
        });

        update_student_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exchange-128.png"))); // NOI18N

        update_student_text.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update_student_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_student_text.setText("Update Student");

        javax.swing.GroupLayout update_student_optionLayout = new javax.swing.GroupLayout(update_student_option);
        update_student_option.setLayout(update_student_optionLayout);
        update_student_optionLayout.setHorizontalGroup(
            update_student_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_student_optionLayout.createSequentialGroup()
                .addGroup(update_student_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(update_student_optionLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(update_student_text, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(update_student_optionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(update_student_logo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        update_student_optionLayout.setVerticalGroup(
            update_student_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_student_optionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(update_student_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update_student_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        delete_student_option.setBackground(new java.awt.Color(51, 255, 153));
        delete_student_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_student_optionMouseClicked(evt);
            }
        });

        delete_student_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete-128.png"))); // NOI18N

        delete_student_text.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete_student_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete_student_text.setText("Delete Student");

        javax.swing.GroupLayout delete_student_optionLayout = new javax.swing.GroupLayout(delete_student_option);
        delete_student_option.setLayout(delete_student_optionLayout);
        delete_student_optionLayout.setHorizontalGroup(
            delete_student_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_student_optionLayout.createSequentialGroup()
                .addGroup(delete_student_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(delete_student_optionLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(delete_student_text, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(delete_student_optionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(delete_student_logo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        delete_student_optionLayout.setVerticalGroup(
            delete_student_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_student_optionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(delete_student_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete_student_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout student_homeLayout = new javax.swing.GroupLayout(student_home);
        student_home.setLayout(student_homeLayout);
        student_homeLayout.setHorizontalGroup(
            student_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_homeLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(student_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(student_homeLayout.createSequentialGroup()
                        .addComponent(add_student_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(search_student_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(update_student_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(delete_student_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(student_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lineSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stud_home_title, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        student_homeLayout.setVerticalGroup(
            student_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_homeLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(stud_home_title, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lineSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addGroup(student_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_student_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_student_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_student_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_student_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(249, Short.MAX_VALUE))
        );

        center.add(student_home, "card3");

        faculty_home.setMaximumSize(new java.awt.Dimension(1020, 660));
        faculty_home.setPreferredSize(new java.awt.Dimension(1511, 660));

        faculty_home_title.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        faculty_home_title.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        faculty_home_title.setText("Faculty");

        add_faculty_option.setBackground(new java.awt.Color(51, 255, 153));
        add_faculty_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_faculty_optionMouseClicked(evt);
            }
        });

        add_faculty_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-128.png"))); // NOI18N
        add_faculty_logo.setLabelFor(add_student_option);

        add_faculty_text.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add_faculty_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_faculty_text.setLabelFor(add_student_option);
        add_faculty_text.setText("Add Faculty");

        javax.swing.GroupLayout add_faculty_optionLayout = new javax.swing.GroupLayout(add_faculty_option);
        add_faculty_option.setLayout(add_faculty_optionLayout);
        add_faculty_optionLayout.setHorizontalGroup(
            add_faculty_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_faculty_optionLayout.createSequentialGroup()
                .addGroup(add_faculty_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(add_faculty_optionLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(add_faculty_text, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(add_faculty_optionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(add_faculty_logo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        add_faculty_optionLayout.setVerticalGroup(
            add_faculty_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_faculty_optionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_faculty_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_faculty_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        search_faculty_option.setBackground(new java.awt.Color(51, 255, 153));
        search_faculty_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_faculty_optionMouseClicked(evt);
            }
        });

        search_faculty_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-128.png"))); // NOI18N

        search_faculty_text.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search_faculty_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search_faculty_text.setText("Search Faculty");

        javax.swing.GroupLayout search_faculty_optionLayout = new javax.swing.GroupLayout(search_faculty_option);
        search_faculty_option.setLayout(search_faculty_optionLayout);
        search_faculty_optionLayout.setHorizontalGroup(
            search_faculty_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_faculty_optionLayout.createSequentialGroup()
                .addGroup(search_faculty_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(search_faculty_optionLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(search_faculty_text, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(search_faculty_optionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(search_faculty_logo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        search_faculty_optionLayout.setVerticalGroup(
            search_faculty_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_faculty_optionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(search_faculty_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_faculty_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        update_faculty_option.setBackground(new java.awt.Color(51, 255, 153));
        update_faculty_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_faculty_optionMouseClicked(evt);
            }
        });

        update_faculty_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exchange-128.png"))); // NOI18N

        update_faculty_text.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update_faculty_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_faculty_text.setText("Update Faculty");

        javax.swing.GroupLayout update_faculty_optionLayout = new javax.swing.GroupLayout(update_faculty_option);
        update_faculty_option.setLayout(update_faculty_optionLayout);
        update_faculty_optionLayout.setHorizontalGroup(
            update_faculty_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_faculty_optionLayout.createSequentialGroup()
                .addGroup(update_faculty_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(update_faculty_optionLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(update_faculty_text, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(update_faculty_optionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(update_faculty_logo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        update_faculty_optionLayout.setVerticalGroup(
            update_faculty_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_faculty_optionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(update_faculty_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update_faculty_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        delete_faculty_option.setBackground(new java.awt.Color(51, 255, 153));
        delete_faculty_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_faculty_optionMouseClicked(evt);
            }
        });

        delete_faculty_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete-128.png"))); // NOI18N

        delete_faculty_text.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete_faculty_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete_faculty_text.setText("Delete Faculty");

        javax.swing.GroupLayout delete_faculty_optionLayout = new javax.swing.GroupLayout(delete_faculty_option);
        delete_faculty_option.setLayout(delete_faculty_optionLayout);
        delete_faculty_optionLayout.setHorizontalGroup(
            delete_faculty_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_faculty_optionLayout.createSequentialGroup()
                .addGroup(delete_faculty_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(delete_faculty_optionLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(delete_faculty_text, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(delete_faculty_optionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(delete_faculty_logo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        delete_faculty_optionLayout.setVerticalGroup(
            delete_faculty_optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_faculty_optionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(delete_faculty_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete_faculty_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        assign_subjects.setBackground(new java.awt.Color(51, 255, 153));
        assign_subjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assign_subjectsMouseClicked(evt);
            }
        });

        assign_subjects_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit-user-128-.png"))); // NOI18N
        assign_subjects_logo.setLabelFor(add_student_option);

        assign_subjects_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        assign_subjects_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assign_subjects_label.setLabelFor(add_student_option);
        assign_subjects_label.setText("Assign Subjects");

        javax.swing.GroupLayout assign_subjectsLayout = new javax.swing.GroupLayout(assign_subjects);
        assign_subjects.setLayout(assign_subjectsLayout);
        assign_subjectsLayout.setHorizontalGroup(
            assign_subjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assign_subjectsLayout.createSequentialGroup()
                .addGroup(assign_subjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assign_subjectsLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(assign_subjects_label, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(assign_subjectsLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(assign_subjects_logo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        assign_subjectsLayout.setVerticalGroup(
            assign_subjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assign_subjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(assign_subjects_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assign_subjects_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout faculty_homeLayout = new javax.swing.GroupLayout(faculty_home);
        faculty_home.setLayout(faculty_homeLayout);
        faculty_homeLayout.setHorizontalGroup(
            faculty_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faculty_homeLayout.createSequentialGroup()
                .addGroup(faculty_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(faculty_homeLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(faculty_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(faculty_homeLayout.createSequentialGroup()
                                .addComponent(add_faculty_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(search_faculty_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(update_faculty_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(delete_faculty_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(faculty_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(faculty_home_title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
                                .addComponent(lineSeaparator2, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(faculty_homeLayout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(assign_subjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(562, Short.MAX_VALUE))
        );
        faculty_homeLayout.setVerticalGroup(
            faculty_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faculty_homeLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(faculty_home_title, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lineSeaparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addGroup(faculty_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_faculty_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_faculty_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_faculty_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_faculty_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(assign_subjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        center.add(faculty_home, "card3");

        add_student_form.setMaximumSize(new java.awt.Dimension(1020, 660));

        stud_home_title1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        stud_home_title1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        stud_home_title1.setText("Add Student");

        personal_Deatail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), java.awt.SystemColor.controlDkShadow)); // NOI18N
        personal_Deatail.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fName_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fName_label.setText("First Name");
        personal_Deatail.add(fName_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 25, 220, 23));

        fname_field.setBackground(new java.awt.Color(240, 240, 240));
        fname_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        fname_field.setMargin(new java.awt.Insets(2, 8, 2, 2));
        personal_Deatail.add(fname_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 55, 220, 27));

        mName_field.setBackground(new java.awt.Color(240, 240, 240));
        mName_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        mName_field.setMargin(new java.awt.Insets(2, 8, 2, 2));
        personal_Deatail.add(mName_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 54, 220, 27));

        mName_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mName_label.setText("Middle Name");
        personal_Deatail.add(mName_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 25, 220, -1));

        lName_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lName_label.setText("Last Name");
        personal_Deatail.add(lName_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 25, 220, -1));

        lName_field.setBackground(new java.awt.Color(240, 240, 240));
        lName_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        lName_field.setMargin(new java.awt.Insets(2, 8, 2, 2));
        personal_Deatail.add(lName_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 55, 220, 27));

        dob_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dob_label.setText("Date of Birth (dd-mm-yyyy)");
        personal_Deatail.add(dob_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 104, -1, 23));

        mName_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mName_label1.setText("Gender");
        personal_Deatail.add(mName_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 104, 220, -1));

        add_stud_bg.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        personal_Deatail.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 137, 80, -1));

        add_stud_bg.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        personal_Deatail.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 137, 80, -1));

        add_stud_bg.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jRadioButton3.setLabel("Other");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        personal_Deatail.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 137, 80, -1));

        dob_field.setDateFormatString("dd-MM-yyyy");
        personal_Deatail.add(dob_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 137, 200, 27));

        communication_Deatail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Communiction Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), java.awt.SystemColor.controlDkShadow)); // NOI18N
        communication_Deatail.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_label.setText("E-Mail");
        communication_Deatail.add(email_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 25, 120, 23));

        email_field.setBackground(new java.awt.Color(240, 240, 240));
        email_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        email_field.setMargin(new java.awt.Insets(2, 8, 2, 2));
        communication_Deatail.add(email_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 54, 360, 27));

        mob_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mob_label.setText("Phone/Mob. No.");
        communication_Deatail.add(mob_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 26, 120, -1));

        mob_field.setBackground(new java.awt.Color(240, 240, 240));
        mob_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        mob_field.setMargin(new java.awt.Insets(2, 8, 2, 2));
        communication_Deatail.add(mob_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 54, 220, 27));

        address_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        address_label.setText("Address");
        communication_Deatail.add(address_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 87, 360, 23));

        address_field.setBackground(new java.awt.Color(240, 240, 240));
        address_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        address_field.setMargin(new java.awt.Insets(2, 8, 2, 2));
        communication_Deatail.add(address_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 116, 360, 27));

        pin_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pin_label.setText("PIN Code");
        communication_Deatail.add(pin_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 87, 120, 23));

        pin_field.setBackground(new java.awt.Color(240, 240, 240));
        pin_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pin_field.setMargin(new java.awt.Insets(2, 8, 2, 2));
        communication_Deatail.add(pin_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 116, 220, 27));

        academic_Detail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Academic Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), java.awt.SystemColor.controlDkShadow)); // NOI18N
        academic_Detail.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        course_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        course_label.setText("Course");
        academic_Detail.add(course_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 25, 120, 23));

        course_field.setBackground(new java.awt.Color(240, 240, 240));
        course_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Course--", "B. Tech", "M. Tech", "Phd" }));
        course_field.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                course_fieldItemStateChanged(evt);
            }
        });
        academic_Detail.add(course_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 54, 206, 27));

        branch_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        branch_label.setText("Branch");
        academic_Detail.add(branch_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 26, 120, -1));

        branch_field.setBackground(new java.awt.Color(240, 240, 240));
        branch_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Branch--" }));
        academic_Detail.add(branch_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 54, 200, 27));

        sem_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sem_label.setText("Semester (in number eg. 1, 2 ,etc.)");
        academic_Detail.add(sem_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 91, 360, 23));

        sem_field.setBackground(new java.awt.Color(240, 240, 240));
        sem_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        sem_field.setMargin(new java.awt.Insets(2, 8, 2, 2));
        academic_Detail.add(sem_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 120, 360, 27));

        yoa_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yoa_label.setText("Year Of Admission");
        academic_Detail.add(yoa_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 92, 120, -1));

        yoa_field.setBackground(new java.awt.Color(240, 240, 240));
        yoa_field.setToolTipText("");
        yoa_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        yoa_field.setMargin(new java.awt.Insets(2, 8, 2, 2));
        academic_Detail.add(yoa_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 120, 220, 27));

        reset_stud_button.setBackground(new java.awt.Color(0, 255, 255));
        reset_stud_button.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        reset_stud_button.setText("Reset");
        reset_stud_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_stud_buttonActionPerformed(evt);
            }
        });

        close_student_form.setBackground(new java.awt.Color(0, 153, 153));
        close_student_form.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        close_student_form.setForeground(new java.awt.Color(255, 255, 255));
        close_student_form.setText("Close");
        close_student_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_student_formActionPerformed(evt);
            }
        });

        add_student_button.setBackground(new java.awt.Color(0, 0, 255));
        add_student_button.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add_student_button.setForeground(new java.awt.Color(255, 255, 255));
        add_student_button.setText("Add Student");
        add_student_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_student_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout add_student_formLayout = new javax.swing.GroupLayout(add_student_form);
        add_student_form.setLayout(add_student_formLayout);
        add_student_formLayout.setHorizontalGroup(
            add_student_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_student_formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(add_student_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(add_student_formLayout.createSequentialGroup()
                        .addComponent(reset_stud_button, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add_student_button, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(add_student_formLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(add_student_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(add_student_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lineSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(add_student_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(personal_Deatail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(communication_Deatail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                                    .addComponent(academic_Detail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, add_student_formLayout.createSequentialGroup()
                                .addComponent(close_student_form, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stud_home_title1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(654, 654, 654))
        );
        add_student_formLayout.setVerticalGroup(
            add_student_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_student_formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(add_student_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stud_home_title1)
                    .addComponent(close_student_form, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lineSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(personal_Deatail, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(communication_Deatail, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(academic_Detail, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(add_student_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset_stud_button, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(add_student_button, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        center.add(add_student_form, "card3");

        search_student_form.setMaximumSize(new java.awt.Dimension(1020, 660));
        search_student_form.setPreferredSize(new java.awt.Dimension(1020, 660));
        search_student_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_stu_title.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        search_stu_title.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        search_stu_title.setText("Search Student");
        search_student_form.add(search_stu_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 200, 45));
        search_student_form.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1000, 1));

        search_stu_roll_field.setBackground(new java.awt.Color(240, 240, 240));
        search_student_form.add(search_stu_roll_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 110, 27));

        search_stu_roll_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_stu_roll_label.setText("Enter Roll No. :");
        search_student_form.add(search_stu_roll_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 100, 27));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        search_student_form.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, -1, 27));

        search_stu_course_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_stu_course_label.setText("Course :");
        search_student_form.add(search_stu_course_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 60, 27));

        search_stu_course_option.setBackground(new java.awt.Color(240, 240, 240));
        search_stu_course_option.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        search_stu_course_option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Course--", "B. Tech", "M. Tech", "Phd" }));
        search_stu_course_option.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                search_stu_course_optionItemStateChanged(evt);
            }
        });
        search_student_form.add(search_stu_course_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, 120, 27));

        search_stu_branch_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_stu_branch_label.setText("Branch : ");
        search_student_form.add(search_stu_branch_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, 60, 27));

        search_stu_branch_option.setBackground(new java.awt.Color(240, 240, 240));
        search_stu_branch_option.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        search_stu_branch_option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Branch--", "Computer Science", "Information Technology", "Civil Engineering", "Electronics and Communication Enginnering", "Electrical Engineering", "Mechanical Engineering", "VLSI", "Seismology", "Maths", "Physics", " " }));
        search_student_form.add(search_stu_branch_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, 120, 27));

        search_stu_option.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-24.png"))); // NOI18N
        search_stu_option.setLabelFor(search_stu_roll_field);
        search_stu_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_stu_optionMouseClicked(evt);
            }
        });
        search_student_form.add(search_stu_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 600, 25, 27));

        listButton.setBackground(new java.awt.Color(51, 51, 255));
        listButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        listButton.setForeground(new java.awt.Color(255, 255, 255));
        listButton.setText("List");
        listButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listButtonActionPerformed(evt);
            }
        });
        search_student_form.add(listButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 600, 70, 27));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1020, 660));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1020, 660));

        jTable1.setBackground(new java.awt.Color(240, 240, 240));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roll No.", "First Name", "Middle Name", "Last Name", "Date of Birth", "Gender", "Email", "Phone", "Address", "PIN Code", "Course", "Branch", "Semester", "Year of Admission"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(13).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(13).setMaxWidth(150);
        }

        search_student_form.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1000, 440));

        search_stu_yod_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_stu_yod_label.setText("Year Of Admission :");
        search_student_form.add(search_stu_yod_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, 130, 27));

        search_stu_yod_field.setBackground(new java.awt.Color(240, 240, 240));
        search_student_form.add(search_stu_yod_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 600, 75, 27));

        close_search_stu.setBackground(new java.awt.Color(0, 153, 153));
        close_search_stu.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        close_search_stu.setForeground(new java.awt.Color(255, 255, 255));
        close_search_stu.setText("Back");
        close_search_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_search_stuActionPerformed(evt);
            }
        });
        search_student_form.add(close_search_stu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 86, 27));

        center.add(search_student_form, "card7");

        update_student_form.setMaximumSize(new java.awt.Dimension(1020, 660));
        update_student_form.setPreferredSize(new java.awt.Dimension(1020, 660));
        update_student_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upd_stud_form_title.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        upd_stud_form_title.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        upd_stud_form_title.setText("Update Student");
        update_student_form.add(upd_stud_form_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 233, -1));
        update_student_form.add(lineSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, 850, 4));

        update_personal_detail_pane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), java.awt.SystemColor.controlDkShadow)); // NOI18N
        update_personal_detail_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fName_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fName_label1.setText("First Name");
        update_personal_detail_pane.add(fName_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 25, 220, 23));

        fname_field1.setBackground(new java.awt.Color(240, 240, 240));
        fname_field1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        fname_field1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        update_personal_detail_pane.add(fname_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 55, 220, 27));

        mName_field1.setBackground(new java.awt.Color(240, 240, 240));
        mName_field1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        mName_field1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        update_personal_detail_pane.add(mName_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 54, 220, 27));

        mName_label2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mName_label2.setText("Middle Name");
        update_personal_detail_pane.add(mName_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 25, 220, -1));

        lName_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lName_label1.setText("Last Name");
        update_personal_detail_pane.add(lName_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 25, 220, -1));

        lName_field1.setBackground(new java.awt.Color(240, 240, 240));
        lName_field1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        lName_field1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        update_personal_detail_pane.add(lName_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 55, 220, 27));

        dob_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dob_label1.setText("Date of Birth (dd-mm-yyyy)");
        update_personal_detail_pane.add(dob_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 104, -1, 23));

        mName_label3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mName_label3.setText("Gender");
        update_personal_detail_pane.add(mName_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 104, 220, -1));

        upd_stud_bg.add(upd_stud_male);
        upd_stud_male.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        upd_stud_male.setText("Male");
        upd_stud_male.setActionCommand("M");
        upd_stud_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_stud_maleActionPerformed(evt);
            }
        });
        update_personal_detail_pane.add(upd_stud_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 137, 80, -1));

        upd_stud_bg.add(upd_stud_female);
        upd_stud_female.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        upd_stud_female.setText("Female");
        upd_stud_female.setActionCommand("F");
        upd_stud_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_stud_femaleActionPerformed(evt);
            }
        });
        update_personal_detail_pane.add(upd_stud_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 137, 80, -1));

        upd_stud_bg.add(upd_stud_other);
        upd_stud_other.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        upd_stud_other.setActionCommand("O");
        upd_stud_other.setLabel("Other");
        upd_stud_other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_stud_otherActionPerformed(evt);
            }
        });
        update_personal_detail_pane.add(upd_stud_other, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 137, 80, -1));

        dob_field1.setDateFormatString("dd-MM-yyyy");
        update_personal_detail_pane.add(dob_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 140, 200, 27));

        update_student_form.add(update_personal_detail_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, 847, 191));

        update_communication_detail_pane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Communiction Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), java.awt.SystemColor.controlDkShadow)); // NOI18N
        update_communication_detail_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_label1.setText("E-Mail");
        update_communication_detail_pane.add(email_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 25, 120, 23));

        email_field1.setBackground(new java.awt.Color(240, 240, 240));
        email_field1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        email_field1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        update_communication_detail_pane.add(email_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 54, 360, 27));

        mob_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mob_label1.setText("Phone/Mob. No.");
        update_communication_detail_pane.add(mob_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 26, 120, -1));

        mob_field1.setBackground(new java.awt.Color(240, 240, 240));
        mob_field1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        mob_field1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        update_communication_detail_pane.add(mob_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 54, 220, 27));

        address_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        address_label1.setText("Address");
        update_communication_detail_pane.add(address_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 87, 360, 23));

        address_field1.setBackground(new java.awt.Color(240, 240, 240));
        address_field1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        address_field1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        update_communication_detail_pane.add(address_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 116, 360, 27));

        pin_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pin_label1.setText("PIN Code");
        update_communication_detail_pane.add(pin_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 87, 120, 23));

        pin_field1.setBackground(new java.awt.Color(240, 240, 240));
        pin_field1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pin_field1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        update_communication_detail_pane.add(pin_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 116, 220, 27));

        update_student_form.add(update_communication_detail_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 847, 161));

        update_academic_detail_pane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Academic Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), java.awt.SystemColor.controlDkShadow)); // NOI18N
        update_academic_detail_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        course_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        course_label1.setText("Course");
        update_academic_detail_pane.add(course_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 25, 120, 23));

        course_field1.setBackground(new java.awt.Color(240, 240, 240));
        course_field1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Course--", "B. Tech", "M. Tech", "Phd" }));
        course_field1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                course_field1ItemStateChanged(evt);
            }
        });
        update_academic_detail_pane.add(course_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 54, 206, 27));

        branch_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        branch_label1.setText("Branch");
        update_academic_detail_pane.add(branch_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 26, 120, -1));

        branch_field1.setBackground(new java.awt.Color(240, 240, 240));
        branch_field1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Branch--" }));
        update_academic_detail_pane.add(branch_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 54, 200, 27));

        sem_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sem_label1.setText("Semester (in number eg. 1, 2 ,etc.)");
        update_academic_detail_pane.add(sem_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 91, 360, 23));

        sem_field1.setBackground(new java.awt.Color(240, 240, 240));
        sem_field1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        sem_field1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        update_academic_detail_pane.add(sem_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 120, 360, 27));

        yoa_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yoa_label1.setText("Year Of Admission");
        update_academic_detail_pane.add(yoa_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 92, 120, -1));

        yoa_field1.setBackground(new java.awt.Color(240, 240, 240));
        yoa_field1.setToolTipText("");
        yoa_field1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        yoa_field1.setMargin(new java.awt.Insets(2, 8, 2, 2));
        update_academic_detail_pane.add(yoa_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 120, 220, 27));

        update_student_form.add(update_academic_detail_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 431, 847, 159));

        reset_stud_button1.setBackground(new java.awt.Color(0, 255, 255));
        reset_stud_button1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        reset_stud_button1.setText("Reset");
        reset_stud_button1.setEnabled(false);
        reset_stud_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_stud_button1ActionPerformed(evt);
            }
        });
        update_student_form.add(reset_stud_button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 608, 105, 32));

        close_student_form1.setBackground(new java.awt.Color(0, 153, 153));
        close_student_form1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        close_student_form1.setForeground(new java.awt.Color(255, 255, 255));
        close_student_form1.setText("Close");
        close_student_form1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_student_form1ActionPerformed(evt);
            }
        });
        update_student_form.add(close_student_form1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 85, 32));

        update_student_button.setBackground(new java.awt.Color(0, 0, 255));
        update_student_button.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        update_student_button.setForeground(new java.awt.Color(255, 255, 255));
        update_student_button.setText("Update Details");
        update_student_button.setEnabled(false);
        update_student_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_student_buttonActionPerformed(evt);
            }
        });
        update_student_form.add(update_student_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 610, 155, 32));

        roll_query_field.setBackground(new java.awt.Color(240, 240, 240));
        update_student_form.add(roll_query_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 140, 27));

        roll_query_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        roll_query_label.setText("Enter Roll No. :");
        update_student_form.add(roll_query_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 110, 27));

        search_label_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-24.png"))); // NOI18N
        search_label_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_label_buttonMouseClicked(evt);
            }
        });
        update_student_form.add(search_label_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 31, 32));

        reset_stud_button2.setBackground(new java.awt.Color(0, 255, 255));
        reset_stud_button2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        reset_stud_button2.setText("Reset Changes");
        reset_stud_button2.setEnabled(false);
        reset_stud_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_stud_button2ActionPerformed(evt);
            }
        });
        update_student_form.add(reset_stud_button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 608, 110, 32));

        center.add(update_student_form, "card3");

        delete_student_form.setMaximumSize(new java.awt.Dimension(1020, 660));
        delete_student_form.setPreferredSize(new java.awt.Dimension(1020, 660));
        delete_student_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete_stu_title.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        delete_stu_title.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        delete_stu_title.setText("Delete Student");
        delete_student_form.add(delete_stu_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, 45));
        delete_student_form.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, 990, -1));

        delete_stu_roll_field.setBackground(new java.awt.Color(240, 240, 240));
        delete_student_form.add(delete_stu_roll_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 110, 27));

        delete_stu_roll_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        delete_stu_roll_label.setText("Enter Roll No. :");
        delete_student_form.add(delete_stu_roll_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 100, 27));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        delete_student_form.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, -1, 27));

        delete_stu_course_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        delete_stu_course_label.setText("Course :");
        delete_student_form.add(delete_stu_course_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 60, 27));

        delete_stu_course_option.setBackground(new java.awt.Color(240, 240, 240));
        delete_stu_course_option.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        delete_stu_course_option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Course--", "B. Tech", "M. Tech", "Phd" }));
        delete_stu_course_option.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                delete_stu_course_optionItemStateChanged(evt);
            }
        });
        delete_student_form.add(delete_stu_course_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 120, 27));

        delete_stu_branch_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        delete_stu_branch_label.setText("Branch : ");
        delete_student_form.add(delete_stu_branch_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 60, 27));

        delete_stu_branch_option.setBackground(new java.awt.Color(240, 240, 240));
        delete_stu_branch_option.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        delete_stu_branch_option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Branch--", "Computer Science", "Information Technology", "Civil Engineering", "Electronics and Communication Enginnering", "Electrical Engineering", "Mechanical Engineering", "VLSI", "Seismology", "Maths", "Physics" }));
        delete_student_form.add(delete_stu_branch_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 120, 27));

        delete_stu_option.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-24.png"))); // NOI18N
        delete_stu_option.setLabelFor(delete_stu_roll_field);
        delete_stu_option.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_stu_optionMouseClicked(evt);
            }
        });
        delete_student_form.add(delete_stu_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 560, 25, 27));

        listButton1.setBackground(new java.awt.Color(51, 102, 255));
        listButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        listButton1.setForeground(new java.awt.Color(255, 255, 255));
        listButton1.setText("List");
        listButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listButton1ActionPerformed(evt);
            }
        });
        delete_student_form.add(listButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 560, 70, 27));

        jScrollPane2.setMaximumSize(new java.awt.Dimension(1020, 660));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(980, 660));

        jTable2.setBackground(new java.awt.Color(240, 240, 240));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roll No.", "First Name", "Middle Name", "Last Name", "Date of Birth", "Gender", "Email", "Phone", "Address", "PIN Code", "Course", "Branch", "Semester", "Year of Admission"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(6).setPreferredWidth(120);
            jTable2.getColumnModel().getColumn(8).setPreferredWidth(150);
            jTable2.getColumnModel().getColumn(9).setPreferredWidth(80);
            jTable2.getColumnModel().getColumn(11).setPreferredWidth(250);
            jTable2.getColumnModel().getColumn(13).setPreferredWidth(80);
            jTable2.getColumnModel().getColumn(13).setMaxWidth(150);
        }

        delete_student_form.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 990, 460));

        delete_stu_yod_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        delete_stu_yod_label.setText("Year Of Admission :");
        delete_student_form.add(delete_stu_yod_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, 130, 27));

        delete_stu_yod_field.setBackground(new java.awt.Color(240, 240, 240));
        delete_student_form.add(delete_stu_yod_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 75, 27));

        close_delete_stu.setBackground(new java.awt.Color(0, 153, 153));
        close_delete_stu.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        close_delete_stu.setForeground(new java.awt.Color(255, 255, 255));
        close_delete_stu.setText("Back");
        close_delete_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_delete_stuActionPerformed(evt);
            }
        });
        delete_student_form.add(close_delete_stu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 86, 27));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        delete_student_form.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, 130, 27));

        center.add(delete_student_form, "card7");

        add_faculty_form.setMaximumSize(new java.awt.Dimension(1020, 660));

        stud_home_title2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        stud_home_title2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        stud_home_title2.setText("Add Faculty");

        personal_Deatail1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), java.awt.SystemColor.controlDkShadow)); // NOI18N
        personal_Deatail1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fName_label2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fName_label2.setText("Name");
        personal_Deatail1.add(fName_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 25, 220, 23));

        fname_field2.setBackground(new java.awt.Color(240, 240, 240));
        fname_field2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        fname_field2.setMargin(new java.awt.Insets(2, 8, 2, 2));
        personal_Deatail1.add(fname_field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 55, 350, 27));

        dob_label2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dob_label2.setText("Date of Birth (dd-mm-yyyy)");
        personal_Deatail1.add(dob_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 104, -1, 23));

        mName_label5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mName_label5.setText("Gender");
        personal_Deatail1.add(mName_label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 104, 220, -1));

        add_fac_bg.add(add_fac_male);
        add_fac_male.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add_fac_male.setText("Male");
        add_fac_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_fac_maleActionPerformed(evt);
            }
        });
        personal_Deatail1.add(add_fac_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 137, 80, -1));

        add_fac_bg.add(add_fac_fem);
        add_fac_fem.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add_fac_fem.setText("Female");
        add_fac_fem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_fac_femActionPerformed(evt);
            }
        });
        personal_Deatail1.add(add_fac_fem, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 137, 80, -1));

        add_fac_bg.add(add_fac_oth);
        add_fac_oth.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add_fac_oth.setLabel("Other");
        add_fac_oth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_fac_othActionPerformed(evt);
            }
        });
        personal_Deatail1.add(add_fac_oth, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 137, 80, -1));

        dob_field2.setDateFormatString("dd-MM-yyyy");
        personal_Deatail1.add(dob_field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 137, 200, 27));

        communication_Deatail1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Communiction Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), java.awt.SystemColor.controlDkShadow)); // NOI18N
        communication_Deatail1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email_label2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_label2.setText("E-Mail");
        communication_Deatail1.add(email_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 25, 120, 23));

        email_field2.setBackground(new java.awt.Color(240, 240, 240));
        email_field2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        email_field2.setMargin(new java.awt.Insets(2, 8, 2, 2));
        communication_Deatail1.add(email_field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 54, 360, 27));

        mob_label2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mob_label2.setText("Phone/Mob. No.");
        communication_Deatail1.add(mob_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 26, 120, -1));

        mob_field2.setBackground(new java.awt.Color(240, 240, 240));
        mob_field2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        mob_field2.setMargin(new java.awt.Insets(2, 8, 2, 2));
        communication_Deatail1.add(mob_field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 54, 220, 27));

        address_label2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        address_label2.setText("Address");
        communication_Deatail1.add(address_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 87, 360, 23));

        address_field2.setBackground(new java.awt.Color(240, 240, 240));
        address_field2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        address_field2.setMargin(new java.awt.Insets(2, 8, 2, 2));
        communication_Deatail1.add(address_field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 116, 360, 27));

        pin_label2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pin_label2.setText("PIN Code");
        communication_Deatail1.add(pin_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 87, 120, 23));

        pin_field2.setBackground(new java.awt.Color(240, 240, 240));
        pin_field2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pin_field2.setMargin(new java.awt.Insets(2, 8, 2, 2));
        communication_Deatail1.add(pin_field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 116, 220, 27));

        academic_Detail1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Academic Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), java.awt.SystemColor.controlDkShadow)); // NOI18N
        academic_Detail1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        course_label2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        course_label2.setText("Designation");
        academic_Detail1.add(course_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 25, 120, 23));

        desg_field.setBackground(new java.awt.Color(240, 240, 240));
        desg_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Designation--", "Professor", "Asst. Professor", "Guest Faculty" }));
        academic_Detail1.add(desg_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 54, 206, 27));

        branch_label2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        branch_label2.setText("Deaprtment");
        academic_Detail1.add(branch_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 26, 120, -1));

        dep_field.setBackground(new java.awt.Color(240, 240, 240));
        dep_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Deapartment--", "Computer Science", "Information Technology", "Civil Engineering", "Electronics and Communication Enginnering", "Electrical Engineering", "Mechanical Engineering", "VLSI", "Seismology", "Maths", "Physics" }));
        academic_Detail1.add(dep_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 54, 200, 27));

        reset_stud_button3.setBackground(new java.awt.Color(0, 255, 255));
        reset_stud_button3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        reset_stud_button3.setText("Reset");
        reset_stud_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_stud_button3ActionPerformed(evt);
            }
        });

        close_student_form2.setBackground(new java.awt.Color(0, 153, 153));
        close_student_form2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        close_student_form2.setForeground(new java.awt.Color(255, 255, 255));
        close_student_form2.setText("Close");
        close_student_form2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_student_form2ActionPerformed(evt);
            }
        });

        add_fac.setBackground(new java.awt.Color(0, 0, 255));
        add_fac.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add_fac.setForeground(new java.awt.Color(255, 255, 255));
        add_fac.setText("Add Faculty");
        add_fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_facActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout add_faculty_formLayout = new javax.swing.GroupLayout(add_faculty_form);
        add_faculty_form.setLayout(add_faculty_formLayout);
        add_faculty_formLayout.setHorizontalGroup(
            add_faculty_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_faculty_formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(add_faculty_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(add_faculty_formLayout.createSequentialGroup()
                        .addComponent(reset_stud_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add_fac, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(add_faculty_formLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(add_faculty_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(add_faculty_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lineSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(add_faculty_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(personal_Deatail1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(communication_Deatail1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                                    .addComponent(academic_Detail1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, add_faculty_formLayout.createSequentialGroup()
                                .addComponent(close_student_form2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stud_home_title2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(654, 654, 654))
        );
        add_faculty_formLayout.setVerticalGroup(
            add_faculty_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_faculty_formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(add_faculty_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stud_home_title2)
                    .addComponent(close_student_form2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lineSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(personal_Deatail1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(communication_Deatail1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(academic_Detail1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(add_faculty_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset_stud_button3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(add_fac, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        center.add(add_faculty_form, "card3");

        update_faculty_form.setMaximumSize(new java.awt.Dimension(1020, 660));
        update_faculty_form.setPreferredSize(new java.awt.Dimension(1020, 660));
        update_faculty_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upd_stud_form_title1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        upd_stud_form_title1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        upd_stud_form_title1.setText("Update Faculty");
        update_faculty_form.add(upd_stud_form_title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 233, -1));
        update_faculty_form.add(lineSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, 850, 4));

        update_personal_detail_pane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), java.awt.SystemColor.controlDkShadow)); // NOI18N
        update_personal_detail_pane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fName_label3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fName_label3.setText("Full Name");
        update_personal_detail_pane1.add(fName_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 25, 220, 23));

        fname_field3.setBackground(new java.awt.Color(240, 240, 240));
        fname_field3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        fname_field3.setMargin(new java.awt.Insets(2, 8, 2, 2));
        update_personal_detail_pane1.add(fname_field3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 55, 390, 27));

        dob_label3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dob_label3.setText("Date of Birth (dd-mm-yyyy)");
        update_personal_detail_pane1.add(dob_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 104, -1, 23));

        mName_label6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mName_label6.setText("Gender");
        update_personal_detail_pane1.add(mName_label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 104, 220, -1));

        add_fac_bg.add(upd_fac_male);
        upd_fac_male.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        upd_fac_male.setText("Male");
        upd_fac_male.setActionCommand("M");
        upd_fac_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_fac_maleActionPerformed(evt);
            }
        });
        update_personal_detail_pane1.add(upd_fac_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 137, 80, -1));

        add_fac_bg.add(upd_fac_fem);
        upd_fac_fem.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        upd_fac_fem.setText("Female");
        upd_fac_fem.setActionCommand("F");
        upd_fac_fem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_fac_femActionPerformed(evt);
            }
        });
        update_personal_detail_pane1.add(upd_fac_fem, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 137, 80, -1));

        add_fac_bg.add(upd_fac_oth);
        upd_fac_oth.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        upd_fac_oth.setActionCommand("O");
        upd_fac_oth.setLabel("Other");
        upd_fac_oth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_fac_othActionPerformed(evt);
            }
        });
        update_personal_detail_pane1.add(upd_fac_oth, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 137, 80, -1));

        dob_field3.setDateFormatString("dd-MM-yyyy");
        update_personal_detail_pane1.add(dob_field3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 137, 200, 27));

        update_faculty_form.add(update_personal_detail_pane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, 847, 191));

        update_communication_detail_pane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Communiction Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), java.awt.SystemColor.controlDkShadow)); // NOI18N
        update_communication_detail_pane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email_label3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_label3.setText("E-Mail");
        update_communication_detail_pane1.add(email_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 25, 120, 23));

        email_field3.setBackground(new java.awt.Color(240, 240, 240));
        email_field3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        email_field3.setMargin(new java.awt.Insets(2, 8, 2, 2));
        update_communication_detail_pane1.add(email_field3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 54, 360, 27));

        mob_label3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mob_label3.setText("Phone/Mob. No.");
        update_communication_detail_pane1.add(mob_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 26, 120, -1));

        mob_field3.setBackground(new java.awt.Color(240, 240, 240));
        mob_field3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        mob_field3.setMargin(new java.awt.Insets(2, 8, 2, 2));
        update_communication_detail_pane1.add(mob_field3, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 54, 220, 27));

        address_label3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        address_label3.setText("Address");
        update_communication_detail_pane1.add(address_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 87, 360, 23));

        address_field3.setBackground(new java.awt.Color(240, 240, 240));
        address_field3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        address_field3.setMargin(new java.awt.Insets(2, 8, 2, 2));
        update_communication_detail_pane1.add(address_field3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 116, 360, 27));

        pin_label3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pin_label3.setText("PIN Code");
        update_communication_detail_pane1.add(pin_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 87, 120, 23));

        pin_field3.setBackground(new java.awt.Color(240, 240, 240));
        pin_field3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pin_field3.setMargin(new java.awt.Insets(2, 8, 2, 2));
        update_communication_detail_pane1.add(pin_field3, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 116, 220, 27));

        update_faculty_form.add(update_communication_detail_pane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 847, 161));

        update_academic_detail_pane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Academic Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), java.awt.SystemColor.controlDkShadow)); // NOI18N
        update_academic_detail_pane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        course_label3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        course_label3.setText("Designation");
        update_academic_detail_pane1.add(course_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 25, 120, 23));

        upd_fac_desg_field.setBackground(new java.awt.Color(240, 240, 240));
        upd_fac_desg_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Designation--", "Professor", "Asst. Professor", "Guest Faculty" }));
        update_academic_detail_pane1.add(upd_fac_desg_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 54, 206, 27));

        branch_label3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        branch_label3.setText("Department");
        update_academic_detail_pane1.add(branch_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 25, 120, 23));

        upd_fac_dep_field.setBackground(new java.awt.Color(240, 240, 240));
        upd_fac_dep_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Department--", "Computer Science", "Information Technology", "Civil Engineering", "Electronics and Communication Enginnering", "Electrical Engineering", "Mechanical Engineering", "VLSI", "Seismology", "Maths", "Physics" }));
        update_academic_detail_pane1.add(upd_fac_dep_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 54, 200, 27));

        update_faculty_form.add(update_academic_detail_pane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 431, 847, 120));

        close_student_form3.setBackground(new java.awt.Color(0, 153, 153));
        close_student_form3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        close_student_form3.setForeground(new java.awt.Color(255, 255, 255));
        close_student_form3.setText("Close");
        close_student_form3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_student_form3ActionPerformed(evt);
            }
        });
        update_faculty_form.add(close_student_form3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 85, 32));

        update_student_button1.setBackground(new java.awt.Color(0, 0, 255));
        update_student_button1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        update_student_button1.setForeground(new java.awt.Color(255, 255, 255));
        update_student_button1.setText("Update Details");
        update_student_button1.setEnabled(false);
        update_student_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_student_button1ActionPerformed(evt);
            }
        });
        update_faculty_form.add(update_student_button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 610, 155, 32));

        id_query_field.setBackground(new java.awt.Color(240, 240, 240));
        update_faculty_form.add(id_query_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 140, 27));

        roll_query_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        roll_query_label1.setText("Enter ID :");
        update_faculty_form.add(roll_query_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 70, 27));

        search_label_button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-24.png"))); // NOI18N
        search_label_button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_label_button1MouseClicked(evt);
            }
        });
        update_faculty_form.add(search_label_button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 31, 32));

        reset_stud_button5.setBackground(new java.awt.Color(0, 255, 255));
        reset_stud_button5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        reset_stud_button5.setText("Reset Changes");
        reset_stud_button5.setEnabled(false);
        reset_stud_button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_stud_button5ActionPerformed(evt);
            }
        });
        update_faculty_form.add(reset_stud_button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 608, 110, 32));

        center.add(update_faculty_form, "card3");

        search_faculty_form.setMaximumSize(new java.awt.Dimension(1020, 660));
        search_faculty_form.setPreferredSize(new java.awt.Dimension(1020, 660));
        search_faculty_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_stu_title1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        search_stu_title1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        search_stu_title1.setText("Search Faculty");
        search_faculty_form.add(search_stu_title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 200, 45));
        search_faculty_form.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1000, 1));

        search_stu_roll_field1.setBackground(new java.awt.Color(240, 240, 240));
        search_faculty_form.add(search_stu_roll_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 110, 27));

        search_stu_roll_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_stu_roll_label1.setText("Enter ID :");
        search_faculty_form.add(search_stu_roll_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 70, 27));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        search_faculty_form.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, -1, 27));

        search_stu_course_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_stu_course_label1.setText("Designation : ");
        search_faculty_form.add(search_stu_course_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 90, 27));

        search_fac_desg_opt.setBackground(new java.awt.Color(240, 240, 240));
        search_fac_desg_opt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        search_fac_desg_opt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Designation--", "Professor", "Asst. Professor", "Guest Faculty", " " }));
        search_faculty_form.add(search_fac_desg_opt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, 120, 27));

        search_stu_branch_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_stu_branch_label1.setText("Department :");
        search_faculty_form.add(search_stu_branch_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, 90, 27));

        search_fac_dep_opt.setBackground(new java.awt.Color(240, 240, 240));
        search_fac_dep_opt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        search_fac_dep_opt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Branch--", "Computer Science", "Information Technology", "Civil Engineering", "Electronics and Communication Enginnering", "Electrical Engineering", "Mechanical Engineering", "VLSI", "Seismology", "Maths", "Physics", " " }));
        search_faculty_form.add(search_fac_dep_opt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 600, 120, 27));

        search_stu_option1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-24.png"))); // NOI18N
        search_stu_option1.setLabelFor(search_stu_roll_field);
        search_stu_option1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_stu_option1MouseClicked(evt);
            }
        });
        search_faculty_form.add(search_stu_option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 25, 27));

        listButton2.setBackground(new java.awt.Color(51, 51, 255));
        listButton2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        listButton2.setForeground(new java.awt.Color(255, 255, 255));
        listButton2.setText("List");
        listButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listButton2ActionPerformed(evt);
            }
        });
        search_faculty_form.add(listButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 600, 70, 27));

        jScrollPane3.setMaximumSize(new java.awt.Dimension(1020, 660));
        jScrollPane3.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(1020, 660));

        jTable3.setBackground(new java.awt.Color(240, 240, 240));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Date of Birth", "Gender", "Email", "Phone", "Address", "PIN Code", "Designation", "Department", "Date of Join"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable3.getColumnModel().getColumn(1).setMaxWidth(200);
            jTable3.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTable3.getColumnModel().getColumn(5).setPreferredWidth(130);
            jTable3.getColumnModel().getColumn(6).setPreferredWidth(150);
            jTable3.getColumnModel().getColumn(6).setMaxWidth(200);
            jTable3.getColumnModel().getColumn(8).setPreferredWidth(150);
            jTable3.getColumnModel().getColumn(9).setPreferredWidth(250);
        }

        search_faculty_form.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1000, 440));

        search_stu_yod_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search_stu_yod_label1.setText("Year Of Joining :");
        search_faculty_form.add(search_stu_yod_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, 110, 27));

        search_stu_yod_field1.setBackground(new java.awt.Color(240, 240, 240));
        search_faculty_form.add(search_stu_yod_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, 75, 27));

        close_search_stu1.setBackground(new java.awt.Color(0, 153, 153));
        close_search_stu1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        close_search_stu1.setForeground(new java.awt.Color(255, 255, 255));
        close_search_stu1.setText("Back");
        close_search_stu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_search_stu1ActionPerformed(evt);
            }
        });
        search_faculty_form.add(close_search_stu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 86, 27));

        center.add(search_faculty_form, "card7");

        delete_faculty_form.setMaximumSize(new java.awt.Dimension(1020, 660));
        delete_faculty_form.setPreferredSize(new java.awt.Dimension(1020, 660));
        delete_faculty_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete_stu_title1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        delete_stu_title1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        delete_stu_title1.setText("Delete Faculty");
        delete_faculty_form.add(delete_stu_title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, 45));
        delete_faculty_form.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, 990, -1));

        delete_fac_id_field.setBackground(new java.awt.Color(240, 240, 240));
        delete_faculty_form.add(delete_fac_id_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 110, 27));

        delete_stu_roll_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        delete_stu_roll_label1.setLabelFor(delete_fac_id_field);
        delete_stu_roll_label1.setText("Enter ID : ");
        delete_faculty_form.add(delete_stu_roll_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 70, 27));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        delete_faculty_form.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, -1, 27));

        delete_stu_course_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        delete_stu_course_label1.setText("Designation : ");
        delete_faculty_form.add(delete_stu_course_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, 90, 27));

        delete_fac_desg_opt.setBackground(new java.awt.Color(240, 240, 240));
        delete_fac_desg_opt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        delete_fac_desg_opt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Designation--", "Professor", "Asst. Professor", "Guest Faculty" }));
        delete_faculty_form.add(delete_fac_desg_opt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 140, 27));

        delete_stu_branch_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        delete_stu_branch_label1.setText("Department : ");
        delete_faculty_form.add(delete_stu_branch_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 90, 27));

        delete_fac_dep_opt.setBackground(new java.awt.Color(240, 240, 240));
        delete_fac_dep_opt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        delete_fac_dep_opt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Department--", "Computer Science", "Information Technology", "Civil Engineering", "Electronics and Communication Enginnering", "Electrical Engineering", "Mechanical Engineering", "VLSI", "Seismology", "Maths", "Physics" }));
        delete_faculty_form.add(delete_fac_dep_opt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, 150, 27));

        delete_stu_option1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-24.png"))); // NOI18N
        delete_stu_option1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_stu_option1MouseClicked(evt);
            }
        });
        delete_faculty_form.add(delete_stu_option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 25, 27));

        listButton3.setBackground(new java.awt.Color(51, 102, 255));
        listButton3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        listButton3.setForeground(new java.awt.Color(255, 255, 255));
        listButton3.setText("List");
        listButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listButton3ActionPerformed(evt);
            }
        });
        delete_faculty_form.add(listButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 560, 70, 27));

        jScrollPane4.setMaximumSize(new java.awt.Dimension(1020, 660));
        jScrollPane4.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(980, 660));

        jTable5.setBackground(new java.awt.Color(240, 240, 240));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Date of Birth", "Gender", "Email", "Phone", "Address", "PIN Code", "Designation", "Department", "Date of Join"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable5.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable5.getTableHeader().setReorderingAllowed(false);
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable5.getColumnModel().getColumn(1).setMaxWidth(200);
            jTable5.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTable5.getColumnModel().getColumn(5).setPreferredWidth(130);
            jTable5.getColumnModel().getColumn(6).setPreferredWidth(150);
            jTable5.getColumnModel().getColumn(6).setMaxWidth(200);
            jTable5.getColumnModel().getColumn(8).setPreferredWidth(150);
            jTable5.getColumnModel().getColumn(9).setPreferredWidth(250);
        }

        delete_faculty_form.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 990, 460));

        delete_stu_yod_label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        delete_stu_yod_label1.setText("Year Of Joining");
        delete_faculty_form.add(delete_stu_yod_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, 100, 27));

        delete_fac_year_field.setBackground(new java.awt.Color(240, 240, 240));
        delete_faculty_form.add(delete_fac_year_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 560, 75, 27));

        close_delete_stu1.setBackground(new java.awt.Color(0, 153, 153));
        close_delete_stu1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        close_delete_stu1.setForeground(new java.awt.Color(255, 255, 255));
        close_delete_stu1.setText("Back");
        close_delete_stu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_delete_stu1ActionPerformed(evt);
            }
        });
        delete_faculty_form.add(close_delete_stu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 86, 27));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete Record");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        delete_faculty_form.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, 130, 27));

        center.add(delete_faculty_form, "card7");

        assign_subj.setMaximumSize(new java.awt.Dimension(1020, 660));
        assign_subj.setPreferredSize(new java.awt.Dimension(1020, 660));
        assign_subj.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upd_stud_form_title2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        upd_stud_form_title2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        upd_stud_form_title2.setText("Assign Faculty");
        assign_subj.add(upd_stud_form_title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 233, -1));
        assign_subj.add(lineSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 990, -1));

        close_student_form4.setBackground(new java.awt.Color(0, 153, 153));
        close_student_form4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        close_student_form4.setForeground(new java.awt.Color(255, 255, 255));
        close_student_form4.setText("Close");
        close_student_form4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_student_form4ActionPerformed(evt);
            }
        });
        assign_subj.add(close_student_form4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 85, 32));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Subject :");
        assign_subj.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Faculty ID : ");
        assign_subj.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, 27));

        fac_id_field.setBackground(new java.awt.Color(240, 240, 240));
        fac_id_field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        assign_subj.add(fac_id_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 120, 27));

        jButton3.setBackground(new java.awt.Color(0, 255, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Assign");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        assign_subj.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 110, 27));

        subj_field.setBackground(new java.awt.Color(240, 240, 240));
        subj_field.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        subj_field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        assign_subj.add(subj_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 120, 27));

        center.add(assign_subj, "card3");

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
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(244, Short.MAX_VALUE))
        );

        center.add(change_password_panel, "card6");

        rootPane.add(center, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 1020, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OnClick(javax.swing.JPanel p1)
    {
        p1.setBackground(new java.awt.Color(240,240,240));
    }
    private void onLeave(javax.swing.JPanel p1)
    {
        p1.setBackground(new java.awt.Color(51,204,255));
    }
    
    private void handleCentre(int arg)
    {
        switch(arg)
        {
            case 0: Welcome.setVisible(true);
                    student_home.setVisible(false);
                    faculty_home.setVisible(false);
                    change_password_panel.setVisible(false);
                    add_student_form.setVisible(false);
                    update_student_form.setVisible(false);
                    search_student_form.setVisible(false);
                    delete_student_form.setVisible(false);
                    add_faculty_form.setVisible(false);
                    update_faculty_form.setVisible(false);
                    search_faculty_form.setVisible(false);
                    delete_faculty_form.setVisible(false);
                    break;
            case 1 :Welcome.setVisible(false);
                    student_home.setVisible(true);
                    faculty_home.setVisible(false);
                    change_password_panel.setVisible(false);
                    add_student_form.setVisible(false);
                    update_student_form.setVisible(false);
                    search_student_form.setVisible(false);
                    delete_student_form.setVisible(false);
                    add_faculty_form.setVisible(false);
                    update_faculty_form.setVisible(false);
                    search_faculty_form.setVisible(false);
                    delete_faculty_form.setVisible(false);
                    break;
            case 2: Welcome.setVisible(false);
                    student_home.setVisible(false);
                    faculty_home.setVisible(true);
                    change_password_panel.setVisible(false);
                    add_student_form.setVisible(false);
                    update_student_form.setVisible(false);
                    search_student_form.setVisible(false);
                    delete_student_form.setVisible(false);
                    add_faculty_form.setVisible(false);
                    update_faculty_form.setVisible(false);
                    search_faculty_form.setVisible(false);
                    delete_faculty_form.setVisible(false);
                    break;
            case 3: Welcome.setVisible(false);
                    student_home.setVisible(false);
                    faculty_home.setVisible(false);
                    change_password_panel.setVisible(true);
                    add_student_form.setVisible(false);
                    update_student_form.setVisible(false);
                    search_student_form.setVisible(false);
                    delete_student_form.setVisible(false);
                    add_faculty_form.setVisible(false);
                    update_faculty_form.setVisible(false);
                    search_faculty_form.setVisible(false);
                    delete_faculty_form.setVisible(false);
                    break;
            case 11:Welcome.setVisible(false);
                    student_home.setVisible(false);
                    faculty_home.setVisible(false);
                    change_password_panel.setVisible(false);
                    add_student_form.setVisible(true);
                    update_student_form.setVisible(false);
                    search_student_form.setVisible(false);
                    delete_student_form.setVisible(false);
                    add_faculty_form.setVisible(false);
                    update_faculty_form.setVisible(false);
                    search_faculty_form.setVisible(false);
                    delete_faculty_form.setVisible(false);
                    break;
            case 12:Welcome.setVisible(false);
                    student_home.setVisible(false);
                    faculty_home.setVisible(false);
                    change_password_panel.setVisible(false);
                    add_student_form.setVisible(false);
                    update_student_form.setVisible(false);
                    search_student_form.setVisible(true);
                    delete_student_form.setVisible(false);
                    add_faculty_form.setVisible(false);
                    update_faculty_form.setVisible(false);
                    search_faculty_form.setVisible(false);
                    delete_faculty_form.setVisible(false);
                    break;
            case 13:Welcome.setVisible(false);
                    student_home.setVisible(false);
                    faculty_home.setVisible(false);
                    change_password_panel.setVisible(false);
                    add_student_form.setVisible(false);
                    update_student_form.setVisible(true);
                    search_student_form.setVisible(false);
                    delete_student_form.setVisible(false);
                    add_faculty_form.setVisible(false);
                    update_faculty_form.setVisible(false);
                    search_faculty_form.setVisible(false);
                    delete_faculty_form.setVisible(false);
                    break;
            case 14:Welcome.setVisible(false);
                    student_home.setVisible(false);
                    faculty_home.setVisible(false);
                    change_password_panel.setVisible(false);
                    add_student_form.setVisible(false);
                    update_student_form.setVisible(false);
                    search_student_form.setVisible(false);
                    delete_student_form.setVisible(true);
                    add_faculty_form.setVisible(false);
                    update_faculty_form.setVisible(false);
                    search_faculty_form.setVisible(false);
                    delete_faculty_form.setVisible(false);
                    break;
            case 21:Welcome.setVisible(false);
                    student_home.setVisible(false);
                    faculty_home.setVisible(false);
                    change_password_panel.setVisible(false);
                    add_student_form.setVisible(false);
                    update_student_form.setVisible(false);
                    search_student_form.setVisible(false);
                    delete_student_form.setVisible(false);
                    add_faculty_form.setVisible(true);
                    update_faculty_form.setVisible(false);
                    search_faculty_form.setVisible(false);
                    delete_faculty_form.setVisible(false);
                    break;
            case 22:Welcome.setVisible(false);
                    student_home.setVisible(false);
                    faculty_home.setVisible(false);
                    change_password_panel.setVisible(false);
                    add_student_form.setVisible(false);
                    update_student_form.setVisible(false);
                    search_student_form.setVisible(false);
                    delete_student_form.setVisible(false);
                    add_faculty_form.setVisible(false);
                    update_faculty_form.setVisible(false);
                    search_faculty_form.setVisible(true);
                    delete_faculty_form.setVisible(false);
                    break;
            case 23:Welcome.setVisible(false);
                    student_home.setVisible(false);
                    faculty_home.setVisible(false);
                    change_password_panel.setVisible(false);
                    add_student_form.setVisible(false);
                    update_student_form.setVisible(false);
                    search_student_form.setVisible(false);
                    delete_student_form.setVisible(false);
                    add_faculty_form.setVisible(false);
                    update_faculty_form.setVisible(true);
                    search_faculty_form.setVisible(false);
                    delete_faculty_form.setVisible(false);
                    break;
            case 24:Welcome.setVisible(false);
                    student_home.setVisible(false);
                    faculty_home.setVisible(false);
                    change_password_panel.setVisible(false);
                    add_student_form.setVisible(false);
                    update_student_form.setVisible(false);
                    search_student_form.setVisible(false);
                    delete_student_form.setVisible(false);
                    add_faculty_form.setVisible(false);
                    update_faculty_form.setVisible(false);
                    search_faculty_form.setVisible(false);
                    delete_faculty_form.setVisible(true);
                    break;
            default: Welcome.setVisible(true);
                    student_home.setVisible(false);
                    faculty_home.setVisible(false);
                    change_password_panel.setVisible(false);
                    add_student_form.setVisible(false);
                    update_student_form.setVisible(false);
                    search_student_form.setVisible(false);
                    delete_student_form.setVisible(false);
                    add_faculty_form.setVisible(false);
                    update_faculty_form.setVisible(false);
                    search_faculty_form.setVisible(false);
                    delete_faculty_form.setVisible(false);
                    break;
        }
    }
    
    private void student_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_optionMouseClicked
        // TODO add your handling code here:
        OnClick(student_option);
        onLeave(faculty_option);        
        handleCentre(1);        
    }//GEN-LAST:event_student_optionMouseClicked

    private void faculty_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faculty_optionMouseClicked
        // TODO add your handling code here:
        onLeave(student_option);
        OnClick(faculty_option);
        handleCentre(2);
    }//GEN-LAST:event_faculty_optionMouseClicked

    private void add_student_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_student_optionMouseClicked
       handleCentre(11);
    }//GEN-LAST:event_add_student_optionMouseClicked

    private void close_student_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_student_formActionPerformed
        handleCentre(1);
    }//GEN-LAST:event_close_student_formActionPerformed

    private void user_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_optionMouseClicked
        // TODO add your handling code here:
        handleCentre(0);
        onLeave(student_option);
        onLeave(faculty_option);
    }//GEN-LAST:event_user_optionMouseClicked

    private void course_fieldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_course_fieldItemStateChanged
        ArrayList<String> array = new ArrayList<>();
        Iterator<String> it;
        if(course_field.getSelectedItem().equals("B. Tech"))
        {
            array.add("Computer Science");
            array.add("Information Technology");
            array.add("Civil Engineering");
            array.add("Electronics and Communication Enginnering");
            array.add("Electrical Engineering");
            array.add("Mechanical Engineering");
            it=array.iterator();
            branch_field.removeAllItems();
            branch_field.addItem("--Select Branch--");
            while(it.hasNext())
            {
                branch_field.addItem(it.next());
            }
        }
        else if(course_field.getSelectedItem().equals("M. Tech"))
        {
            array.add("Computer Science");
            array.add("VLSI");
            array.add("Seismology");
            it=array.iterator();
            branch_field.removeAllItems();
            branch_field.addItem("--Select Branch--");
            while(it.hasNext())
            {
                branch_field.addItem(it.next());
            }
        }
        else if(course_field.getSelectedItem().equals("Phd"))
        {
            array.add("Maths");
            array.add("Physics");
            it=array.iterator();
            branch_field.removeAllItems();
            branch_field.addItem("--Select Branch--");
            while(it.hasNext())
            {
                branch_field.addItem(it.next());
            }
        }
        else
        {
            branch_field.removeAllItems();
            branch_field.addItem("--Select Branch--");
        }

    }//GEN-LAST:event_course_fieldItemStateChanged

    private void course_field1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_course_field1ItemStateChanged
        ArrayList<String> array = new ArrayList<>();
        Iterator<String> it;
        if(course_field1.getSelectedItem().equals("B. Tech"))
        {
            array.add("Computer Science");
            array.add("Information Technology");
            array.add("Civil Engineering");
            array.add("Electronics and Communication Enginnering");
            array.add("Electrical Engineering");
            array.add("Mechanical Engineering");
            it=array.iterator();
            branch_field1.removeAllItems();
            branch_field1.addItem("--Select Branch--");
            while(it.hasNext())
            {
                branch_field1.addItem(it.next());
            }
        }
        else if(course_field1.getSelectedItem().equals("M. Tech"))
        {
            array.add("Computer Science");
            array.add("VLSI");
            array.add("Seismology");
            it=array.iterator();
            branch_field1.removeAllItems();
            branch_field1.addItem("--Select Branch--");
            while(it.hasNext())
            {
                branch_field1.addItem(it.next());
            }
        }
        else if(course_field1.getSelectedItem().equals("Phd"))
        {
            array.add("Maths");
            array.add("Physics");
            it=array.iterator();
            branch_field1.removeAllItems();
            branch_field1.addItem("--Select Branch--");
            while(it.hasNext())
            {
                branch_field1.addItem(it.next());
            }
        }
        else
        {
            branch_field1.removeAllItems();
            branch_field1.addItem("--Select Branch--");
        }
    }//GEN-LAST:event_course_field1ItemStateChanged

    private void close_student_form1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_student_form1ActionPerformed
        handleCentre(1);
        f=null;
    }//GEN-LAST:event_close_student_form1ActionPerformed

    private void search_label_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_label_buttonMouseClicked
        this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
        if(roll_query_field.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Roll Number","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            long roll=0;
            try
            {
                roll=Long.parseLong(roll_query_field.getText().trim());
            }
            catch(NumberFormatException nf)
            {
                javax.swing.JOptionPane.showMessageDialog(null,"Enter numeric data","Error",JOptionPane.ERROR_MESSAGE);
            }
            f=DBManager.getRecord(roll);
            if(f!=null)
            {
                getDetails(f);
                update_personal_detail_pane.setVisible(true);
                update_communication_detail_pane.setVisible(true);
                update_academic_detail_pane.setVisible(true);
                reset_stud_button1.setEnabled(true);
                reset_stud_button2.setEnabled(true);
                update_student_button.setEnabled(true);
            }
            else
                javax.swing.JOptionPane.showMessageDialog(null,"No Record Found","Error",JOptionPane.ERROR_MESSAGE);
        }
        this.setCursor(java.awt.Cursor.getDefaultCursor());
    }//GEN-LAST:event_search_label_buttonMouseClicked
    private void getDetails(Form_Data fd) {
        fname_field1.setText(fd.getfName());
        mName_field1.setText(fd.getmName());
        lName_field1.setText(fd.getlName());
        switch(fd.getGender())
        {
            case 'm':
            case 'M': upd_stud_male.setSelected(true);
                      upd_stud_female.setSelected(false);
                      upd_stud_other.setSelected(false);
                      break;
            case 'f':
            case 'F': upd_stud_male.setSelected(false);
                      upd_stud_female.setSelected(true);
                      upd_stud_other.setSelected(false);
                      break;
            case 'o':
            case 'O': upd_stud_male.setSelected(false);
                      upd_stud_female.setSelected(false);
                      upd_stud_other.setSelected(true);
                      break;
            default : upd_stud_male.setSelected(false);
                      upd_stud_female.setSelected(false);
                      upd_stud_other.setSelected(false);
        }
        java.text.DateFormat df = new java.text.SimpleDateFormat("dd-MM-yyyy");
        java.util.Date d=new java.util.Date();
        System.out.println(fd.SQLtoInp());
        try {
            d=df.parse(fd.SQLtoInp());
        } catch (ParseException ex) {
            System.out.println("Parse Error!");
        }
        dob_field1.setDate(d);
        email_field1.setText(fd.getEmail());
        mob_field1.setText(String.valueOf(fd.getMob()));
        address_field1.setText(fd.getAddress());
        pin_field1.setText(String.valueOf(fd.getPIN()));
        course_field1.setSelectedItem(fd.getCourse());
        ArrayList<String> array = new ArrayList<>();
        Iterator<String> it;
        if(course_field1.getSelectedItem().equals("B. Tech"))
        {
            array.removeAll(array);
            array.add("--Select Branch--");
            array.add("Computer Science");
            array.add("Information Technology");
            array.add("Civil Engineering");
            array.add("Electronics and Communication Enginnering");
            array.add("Electrical Engineering");
            array.add("Mechanical Engineering");
            it=array.iterator();
            branch_field1.removeAllItems();
            while(it.hasNext())
            {
                branch_field1.addItem(it.next());
            }
        }
        else if(course_field1.getSelectedItem().equals("M. Tech"))
        {
            array.removeAll(array);
            array.add("--Select Branch--");
            array.add("Computer Science");
            array.add("VLSI");
            array.add("Seismology");
            it=array.iterator();
            branch_field1.removeAllItems();
            while(it.hasNext())
            {
                branch_field1.addItem(it.next());
            }
        }
        else if(course_field1.getSelectedItem().equals("Phd"))
        {
            array.removeAll(array);
            array.add("--Select Branch--");
            array.add("Maths");
            array.add("Physics");
            it=array.iterator();
            branch_field1.removeAllItems();
            while(it.hasNext())
            {
                branch_field1.addItem(it.next());
            }
        }
        else
        {
            branch_field1.removeAllItems();
            array.removeAll(array);
            array.add("--Select Branch--");
            it=array.iterator();
            while(it.hasNext())
                branch_field1.addItem(it.next());
        }
        //System.out.println(array.indexOf(fd.getBranch())+" "+fd.getBranch());
        branch_field1.setSelectedIndex(array.indexOf(fd.getBranch()));
        sem_field1.setText(String.valueOf(fd.getSem()));
        yoa_field1.setText(String.valueOf(fd.getYOAdm()));
    }
    private void update_student_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_student_optionMouseClicked
        // TODO add your handling code here:
        handleCentre(13);
        update_personal_detail_pane.setVisible(false);
        update_communication_detail_pane.setVisible(false);
        update_academic_detail_pane.setVisible(false);
        roll_query_field.setText("");
        reset_stud_button1.setEnabled(false);
        update_student_button.setEnabled(false);
        reset_stud_button2.setEnabled(false);
    }//GEN-LAST:event_update_student_optionMouseClicked

    private void search_stu_course_optionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_search_stu_course_optionItemStateChanged
        // TODO add your handling code here:
        ArrayList<String> array = new ArrayList<>();
        Iterator<String> it;
        if(search_stu_course_option.getSelectedItem().equals("B. Tech"))
        {
            array.add("Computer Science");
            array.add("Information Technology");
            array.add("Civil Engineering");
            array.add("Electronics and Communication Enginnering");
            array.add("Electrical Engineering");
            array.add("Mechanical Engineering");
            it=array.iterator();
            search_stu_branch_option.removeAllItems();
            search_stu_branch_option.addItem("--Select Branch--");
            while(it.hasNext())
            {
                search_stu_branch_option.addItem(it.next());
            }
        }
        else if(search_stu_course_option.getSelectedItem().equals("M. Tech"))
        {
            array.add("Computer Science");
            array.add("VLSI");
            array.add("Seismology");
            it=array.iterator();
            search_stu_branch_option.removeAllItems();
            search_stu_branch_option.addItem("--Select Branch--");
            while(it.hasNext())
            {
                search_stu_branch_option.addItem(it.next());
            }
        }
        else if(search_stu_course_option.getSelectedItem().equals("Phd"))
        {
            array.add("Maths");
            array.add("Physics");
            it=array.iterator();
            search_stu_branch_option.removeAllItems();
            search_stu_branch_option.addItem("--Select Branch--");
            while(it.hasNext())
            {
                search_stu_branch_option.addItem(it.next());
            }
        }
        else
        {
            search_stu_branch_option.removeAllItems();
            search_stu_branch_option.addItem("--Select Branch--");
            search_stu_branch_option.addItem("Computer Science");
            search_stu_branch_option.addItem("Information Technology");
            search_stu_branch_option.addItem("Civil Engineering");
            search_stu_branch_option.addItem("Electronics and Communication Enginnering");
            search_stu_branch_option.addItem("Electrical Engineering");
            search_stu_branch_option.addItem("Mechanical Engineering");
            search_stu_branch_option.addItem("VLSI");
            search_stu_branch_option.addItem("Seismology");
            search_stu_branch_option.addItem("Maths");
            search_stu_branch_option.addItem("Physics");
        }
        
    }//GEN-LAST:event_search_stu_course_optionItemStateChanged

    private void close_search_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_search_stuActionPerformed
        // TODO add your handling code here:
        handleCentre(1);
        javax.swing.table.DefaultTableModel dm =(javax.swing.table.DefaultTableModel) jTable1.getModel();
        //System.out.println(jTable1.getRowCount());
        for(int i=jTable1.getRowCount()-1;i>=0;i--)
            dm.removeRow(i);
    }//GEN-LAST:event_close_search_stuActionPerformed

    private void search_student_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_student_optionMouseClicked
        // TODO add your handling code here:
        handleCentre(12);
    }//GEN-LAST:event_search_student_optionMouseClicked

    private void delete_stu_course_optionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_delete_stu_course_optionItemStateChanged
        // TODO add your handling code here:
        ArrayList<String> array = new ArrayList<>();
        Iterator<String> it;
        if(delete_stu_course_option.getSelectedItem().equals("B. Tech"))
        {
            array.add("Computer Science");
            array.add("Information Technology");
            array.add("Civil Engineering");
            array.add("Electronics and Communication Enginnering");
            array.add("Electrical Engineering");
            array.add("Mechanical Engineering");
            it=array.iterator();
            delete_stu_branch_option.removeAllItems();
            delete_stu_branch_option.addItem("--Select Branch--");
            while(it.hasNext())
            {
                delete_stu_branch_option.addItem(it.next());
            }
        }
        else if(delete_stu_course_option.getSelectedItem().equals("M. Tech"))
        {
            array.add("Computer Science");
            array.add("VLSI");
            array.add("Seismology");
            it=array.iterator();
            delete_stu_branch_option.removeAllItems();
            delete_stu_branch_option.addItem("--Select Branch--");
            while(it.hasNext())
            {
                delete_stu_branch_option.addItem(it.next());
            }
        }
        else if(delete_stu_course_option.getSelectedItem().equals("Phd"))
        {
            array.add("Maths");
            array.add("Physics");
            it=array.iterator();
            delete_stu_branch_option.removeAllItems();
            delete_stu_branch_option.addItem("--Select Branch--");
            while(it.hasNext())
            {
                delete_stu_branch_option.addItem(it.next());
            }
        }
        else
        {
            delete_stu_branch_option.removeAllItems();
            delete_stu_branch_option.addItem("--Select Branch--");
            delete_stu_branch_option.addItem("Computer Science");
            delete_stu_branch_option.addItem("Information Technology");
            delete_stu_branch_option.addItem("Civil Engineering");
            delete_stu_branch_option.addItem("Electronics and Communication Enginnering");
            delete_stu_branch_option.addItem("Electrical Engineering");
            delete_stu_branch_option.addItem("Mechanical Engineering");
            delete_stu_branch_option.addItem("VLSI");
            delete_stu_branch_option.addItem("Seismology");
            delete_stu_branch_option.addItem("Maths");
            delete_stu_branch_option.addItem("Physics");
        }
    }//GEN-LAST:event_delete_stu_course_optionItemStateChanged

    private void close_delete_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_delete_stuActionPerformed
        handleCentre(1);
        javax.swing.table.DefaultTableModel dm =(javax.swing.table.DefaultTableModel) jTable2.getModel();
        for(int i =jTable2.getRowCount()-1;i>=0;i--)
            dm.removeRow(i);
        jButton1.setEnabled(false);
    }//GEN-LAST:event_close_delete_stuActionPerformed

    private void delete_student_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_student_optionMouseClicked
        handleCentre(14);
        jButton1.setEnabled(false);
    }//GEN-LAST:event_delete_student_optionMouseClicked

    private void add_student_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_student_buttonActionPerformed
        String fn="",mn="",ln="",em="",cr="",br="",ad="",dob="01-01-1111";
        int pn = 0,s = 0,y = 0;
        long m = 0;
        fn=fname_field.getText().trim();
        mn=mName_field.getText().trim();
        ln=lName_field.getText().trim();
        em=email_field.getText().trim();
        ad=address_field.getText().trim();
        java.text.SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        dob=sdf.format(dob_field.getDate());
        try
        {
            pn=Integer.parseInt(pin_field.getText().trim());
            s=Integer.parseInt(sem_field.getText().trim());
            y=Integer.parseInt(yoa_field.getText().trim());
            m=Long.parseLong(mob_field.getText().trim());
        }
        catch(NumberFormatException nm)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Please enter numeric data in numeric fields!","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
            resetForm();
        }
        cr=course_field.getSelectedItem().toString();
        br=branch_field.getSelectedItem().toString();
        
        if(fn.equals(""))
        {
            validInput = false;
        }
        else if(ln.equals(""))
        {
            validInput=false;
        }
        else if(dob.equals("01-01-1111")||dob.equals(""))
        {
            validInput=false;
        }
        else if(genData=='0')
        {
            validInput=false;
        }
        else if(em.equals(""))
        {
            validInput=false;
        }
        else if(m==0)
        {
            validInput=false;
        }
        else if(pn==0)
        {
             validInput=false;       
        }
        else if(s==0)
        {
            validInput=false;
        }
        else if(y==0)
        {
            validInput=false;
        }
        else if(cr.equalsIgnoreCase("--Select Course--"))
        {
            validInput=false;
        }
        else if(br.equalsIgnoreCase("--Select Branch--"))
        {
            validInput=false;
        }
        else
        {
            validInput=true;
        }
        if(validInput)
        {
            Form_Data  fd = new Form_Data(fn,mn,ln,dob,genData,em,m,ad,pn,cr,br,s,y);
            if(DBManager.insertRecord(fd))
            {
                String txt="<html>Record Added\nRoll No. : <b>"+fd.getRoll()+"</b></html>";
                javax.swing.JLabel msg=new javax.swing.JLabel("<html>Record Added\nRoll No. : <b>"+fd.getRoll()+"</b></html>");
                javax.swing.JOptionPane.showMessageDialog(null,msg,"Done",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                resetForm();
            }
            else
            {
                javax.swing.JOptionPane.showMessageDialog(null,DBManager.err,"Failed",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            javax.swing.JOptionPane.showMessageDialog(null,"One or more fields are empty","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_add_student_buttonActionPerformed

    private void resetForm(){
        fname_field.setText("");
        mName_field.setText("");
        lName_field.setText("");
        address_field.setText("");
        mob_field.setText("");
        sem_field.setText("");
        yoa_field.setText("");
        dob_field=new com.toedter.calendar.JDateChooser();
        email_field.setText("");
        add_stud_bg.clearSelection();
        pin_field.setText("");
        course_field.setSelectedIndex(0);
        branch_field.setSelectedIndex(0);
    }
    
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        genData=jRadioButton1.getText().charAt(0);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        genData=jRadioButton2.getText().charAt(0);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        genData=jRadioButton3.getText().charAt(0);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void reset_stud_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_stud_buttonActionPerformed
        resetForm();
    }//GEN-LAST:event_reset_stud_buttonActionPerformed

    private void reset_stud_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_stud_button1ActionPerformed
        // TODO add your handling code here:
        roll_query_field.setText("");
        update_personal_detail_pane.setVisible(false);
        update_communication_detail_pane.setVisible(false);
        update_academic_detail_pane.setVisible(false);
        reset_stud_button1.setEnabled(false);
        reset_stud_button2.setEnabled(false);
        update_student_button.setEnabled(false);
    }//GEN-LAST:event_reset_stud_button1ActionPerformed

    private void reset_stud_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_stud_button2ActionPerformed
        getDetails(f);
    }//GEN-LAST:event_reset_stud_button2ActionPerformed

    private void update_student_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_student_buttonActionPerformed
        // TODO add your handling code here:
        String fn,mn,ln,em,cr,br,ad,dob="01-01-1111";
        int pn = 0,s = 0,y = 0;
        long m = 0,rn=0;
        genData=upd_stud_bg.getSelection().getActionCommand().charAt(0);
        fn=fname_field1.getText().trim();
        mn=mName_field1.getText().trim();
        ln=lName_field1.getText().trim();
        em=email_field1.getText().trim();
        ad=address_field1.getText().trim();
        //dob=dob_field1_upd.getText().trim();
        java.text.SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        dob=sdf.format(dob_field1.getDate());
        try
        {
            pn=Integer.parseInt(pin_field1.getText().trim());
            rn=Long.parseLong(roll_query_field.getText().trim());
            s=Integer.parseInt(sem_field1.getText().trim());
            y=Integer.parseInt(yoa_field1.getText().trim());
            m=Long.parseLong(mob_field1.getText().trim());
        }
        catch(NumberFormatException nm)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Please enter numeric data in numeric fields!","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
            resetForm();
        }
        cr=course_field1.getSelectedItem().toString();
        br=branch_field1.getSelectedItem().toString();

        if(fn.equals(""))
        {
            validInput = false;
        }
        else if(ln.equals(""))
        {
            validInput=false;
        }
        else if(dob.equals("01-01-1111")||dob.equals(""))
        {
            validInput=false;
        }
        else if(genData=='0')
        {
            validInput=false;
        }
        else if(em.equals(""))
        {
            validInput=false;
        }
        else if(m==0)
        {
            validInput=false;
        }
        else if(pn==0)
        {
             validInput=false;       
        }
        else if(s==0)
        {
            validInput=false;
        }
        else if(y==0)
        {
            validInput=false;
        }
        else if(cr.equalsIgnoreCase("--Select Course--"))
        {
            validInput=false;
        }
        else if(br.equalsIgnoreCase("--Select Branch--"))
        {
            validInput=false;
        }
        else
        {
            validInput=true;
        }
        if(validInput)
        {
            Form_Data  fd = new Form_Data();
            
            fd.setRoll(rn);
            
            fd.setfName(fn);
            fd.setmName(mn);
            fd.setlName(ln);
            fd.setDOB(dob);
            fd.setGender(genData);
            
            fd.setEmail(em);
            fd.setMob(m);
            fd.setAddress(ad);
            fd.setPIN(pn);
            
            fd.setCourse(cr);
            fd.setBranch(br);
            fd.setSem(s);
            fd.setYOAdm(y);
            
            if(DBManager.updateRecord(fd))
            {
                javax.swing.JOptionPane.showMessageDialog(null,"Success","Done",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                resetForm();
                reset_stud_button1.setEnabled(false);
                reset_stud_button2.setEnabled(false);
                update_student_button.setEnabled(false);
                update_personal_detail_pane.setVisible(false);
                update_communication_detail_pane.setVisible(false);
                update_academic_detail_pane.setVisible(false);
                roll_query_field.setText("");
            }
            else
            {
                javax.swing.JOptionPane.showMessageDialog(null,DBManager.err,"Failed",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            javax.swing.JOptionPane.showMessageDialog(null,"One or more fields are empty","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        f=null;
    }//GEN-LAST:event_update_student_buttonActionPerformed

    private void search_stu_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_stu_optionMouseClicked
        // TODO add your handling code here:
        this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
        jTable1.setRowSorter(new javax.swing.table.TableRowSorter<>(jTable1.getModel()));
        if(search_stu_roll_field.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Roll Number","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else
        {
            long roll=0;
            try
            {
                roll=Long.parseLong(search_stu_roll_field.getText().trim());
            }
            catch(NumberFormatException nf)
            {
                javax.swing.JOptionPane.showMessageDialog(null,"Enter numeric data","Error",JOptionPane.ERROR_MESSAGE);
            }
            //System.out.println(roll);
            f=DBManager.getRecord(roll);
            if(f!=null)
            {
                Vector<Object> rowData=SearchManager.convertToVector(f);
                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)jTable1.getModel();
                model.addRow(rowData);
            }
            else
                javax.swing.JOptionPane.showMessageDialog(null,"No Record Found","Error",JOptionPane.ERROR_MESSAGE);
        }
        this.setCursor(java.awt.Cursor.getDefaultCursor());
    }//GEN-LAST:event_search_stu_optionMouseClicked

    private void delete_stu_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_stu_optionMouseClicked
        // TODO add your handling code here:
        this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
        jButton1.setEnabled(false);
        javax.swing.table.DefaultTableModel model=(javax.swing.table.DefaultTableModel)jTable2.getModel();
        for(int i = jTable2.getRowCount()-1;i>=0;i--)
            model.removeRow(i);
        if(delete_stu_roll_field.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Roll Number","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            long roll=0;
            try
            {
                roll=Long.parseLong(delete_stu_roll_field.getText().trim());
            }
            catch(NumberFormatException nf)
            {
                javax.swing.JOptionPane.showMessageDialog(null,"Enter numeric data","Error",JOptionPane.ERROR_MESSAGE);
            }
            f=DBManager.getRecord(roll);
            if(f!=null)
            {
                getDetails(f);
                Vector<Object> rowData=SearchManager.convertToVector(f);
                model.addRow(rowData);
            }
            else
                javax.swing.JOptionPane.showMessageDialog(null,"No Record Found","Error",JOptionPane.ERROR_MESSAGE);
        }
        this.setCursor(java.awt.Cursor.getDefaultCursor());

    }//GEN-LAST:event_delete_stu_optionMouseClicked

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButtonActionPerformed
        this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
        java.util.Vector<Vector> rowData=new Vector<>();
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)jTable1.getModel();
        for(int i=jTable1.getRowCount()-1;i>=0;i--)
            model.removeRow(i);
        jTable1.setRowSorter(new javax.swing.table.TableRowSorter<>(model));
        if(search_stu_course_option.getSelectedIndex()==0 && search_stu_branch_option.getSelectedIndex()==0&& search_stu_yod_field.getText().trim().equals(""))
        {
            rowData=DBManager.listAllRecord();
        }
        else if(search_stu_course_option.getSelectedIndex()==0 &&search_stu_branch_option.getSelectedIndex()==0)
        {
            int y=0;
            try
            {
                y=Integer.parseInt(search_stu_yod_field.getText().trim());
            }catch(NumberFormatException nm)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Year should be numeric", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            rowData=DBManager.getRecord(y);
        }
        else if(search_stu_course_option.getSelectedIndex()==0 && search_stu_yod_field.getText().trim().equals(""))
        {
            rowData=DBManager.getRecordOnBranch(search_stu_branch_option.getSelectedItem().toString());
        }
        else if(search_stu_branch_option.getSelectedIndex()==0 && search_stu_yod_field.getText().trim().equals(""))
        {
            rowData=DBManager.getRecordOnCourse(search_stu_course_option.getSelectedItem().toString());
        }
        else if(search_stu_branch_option.getSelectedIndex()==0)
        {
            int y=0;
            try
            {
                y=Integer.parseInt(search_stu_yod_field.getText().trim());
            }catch(NumberFormatException nm)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Year should be numeric", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            rowData=DBManager.getRecordOnCourse(search_stu_course_option.getSelectedItem().toString(), y);
        }
        else if(search_stu_course_option.getSelectedIndex()==0)
        {
            int y=0;
            try
            {
                y=Integer.parseInt(search_stu_yod_field.getText().trim());
            }catch(NumberFormatException nm)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Year should be numeric", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            rowData=DBManager.getRecordOnBranch(search_stu_branch_option.getSelectedItem().toString(), y);
        }
        else if(search_stu_yod_field.getText().trim().equals(""))
        {
            rowData=DBManager.getRecord(search_stu_course_option.getSelectedItem().toString(), search_stu_branch_option.getSelectedItem().toString());
        }
        else
        {
            int y=0;
            try
            {
                y=Integer.parseInt(search_stu_yod_field.getText().trim());
            }catch(NumberFormatException nm)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Year should be numeric", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            rowData=DBManager.getRecord(search_stu_course_option.getSelectedItem().toString(), search_stu_branch_option.getSelectedItem().toString(), y);
        }
        
        if(!rowData.isEmpty())
        {
            for(int i=0;i<rowData.size();i++)
                model.addRow(rowData.get(i));
        }
        else
            javax.swing.JOptionPane.showMessageDialog(null, "No Records", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        this.setCursor(java.awt.Cursor.getDefaultCursor());
        System.out.println(jTable1.getRowCount());
    }//GEN-LAST:event_listButtonActionPerformed

    private void listButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButton1ActionPerformed
        this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
        jButton1.setEnabled(false);
        java.util.Vector<Vector> rowData=new Vector<>();
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)jTable2.getModel();
        jTable2.setColumnSelectionAllowed(false);
        for(int i=jTable2.getRowCount()-1;i>=0;i--)
            model.removeRow(i);
        jTable1.setRowSorter(new javax.swing.table.TableRowSorter<>(model));
        if(delete_stu_course_option.getSelectedIndex()==0 && delete_stu_branch_option.getSelectedIndex()==0&& delete_stu_yod_field.getText().trim().equals(""))
        {
            rowData=DBManager.listAllRecord();
        }
        else if(delete_stu_course_option.getSelectedIndex()==0 &&delete_stu_branch_option.getSelectedIndex()==0)
        {
            int y=0;
            try
            {
                y=Integer.parseInt(delete_stu_yod_field.getText().trim());
            }catch(NumberFormatException nm)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Year should be numeric", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            rowData=DBManager.getRecord(y);
        }
        else if(delete_stu_course_option.getSelectedIndex()==0 && delete_stu_yod_field.getText().trim().equals(""))
        {
            rowData=DBManager.getRecordOnBranch(search_stu_branch_option.getSelectedItem().toString());
        }
        else if(delete_stu_branch_option.getSelectedIndex()==0 && delete_stu_yod_field.getText().trim().equals(""))
        {
            rowData=DBManager.getRecordOnCourse(delete_stu_course_option.getSelectedItem().toString());
        }
        else if(delete_stu_branch_option.getSelectedIndex()==0)
        {
            int y=0;
            try
            {
                y=Integer.parseInt(delete_stu_yod_field.getText().trim());
            }catch(NumberFormatException nm)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Year should be numeric", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            rowData=DBManager.getRecordOnCourse(delete_stu_course_option.getSelectedItem().toString(), y);
        }
        else if(delete_stu_course_option.getSelectedIndex()==0)
        {
            int y=0;
            try
            {
                y=Integer.parseInt(delete_stu_yod_field.getText().trim());
            }catch(NumberFormatException nm)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Year should be numeric", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            rowData=DBManager.getRecordOnBranch(delete_stu_branch_option.getSelectedItem().toString(), y);
        }
        else if(delete_stu_yod_field.getText().trim().equals(""))
        {
            rowData=DBManager.getRecord(delete_stu_course_option.getSelectedItem().toString(), delete_stu_branch_option.getSelectedItem().toString());
        }
        else
        {
            int y=0;
            try
            {
                y=Integer.parseInt(delete_stu_yod_field.getText().trim());
            }catch(NumberFormatException nm)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Year should be numeric", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            rowData=DBManager.getRecord(delete_stu_course_option.getSelectedItem().toString(), delete_stu_branch_option.getSelectedItem().toString(), y);
        }
        
        if(!rowData.isEmpty())
        {
            for(int i=0;i<rowData.size();i++)
                model.addRow(rowData.get(i));
        }
        else
            javax.swing.JOptionPane.showMessageDialog(null, "No Records", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        this.setCursor(java.awt.Cursor.getDefaultCursor());
        System.out.println(jTable1.getRowCount());
    }//GEN-LAST:event_listButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        if(!(jTable2.getSelectedRowCount()==0))
            jButton1.setEnabled(true);
        else
            jButton1.setEnabled(false);            
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        long roll = Long.parseLong(jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 0).toString().trim());
        if(DBManager.deleteRecord(roll))
            javax.swing.JOptionPane.showMessageDialog(null, "Record Deleted", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        else
            javax.swing.JOptionPane.showMessageDialog(null, DBManager.err, "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        javax.swing.table.DefaultTableModel dm = (javax.swing.table.DefaultTableModel)jTable2.getModel();
        for(int i=jTable2.getRowCount()-1;i>=0;i--)
        {
            dm.removeRow(i);
        }
        listButton1ActionPerformed(evt);    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void add_fac_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_fac_maleActionPerformed
        genData=add_fac_male.getActionCommand().charAt(0);
    }//GEN-LAST:event_add_fac_maleActionPerformed

    private void add_fac_femActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_fac_femActionPerformed
        genData=add_fac_fem.getActionCommand().charAt(0);
    }//GEN-LAST:event_add_fac_femActionPerformed

    private void add_fac_othActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_fac_othActionPerformed
        genData=add_fac_oth.getActionCommand().charAt(0);
    }//GEN-LAST:event_add_fac_othActionPerformed

    private void reset_stud_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_stud_button3ActionPerformed
        fname_field2.setText("");
        dob_field2=new com.toedter.calendar.JDateChooser();
        add_fac_bg.clearSelection();
        email_field2.setText("");
        pin_field2.setText("");
        address_field2.setText("");
        mob_field2.setText("");
        desg_field.setSelectedIndex(0);
        dep_field.setSelectedIndex(0);
    }//GEN-LAST:event_reset_stud_button3ActionPerformed

    private void close_student_form2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_student_form2ActionPerformed
        handleCentre(2);
        fname_field2.setText("");
        dob_field2=new com.toedter.calendar.JDateChooser();
        add_fac_bg.clearSelection();
        email_field2.setText("");
        pin_field2.setText("");
        address_field2.setText("");
        mob_field2.setText("");
        desg_field.setSelectedIndex(0);
        dep_field.setSelectedIndex(0);
    }//GEN-LAST:event_close_student_form2ActionPerformed

    private void add_facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_facActionPerformed
        Faculty f;
        String nam,dob,em,add,dep,desg,sj;
        int pin=0;
        long mob=0;
        nam=fname_field2.getText().trim();
        java.text.SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        dob=sdf.format(dob_field2.getDate());
        em=email_field2.getText().trim();
        add=address_field2.getText().trim();
        dep=dep_field.getSelectedItem().toString();
        desg=desg_field.getSelectedItem().toString();
        try
        {
            pin=Integer.parseInt(pin_field2.getText().trim());
            mob=Long.parseLong(mob_field2.getText().trim());
        }
        catch(NumberFormatException e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Enter numeric data in numeric field","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        if(nam.equals("")||dob.equals("")||add_fac_bg.getSelection()==null||em.equals("")||mob==0||add.equals("")||pin==0||dep_field.getSelectedIndex()==0||desg_field.getSelectedIndex()==0)
        {
            validInput = false;
        }
        else
            validInput = true;
        
        if(validInput)
        {
            f=new Faculty(nam,dob,genData,em,mob,add,pin,desg,dep);
            if(faculty_db.addFaculty(f))
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Record Added\nID : "+f.getID(), "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                fname_field2.setText("");
                dob_field2=new com.toedter.calendar.JDateChooser();
                add_fac_bg.clearSelection();
                email_field2.setText("");
                pin_field2.setText("");
                address_field2.setText("");
                mob_field2.setText("");
                desg_field.setSelectedIndex(0);
                dep_field.setSelectedIndex(0);
            }
            else
            {
                fname_field2.setText("");
                dob_field3=new com.toedter.calendar.JDateChooser();
                add_fac_bg.clearSelection();
                email_field2.setText("");
                pin_field2.setText("");
                address_field2.setText("");
                mob_field2.setText("");
                desg_field.setSelectedIndex(0);
                dep_field.setSelectedIndex(0);
                javax.swing.JOptionPane.showMessageDialog(null, "Failed", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            javax.swing.JOptionPane.showMessageDialog(null,"One or more fields are Empty","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_add_facActionPerformed

    private void close_student_form3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_student_form3ActionPerformed
        handleCentre(2);
        id_query_field.setText("");
        update_personal_detail_pane1.setVisible(false);
        update_communication_detail_pane1.setVisible(false);
        update_academic_detail_pane1.setVisible(false);
        reset_stud_button5.setEnabled(false);
    }//GEN-LAST:event_close_student_form3ActionPerformed

    private void update_student_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_student_button1ActionPerformed
        Faculty f;
        String nam,dob="",em,add,dep,desg;
        int pin=0;
        long mob=0;
        nam=fname_field3.getText().trim();
        //dob=dob_field2_ad_f.getText().trim();
        em=email_field3.getText().trim();
        add=address_field3.getText().trim();
        dep=upd_fac_dep_field.getSelectedItem().toString();
        desg=upd_fac_desg_field.getSelectedItem().toString();
        java.text.SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        dob=sdf.format(dob_field3.getDate());
        try
        {
            pin=Integer.parseInt(pin_field3.getText().trim());
            mob=Long.parseLong(mob_field3.getText().trim());
        }
        catch(NumberFormatException e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Enter numeric data in numeric field","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
            mob=0;
            pin=0;
        }
        if(nam.equals("")||dob.equals("")||add_fac_bg.getSelection()==null||em.equals("")||mob==0||add.equals("")||pin==0||upd_fac_dep_field.getSelectedIndex()==0||upd_fac_desg_field.getSelectedIndex()==0)
        {
            validInput = false;
        }
        else
            validInput = true;
        
        if(validInput)
        {
            f=new Faculty();
            f.setID(id_query_field.getText().trim());
            f.setName(nam);
            f.setAddress(add);
            f.setDOB(dob);
            f.setGender(genData);
            f.setJoinDate(fc.getJoinDate());
            f.setEmail(em);
            f.setMob(mob);
            f.setPIN(pin);
            f.setDepartment(dep);
            f.setDesignation(desg);
            if(faculty_db.updFaculty(f))
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Record Updated\n", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                fname_field2.setText("");
                dob_field2=new com.toedter.calendar.JDateChooser();
                add_fac_bg.clearSelection();
                email_field2.setText("");
                pin_field2.setText("");
                address_field2.setText("");
                mob_field2.setText("");
                desg_field.setSelectedIndex(0);
                dep_field.setSelectedIndex(0);
                update_personal_detail_pane1.setVisible(false);
                update_communication_detail_pane1.setVisible(false);
                update_academic_detail_pane1.setVisible(false);
            }
            else
            {
                fname_field2.setText("");
                dob_field2=new com.toedter.calendar.JDateChooser();
                add_fac_bg.clearSelection();
                email_field2.setText("");
                pin_field2.setText("");
                address_field2.setText("");
                mob_field2.setText("");
                desg_field.setSelectedIndex(0);
                dep_field.setSelectedIndex(0);
                update_personal_detail_pane1.setVisible(false);
                update_communication_detail_pane1.setVisible(false);
                update_academic_detail_pane1.setVisible(false);
                javax.swing.JOptionPane.showMessageDialog(null, "Failed", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            javax.swing.JOptionPane.showMessageDialog(null,"One or more fields are Empty","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        id_query_field.setText("");
    }//GEN-LAST:event_update_student_button1ActionPerformed

    private void reset_stud_button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_stud_button5ActionPerformed
        fname_field3.setText(fc.getName());
        java.text.SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date date=new java.util.Date();
        try {
            date = sdf.parse(fc.getDOB());
        } catch (ParseException ex) {
            System.out.println("Parse Exception!");
        }
        dob_field3.setDate(date);
        email_field3.setText(fc.getEmail());
        mob_field3.setText(String.valueOf(fc.getMob()));
        pin_field3.setText(String.valueOf(fc.getPIN()));
        address_field3.setText(fc.getAddress());
        switch(fc.getGender())
        {
            case 'm':
            case 'M': upd_stud_male.setSelected(true);
                      upd_fac_fem.setSelected(false);
                      upd_stud_other.setSelected(false);
                      break;
            case 'f':
            case 'F': upd_stud_male.setSelected(false);
                      upd_fac_fem.setSelected(true);
                      upd_stud_other.setSelected(false);
                      break;
            case 'o':
            case 'O': upd_stud_male.setSelected(false);
                      upd_fac_fem.setSelected(false);
                      upd_stud_other.setSelected(true);
                      break;
            default : upd_stud_male.setSelected(false);
                      upd_fac_fem.setSelected(false);
                      upd_stud_other.setSelected(false);
        }
        upd_fac_desg_field.setSelectedItem(fc.getDesignation());
        upd_fac_dep_field.setSelectedItem(fc.getDepartment());
    }//GEN-LAST:event_reset_stud_button5ActionPerformed

    private void search_stu_option1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_stu_option1MouseClicked
        javax.swing.table.DefaultTableModel model =(javax.swing.table.DefaultTableModel)jTable3.getModel();
        for(int i=jTable3.getRowCount()-1;i>=0;i--)
            model.removeRow(i);
        if(search_stu_roll_field1.getText().trim().equals(""))
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Please enter ID!","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Faculty f = faculty_db.getRecord(search_stu_roll_field1.getText().trim());
            if(f!=null)
            {
                model.addRow(SearchManager.convertToVector(f));
            }
            else
                javax.swing.JOptionPane.showMessageDialog(null,"No Record Found","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_search_stu_option1MouseClicked

    private void listButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButton2ActionPerformed
        this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
        java.util.Vector<Vector> rowData=new Vector<>();
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)jTable3.getModel();
        for(int i=jTable3.getRowCount()-1;i>=0;i--)
            model.removeRow(i);
        jTable3.setRowSorter(new javax.swing.table.TableRowSorter<>(model));
        if(search_fac_desg_opt.getSelectedIndex()==0 && search_fac_dep_opt.getSelectedIndex()==0&& search_stu_yod_field1.getText().trim().equals(""))
        {
            rowData=faculty_db.listAllRecord();
        }
        else if(search_fac_desg_opt.getSelectedIndex()==0 &&search_fac_dep_opt.getSelectedIndex()==0)
        {
            int y=0;
            try
            {
                y=Integer.parseInt(search_stu_yod_field1.getText().trim());
            }catch(NumberFormatException nm)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Year should be numeric", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            rowData=faculty_db.getRecordOnYear(y);
        }
        else if(search_fac_desg_opt.getSelectedIndex()==0 && search_stu_yod_field1.getText().trim().equals(""))
        {
            rowData=faculty_db.getRecordOnDepartment(search_fac_dep_opt.getSelectedItem().toString());
        }
        else if(search_fac_dep_opt.getSelectedIndex()==0 && search_stu_yod_field1.getText().trim().equals(""))
        {
            rowData=faculty_db.getRecordOnDesignation(search_fac_desg_opt.getSelectedItem().toString());
        }
        else if(search_fac_dep_opt.getSelectedIndex()==0)
        {
            int y=0;
            try
            {
                y=Integer.parseInt(search_stu_yod_field1.getText().trim());
            }catch(NumberFormatException nm)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Year should be numeric", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            rowData=faculty_db.getRecordOnDesgNYear(search_fac_desg_opt.getSelectedItem().toString(), y);
        }
        else if(search_fac_desg_opt.getSelectedIndex()==0)
        {
            int y=0;
            try
            {
                y=Integer.parseInt(search_stu_yod_field1.getText().trim());
            }catch(NumberFormatException nm)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Year should be numeric", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            rowData=faculty_db.getRecordOnDepNYear(search_fac_dep_opt.getSelectedItem().toString(), y);
        }
        else if(search_stu_yod_field1.getText().trim().equals(""))
        {
            rowData=faculty_db.getRecordOnDepNDesg(search_fac_dep_opt.getSelectedItem().toString(), search_fac_desg_opt.getSelectedItem().toString());
        }
        else
        {
            int y=0;
            try
            {
                y=Integer.parseInt(search_stu_yod_field1.getText().trim());
            }catch(NumberFormatException nm)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Year should be numeric", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            rowData=faculty_db.getRecord(search_fac_dep_opt.getSelectedItem().toString(), search_fac_desg_opt.getSelectedItem().toString(), y);
        }
        
        if(!rowData.isEmpty())
        {
            for(int i=0;i<rowData.size();i++)
                model.addRow(rowData.get(i));
        }
        else
            javax.swing.JOptionPane.showMessageDialog(null, "No Records", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        this.setCursor(java.awt.Cursor.getDefaultCursor());
    }//GEN-LAST:event_listButton2ActionPerformed

    private void close_search_stu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_search_stu1ActionPerformed
        handleCentre(2);
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)jTable3.getModel();
        for(int i = jTable3.getRowCount()-1;i>=0;i--)
            model.removeRow(i);
        search_stu_roll_field1.setText("");
        search_fac_desg_opt.setSelectedIndex(0);
        search_fac_dep_opt.setSelectedIndex(0);
        search_stu_yod_field1.setText("");
    }//GEN-LAST:event_close_search_stu1ActionPerformed

    private void upd_stud_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_stud_maleActionPerformed
        // TODO add your handling code here:
        genData=upd_stud_male.getText().charAt(0);
    }//GEN-LAST:event_upd_stud_maleActionPerformed

    private void upd_stud_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_stud_femaleActionPerformed
        genData=upd_stud_female.getText().charAt(0);
    }//GEN-LAST:event_upd_stud_femaleActionPerformed

    private void upd_stud_otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_stud_otherActionPerformed
        genData=upd_stud_other.getText().charAt(0);
    }//GEN-LAST:event_upd_stud_otherActionPerformed

    private void add_faculty_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_faculty_optionMouseClicked
        handleCentre(21);
    }//GEN-LAST:event_add_faculty_optionMouseClicked

    private void delete_stu_option1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_stu_option1MouseClicked
        this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
        javax.swing.table.DefaultTableModel model =(javax.swing.table.DefaultTableModel)jTable5.getModel();
        for(int i=jTable5.getRowCount()-1;i>=0;i--)
            model.removeRow(i);
        jTable5.setRowSorter(new javax.swing.table.TableRowSorter<>(model));
        if(delete_fac_id_field.getText().trim().equals(""))
            javax.swing.JOptionPane.showMessageDialog(null,"Please enter ID!!","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
        else
        {
            fc=faculty_db.getRecord(delete_fac_id_field.getText().trim());
            if(fc!=null){
                model.addRow(SearchManager.convertToVector(fc));
            }
            else
                javax.swing.JOptionPane.showMessageDialog(null,"No record Found","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        this.setCursor(java.awt.Cursor.getDefaultCursor());
    }//GEN-LAST:event_delete_stu_option1MouseClicked

    private void listButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButton3ActionPerformed
        this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
        java.util.Vector<Vector> rowData=new Vector<>();
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)jTable5.getModel();
        for(int i=jTable5.getRowCount()-1;i>=0;i--)
            model.removeRow(i);
        jTable5.setRowSorter(new javax.swing.table.TableRowSorter<>(model));
        if(delete_fac_desg_opt.getSelectedIndex()==0 && delete_fac_dep_opt.getSelectedIndex()==0&& delete_fac_year_field.getText().trim().equals(""))
        {
            rowData=faculty_db.listAllRecord();
        }
        else if(delete_fac_desg_opt.getSelectedIndex()==0 &&delete_fac_dep_opt.getSelectedIndex()==0)
        {
            int y=0;
            try
            {
                y=Integer.parseInt(delete_fac_year_field.getText().trim());
            }catch(NumberFormatException nm)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Year should be numeric", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            rowData=faculty_db.getRecordOnYear(y);
        }
        else if(delete_fac_desg_opt.getSelectedIndex()==0 && delete_fac_year_field.getText().trim().equals(""))
        {
            rowData=faculty_db.getRecordOnDepartment(delete_fac_dep_opt.getSelectedItem().toString());
        }
        else if(delete_fac_dep_opt.getSelectedIndex()==0 && delete_fac_year_field.getText().trim().equals(""))
        {
            rowData=faculty_db.getRecordOnDesignation(delete_fac_desg_opt.getSelectedItem().toString());
        }
        else if(delete_fac_dep_opt.getSelectedIndex()==0)
        {
            int y=0;
            try
            {
                y=Integer.parseInt(delete_fac_year_field.getText().trim());
            }catch(NumberFormatException nm)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Year should be numeric", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            rowData=faculty_db.getRecordOnDesgNYear(delete_fac_desg_opt.getSelectedItem().toString(), y);
        }
        else if(delete_fac_desg_opt.getSelectedIndex()==0)
        {
            int y=0;
            try
            {
                y=Integer.parseInt(delete_fac_year_field.getText().trim());
            }catch(NumberFormatException nm)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Year should be numeric", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            rowData=faculty_db.getRecordOnDepNYear(delete_fac_dep_opt.getSelectedItem().toString(), y);
        }
        else if(delete_fac_year_field.getText().trim().equals(""))
        {
            rowData=faculty_db.getRecordOnDepNDesg(delete_fac_dep_opt.getSelectedItem().toString(), delete_fac_desg_opt.getSelectedItem().toString());
        }
        else
        {
            int y=0;
            try
            {
                y=Integer.parseInt(delete_fac_year_field.getText().trim());
            }catch(NumberFormatException nm)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Year should be numeric", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            rowData=faculty_db.getRecord(delete_fac_dep_opt.getSelectedItem().toString(), delete_fac_desg_opt.getSelectedItem().toString(), y);
        }
        
        if(!rowData.isEmpty())
        {
            for(int i=0;i<rowData.size();i++)
                model.addRow(rowData.get(i));
        }
        else
            javax.swing.JOptionPane.showMessageDialog(null, "No Records", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        this.setCursor(java.awt.Cursor.getDefaultCursor());
    }//GEN-LAST:event_listButton3ActionPerformed

    private void close_delete_stu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_delete_stu1ActionPerformed
        handleCentre(2);
        delete_fac_id_field.setText("");
        delete_fac_desg_opt.setSelectedIndex(0);
        delete_fac_dep_opt.setSelectedIndex(0);
        delete_fac_year_field.setText("");
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)jTable5.getModel();
        for(int i=jTable5.getRowCount()-1;i>=0;i--)
            model.removeRow(i);
        jButton2.setEnabled(false);
    }//GEN-LAST:event_close_delete_stu1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String id = jTable5.getModel().getValueAt(jTable5.getSelectedRow(), 0).toString();
        if(faculty_db.deleteRecord(id))
            javax.swing.JOptionPane.showMessageDialog(null, "Record Deleted", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        else
            javax.swing.JOptionPane.showMessageDialog(null, DBManager.err, "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        javax.swing.table.DefaultTableModel dm = (javax.swing.table.DefaultTableModel)jTable5.getModel();
        for(int i=jTable5.getRowCount()-1;i>=0;i--)
        {
            dm.removeRow(i);
        }
        listButton3ActionPerformed(evt);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void search_faculty_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_faculty_optionMouseClicked
        handleCentre(22);
    }//GEN-LAST:event_search_faculty_optionMouseClicked

    private void update_faculty_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_faculty_optionMouseClicked
        handleCentre(23);
        reset_stud_button5.setEnabled(false);
        update_personal_detail_pane1.setVisible(false);
        update_communication_detail_pane1.setVisible(false);
        update_academic_detail_pane1.setVisible(false);
    }//GEN-LAST:event_update_faculty_optionMouseClicked

    private void delete_faculty_optionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_faculty_optionMouseClicked
        handleCentre(24);
        jButton2.setEnabled(false);
    }//GEN-LAST:event_delete_faculty_optionMouseClicked

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
       if(jTable5.getSelectedRowCount()==0)
           jButton2.setEnabled(false);
       else
           jButton2.setEnabled(true);
    }//GEN-LAST:event_jTable5MouseClicked

    private void search_label_button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_label_button1MouseClicked
        this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
        if(id_query_field.getText().trim().equals(""))
        javax.swing.JOptionPane.showMessageDialog(null,"Enter ID","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
        else
        {
            fc=faculty_db.getRecord(id_query_field.getText().trim());
            if(fc!=null){
                fname_field3.setText(fc.getName());
                java.text.DateFormat df = new java.text.SimpleDateFormat("dd-MM-yyyy");
                java.util.Date d=new java.util.Date();
                try {
                    d=df.parse(fc.getDOB());
                } catch (ParseException ex) {
                    System.out.println("Parse Error!");
                }
                dob_field3.setDate(d);
                email_field3.setText(fc.getEmail());
                mob_field3.setText(String.valueOf(fc.getMob()));
                pin_field3.setText(String.valueOf(fc.getPIN()));
                address_field3.setText(fc.getAddress());
                switch(fc.getGender())
                {
                    case 'm':
                    case 'M': upd_fac_male.setSelected(true);
                    upd_fac_fem.setSelected(false);
                    upd_fac_oth.setSelected(false);
                    break;
                    case 'f':
                    case 'F': upd_fac_male.setSelected(false);
                    upd_fac_fem.setSelected(true);
                    upd_fac_oth.setSelected(false);
                    break;
                    case 'o':
                    case 'O': upd_fac_male.setSelected(false);
                    upd_fac_fem.setSelected(false);
                    upd_fac_oth.setSelected(true);
                    break;
                    default : upd_fac_male.setSelected(false);
                    upd_fac_fem.setSelected(false);
                    upd_fac_oth.setSelected(false);
                }
                upd_fac_desg_field.setSelectedItem(fc.getDesignation());
                upd_fac_dep_field.setSelectedItem(fc.getDepartment());
                update_personal_detail_pane1.setVisible(true);
                update_communication_detail_pane1.setVisible(true);
                update_academic_detail_pane1.setVisible(true);
                reset_stud_button5.setEnabled(true);
                update_student_button1.setEnabled(true);
            }
            else
            {
                javax.swing.JOptionPane.showMessageDialog(null,"Record Not Found","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
            }

        }
        this.setCursor(java.awt.Cursor.getDefaultCursor());
    }//GEN-LAST:event_search_label_button1MouseClicked

    private void close_student_form4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_student_form4ActionPerformed
        handleCentre(2);
        assign_subj.setVisible(false);
    }//GEN-LAST:event_close_student_form4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(subj_field.getText().trim().equals("")||fac_id_field.getText().trim().equals(""))
        {
            javax.swing.JOptionPane.showMessageDialog(null,"One or more fields are empty","error",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            connectionManager.connect();
            String sub=subj_field.getText().trim();
            String id=fac_id_field.getText().trim();
            try
            {
                String query = "insert into subjects values (?,?)";
                connectionManager.pstmt=connectionManager.conn.prepareStatement(query);
                connectionManager.pstmt.setString(1,sub);
                connectionManager.pstmt.setString(2,id);
                connectionManager.pstmt.executeUpdate();
                javax.swing.JOptionPane.showMessageDialog(null, "Success", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                subj_field.setText("");
                fac_id_field.setText("");
            }
            catch(java.sql.SQLException e)
            {
                javax.swing.JOptionPane.showMessageDialog(null, e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            finally
            {
                try
                {
                    connectionManager.pstmt.close();
                    connectionManager.conn.close();
                }
                catch(java.sql.SQLException e)
                {
                    System.out.println(e);
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void assign_subjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assign_subjectsMouseClicked
        faculty_home.setVisible(false);
        assign_subj.setVisible(true);
    }//GEN-LAST:event_assign_subjectsMouseClicked

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

    private void decResOptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decResOptionMouseClicked
        if(ResultStatus.getResStatus())
        {
            ResultStatus.setResStatus(false);
            decResOption.setText("Declare Result");
        }
        else
        {
            ResultStatus.setResStatus(true);
            decResOption.setText("Undeclare Result");
        }
    }//GEN-LAST:event_decResOptionMouseClicked

    private void faculty_optionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faculty_optionMouseEntered
        faculty_option.setBackground(new java.awt.Color(102,102,255));
    }//GEN-LAST:event_faculty_optionMouseEntered

    private void faculty_optionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faculty_optionMouseExited
        if(faculty_home.isVisible()||add_faculty_form.isVisible()||search_faculty_form.isVisible()||update_faculty_form.isVisible()||delete_faculty_form.isVisible()||assign_subj.isVisible())
            faculty_option.setBackground(new java.awt.Color(240,240,240));
        else
            faculty_option.setBackground(new java.awt.Color(51,204,255));
    }//GEN-LAST:event_faculty_optionMouseExited

    private void student_optionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_optionMouseEntered
        student_option.setBackground(new java.awt.Color(102,102,255));
    }//GEN-LAST:event_student_optionMouseEntered

    private void student_optionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_optionMouseExited
        if(student_home.isVisible()||add_student_form.isVisible()||search_student_form.isVisible()||delete_student_form.isVisible()||update_student_form.isVisible())
            student_option.setBackground(new java.awt.Color(240,240,240));
        else
            student_option.setBackground(new java.awt.Color(51,204,255));
    }//GEN-LAST:event_student_optionMouseExited

    private void upd_fac_femActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_fac_femActionPerformed
        genData='F';
    }//GEN-LAST:event_upd_fac_femActionPerformed

    private void upd_fac_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_fac_maleActionPerformed
        genData='M';
    }//GEN-LAST:event_upd_fac_maleActionPerformed

    private void upd_fac_othActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_fac_othActionPerformed
        genData='O';
    }//GEN-LAST:event_upd_fac_othActionPerformed

    private void chgpwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chgpwdMouseClicked
        handleCentre(3);
    }//GEN-LAST:event_chgpwdMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        change_password_panel.setVisible(false);
        newPassField.setText("");
        oldPassField.setText("");
        confirmPassField.setText("");
        handleCentre(0);
    }//GEN-LAST:event_backButtonActionPerformed

    private void updatePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePassActionPerformed
        if(newPassField.getText().trim().equals("")||oldPassField.getText().trim().equals("")||confirmPassField.getText().trim().equals(""))
        {
            javax.swing.JOptionPane.showMessageDialog(null,"one or more fields are empty","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String oldpass,newpass,cnfrmpass;
            newpass=new String(newPassField.getPassword());
            oldpass=new String(oldPassField.getPassword());
            cnfrmpass=new String(confirmPassField.getPassword());
            if(newpass.equals(cnfrmpass))
            {
                try
                {
                    connectionManager.connect();
                    String query="select pass from users where name=\"admin\"";
                    connectionManager.pstmt=connectionManager.conn.prepareStatement(query);
                    connectionManager.rs=connectionManager.pstmt.executeQuery();
                    if(connectionManager.rs.next())
                    {
                        if(oldpass.equals(connectionManager.rs.getString(1)))
                        {
                            query="update users set pass=? where name=\"admin\"";
                            connectionManager.pstmt=connectionManager.conn.prepareStatement(query);
                            connectionManager.pstmt.setString(1,newpass);
                            int n=connectionManager.pstmt.executeUpdate();
                            if(n!=0)
                                javax.swing.JOptionPane.showMessageDialog(null,"Password Changed!","Success",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                            newPassField.setText("");
                            oldPassField.setText("");
                            confirmPassField.setText("");
                        }
                        else {
                            javax.swing.JOptionPane.showMessageDialog(null,"Old password incorrect","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
                            newPassField.setText("");
                            oldPassField.setText("");
                            confirmPassField.setText("");
                        }
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
                    } catch (java.sql.SQLException ex) {
                        java.util.logging.Logger.getLogger(Student_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                }
            }
            else
            {
                javax.swing.JOptionPane.showMessageDialog(null,"Confirm Password do not match the New Password","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
                newPassField.setText("");
                oldPassField.setText("");
                confirmPassField.setText("");
            }
        }
    }//GEN-LAST:event_updatePassActionPerformed
    //<editor-fold defaultstate="collapse">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Welcome;
    private javax.swing.JPanel academic_Detail;
    private javax.swing.JPanel academic_Detail1;
    private javax.swing.JButton add_fac;
    private javax.swing.ButtonGroup add_fac_bg;
    private javax.swing.JRadioButton add_fac_fem;
    private javax.swing.JRadioButton add_fac_male;
    private javax.swing.JRadioButton add_fac_oth;
    private javax.swing.JPanel add_faculty_form;
    private javax.swing.JLabel add_faculty_logo;
    private javax.swing.JPanel add_faculty_option;
    private javax.swing.JLabel add_faculty_text;
    private javax.swing.ButtonGroup add_stud_bg;
    private javax.swing.JButton add_student_button;
    private javax.swing.JPanel add_student_form;
    private javax.swing.JLabel add_student_logo;
    private javax.swing.JPanel add_student_option;
    private javax.swing.JLabel add_student_text;
    private javax.swing.JTextField address_field;
    private javax.swing.JTextField address_field1;
    private javax.swing.JTextField address_field2;
    private javax.swing.JTextField address_field3;
    private javax.swing.JLabel address_label;
    private javax.swing.JLabel address_label1;
    private javax.swing.JLabel address_label2;
    private javax.swing.JLabel address_label3;
    private javax.swing.JLabel admin_welcome_logo;
    private javax.swing.JLabel admin_welcome_text;
    private javax.swing.JPanel assign_subj;
    private javax.swing.JPanel assign_subjects;
    private javax.swing.JLabel assign_subjects_label;
    private javax.swing.JLabel assign_subjects_logo;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> branch_field;
    private javax.swing.JComboBox<String> branch_field1;
    private javax.swing.JLabel branch_label;
    private javax.swing.JLabel branch_label1;
    private javax.swing.JLabel branch_label2;
    private javax.swing.JLabel branch_label3;
    private javax.swing.JPanel center;
    private javax.swing.JLabel changePassTitle;
    private javax.swing.JPanel change_password_panel;
    private javax.swing.JLabel chgpwd;
    private javax.swing.JButton close_delete_stu;
    private javax.swing.JButton close_delete_stu1;
    private javax.swing.JButton close_search_stu;
    private javax.swing.JButton close_search_stu1;
    private javax.swing.JButton close_student_form;
    private javax.swing.JButton close_student_form1;
    private javax.swing.JButton close_student_form2;
    private javax.swing.JButton close_student_form3;
    private javax.swing.JButton close_student_form4;
    private javax.swing.JPanel communication_Deatail;
    private javax.swing.JPanel communication_Deatail1;
    private javax.swing.JPasswordField confirmPassField;
    private javax.swing.JLabel confirmPassLabel;
    private javax.swing.JComboBox<String> course_field;
    private javax.swing.JComboBox<String> course_field1;
    private javax.swing.JLabel course_label;
    private javax.swing.JLabel course_label1;
    private javax.swing.JLabel course_label2;
    private javax.swing.JLabel course_label3;
    private javax.swing.JLabel decResOption;
    private javax.swing.JComboBox<String> delete_fac_dep_opt;
    private javax.swing.JComboBox<String> delete_fac_desg_opt;
    private javax.swing.JTextField delete_fac_id_field;
    private javax.swing.JTextField delete_fac_year_field;
    private javax.swing.JPanel delete_faculty_form;
    private javax.swing.JLabel delete_faculty_logo;
    private javax.swing.JPanel delete_faculty_option;
    private javax.swing.JLabel delete_faculty_text;
    private javax.swing.JLabel delete_stu_branch_label;
    private javax.swing.JLabel delete_stu_branch_label1;
    private javax.swing.JComboBox<String> delete_stu_branch_option;
    private javax.swing.JLabel delete_stu_course_label;
    private javax.swing.JLabel delete_stu_course_label1;
    private javax.swing.JComboBox<String> delete_stu_course_option;
    private javax.swing.JLabel delete_stu_option;
    private javax.swing.JLabel delete_stu_option1;
    private javax.swing.JTextField delete_stu_roll_field;
    private javax.swing.JLabel delete_stu_roll_label;
    private javax.swing.JLabel delete_stu_roll_label1;
    private javax.swing.JLabel delete_stu_title;
    private javax.swing.JLabel delete_stu_title1;
    private javax.swing.JTextField delete_stu_yod_field;
    private javax.swing.JLabel delete_stu_yod_label;
    private javax.swing.JLabel delete_stu_yod_label1;
    private javax.swing.JPanel delete_student_form;
    private javax.swing.JLabel delete_student_logo;
    private javax.swing.JPanel delete_student_option;
    private javax.swing.JLabel delete_student_text;
    private javax.swing.JComboBox<String> dep_field;
    private javax.swing.JComboBox<String> desg_field;
    private com.toedter.calendar.JDateChooser dob_field;
    private com.toedter.calendar.JDateChooser dob_field1;
    private com.toedter.calendar.JDateChooser dob_field2;
    private com.toedter.calendar.JDateChooser dob_field3;
    private javax.swing.JLabel dob_label;
    private javax.swing.JLabel dob_label1;
    private javax.swing.JLabel dob_label2;
    private javax.swing.JLabel dob_label3;
    private javax.swing.JTextField email_field;
    private javax.swing.JTextField email_field1;
    private javax.swing.JTextField email_field2;
    private javax.swing.JTextField email_field3;
    private javax.swing.JLabel email_label;
    private javax.swing.JLabel email_label1;
    private javax.swing.JLabel email_label2;
    private javax.swing.JLabel email_label3;
    private javax.swing.JLabel fName_label;
    private javax.swing.JLabel fName_label1;
    private javax.swing.JLabel fName_label2;
    private javax.swing.JLabel fName_label3;
    private javax.swing.JTextField fac_id_field;
    private javax.swing.JPanel faculty_home;
    private javax.swing.JLabel faculty_home_title;
    private javax.swing.JLabel faculty_label;
    private javax.swing.JLabel faculty_logo;
    private javax.swing.JPanel faculty_option;
    private javax.swing.JTextField fname_field;
    private javax.swing.JTextField fname_field1;
    private javax.swing.JTextField fname_field2;
    private javax.swing.JTextField fname_field3;
    private javax.swing.JPanel header;
    private javax.swing.JTextField id_query_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField lName_field;
    private javax.swing.JTextField lName_field1;
    private javax.swing.JLabel lName_label;
    private javax.swing.JLabel lName_label1;
    private javax.swing.JSeparator lineSeaparator2;
    private javax.swing.JSeparator lineSeparator1;
    private javax.swing.JSeparator lineSeparator2;
    private javax.swing.JSeparator lineSeparator3;
    private javax.swing.JSeparator lineSeparator4;
    private javax.swing.JSeparator lineSeparator5;
    private javax.swing.JSeparator lineSeparator6;
    private javax.swing.JButton listButton;
    private javax.swing.JButton listButton1;
    private javax.swing.JButton listButton2;
    private javax.swing.JButton listButton3;
    private javax.swing.JLabel log_out;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField mName_field;
    private javax.swing.JTextField mName_field1;
    private javax.swing.JLabel mName_label;
    private javax.swing.JLabel mName_label1;
    private javax.swing.JLabel mName_label2;
    private javax.swing.JLabel mName_label3;
    private javax.swing.JLabel mName_label5;
    private javax.swing.JLabel mName_label6;
    private javax.swing.JTextField mob_field;
    private javax.swing.JTextField mob_field1;
    private javax.swing.JTextField mob_field2;
    private javax.swing.JTextField mob_field3;
    private javax.swing.JLabel mob_label;
    private javax.swing.JLabel mob_label1;
    private javax.swing.JLabel mob_label2;
    private javax.swing.JLabel mob_label3;
    private javax.swing.JPanel nav_panel;
    private javax.swing.JPasswordField newPassField;
    private javax.swing.JLabel newPassLabel;
    private javax.swing.JPasswordField oldPassField;
    private javax.swing.JLabel oldPassLabel;
    private javax.swing.JPanel personal_Deatail;
    private javax.swing.JPanel personal_Deatail1;
    private javax.swing.JTextField pin_field;
    private javax.swing.JTextField pin_field1;
    private javax.swing.JTextField pin_field2;
    private javax.swing.JTextField pin_field3;
    private javax.swing.JLabel pin_label;
    private javax.swing.JLabel pin_label1;
    private javax.swing.JLabel pin_label2;
    private javax.swing.JLabel pin_label3;
    private javax.swing.JButton reset_stud_button;
    private javax.swing.JButton reset_stud_button1;
    private javax.swing.JButton reset_stud_button2;
    private javax.swing.JButton reset_stud_button3;
    private javax.swing.JButton reset_stud_button5;
    private javax.swing.JTextField roll_query_field;
    private javax.swing.JLabel roll_query_label;
    private javax.swing.JLabel roll_query_label1;
    private javax.swing.JPanel rootPane;
    private javax.swing.JComboBox<String> search_fac_dep_opt;
    private javax.swing.JComboBox<String> search_fac_desg_opt;
    private javax.swing.JPanel search_faculty_form;
    private javax.swing.JLabel search_faculty_logo;
    private javax.swing.JPanel search_faculty_option;
    private javax.swing.JLabel search_faculty_text;
    private javax.swing.JLabel search_label_button;
    private javax.swing.JLabel search_label_button1;
    private javax.swing.JLabel search_stu_branch_label;
    private javax.swing.JLabel search_stu_branch_label1;
    private javax.swing.JComboBox<String> search_stu_branch_option;
    private javax.swing.JLabel search_stu_course_label;
    private javax.swing.JLabel search_stu_course_label1;
    private javax.swing.JComboBox<String> search_stu_course_option;
    private javax.swing.JLabel search_stu_option;
    private javax.swing.JLabel search_stu_option1;
    private javax.swing.JTextField search_stu_roll_field;
    private javax.swing.JTextField search_stu_roll_field1;
    private javax.swing.JLabel search_stu_roll_label;
    private javax.swing.JLabel search_stu_roll_label1;
    private javax.swing.JLabel search_stu_title;
    private javax.swing.JLabel search_stu_title1;
    private javax.swing.JTextField search_stu_yod_field;
    private javax.swing.JTextField search_stu_yod_field1;
    private javax.swing.JLabel search_stu_yod_label;
    private javax.swing.JLabel search_stu_yod_label1;
    private javax.swing.JPanel search_student_form;
    private javax.swing.JLabel search_student_logo;
    private javax.swing.JPanel search_student_option;
    private javax.swing.JLabel search_student_text;
    private javax.swing.JTextField sem_field;
    private javax.swing.JTextField sem_field1;
    private javax.swing.JLabel sem_label;
    private javax.swing.JLabel sem_label1;
    private javax.swing.JLabel stud_home_title;
    private javax.swing.JLabel stud_home_title1;
    private javax.swing.JLabel stud_home_title2;
    private javax.swing.JPanel student_home;
    private javax.swing.JLabel student_label;
    private javax.swing.JLabel student_logo;
    private javax.swing.JPanel student_option;
    private javax.swing.JTextField subj_field;
    private javax.swing.JComboBox<String> upd_fac_dep_field;
    private javax.swing.JComboBox<String> upd_fac_desg_field;
    private javax.swing.JRadioButton upd_fac_fem;
    private javax.swing.JRadioButton upd_fac_male;
    private javax.swing.JRadioButton upd_fac_oth;
    private javax.swing.ButtonGroup upd_stud_bg;
    private javax.swing.JRadioButton upd_stud_female;
    private javax.swing.JLabel upd_stud_form_title;
    private javax.swing.JLabel upd_stud_form_title1;
    private javax.swing.JLabel upd_stud_form_title2;
    private javax.swing.JRadioButton upd_stud_male;
    private javax.swing.JRadioButton upd_stud_other;
    private javax.swing.JButton updatePass;
    private javax.swing.JPanel update_academic_detail_pane;
    private javax.swing.JPanel update_academic_detail_pane1;
    private javax.swing.JPanel update_communication_detail_pane;
    private javax.swing.JPanel update_communication_detail_pane1;
    private javax.swing.JPanel update_faculty_form;
    private javax.swing.JLabel update_faculty_logo;
    private javax.swing.JPanel update_faculty_option;
    private javax.swing.JLabel update_faculty_text;
    private javax.swing.JPanel update_personal_detail_pane;
    private javax.swing.JPanel update_personal_detail_pane1;
    private javax.swing.JButton update_student_button;
    private javax.swing.JButton update_student_button1;
    private javax.swing.JPanel update_student_form;
    private javax.swing.JLabel update_student_logo;
    private javax.swing.JPanel update_student_option;
    private javax.swing.JLabel update_student_text;
    private javax.swing.JLabel user_option;
    private javax.swing.JTextField yoa_field;
    private javax.swing.JTextField yoa_field1;
    private javax.swing.JLabel yoa_label;
    private javax.swing.JLabel yoa_label1;
    // End of variables declaration//GEN-END:variables

}
