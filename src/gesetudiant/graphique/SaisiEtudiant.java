/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gesetudiant.graphique;

import gesetudiant.DAO.TraitementEtudiant;
import gesetudiant.entite.Etudiant;
import gesetudiant.utils.MyTableModel;
import gesetudiant.utils.constante;
import javax.swing.JOptionPane;

/**
 *
 * @author hppp
 */
public class SaisiEtudiant extends javax.swing.JFrame {

    public SaisiEtudiant() {
        initComponents();
        this.setLocationRelativeTo(null);
        //AccessDB.obtenirConnection();
        tabetu.setModel(MyTableModel.getEtudiantModel());
        txtinscrit.setText(String.valueOf(new TraitementEtudiant().nombreInscrit()));
        txtCode.setVisible(false);
    }
    
    private void raz(){
        txtnom.setText(null);
        txtprenom.setText(null);
        txtdate.setDate(null);
        txtlieu.setText(null);
        combofiliere.setSelectedItem(null);
        combonat.setSelectedItem(null); 
        radio1.setSelected(false);
        radio2.setSelected(false);
    }
    
    private boolean check(){
    if(
       //!radio1.isSelected() ||
       //!radio2.isSelected() ||     
       txtnom.getText()!=null || 
       txtprenom.getText()!=null || 
       txtdate.getDate()==null || 
       txtlieu.getText()==null || 
       combofiliere.getSelectedItem()==null || 
       combonat.getSelectedItem()==null){
       return false; 
    }else{
      return true;
    } 
   }
    
    private void proprieteSaisie(Etudiant et){
        //Etudiant et = new Etudiant();
        if(radio1.isSelected()){
          et.setTypetu(constante.BOURSE_OUI);  
        }else{
            et.setTypetu(constante.BOURSE_NON);
        }
        et.setNom(txtnom.getText());
        et.setPrenom(txtprenom.getText());
        et.setDnais(txtdate.getDate());
        et.setLieu(txtlieu.getText());
        et.setFiliere(combofiliere.getSelectedItem()+"");
        et.setNationalite(combonat.getSelectedItem()+"");
    }
    
