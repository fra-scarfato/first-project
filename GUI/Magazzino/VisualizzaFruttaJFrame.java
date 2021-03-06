package GUI.Magazzino;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import Controller.ControllerMagazzino;
import Controller.ControllerPrincipale;
import GUI.Cliente.ClientiJFrame;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;

public class VisualizzaFruttaJFrame extends JFrame {

	private JPanel VisualizzaProdottiPanel;
	private ControllerMagazzino ControllerM;
	private ControllerPrincipale ControllerP;
	private DefaultTableModel Model = new DefaultTableModel(new String[] {"ID Prodotto", "Nome", "Provenienza", "Lotto Lavorazione", "Data Raccolta", "Valore al kg", "Scorte in kg"},0)
	{
		 public boolean isCellEditable(int row, int column) {
		       return false; //Tabella non modificabile
		    }
		 
	};
	private JTable ProdottiTable;
	private TableRowSorter<DefaultTableModel> Sorter;
	private JTextField FiltraPerTF;

	/**
	 * Create the frame.
	 */
	public VisualizzaFruttaJFrame(ControllerMagazzino c, ControllerPrincipale cp) {
		ControllerM = c;
		ControllerP = cp;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		VisualizzaProdottiPanel = new JPanel();
		setTitle("ProgettoOOBD2020");
		VisualizzaProdottiPanel.setBackground(new Color(255, 228, 181));
		VisualizzaProdottiPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		VisualizzaProdottiPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(VisualizzaProdottiPanel);
		VisualizzaProdottiPanel.setLayout(null);
		
		JToolBar Men?LateraleTB = new JToolBar();
		Men?LateraleTB.setBounds(0, 0, 65, 563);
		VisualizzaProdottiPanel.add(Men?LateraleTB, BorderLayout.WEST);
		Men?LateraleTB.setBorder(null);
		Men?LateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		Men?LateraleTB.setBorderPainted(false);
		Men?LateraleTB.setFloatable(false);
		Men?LateraleTB.setBackground(new Color(255, 153, 51));
		Men?LateraleTB.setMaximumSize(new Dimension(100, 100));
		Men?LateraleTB.setOrientation(SwingConstants.VERTICAL);
		
		
		JButton ClientiButton = new JButton("");
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.VisualizzaFruttaMenuLateraleClientiBottonePremuto();
			}
		});
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		ClientiButton.setToolTipText("Clienti");
		Men?LateraleTB.add(ClientiButton);

		ClientiButton.setIcon(new ImageIcon(VisualizzaFruttaJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton VenditeButton = new JButton("");
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.VisualizzaFruttaMenuLateraleVenditeBottonePremuto();
			}
		});
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setToolTipText("Vendite");
		VenditeButton.setIcon(new ImageIcon(ClientiJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		Men?LateraleTB.add(VenditeButton);
		
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.VisualizzaFruttaMenuLateraleMagazzinoBottonePremuto();
			}
		});
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon(ClientiJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setToolTipText("Magazzino");
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		Men?LateraleTB.add(MagazzinoButton);
		

		Component VerticalStrut = Box.createVerticalStrut(280);
		VerticalStrut.setMaximumSize(new Dimension(32767, 300));
		Men?LateraleTB.add(VerticalStrut);
		
		
		JToolBar PercorsoTB = new JToolBar();
		PercorsoTB.setBorder(null);
		PercorsoTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		PercorsoTB.setBorderPainted(false);
		PercorsoTB.setFloatable(false);
		PercorsoTB.setBackground(new Color(255, 204, 153));
		PercorsoTB.setMaximumSize(new Dimension(100, 100));
		PercorsoTB.setBounds(65, 0, 976, 30);
		VisualizzaProdottiPanel.add(PercorsoTB);
		
		JButton MagazzinoPercorsoButton = new JButton("> Magazzino");
		MagazzinoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.VisualizzaFrutta_MagazzinoPercorsoBottonePremuto();
			}
		});
		MagazzinoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(MagazzinoPercorsoButton);
		
		JButton VisualizzaProdottiPercorsoButton = new JButton("> Visualizza Prodotti");
		VisualizzaProdottiPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.VisualizzaFrutta_VisualizzaProdottoPercorsoBottonePremuto();
			}
		});
		VisualizzaProdottiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(VisualizzaProdottiPercorsoButton);
		
		JButton VisualizzaFruttaPercorsoButton = new JButton("> Visualizza Frutta\r\n\r\n");
		VisualizzaFruttaPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.VisualizzaFrutta_VisualizzaFruttaPercorsoBottonePremuto();
				ControllerM.CompletaTabellaFrutta();
			}
		});
		VisualizzaFruttaPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(VisualizzaFruttaPercorsoButton);
		
		JButton IndietroButton = new JButton("Indietro");
		IndietroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.VisualizzaFruttaBottoneIndietroPremuto();
			}
		});
		IndietroButton.setFont(new Font("Arial", Font.PLAIN, 11));
		IndietroButton.setBounds(852, 521, 110, 31);
		VisualizzaProdottiPanel.add(IndietroButton);
		
		JScrollPane TabellaPanel = new JScrollPane();
		TabellaPanel.setBounds(95, 85, 789, 419);
		VisualizzaProdottiPanel.add(TabellaPanel);
		ProdottiTable = new JTable(Model);
		ProdottiTable.setFont(new Font("Arial", Font.PLAIN, 11));
		Sorter = new TableRowSorter<DefaultTableModel>(Model);
		ProdottiTable.setRowSelectionAllowed(false);
		ProdottiTable.setBackground(new Color(255, 204, 153));
		ProdottiTable.setAutoCreateRowSorter(true);
		ProdottiTable.setRowSorter(Sorter);
		ProdottiTable.getTableHeader().setReorderingAllowed(false);
		TabellaPanel.setViewportView(ProdottiTable);
		
		FiltraPerTF = new JTextField();
		FiltraPerTF.setBounds(412, 41, 256, 20);
		VisualizzaProdottiPanel.add(FiltraPerTF);
		FiltraPerTF.setColumns(10);
		
		JComboBox FiltraPerCB = new JComboBox();
		FiltraPerCB.setModel(new DefaultComboBoxModel(new String[] {"ID Prodotto", "Nome", "Provenienza", "Lotto Lavorazione", "Data", "Valore", "Scorte (kg)"}));
		FiltraPerCB.setSelectedIndex(0);
		FiltraPerCB.setBounds(283, 41, 119, 22);
		VisualizzaProdottiPanel.add(FiltraPerCB);
		
		JLabel FiltraPerLB = new JLabel("Filtra per:");
		FiltraPerLB.setFont(new Font("Arial", Font.PLAIN, 13));
		FiltraPerLB.setBounds(224, 41, 65, 20);
		VisualizzaProdottiPanel.add(FiltraPerLB);
		
		JButton EliminaButton = new JButton("Elimina");
		EliminaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.VisualizzaFruttaEliminaBottonePremuto();
			}
		});
		EliminaButton.setFont(new Font("Arial", Font.PLAIN, 11));
		EliminaButton.setBounds(894, 85, 82, 30);
		VisualizzaProdottiPanel.add(EliminaButton);
		FiltraPerCB.addItemListener(new ItemListener() {
			public void itemStateChanged (ItemEvent ie) {
				if(ie.getStateChange() == ItemEvent.SELECTED) {
				      FiltraPerTF.setText("");
				   }
			}
			
		});
		
		FiltraPerTF.getDocument().addDocumentListener(
                new DocumentListener() {
                    public void changedUpdate(DocumentEvent e) {
                    	newFilter(FiltraPerCB.getSelectedIndex());
                    }
                    public void insertUpdate(DocumentEvent e) {
                        newFilter(FiltraPerCB.getSelectedIndex());
                    }
                    public void removeUpdate(DocumentEvent e) {
                        newFilter(FiltraPerCB.getSelectedIndex());
                    }
                });
		
	}
	
	public void setRigheTabella(int ID_Prodotto, String Nome, String Provenienza, String Lotto, Date Data, float Valore, float Peso) {
		Model.addRow(new Object[]{ID_Prodotto, Nome, Provenienza, Lotto, Data, Valore, Peso});
		}
	
	private void newFilter(int IndiceColonna) {
	    RowFilter<DefaultTableModel, Object> rf = null;
	    try {
	        rf = RowFilter.regexFilter(FiltraPerTF.getText().toUpperCase(),IndiceColonna);
	    } catch (java.util.regex.PatternSyntaxException e) {
	        return;
	    }
	    Sorter.setRowFilter(rf);
 }
}
