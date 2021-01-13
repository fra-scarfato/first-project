package GUI.Magazzino;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerMagazzino;

import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;

import java.awt.Dimension;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class VisualizzaProdottiJFrame extends JFrame {

	private JPanel VisualizzaProdottiPanel;
	private ControllerMagazzino Controller;

	/**
	 * Create the frame.
	 */
	public VisualizzaProdottiJFrame(ControllerMagazzino c) {
		Controller = c;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		VisualizzaProdottiPanel = new JPanel();
		VisualizzaProdottiPanel.setBackground(new Color(255, 228, 181));
		VisualizzaProdottiPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		VisualizzaProdottiPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(VisualizzaProdottiPanel);
		VisualizzaProdottiPanel.setLayout(null);
		
		JToolBar Men�LateraleTB = new JToolBar();
		Men�LateraleTB.setBorder(null);
		Men�LateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		Men�LateraleTB.setBorderPainted(false);
		Men�LateraleTB.setFloatable(false);
		Men�LateraleTB.setBackground(new Color(255, 153, 51));
		Men�LateraleTB.setMaximumSize(new Dimension(100, 100));
		Men�LateraleTB.setBounds(0, 0, 65, 563);
		Men�LateraleTB.setOrientation(SwingConstants.VERTICAL);
		VisualizzaProdottiPanel.add(Men�LateraleTB);
		
		JButton ClientiButton = new JButton("");
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		Men�LateraleTB.add(ClientiButton);
		ClientiButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\clientiii.png"));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		JButton VenditeButton = new JButton("");
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\cassaaaa.png"));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		Men�LateraleTB.add(VenditeButton);
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\scatolaaaa.png"));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		Men�LateraleTB.add(MagazzinoButton);
		
		JButton DipendentiButton = new JButton("");
		DipendentiButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\dipendentee.png"));
		DipendentiButton.setBorderPainted(false);
		DipendentiButton.setBorder(null);
		DipendentiButton.setBackground(new Color(255, 153, 51));
		DipendentiButton.setMaximumSize(new Dimension(65, 70));
		Men�LateraleTB.add(DipendentiButton);
		
		Component verticalStrut = Box.createVerticalStrut(200);
		Men�LateraleTB.add(verticalStrut);
		
		JButton InfoButton = new JButton("");
		InfoButton.setBackground(new Color(255, 153, 51));
		InfoButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\infoo.png"));
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
		VisualizzaProdottiPanel.add(percorsoTB);
		
		JButton MagazzinoPercorsoButton = new JButton("> Magazzino");
		MagazzinoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(MagazzinoPercorsoButton);
		
		JButton VisualizzaProdottiPercorsoButton = new JButton("> Visualizza Prodotti");
		VisualizzaProdottiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(VisualizzaProdottiPercorsoButton);
		
		JPanel ContainerPanel = new JPanel();
		ContainerPanel.setBackground(new Color(255, 204, 153));
		ContainerPanel.setBounds(186, 127, 663, 318);
		VisualizzaProdottiPanel.add(ContainerPanel);
		ContainerPanel.setLayout(null);
		
		JButton FruttaButton = new JButton("Frutta");
		FruttaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.MostraFinestraVisualizzaFrutta();
				Controller.CompletaTabellaFrutta();
			}
		});
		FruttaButton.setBounds(10, 11, 213, 145);
		ContainerPanel.add(FruttaButton);
		
		JButton VerduraButton = new JButton("Verdura");
		VerduraButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.MostraFinestraVisualizzaVerdura();
				Controller.CompletaTabellaVerdura();
				
			}
		});
		VerduraButton.setBounds(223, 11, 213, 145);
		ContainerPanel.add(VerduraButton);
		
		JButton LatticiniButton = new JButton("Latticini");
		LatticiniButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.MostraFinestraVisualizzaLatticini();
				Controller.CompletaTabellaLatticini();
				
			}
		});
		LatticiniButton.setBounds(436, 11, 213, 145);
		ContainerPanel.add(LatticiniButton);
		
		JButton FarinaceiButton = new JButton("Farinacei");
		FarinaceiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.MostraFinestraVisualizzaFarinacei();
				Controller.CompletaTabellaFarinacei();
				
			}
		});
		FarinaceiButton.setBounds(10, 162, 213, 145);
		ContainerPanel.add(FarinaceiButton);
		
		JButton ConfezionatiButton = new JButton("Confezionati");
		ConfezionatiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.MostraFinestraVisualizzaConfezionati();
				Controller.CompletaTabellaConfezionati();
				
			}
		});
		ConfezionatiButton.setBounds(223, 162, 213, 145);
		ContainerPanel.add(ConfezionatiButton);
		
		JButton UovaButton = new JButton("Uova");
		UovaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.MostraFinestraVisualizzaUova();
				Controller.CompletaTabellaUova();
				
			}
		});
		UovaButton.setBounds(436, 162, 213, 145);
		ContainerPanel.add(UovaButton);
		
		JLabel SelezionaCategoriaLB = new JLabel("Seleziona la categoria di cui vuoi visualizzare i prodotti");
		SelezionaCategoriaLB.setFont(new Font("Arial", Font.BOLD, 20));
		SelezionaCategoriaLB.setBounds(269, 63, 520, 66);
		VisualizzaProdottiPanel.add(SelezionaCategoriaLB);
	}
}
