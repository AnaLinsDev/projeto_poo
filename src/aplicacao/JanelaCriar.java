package aplicacao;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JanelaCriar extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTextField textFieldtelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCriar window = new JanelaCriar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaCriar() {
		getContentPane().setLayout(null);
		
		JLabel lblCriao = new JLabel("Cria\u00E7\u00E3o");
		lblCriao.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCriao.setBounds(152, 0, 130, 65);
		getContentPane().add(lblCriao);
		
		textFieldtelefone = new JTextField();
		textFieldtelefone.setBounds(118, 81, 118, 17);
		getContentPane().add(textFieldtelefone);
		textFieldtelefone.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Pedido Normal");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(143, 143, 206, 27);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Pedido Express");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setBounds(143, 172, 177, 21);
		getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel = new JLabel("Telefone");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(25, 75, 111, 21);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo do pedido:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(25, 108, 177, 29);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Criar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(25, 194, 85, 21);
		getContentPane().add(btnNewButton);
		
		JLabel idcriadolb = new JLabel("id criado:");
		idcriadolb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		idcriadolb.setBounds(37, 226, 333, 27);
		getContentPane().add(idcriadolb);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
