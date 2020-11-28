package aplicacao;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NovaJanelaPedido extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NovaJanelaPedido window = new NovaJanelaPedido();
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
	public NovaJanelaPedido() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Criar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaCriar innerFrame = new JanelaCriar();
		        innerFrame.setVisible(true);
			}
		});
		btnNewButton.setBounds(43, 102, 119, 34);
		getContentPane().add(btnNewButton);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaAlterar innerFrame = new JanelaAlterar();
		        innerFrame.setVisible(true);
			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAlterar.setBounds(43, 176, 119, 34);
		getContentPane().add(btnAlterar);
		
		JButton btnNewButton_1_1 = new JButton("Pagar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaPagar innerFrame = new JanelaPagar();
		        innerFrame.setVisible(true);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1.setBounds(264, 102, 119, 34);
		getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("Pedido");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(167, 10, 217, 49);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1_1_1 = new JButton("Cancelar");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaCancelamento innerFrame = new JanelaCancelamento();
		        innerFrame.setVisible(true);
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1_1.setBounds(264, 176, 119, 34);
		getContentPane().add(btnNewButton_1_1_1);
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
