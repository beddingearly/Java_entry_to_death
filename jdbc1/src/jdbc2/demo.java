package jdbc2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
 
 
public class demo extends JFrame implements ActionListener{
	////////////////////////////////////
	JTextField ID1;
	JTextField Sname1;
	JTextField Rname1;
	JTextField Raddr1;
	JTextField Saddr1;
	JTextField SPhone1;
	JTextField RPhone1;
	JTextField Rzip1;
	JTextField Szip1;
	
	static String ID;
	static String Sname;
	static String Rname;
	static String Raddr;
	static String Saddr;
	static String SPhone;
	static String RPhone;
	static String Rzip;
	static String Szip;

	public demo () {
	setTitle("信息录入界面");
	setBounds(400, 150, 900, 350);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container content = new Container();

	content.setBackground(Color.white);
	content.setLayout(new GridLayout(6,2,25,20));

	JLabel lable1 = new JLabel("添加快递单号基本信息");
	JLabel lable2 = new JLabel("快递单号： ");
	JLabel lable4 = new JLabel("寄件人姓名： ");
	JLabel lable3 = new JLabel("收件人姓名： ");
	JLabel lable6 = new JLabel("寄件人地址： ");
	JLabel lable5 = new JLabel("收件人地址： ");
	JLabel lable8 = new JLabel("寄件人联系方式： ");
	JLabel lable7 = new JLabel("收件人联系方式： ");
	JLabel lable10 = new JLabel("寄件人邮编： ");
	JLabel lable9 = new JLabel("收件人邮编： ");
	JButton button1 = new JButton("添加");
	JButton button2 = new JButton("重置");
	JPanel buttonPanel = new JPanel();
	ButtonGroup group = new ButtonGroup( );
	ID1=new JTextField ("",20);
	Sname1=new JTextField ("",20);
	Rname1=new JTextField ("",20);
	Raddr1=new JTextField ("",20);
	Saddr1=new JTextField ("",20);
	RPhone1=new JTextField ("",20);
	SPhone1=new JTextField ("",20);
	Rzip1=new JTextField ("",20);
	Szip1=new JTextField ("",20);
	getContentPane().add(content, BorderLayout.CENTER);
	getContentPane().add(lable1,BorderLayout.NORTH);

	content.add(lable2);
	content.add(ID1);

	content.add(lable3);
	content.add(Rname1);

	content.add(lable4);
	content.add(Sname1);

	content.add(lable5);
	content.add(Raddr1);

	content.add(lable6);
	content.add(Saddr1);

	content.add(lable7);
	content.add(RPhone1);

	content.add(lable8);
	content.add(SPhone1);

	content.add(lable9);
	content.add(Rzip1);

	content.add(lable10);
	content.add(Szip1);

	content.add(button1);
	content.add(button2);

	button1.addActionListener(this);
	BHandler h = new BHandler();
	button2.addActionListener(h);
	//pack();
	setVisible(true);
	} 
	private class BHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//JTextField textField = new JTextField(); 
			ID1.setText("");
			Sname1.setText("");
			Rname1.setText("");
			Raddr1.setText("");
			Saddr1.setText("");
			SPhone1.setText("");
			RPhone1.setText("");
			Rzip1.setText("");
			Szip1.setText("");
		}
		
	}
	////////////////////////////////////

    public static void main(String[] args) throws Exception {
    	new demo();
        //fdfg();
 
    }
	private static void fdfg() throws SQLException {
		Connection conn = null;
        String sql;
        // MySQL的JDBC URL编写方式：jdbc:mysql://主机名称：连接端口/数据库的名称?参数=值
        // 避免中文乱码要指定useUnicode和characterEncoding
        // 执行数据库操作之前要在数据库管理系统上创建一个数据库，名字自己定，
        // 下面语句之前就要先创建javademo数据库
        String url = "jdbc:mysql://127.0.0.1:3306/t?"
                + "user=root&password=123456&useUnicode=true&characterEncoding=UTF8";
 
        try {
            // 之所以要使用下面这条语句，是因为要使用MySQL的驱动，所以我们要把它驱动起来，
            // 可以通过Class.forName把它加载进去，也可以通过初始化来驱动起来，下面三种形式都可以
            Class.forName("com.mysql.jdbc.Driver");// 动态加载mysql驱动
            // or:
            // com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
            // or：
            // new com.mysql.jdbc.Driver();
 
            System.out.println("成功加载MySQL驱动程序");
            // 一个Connection代表一个数据库连接
            conn = DriverManager.getConnection(url);
            // Statement里面带有很多方法，比如executeUpdate可以实现插入，更新和删除等
            Statement stmt = conn.createStatement();
            //sql = "create table student(NO char(20),name varchar(20),primary key(NO))";
            //int result = stmt.executeUpdate(sql);// executeUpdate语句会返回一个受影响的行数，如果返回-1就没有成功
            int rss;
            //if (result != -1) {
                System.out.println("创建数据表成功");
                //sql = "insert into log(ID,Sname,Rname,RAddr,SPhone,RPhone,SAddr,Rzip,Szip) values(6,'213','123','HUST',12,1,'CUG',430074,430074)";
                //sql = "insert into log values("+ID+", "+Sname+", "+Rname+", "+Raddr+", "+Saddr+", "+SPhone+", "+RPhone+", "+Rzip+", "+Szip+")";
                sql = "insert into log(ID,Sname,Rname,RAddr,SPhone,RPhone,SAddr,Rzip,Szip) values('"+ID+"','"+Sname+"','"+Rname+"','"+Raddr+"','"+SPhone+"','"+RPhone+"','"+Saddr+"','"+Rzip+"','"+Szip+"')";
                rss = stmt.executeUpdate(sql);
                
                sql = "select * from log";
                ResultSet rs = stmt.executeQuery(sql);// executeQuery会返回结果的集合，否则返回空值
                /*System.out.println("ID\t发件人");
                while (rs.next()) {
                    System.out
                            .println(rs.getString(1) + "\t" + rs.getString(2));// 入如果返回的是int类型可以用getInt()
                }*/
            //}
        } catch (SQLException e) {
            System.out.println("MySQL操作错误");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
	}
    /////////////////////////////////////
	public void actionPerformed(ActionEvent arg0) {
		ID=ID1.getText();
		Sname=Sname1.getText();
		Rname=Rname1.getText();
		Raddr=Raddr1.getText();
		Saddr=Saddr1.getText();
		SPhone=SPhone1.getText();
		RPhone=RPhone1.getText();
		Rzip=Rzip1.getText();
		Szip=Szip1.getText();
		try {
			fdfg();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ID);
	}

 
}