    private void getOne(int index){
      TraitementEtudiant t = new TraitementEtudiant();  
      if(t.lister().get(index).getTypetu().
         equals(constante.BOURSE_OUI)){
         radio1.setSelected(true);
      }else{
        radio2.setSelected(true);  
      }
      txtCode.setText(String.valueOf(t.lister().get(index).getCode()));
      txtnom.setText(t.lister().get(index).getNom());
      txtprenom.setText(t.lister().get(index).getPrenom());
      txtdate.setDate(t.lister().get(index).getDnais());
      txtlieu.setText(t.lister().get(index).getLieu());
      combofiliere.setSelectedItem(t.lister().get(index).getFiliere());
      combonat.setSelectedItem(t.lister().get(index).getNationalite());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtprenom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtlieu = new javax.swing.JTextField();
        txtdate = new com.toedter.calendar.JDateChooser();
        combofiliere = new javax.swing.JComboBox<>();
        combonat = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btnmodif = new javax.swing.JButton();
        btnsuppr = new javax.swing.JButton();
        btnenr = new javax.swing.JButton();
        btnquit = new javax.swing.JButton();
        btnannuler = new javax.swing.JButton();
        txtCode = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabetu = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtinscrit = new javax.swing.JTextField();
        btndec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 153));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORMULAIRE D'INSCRIPTION D'ETUDIANTS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 2, 18)); // NOI18N
        jLabel2.setText("L'étudiant est-il boursié ?");

        radio1.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(radio1);
        radio1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        radio1.setText("Oui");

        radio2.setBackground(new java.awt.Color(0, 204, 204));
        buttonGroup1.add(radio2);
        radio2.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        radio2.setText("Non");

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel3.setText("Nationalité");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel4.setText("Date de naissance");

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel5.setText("Lieu de naissance");

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel6.setText("Filière");

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel7.setText("Nom");

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel8.setText("Prénoms");

        combofiliere.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Choisir une filière---", "GL", "ASR", "MTWI" }));
        combofiliere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combofiliereActionPerformed(evt);
            }
        });

        combonat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Choisir une nationalité---", "Togolaise", "Béninoise", "Ivoirienne", "Malienne", "Congolaise", "Tchadienne" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlieu, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combofiliere, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combonat, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtlieu)
                            .addComponent(jLabel5))
                        .addGap(11, 11, 11)
                        .addComponent(combofiliere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combonat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel4.setBackground(new java.awt.Color(204, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 205)));

        btnmodif.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnmodif.setText("Modifier");
        btnmodif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifActionPerformed(evt);
            }
        });

        btnsuppr.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnsuppr.setText("Supprimer");
        btnsuppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsupprActionPerformed(evt);
            }
        });

        btnenr.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnenr.setText("Enregistrer");
        btnenr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenrActionPerformed(evt);
            }
        });

        btnquit.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnquit.setText("Quitter");
        btnquit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitActionPerformed(evt);
            }
        });

        btnannuler.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnannuler.setText("Annuler");
        btnannuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnannulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnannuler, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsuppr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmodif, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnenr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(btnquit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnenr)
                .addGap(18, 18, 18)
                .addComponent(btnmodif)
                .addGap(18, 18, 18)
                .addComponent(btnsuppr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnannuler)
                .addGap(18, 18, 18)
                .addComponent(btnquit)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(radio1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(radio2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtCode))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        jLabel9.setBackground(new java.awt.Color(204, 204, 255));
        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Liste des étudiants inscrits");

        tabetu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nom", "Prénoms", "Date de naissance", "Lieu de naissance", "Filière", "Lieu de naissance"
            }
        ));
        tabetu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabetuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabetu);

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 2, 18)); // NOI18N
        jLabel10.setText("Nombre d'étudiants inscrits");

        txtinscrit.setEditable(false);

        btndec.setFont(new java.awt.Font("Bookman Old Style", 2, 14)); // NOI18N
        btndec.setForeground(new java.awt.Color(255, 0, 0));
        btndec.setText("Déconnexion");
        btndec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(txtinscrit, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btndec)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtinscrit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndec))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 817, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combofiliereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combofiliereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combofiliereActionPerformed

    private void btnenrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenrActionPerformed
    Etudiant et = new Etudiant();
    proprieteSaisie(et);   
    if (new TraitementEtudiant().enregistrer(et)) {
     tabetu.setModel(MyTableModel.getEtudiantModel());
     txtinscrit.setText(new TraitementEtudiant().nombreInscrit() + "");
     raz();
    } 
    
    /*if(radio1.isSelected()){              
            et.setTypetu(constante.BOURSE_OUI);
            if(new TraitementEtudiant().enregistrer(et)){
            tabetu.setModel(MyTableModel.getEtudiantModel()); 
            txtinscrit.setText(new TraitementEtudiant().nombreInscrit()+"");
            raz();
           }
       }else if(radio2.isSelected()){
            et.setTypetu(constante.BOURSE_NON); 
            if(new TraitementEtudiant().enregistrer(et)){
            tabetu.setModel(MyTableModel.getEtudiantModel()); 
            txtinscrit.setText(new TraitementEtudiant().nombreInscrit()+"");
            raz();
           }
        }
        else if(!check()){
            JOptionPane.showMessageDialog(null, "Veuillez saisir tous les champs");
        }  */     
    }//GEN-LAST:event_btnenrActionPerformed
     
    private void btnquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnquitActionPerformed

    private void btnmodifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifActionPerformed
        Etudiant et = new Etudiant();
        proprieteSaisie(et);
        et.setCode(Integer.parseInt(txtCode.getText()));
        if(new TraitementEtudiant().update(et)){
        tabetu.setModel(MyTableModel.getEtudiantModel()); 
        txtinscrit.setText(new TraitementEtudiant().nombreInscrit()+"");  
        raz(); 
        }  
        
    /*    if(radio1.isSelected()){
        proprieteSaisie(et);
        et.setCode(Integer.parseInt(txtCode.getText()));
        et.setTypetu(constante.BOURSE_OUI);
        if(new TraitementEtudiant().update(et)){
        tabetu.setModel(MyTableModel.getEtudiantModel()); 
        txtinscrit.setText(new TraitementEtudiant().nombreInscrit()+"");  
        raz(); 
        }      
     }else {
       proprieteSaisie(et);
        et.setCode(Integer.parseInt(txtCode.getText()));
        et.setTypetu(constante.BOURSE_NON);
        if(new TraitementEtudiant().update(et)){
        tabetu.setModel(MyTableModel.getEtudiantModel()); 
        txtinscrit.setText(new TraitementEtudiant().nombreInscrit()+"");  
        raz(); 
        } 
     }*/
    }//GEN-LAST:event_btnmodifActionPerformed

    private void btnannulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnannulerActionPerformed
        raz();
    }//GEN-LAST:event_btnannulerActionPerformed

    private void tabetuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabetuMouseClicked
        int index = tabetu.getSelectedRow();
        getOne(index);
    }//GEN-LAST:event_tabetuMouseClicked

    private void btnsupprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsupprActionPerformed
        //Connection con = AccessDB.obtenirConnection();
        Etudiant et = new Etudiant();
        et.setCode(Integer.parseInt(txtCode.getText()));
        if(JOptionPane.showConfirmDialog(null, "Etes-vous sûr de supprimer cet étudiant?")==0){
            if(new TraitementEtudiant().supprimer(et)){
             tabetu.setModel(MyTableModel.getEtudiantModel()); 
            txtinscrit.setText(new TraitementEtudiant().nombreInscrit()+"");  
       }
        raz();
        }else{
            JOptionPane.showMessageDialog(null, "Aucune suppression effectuée");
        }   
    }//GEN-LAST:event_btnsupprActionPerformed

    private void btndecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndecActionPerformed
        new Accueil().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btndecActionPerformed

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
            java.util.logging.Logger.getLogger(SaisiEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaisiEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaisiEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaisiEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaisiEtudiant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnannuler;
    private javax.swing.JButton btndec;
    private javax.swing.JButton btnenr;
    private javax.swing.JButton btnmodif;
    private javax.swing.JButton btnquit;
    private javax.swing.JButton btnsuppr;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combofiliere;
    private javax.swing.JComboBox<String> combonat;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JTable tabetu;
    private javax.swing.JTextField txtCode;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JTextField txtinscrit;
    private javax.swing.JTextField txtlieu;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtprenom;
    // End of variables declaration//GEN-END:variables
}
