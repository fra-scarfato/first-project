package GUI.Magazzino;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;


import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controller.ControllerMagazzino;
import Controller.ControllerPrincipale;
import GUI.Cliente.ClientiJFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class MagazzinoJFrame extends JFrame {

	private JPanel MagazzinoPanel;
	private ControllerMagazzino ControllerM;
	private ControllerPrincipale ControllerP;
	private JButton MagazzinoButton;

	
	public  MagazzinoJFrame(ControllerMagazzino c, ControllerPrincipale c1) {
		ControllerM = c;
		ControllerP = c1;
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		setResizable(false);
		MagazzinoPanel = new JPanel();
		MagazzinoPanel.setBackground(new Color(255, 222, 173));
		MagazzinoPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		MagazzinoPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MagazzinoPanel);
		
		JPanel ContainerPanel = new JPanel();
		ContainerPanel.setBackground(new Color(255, 228, 181));
		ContainerPanel.setMinimumSize(new Dimension(310, 189));
		MagazzinoPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel Panel = new JPanel();
		Panel.setBackground(new Color(255, 204, 153));
		MagazzinoPanel.add(Panel, BorderLayout.CENTER);
		Panel.setLayout(new BorderLayout(0, 0));
		Panel.add(ContainerPanel);
		ContainerPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel Panel_1 = new JPanel();
		Panel_1.setBorder(null);
		Panel_1.setBackground(new Color(255, 228, 181));
		ContainerPanel.add(Panel_1);
		
		JButton AggiungiProdottoButton = new JButton("Aggiungi Nuovo Prodotto");
		AggiungiProdottoButton.setBounds(199, 200, 186, 103);
		AggiungiProdottoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.MostraFinestraAggiungiProdotto();
			}
		});
		Panel_1.setLayout(null);
		AggiungiProdottoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		AggiungiProdottoButton.setBackground(new Color(255, 204, 153));
		AggiungiProdottoButton.setMaximumSize(new Dimension(186, 102));
		AggiungiProdottoButton.setPreferredSize(new Dimension(186, 102));
		Panel_1.add(AggiungiProdottoButton);
		
		JButton VisualizzaProdottoButton = new JButton("Visualizza Prodotti");
		VisualizzaProdottoButton.setBounds(529, 200, 186, 103);
		VisualizzaProdottoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.MostraFinestraVisualizzaProdotto();
			}
		});
		VisualizzaProdottoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		VisualizzaProdottoButton.setBackground(new Color(255, 204, 153));
		VisualizzaProdottoButton.setMaximumSize(new Dimension(186, 102));
		VisualizzaProdottoButton.setPreferredSize(new Dimension(186, 23));
		Panel_1.add(VisualizzaProdottoButton);
		
		JLabel SezioneMagazzinoLB = new JLabel("Sezione Magazzino");
		SezioneMagazzinoLB.setPreferredSize(new Dimension(90, 50));
		SezioneMagazzinoLB.setMinimumSize(new Dimension(90, 50));
		SezioneMagazzinoLB.setMaximumSize(new Dimension(90, 50));
		SezioneMagazzinoLB.setBackground(new Color(255, 204, 153));
		SezioneMagazzinoLB.setFont(new Font("Arial", Font.PLAIN, 22));
		SezioneMagazzinoLB.setHorizontalAlignment(SwingConstants.CENTER);
		Panel.add(SezioneMagazzinoLB, BorderLayout.NORTH);
		
		JToolBar Men?LateraleTB = new JToolBar();
		MagazzinoPanel.add(Men?LateraleTB, BorderLayout.WEST);
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
				ControllerP.MagazzinoMenuLateraleClientiBottonePremuto();
			}
		});
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		ClientiButton.setToolTipText("Clienti");
		Men?LateraleTB.add(ClientiButton);
		ClientiButton.setIcon(new ImageIcon(ClientiJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		JButton VenditeButton = new JButton("");
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.MagazzinoMen?LateraleVenditeBottonePremuto();
				
			}
		});
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setToolTipText("Vendite");
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon(ClientiJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		Men?LateraleTB.add(VenditeButton);
		
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.MagazzinoMenuLateraleMagazzinoBottonePremuto();
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
	}
		
	}

