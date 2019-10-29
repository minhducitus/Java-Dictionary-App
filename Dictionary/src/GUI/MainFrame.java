package GUI;

import org.jdesktop.swingx.JXDatePicker;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MainFrame {

    private JFrame frmDictionary;
    private JLabel lblFrom;
    private JLabel lblTo;
    private JButton btnSearch;
    private JButton btnSwitch;
    private JButton btnDeleteFav;
    private JButton btnAddFav;
    private JButton btnResult; // thong ke so lan tra
    private JTextField txtSearch;
    private JTextField txtDateFrom;
    private JTextField txtDateTo;
    private JTextArea txtAreaInfor;
    private JList<String> lstWord;
    private JList<String> lstFavWord;
    private JScrollPane scp1;
    private JScrollPane scp2;
    private JScrollPane scp3;
    private JScrollPane scp4;
    private JSeparator spr1;
    private JSeparator spr2;
    private JXDatePicker dpFrom;
    private JXDatePicker dpTo;
    private JTable tblStats;


    public MainFrame() {
        InitComponent();
    }

    public void InitComponent() {
        frmDictionary = new JFrame();
        frmDictionary.setTitle("Dictionary");
        frmDictionary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmDictionary.setResizable(false);
        frmDictionary.setBounds(100, 100, 1200, 700);
        frmDictionary.getContentPane().setBackground(Color.WHITE);

        spr1 = new JSeparator();
        spr2 = new JSeparator();

        scp1 = new JScrollPane();
        scp2 = new JScrollPane();
        scp3 = new JScrollPane();
        scp4 = new JScrollPane();

        dpFrom = new JXDatePicker();
        dpTo = new JXDatePicker();

        txtSearch = new JTextField();
        txtSearch.setText("Input Word To Search");
        txtSearch.setPreferredSize(new Dimension(230, 25));

        txtDateFrom = new JTextField();
        txtDateFrom.setPreferredSize(new Dimension(230, 25));

        txtDateTo = new JTextField();
        txtDateTo.setPreferredSize(new Dimension(230, 25));

        txtAreaInfor = new JTextArea();
        txtAreaInfor.setEditable(false);

        scp1.setViewportView(txtAreaInfor);

        btnSearch = new JButton("Search");
        btnSearch.setIcon(new ImageIcon(getClass().getResource("/Images/research.png")));
        btnSearch.setMargin(new Insets(0, 0, 0, 0));
        btnSearch.setBackground(Color.decode("#EFF0F2"));
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        btnSearch.setBorder(border);

        btnAddFav = new JButton("Favorite Words");
        btnAddFav.setIcon(new ImageIcon(getClass().getResource("/Images/love.png")));
        btnAddFav.setMargin(new Insets(0, 0, 0, 0));
        btnAddFav.setBackground(Color.decode("#EFF0F2"));
        Border border1 = BorderFactory.createLineBorder(Color.BLACK);
        btnAddFav.setBorder(border1);

        btnSwitch = new JButton("Change To English-Vietnam");
        btnSwitch.setIcon(new ImageIcon(getClass().getResource("/Images/switch.png")));
        btnSwitch.setMargin(new Insets(0, 0, 0, 0));
        btnSwitch.setBackground(Color.decode("#EFF0F2"));
        Border border3 = BorderFactory.createLineBorder(Color.black);
        btnSwitch.setBorder(border3);

        btnResult = new JButton("Statistics");
        btnResult.setIcon(new ImageIcon(getClass().getResource("/Images/switch.png")));
        btnResult.setMargin(new Insets(0, 0, 0, 0));
        btnResult.setBackground(Color.decode("#EFF0F2"));
        Border border4 = BorderFactory.createLineBorder(Color.black);
        btnSwitch.setBorder(border4);

        btnDeleteFav = new JButton("Delete Favorite");
        btnDeleteFav.setIcon(new ImageIcon(getClass().getResource("/Images/clear.png")));
        btnDeleteFav.setMargin(new Insets(0, 0, 0, 0));
        btnDeleteFav.setBackground(Color.decode("#EFF0F2"));
        Border border5 = BorderFactory.createLineBorder(Color.BLACK);
        btnSearch.setBorder(border5);

        lblFrom = new JLabel("From");
        lblTo = new JLabel("To");

        lstFavWord = new JList<>();
        lstFavWord.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        scp2.setViewportView(lstFavWord);

        lstWord = new JList<>();
        lstWord.setAutoscrolls(false);
        lstWord.setVisibleRowCount(100000);
        scp3.setViewportView(lstWord);

        tblStats = new JTable();
        tblStats.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        scp4.setViewportView(tblStats);

        GroupLayout layout = new GroupLayout(frmDictionary.getContentPane());
        frmDictionary.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(scp3, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                        .addComponent(txtSearch))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scp1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblFrom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spr2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(spr1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(dpFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dpTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAddFav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(scp2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                        .addComponent(btnSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnDeleteFav, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblTo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(scp4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(scp1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(spr1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1)
                                                .addComponent(btnAddFav, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(scp2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnDeleteFav)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spr2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dpFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblTo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dpTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(scp4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(scp3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        frmDictionary.pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame window = new MainFrame();
                window.frmDictionary.setVisible(true);
            }
        });
    }
}
