import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Insertar arbol");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ventana2_Main hijo = Ventana2_Main(this,true);
				hijo.setVisible(true);
				abrirFormularioArbol()
			}
		});
		btnNewButton.setBounds(147, 179, 148, 23);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(200, 82, 114, 20);
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		contentPane.add(comboBox);
		
		JLabel lblListaDeArboles = new JLabel("Lista de arboles:");
		lblListaDeArboles.setFont(new Font("Traditional Arabic", Font.BOLD, 14));
		lblListaDeArboles.setBounds(91, 85, 99, 17);
		contentPane.add(lblListaDeArboles);
	}
}
