package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainFrame {

    private JPanel pnlLeft;
    private JPanel pnlCenter;
    private JPanel pnlRight;
    private JFrame frmDictionary;
    private JButton btnSearch;
    private JButton btnSwitch;
    private JButton btnDeleteFav;
    private JButton btnAddFav;
    private JButton btnResult; // thong ke so lan tra
    private JTextField txtSearch;
    private JTextArea txtAreaInfor;
    private JList<String> lstWord;
    private JList<String> lstFavWord;

    public MainFrame() {
        InitComponent();
    }

    public void InitComponent() {
        frmDictionary = new JFrame();
        frmDictionary.setTitle("Dictionary");
        frmDictionary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmDictionary.setResizable(false);
        frmDictionary.setBounds(100, 100, 1200, 700);
        frmDictionary.getContentPane().setLayout(new BorderLayout());
        frmDictionary.getContentPane().setBackground(Color.WHITE);

        pnlLeft = new JPanel();
        pnlLeft.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        pnlCenter = new JPanel();

        pnlRight = new JPanel();
        pnlRight.setLayout(new GridBagLayout());
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.insets = new Insets(1, 1, 12, 1);

        gbc.gridx = 0;
        gbc.gridy = 0;
        txtSearch = new JTextField();
        txtSearch.setText("Input Word To Search");
        txtSearch.setPreferredSize(new Dimension(230, 25));
        pnlLeft.add(txtSearch, gbc);

        txtAreaInfor = new JTextArea();
        txtAreaInfor.setEditable(false);
        txtAreaInfor.setColumns(230);
        txtAreaInfor.setRows(500);
        pnlCenter.add(txtAreaInfor);

        pnlRight.setBackground(Color.GRAY);

        btnSearch = new JButton("Search");
        btnSearch.setPreferredSize(new Dimension(230, 30));
        btnSearch.setBounds(0, 0, 230, 30);
        btnSearch.setIcon(new ImageIcon(getClass().getResource("/Images/research.png")));
        btnSearch.setMargin(new Insets(0, 0, 0, 0));
        btnSearch.setBackground(Color.decode("#EFF0F2"));
        Border border1 = BorderFactory.createLineBorder(Color.BLACK);
        btnSearch.setBorder(border1);
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        pnlRight.add(btnSearch, gbc1);

        btnAddFav = new JButton("Favorite Words");
        btnAddFav.setPreferredSize(new Dimension(230, 30));
        btnAddFav.setBounds(0, 20, 230, 30);
        btnAddFav.setIcon(new ImageIcon(getClass().getResource("/Images/love.png")));
        btnAddFav.setMargin(new Insets(0, 0, 0, 0));
        btnAddFav.setBackground(Color.decode("#EFF0F2"));
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        btnAddFav.setBorder(border);
        gbc1.gridx = 0;
        gbc1.gridy = 1;
        pnlRight.add(btnAddFav, gbc1);

        frmDictionary.getContentPane().add(pnlLeft, BorderLayout.LINE_START);
        frmDictionary.getContentPane().add(pnlCenter, BorderLayout.CENTER);
        frmDictionary.getContentPane().add(pnlRight, BorderLayout.LINE_END);
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
