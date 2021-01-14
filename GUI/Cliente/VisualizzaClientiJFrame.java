package GUI.Cliente;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controller.ControllerCliente;
import Controller.ControllerMagazzino;

import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class VisualizzaClientiJFrame extends JFrame {

	private JPanel VisualizzaClientiPanel;
	ControllerCliente controller;
	private JTable table;
	private DefaultTableModel Model = new DefaultTableModel(new String[] {"Numero Tessera", "Punti Fedelt�",  "Codice Fiscale", "Data di Rilascio", "Data di Scadenza"},0) {
		 public boolean isCellEditable(int row, int column) {
		       return false; //Tabella non modificabile
		    }
	};


	public VisualizzaClientiJFrame(ControllerCliente c) {
		controller = c;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		VisualizzaClientiPanel = new JPanel();
		VisualizzaClientiPanel.setBackground(new Color(255, 228, 181));
		VisualizzaClientiPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		VisualizzaClientiPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(VisualizzaClientiPanel);
		VisualizzaClientiPanel.setLayout(null);
		
		JToolBar Men�LateraleTB = new JToolBar();
		Men�LateraleTB.setBorder(null);
		Men�LateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		Men�LateraleTB.setBorderPainted(false);
		Men�LateraleTB.setFloatable(false);
		Men�LateraleTB.setBackground(new Color(255, 153, 51));
		Men�LateraleTB.setMaximumSize(new Dimension(100, 100));
		Men�LateraleTB.setBounds(0, 0, 65, 563);
		Men�LateraleTB.setOrientation(SwingConstants.VERTICAL);
		VisualizzaClientiPanel.add(Men�LateraleTB);
		
		JButton ClientiButton = new JButton("");
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		Men�LateraleTB.add(ClientiButton);
		ClientiButton.setIcon(new ImageIcon(VisualizzaClientiJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
		JButton VenditeButton = new JButton("");
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon(VisualizzaClientiJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		Men�LateraleTB.add(VenditeButton);
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon(VisualizzaClientiJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		Men�LateraleTB.add(MagazzinoButton);
		
		Component verticalStrut = Box.createVerticalStrut(280);
		Men�LateraleTB.add(verticalStrut);
		
		JButton InfoButton = new JButton("");
		InfoButton.setBackground(new Color(255, 153, 51));
		InfoButton.setIcon(new ImageIcon(VisualizzaClientiJFrame.class.getResource("/Risorse/info-menu.png")));
		InfoButton.setBorder(null);
		InfoButton.setBorderPainted(false);
		InfoButton.setMaximumSize(new Dimension(65, 70));
		Men�LateraleTB.add(InfoButton);
		
		JToolBar percorsoTB = new JToolBar();
		percorsoTB.setBorder(null);
		percorsoTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		percorsoTB.setBorderPainted(false);
		percorsoTB.setFloatable(false);
		percorsoTB.setBackground(new Color(255, 204, 153));
		percorsoTB.setMaximumSize(new Dimension(100, 100));
		percorsoTB.setBounds(65, 0, 976, 30);
		VisualizzaClientiPanel.add(percorsoTB);
		
		JButton MagazzinoPercorsoButton = new JButton("> Clienti");
		MagazzinoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controller.VisualizzaClientiClientiPercorsoButtonPressed();
				
			}
		});
		MagazzinoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(MagazzinoPercorsoButton);
		
		JButton VisualizzaProdottiPercorsoButton = new JButton("> Visualizza Clienti");
		VisualizzaProdottiPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				controller.VisualizzaClientiVisualizzaClientiPercorsoButtonPressed();
				controller.CompletaTabellaTessera();
			}
		});
		VisualizzaProdottiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(VisualizzaProdottiPercorsoButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(200, 116, 673, 385);
		VisualizzaClientiPanel.add(scrollPane);
		table = new JTable(Model);
		scrollPane.setViewportView(table);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setOrientation(SwingConstants.VERTICAL);
		toolBar.setBounds(75, 153, 115, 316);
		VisualizzaClientiPanel.add(toolBar);
		
		JButton EliminaTesseraJButton = new JButton("Elimina Tessera");
		EliminaTesseraJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controller.ApriEliminaTesseraByNTessera();
				
			}
		});
		EliminaTesseraJButton.setFont(new Font("Arial", Font.BOLD, 12));
		toolBar.add(EliminaTesseraJButton);
		
		JButton VisualizzaDettagliClienteJButton = new JButton("Dettagli Cliente");
		VisualizzaDettagliClienteJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controller.ApriDettagliClienteJDialog();
				
				
			}
		});
		VisualizzaDettagliClienteJButton.setFont(new Font("Arial", Font.BOLD, 12));
		toolBar.add(VisualizzaDettagliClienteJButton);

		


	}
	
	public void setRigheTabella(int NTessera, int PuntiFedelt�, String CF, Date DataRilascio, Date DataScadenza ){
		Model.addRow(new Object[] {NTessera, PuntiFedelt�, CF, DataRilascio, DataScadenza});
		
		}
}
