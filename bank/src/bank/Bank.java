package bank;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class User {
	private String name;
	private String password;
	public User() {
		super();
		this.name = "����";
		this.password = "111111";
	}
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	
}

//��½����
class Login extends JFrame {
	private JPanel contentPane; // �������
	private JLabel titel, nameLabel, passwordLabel;// ����
	private JTextField username;// �û����ı���
	private JPasswordField password;// ����
	private JButton login;// ��½��ť
	private Font font;

	public Login() {
		super("��ӭ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô����˳�ʱ����
		setSize(900, 600); // ���ô���λ�úʹ�С
		setLocationRelativeTo(null);
		setResizable(false);
		// �����������
		contentPane = new JPanel(null);
		titel = new JLabel("��ӭ��½");
		nameLabel = new JLabel("�û�����");
		passwordLabel = new JLabel("���룺");
		username = new JTextField(20);
		password = new JPasswordField(20);
		login = new JButton("��¼");
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(username.getText().equals(new User().getName()));
				if(username.getText().equals(new User().getName()) && password.getText().equals(new User().getPassword())) {
					dispose();
					Function fun = new Function();	
				}
				else {
					JOptionPane.showMessageDialog(null, "��¼ʧ�ܣ������û���������"
							+ "",
							"��Ϣ�Ի���", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		// ��������
		font = new Font("΢���ź�", Font.BOLD, 25);
		titel.setFont(font);
		login.setFont(font);
		font = new Font("΢���ź�", Font.PLAIN, 15);
		nameLabel.setFont(font);
		passwordLabel.setFont(font);
		// ���ò���
		titel.setBounds(400, 0, 100, 100);
		nameLabel.setBounds(300, 155, 50, 30);
		username.setBounds(350, 155, 200, 30);
		passwordLabel.setBounds(300, 255, 50, 30);
		password.setBounds(350, 255, 200, 30);
		login.setBounds(375, 400, 150, 50);
		contentPane.add(titel);
		contentPane.add(nameLabel);
		contentPane.add(username);
		contentPane.add(passwordLabel);
		contentPane.add(password);
		contentPane.add(login);
		setContentPane(contentPane);
		setVisible(true);
	}
}

//�û�����������
class Function extends JFrame {
	private JLabel tip;
	private JButton save, qu;
	private JPanel contentPane;
	private Font font;

	public Function() {
		super("���ܽ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô����˳�ʱ����
		setSize(900, 600); // ���ô���λ�úʹ�С
		setLocationRelativeTo(null);// �������
		setResizable(false);
		// �����������
		contentPane = new JPanel(new BorderLayout());
		save = new JButton("��Ǯ");
		qu = new JButton("ȡǮ");
		tip = new JLabel("�𾴵��û�����ӭ����ʹ��", JLabel.CENTER);
		// ��������
		font = new Font("΢���ź�", Font.BOLD, 25);
		tip.setFont(font);
		save.setFont(font);
		qu.setFont(font);
		// �����¼�
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				SaveMoney save = new SaveMoney();
			}
		});
		qu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				QuMoney qu = new QuMoney();
			}
		});
		// ���ò���
		contentPane.add(tip, BorderLayout.NORTH);
		contentPane.add(save, BorderLayout.WEST);
		contentPane.add(qu, BorderLayout.EAST);
		setContentPane(contentPane);
		setVisible(true);
	}
}

//��Ǯ
class SaveMoney extends JFrame {
	private JLabel savetip;
	private JTextField text;
	private JButton save, exit;
	private JPanel contentPane;
	private Font font;

	public SaveMoney() {
		super("���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô����˳�ʱ����
		setSize(900, 600); // ���ô���λ�úʹ�С
		setLocationRelativeTo(null);// �������
		setResizable(false);
		// �����������
		contentPane = new JPanel(null);
		exit = new JButton("����");
		savetip = new JLabel("��������Ҫ��Ľ��(��������100Ϊ��λ)");
		text = new JTextField(20);
		save = new JButton("��Ǯ");
		// ��������
		font = new Font("΢���ź�", Font.BOLD, 25);
		exit.setFont(font);
		font = new Font("΢���ź�", Font.PLAIN, 15);
		savetip.setFont(font);
		// �����¼�
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�洢�ɹ�,���洢�� " + (Integer.valueOf(text.getText()) +".00") + "Ԫ",
						"��Ϣ�Ի���", JOptionPane.WARNING_MESSAGE);
			}
		});
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Function f = new Function();
			}
		});
		// ���ò���
		savetip.setBounds(115, 100, 285, 30);
		text.setBounds(400, 100, 150, 30);
		save.setBounds(550, 100, 100, 30);
		exit.setBounds(350, 525, 200, 50);
		contentPane.add(savetip);
		contentPane.add(text);
		contentPane.add(save);
		contentPane.add(exit);
		setContentPane(contentPane);
		setVisible(true);
	}
}

//ȡǮ
//��Ǯ
class QuMoney extends JFrame {
	private JLabel savetip;
	private JTextField text;
	private JButton save, exit;
	private JPanel contentPane;
	private Font font;

	public QuMoney() {
		super("ȡ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô����˳�ʱ����
		setSize(900, 600); // ���ô���λ�úʹ�С
		setLocationRelativeTo(null);// �������
		setResizable(false);
		// �����������
		contentPane = new JPanel(null);
		exit = new JButton("����");
		savetip = new JLabel("��������Ҫȡ�Ľ��(��100Ϊ��λ)");
		text = new JTextField(20);
		save = new JButton("ȡǮ");
		// ��������
		font = new Font("΢���ź�", Font.BOLD, 25);
		exit.setFont(font);
		font = new Font("΢���ź�", Font.PLAIN, 15);
		savetip.setFont(font);
		// �����¼�
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "ȡ���ɹ�,��ȡ���� " + (Integer.valueOf(text.getText()) +".00") + "Ԫ",
						"��Ϣ�Ի���", JOptionPane.WARNING_MESSAGE);
			}
		});
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Function f = new Function();
			}
		});
		// ���ò���
		savetip.setBounds(165, 100, 245, 30);
		text.setBounds(400, 100, 150, 30);
		save.setBounds(550, 100, 100, 30);
		exit.setBounds(350, 525, 200, 50);
		contentPane.add(savetip);
		contentPane.add(text);
		contentPane.add(save);
		contentPane.add(exit);
		setContentPane(contentPane);
		setVisible(true);
	}
}

public class Bank {
	public static void main(String[] args) {
		Login login = new Login();
	}
}
