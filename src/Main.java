import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Abrir Formulario");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(102, 201, 235, 23);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(143, 96, 142, 20);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Lista de arboles :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 97, 123, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBounds(102, 205, 46, 14);
		contentPane.add(label);
		
		JButton btnNewButton_1 = new JButton("Insertar Arbol");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirFormularioArbol();
			}

			private Datos Ventana2_Main(ActionListener actionListener, boolean b) {
				// TODO Apéndice de método generado automáticamente
				return null;
			}
		});
		btnNewButton_1.setBounds(116, 163, 169, 23);
		contentPane.add(btnNewButton_1);
	}

	protected void abrirFormularioArbol() {
		// TODO Apéndice de método generado automáticamente
		Datos hija = new Datos(this,"Formulario",true);
		hija.setVisible(true);
	}
}
