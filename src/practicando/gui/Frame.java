
package practicando.gui;

import java.util.ArrayList;

public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
        Verifylbl.setVisible(false);
        LogInDiag.setModal(true);
        LogInDiag.setSize(400, 200);
        PassInsDiag.setModal(true);
        PassInsDiag.setSize(500, 300);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogInDiag = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        LoginConfirmBut = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        PassInsDiag = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        PassInslbl = new javax.swing.JLabel();
        PassInsLbl2 = new javax.swing.JLabel();
        PassInfConfirmBut = new javax.swing.JToggleButton();
        LoginP = new javax.swing.JPanel();
        Userlbl = new javax.swing.JLabel();
        NombreFld = new javax.swing.JTextField();
        Contralbl = new javax.swing.JLabel();
        ContraseñaFld = new javax.swing.JTextField();
        LogInBut = new javax.swing.JToggleButton();
        Verifylbl = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        LogOutBut = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pull10lbl = new javax.swing.JLabel();
        Pull1lbl = new javax.swing.JLabel();
        Userlbl3 = new javax.swing.JLabel();
        Userlbl4 = new javax.swing.JLabel();
        Wish10But = new javax.swing.JToggleButton();
        Wish1But = new javax.swing.JToggleButton();
        LogOutBut3 = new javax.swing.JToggleButton();
        LogOutBut4 = new javax.swing.JToggleButton();
        Userlbl5 = new javax.swing.JLabel();
        LogOutBut5 = new javax.swing.JToggleButton();
        UserCreateP = new javax.swing.JPanel();
        CreateNamelbl = new javax.swing.JLabel();
        CreateUserLbl = new javax.swing.JLabel();
        CreatePassLbl = new javax.swing.JLabel();
        NameCreatefld = new javax.swing.JTextField();
        PassCreateFld = new javax.swing.JTextField();
        UserCreateFld = new javax.swing.JTextField();
        VerifylCreateLbl = new javax.swing.JLabel();
        CreateBut = new javax.swing.JToggleButton();
        PassInfoBut = new javax.swing.JToggleButton();
        NameInfoBut = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        LogInDiag.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        LoginConfirmBut.setBackground(new java.awt.Color(0, 204, 204));
        LoginConfirmBut.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LoginConfirmBut.setForeground(new java.awt.Color(0, 0, 0));
        LoginConfirmBut.setText("Ok");
        LoginConfirmBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        LoginConfirmBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginConfirmButActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Log In Succsesful");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(LoginConfirmBut, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginConfirmBut)
                .addGap(25, 25, 25))
        );

        LogInDiag.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        PassInslbl.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        PassInslbl.setForeground(new java.awt.Color(0, 0, 0));
        PassInslbl.setText("Password Instructions");

        PassInsLbl2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        PassInsLbl2.setForeground(new java.awt.Color(0, 0, 0));
        PassInsLbl2.setText("1.Must contain 2 numbers Minimum\n" +
            "2.Not Related to Username\n" +
            "3.Longer than 8 characters");

        PassInfConfirmBut.setBackground(new java.awt.Color(0, 204, 204));
        PassInfConfirmBut.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        PassInfConfirmBut.setForeground(new java.awt.Color(0, 0, 0));
        PassInfConfirmBut.setText("Ok");
        PassInfConfirmBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        PassInfConfirmBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassInfConfirmButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PassInsLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PassInfConfirmBut, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(PassInslbl)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PassInslbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PassInsLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PassInfConfirmBut))
        );

        javax.swing.GroupLayout PassInsDiagLayout = new javax.swing.GroupLayout(PassInsDiag.getContentPane());
        PassInsDiag.getContentPane().setLayout(PassInsDiagLayout);
        PassInsDiagLayout.setHorizontalGroup(
            PassInsDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PassInsDiagLayout.setVerticalGroup(
            PassInsDiagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginP.setBackground(new java.awt.Color(255, 255, 255));

        Userlbl.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Userlbl.setForeground(new java.awt.Color(0, 0, 0));
        Userlbl.setText("Ingrese Ususario");

        NombreFld.setBackground(new java.awt.Color(255, 255, 255));
        NombreFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        Contralbl.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Contralbl.setForeground(new java.awt.Color(0, 0, 0));
        Contralbl.setText("Ingrese Contraseña");

        ContraseñaFld.setBackground(new java.awt.Color(255, 255, 255));
        ContraseñaFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        LogInBut.setBackground(new java.awt.Color(0, 153, 153));
        LogInBut.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LogInBut.setForeground(new java.awt.Color(255, 255, 255));
        LogInBut.setText("Entrar");
        LogInBut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        LogInBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButActionPerformed(evt);
            }
        });

        Verifylbl.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Verifylbl.setForeground(new java.awt.Color(0, 0, 0));
        Verifylbl.setText("hola");

        javax.swing.GroupLayout LoginPLayout = new javax.swing.GroupLayout(LoginP);
        LoginP.setLayout(LoginPLayout);
        LoginPLayout.setHorizontalGroup(
            LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPLayout.createSequentialGroup()
                .addGroup(LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContraseñaFld, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Userlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreFld, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contralbl)))
                    .addGroup(LoginPLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(LogInBut, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginPLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(Verifylbl)))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        LoginPLayout.setVerticalGroup(
            LoginPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(Userlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NombreFld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Contralbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContraseñaFld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogInBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Verifylbl)
                .addGap(128, 128, 128))
        );

        Menu.setBackground(new java.awt.Color(0, 255, 255));

        LogOutBut.setBackground(new java.awt.Color(0, 153, 153));
        LogOutBut.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LogOutBut.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBut.setText("Log Out");
        LogOutBut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        LogOutBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        Pull10lbl.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Pull10lbl.setForeground(new java.awt.Color(0, 0, 0));
        Pull10lbl.setText("Do a 10 Pull");

        Pull1lbl.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Pull1lbl.setForeground(new java.awt.Color(0, 0, 0));
        Pull1lbl.setText("Single Pull");

        Userlbl3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Userlbl3.setForeground(new java.awt.Color(0, 0, 0));
        Userlbl3.setText("Ver Personajes");

        Userlbl4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Userlbl4.setForeground(new java.awt.Color(0, 0, 0));
        Userlbl4.setText("Ver equipo actual");

        Wish10But.setBackground(new java.awt.Color(0, 153, 153));
        Wish10But.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Wish10But.setForeground(new java.awt.Color(255, 255, 255));
        Wish10But.setText("Wish 10");
        Wish10But.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Wish10But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wish10ButActionPerformed(evt);
            }
        });

        Wish1But.setBackground(new java.awt.Color(0, 153, 153));
        Wish1But.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Wish1But.setForeground(new java.awt.Color(255, 255, 255));
        Wish1But.setText("Wish");
        Wish1But.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Wish1But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wish1ButActionPerformed(evt);
            }
        });

        LogOutBut3.setBackground(new java.awt.Color(0, 153, 153));
        LogOutBut3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LogOutBut3.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBut3.setText("Log Out");
        LogOutBut3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        LogOutBut3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBut3ActionPerformed(evt);
            }
        });

        LogOutBut4.setBackground(new java.awt.Color(0, 153, 153));
        LogOutBut4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LogOutBut4.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBut4.setText("Log Out");
        LogOutBut4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        LogOutBut4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBut4ActionPerformed(evt);
            }
        });

        Userlbl5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Userlbl5.setForeground(new java.awt.Color(0, 0, 0));
        Userlbl5.setText("Importar Personaje");

        LogOutBut5.setBackground(new java.awt.Color(0, 153, 153));
        LogOutBut5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LogOutBut5.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBut5.setText("Log Out");
        LogOutBut5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        LogOutBut5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBut5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogOutBut, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pull1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Userlbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Userlbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pull10lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Wish10But, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Wish1But, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LogOutBut4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LogOutBut3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LogOutBut5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Userlbl5, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                        .addGap(67, 226, Short.MAX_VALUE))))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pull10lbl)
                .addGap(8, 8, 8)
                .addComponent(Wish10But)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pull1lbl)
                .addGap(7, 7, 7)
                .addComponent(Wish1But)
                .addGap(18, 18, 18)
                .addComponent(Userlbl3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogOutBut3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Userlbl4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogOutBut4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Userlbl5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogOutBut5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(LogOutBut)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );

        UserCreateP.setBackground(new java.awt.Color(153, 153, 255));

        CreateNamelbl.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CreateNamelbl.setForeground(new java.awt.Color(0, 0, 0));
        CreateNamelbl.setText("New Name:");

        CreateUserLbl.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CreateUserLbl.setForeground(new java.awt.Color(0, 0, 0));
        CreateUserLbl.setText("New Username:");

        CreatePassLbl.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CreatePassLbl.setForeground(new java.awt.Color(0, 0, 0));
        CreatePassLbl.setText("New Password:");

        NameCreatefld.setBackground(new java.awt.Color(255, 255, 255));
        NameCreatefld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        PassCreateFld.setBackground(new java.awt.Color(255, 255, 255));
        PassCreateFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        UserCreateFld.setBackground(new java.awt.Color(255, 255, 255));
        UserCreateFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        VerifylCreateLbl.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        VerifylCreateLbl.setForeground(new java.awt.Color(0, 0, 0));
        VerifylCreateLbl.setText("hola");

        CreateBut.setBackground(new java.awt.Color(255, 153, 255));
        CreateBut.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        CreateBut.setForeground(new java.awt.Color(255, 255, 255));
        CreateBut.setText("Create");
        CreateBut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        CreateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButActionPerformed(evt);
            }
        });

        PassInfoBut.setBackground(new java.awt.Color(255, 153, 255));
        PassInfoBut.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        PassInfoBut.setForeground(new java.awt.Color(255, 255, 255));
        PassInfoBut.setText("i");
        PassInfoBut.setToolTipText("");
        PassInfoBut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        PassInfoBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassInfoButActionPerformed(evt);
            }
        });

        NameInfoBut.setBackground(new java.awt.Color(255, 153, 255));
        NameInfoBut.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        NameInfoBut.setForeground(new java.awt.Color(255, 255, 255));
        NameInfoBut.setText("i");
        NameInfoBut.setToolTipText("");
        NameInfoBut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        NameInfoBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameInfoButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UserCreatePLayout = new javax.swing.GroupLayout(UserCreateP);
        UserCreateP.setLayout(UserCreatePLayout);
        UserCreatePLayout.setHorizontalGroup(
            UserCreatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserCreatePLayout.createSequentialGroup()
                .addGroup(UserCreatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UserCreatePLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(UserCreatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UserCreateFld, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CreateNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameCreatefld, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(UserCreatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(CreatePassLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CreateUserLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PassCreateFld, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(VerifylCreateLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UserCreatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PassInfoBut)
                            .addComponent(NameInfoBut)))
                    .addGroup(UserCreatePLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(CreateBut, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        UserCreatePLayout.setVerticalGroup(
            UserCreatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserCreatePLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(CreateNamelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UserCreatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameCreatefld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameInfoBut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CreateUserLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserCreateFld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CreatePassLbl)
                .addGap(18, 18, 18)
                .addGroup(UserCreatePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassCreateFld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassInfoBut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerifylCreateLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreateBut)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(UserCreateP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(175, 175, 175)
                    .addComponent(UserCreateP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(176, 176, 176)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButActionPerformed
        String user = NombreFld.getText();
        String pass = ContraseñaFld.getText();
        
        if(user.equals("123") && pass.equals("123")){
            LoginP.setVisible(false);
            Menu.setVisible(true);
            LogInDiag.setVisible(true);
            NombreFld.setText("");
            ContraseñaFld.setText("");
            
        }else if(user.equals("123") && !pass.equals("123")){
            Verifylbl.setVisible(true);
            Verifylbl.setText("Contraseña Incorrecta");
        }else if(!user.equals("123") && pass.equals("123")){
             Verifylbl.setVisible(true);
            Verifylbl.setText("Nombre Incorrecto");
        }else{
            Verifylbl.setVisible(true);
            Verifylbl.setText("Contraseña o Nombre Incorrecto");
        }
    }//GEN-LAST:event_LogInButActionPerformed

    private void LoginConfirmButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginConfirmButActionPerformed
        LogInDiag.setVisible(false);
    }//GEN-LAST:event_LoginConfirmButActionPerformed

    private void LogOutButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButActionPerformed
        Menu.setVisible(false);
        LoginP.setVisible(true);
    }//GEN-LAST:event_LogOutButActionPerformed

    private void Wish10ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wish10ButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Wish10ButActionPerformed

    private void Wish1ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wish1ButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Wish1ButActionPerformed

    private void LogOutBut3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBut3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutBut3ActionPerformed

    private void LogOutBut4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBut4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutBut4ActionPerformed

    private void LogOutBut5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBut5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutBut5ActionPerformed

    private void CreateButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButActionPerformed
        String Name = NameCreatefld.getText();
        String Pass = PassCreateFld.getText();
        String User = UserCreateFld.getText();
        ArrayList<Characters> ChacList = new ArrayList();
        Users NewUser = new Users(Pass, Name, User, ChacList);
        
    }//GEN-LAST:event_CreateButActionPerformed

    private void PassInfoButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassInfoButActionPerformed
        PassInsDiag.setVisible(true);
    }//GEN-LAST:event_PassInfoButActionPerformed

    private void NameInfoButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameInfoButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameInfoButActionPerformed

    private void PassInfConfirmButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassInfConfirmButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassInfConfirmButActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contralbl;
    private javax.swing.JTextField ContraseñaFld;
    private javax.swing.JToggleButton CreateBut;
    private javax.swing.JLabel CreateNamelbl;
    private javax.swing.JLabel CreatePassLbl;
    private javax.swing.JLabel CreateUserLbl;
    private javax.swing.JToggleButton LogInBut;
    private javax.swing.JDialog LogInDiag;
    private javax.swing.JToggleButton LogOutBut;
    private javax.swing.JToggleButton LogOutBut3;
    private javax.swing.JToggleButton LogOutBut4;
    private javax.swing.JToggleButton LogOutBut5;
    private javax.swing.JToggleButton LoginConfirmBut;
    private javax.swing.JPanel LoginP;
    private javax.swing.JPanel Menu;
    private javax.swing.JTextField NameCreatefld;
    private javax.swing.JToggleButton NameInfoBut;
    private javax.swing.JTextField NombreFld;
    private javax.swing.JTextField PassCreateFld;
    private javax.swing.JToggleButton PassInfConfirmBut;
    private javax.swing.JToggleButton PassInfoBut;
    private javax.swing.JDialog PassInsDiag;
    private javax.swing.JLabel PassInsLbl2;
    private javax.swing.JLabel PassInslbl;
    private javax.swing.JLabel Pull10lbl;
    private javax.swing.JLabel Pull1lbl;
    private javax.swing.JTextField UserCreateFld;
    private javax.swing.JPanel UserCreateP;
    private javax.swing.JLabel Userlbl;
    private javax.swing.JLabel Userlbl3;
    private javax.swing.JLabel Userlbl4;
    private javax.swing.JLabel Userlbl5;
    private javax.swing.JLabel VerifylCreateLbl;
    private javax.swing.JLabel Verifylbl;
    private javax.swing.JToggleButton Wish10But;
    private javax.swing.JToggleButton Wish1But;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
