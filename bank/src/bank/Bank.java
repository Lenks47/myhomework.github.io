package bank;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class User {
	private String name;
	private String password;
	public User() {
		super();
		this.name = "李四";
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

//登陆界面
class Login extends JFrame {
	private JPanel contentPane; // 内容面板
	private JLabel titel, nameLabel, passwordLabel;// 标题
	private JTextField username;// 用户名文本框
	private JPasswordField password;// 密码
	private JButton login;// 登陆按钮
	private Font font;

	public Login() {
		super("欢迎界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体退出时操作
		setSize(900, 600); // 设置窗体位置和大小
		setLocationRelativeTo(null);
		setResizable(false);
		// 创建内容面板
		contentPane = new JPanel(null);
		titel = new JLabel("欢迎登陆");
		nameLabel = new JLabel("用户名：");
		passwordLabel = new JLabel("密码：");
		username = new JTextField(20);
		password = new JPasswordField(20);
		login = new JButton("登录");
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(username.getText().equals(new User().getName()));
				if(username.getText().equals(new User().getName()) && password.getText().equals(new User().getPassword())) {
					dispose();
					Function fun = new Function();	
				}
				else {
					JOptionPane.showMessageDialog(null, "登录失败，请检查用户名或密码"
							+ "",
							"消息对话框", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		// 设置字体
		font = new Font("微软雅黑", Font.BOLD, 25);
		titel.setFont(font);
		login.setFont(font);
		font = new Font("微软雅黑", Font.PLAIN, 15);
		nameLabel.setFont(font);
		passwordLabel.setFont(font);
		// 设置布局
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

//用户功能主界面
class Function extends JFrame {
	private JLabel tip;
	private JButton save, qu;
	private JPanel contentPane;
	private Font font;

	public Function() {
		super("功能界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体退出时操作
		setSize(900, 600); // 设置窗体位置和大小
		setLocationRelativeTo(null);// 窗体居中
		setResizable(false);
		// 创建内容面板
		contentPane = new JPanel(new BorderLayout());
		save = new JButton("存钱");
		qu = new JButton("取钱");
		tip = new JLabel("尊敬的用户，欢迎您的使用", JLabel.CENTER);
		// 设置字体
		font = new Font("微软雅黑", Font.BOLD, 25);
		tip.setFont(font);
		save.setFont(font);
		qu.setFont(font);
		// 设置事件
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
		// 设置布局
		contentPane.add(tip, BorderLayout.NORTH);
		contentPane.add(save, BorderLayout.WEST);
		contentPane.add(qu, BorderLayout.EAST);
		setContentPane(contentPane);
		setVisible(true);
	}
}

//存钱
class SaveMoney extends JFrame {
	private JLabel savetip;
	private JTextField text;
	private JButton save, exit;
	private JPanel contentPane;
	private Font font;

	public SaveMoney() {
		super("存款");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体退出时操作
		setSize(900, 600); // 设置窗体位置和大小
		setLocationRelativeTo(null);// 窗体居中
		setResizable(false);
		// 创建内容面板
		contentPane = new JPanel(null);
		exit = new JButton("返回");
		savetip = new JLabel("请输入您要存的金额(整数，以100为单位)");
		text = new JTextField(20);
		save = new JButton("存钱");
		// 设置字体
		font = new Font("微软雅黑", Font.BOLD, 25);
		exit.setFont(font);
		font = new Font("微软雅黑", Font.PLAIN, 15);
		savetip.setFont(font);
		// 设置事件
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "存储成功,您存储了 " + (Integer.valueOf(text.getText()) +".00") + "元",
						"消息对话框", JOptionPane.WARNING_MESSAGE);
			}
		});
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Function f = new Function();
			}
		});
		// 设置布局
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

//取钱
//存钱
class QuMoney extends JFrame {
	private JLabel savetip;
	private JTextField text;
	private JButton save, exit;
	private JPanel contentPane;
	private Font font;

	public QuMoney() {
		super("取款");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体退出时操作
		setSize(900, 600); // 设置窗体位置和大小
		setLocationRelativeTo(null);// 窗体居中
		setResizable(false);
		// 创建内容面板
		contentPane = new JPanel(null);
		exit = new JButton("返回");
		savetip = new JLabel("请输入您要取的金额(以100为单位)");
		text = new JTextField(20);
		save = new JButton("取钱");
		// 设置字体
		font = new Font("微软雅黑", Font.BOLD, 25);
		exit.setFont(font);
		font = new Font("微软雅黑", Font.PLAIN, 15);
		savetip.setFont(font);
		// 设置事件
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "取出成功,您取出了 " + (Integer.valueOf(text.getText()) +".00") + "元",
						"消息对话框", JOptionPane.WARNING_MESSAGE);
			}
		});
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Function f = new Function();
			}
		});
		// 设置布局
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
