package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setTitle("Sobre");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP");
		lblNewLabel.setBounds(63, 33, 143, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Desenvolvedora Cristiane Reis");
		lblNewLabel_1.setBounds(39, 73, 264, 14);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnGitub = new JButton("");
		btnGitub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/Cristiannireis/BuscaCep");
			}
		});
		btnGitub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGitub.setBorder(null);
		btnGitub.setIcon(new ImageIcon(Sobre.class.getResource("/img/gitb.png")));
		btnGitub.setBackground(SystemColor.control);
		btnGitub.setToolTipText("Github");
		btnGitub.setBounds(52, 133, 48, 48);
		getContentPane().add(btnGitub);

	}
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
