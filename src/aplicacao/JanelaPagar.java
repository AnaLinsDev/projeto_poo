package aplicacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JanelaPagar extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTextField idpedido;
	private JTextField entregador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPagar window = new JanelaPagar();
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
	public JanelaPagar() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pagamento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(126, 10, 154, 50);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id Pedido:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(102, 78, 105, 25);
		getContentPane().add(lblNewLabel_1);
		
		idpedido = new JTextField();
		idpedido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		idpedido.setBounds(217, 81, 132, 19);
		getContentPane().add(idpedido);
		idpedido.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome do entregador:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 135, 197, 25);
		getContentPane().add(lblNewLabel_1_1);
		
		entregador = new JTextField();
		entregador.setFont(new Font("Tahoma", Font.PLAIN, 20));
		entregador.setColumns(10);
		entregador.setBounds(217, 142, 132, 19);
		getContentPane().add(entregador);
		
		JButton btnNewButton = new JButton("Pagar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(260, 202, 88, 33);
		getContentPane().add(btnNewButton);
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
