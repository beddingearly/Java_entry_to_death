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
	setTitle("��Ϣ¼�����");
	setBounds(400, 150, 900, 350);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container content = new Container();

	content.setBackground(Color.white);
	content.setLayout(new GridLayout(6,2,25,20));

	JLabel lable1 = new JLabel("��ӿ�ݵ��Ż�����Ϣ");
	JLabel lable2 = new JLabel("��ݵ��ţ� ");
	JLabel lable4 = new JLabel("�ļ��������� ");
	JLabel lable3 = new JLabel("�ռ��������� ");
	JLabel lable6 = new JLabel("�ļ��˵�ַ�� ");
	JLabel lable5 = new JLabel("�ռ��˵�ַ�� ");
	JLabel lable8 = new JLabel("�ļ�����ϵ��ʽ�� ");
	JLabel lable7 = new JLabel("�ռ�����ϵ��ʽ�� ");
	JLabel lable10 = new JLabel("�ļ����ʱࣺ ");
	JLabel lable9 = new JLabel("�ռ����ʱࣺ ");
	JButton button1 = new JButton("���");
	JButton button2 = new JButton("����");
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
        // MySQL��JDBC URL��д��ʽ��jdbc:mysql://�������ƣ����Ӷ˿�/���ݿ������?����=ֵ
        // ������������Ҫָ��useUnicode��characterEncoding
        // ִ�����ݿ����֮ǰҪ�����ݿ����ϵͳ�ϴ���һ�����ݿ⣬�����Լ�����
        // �������֮ǰ��Ҫ�ȴ���javademo���ݿ�
        String url = "jdbc:mysql://127.0.0.1:3306/t?"
                + "user=root&password=123456&useUnicode=true&characterEncoding=UTF8";
 
        try {
            // ֮����Ҫʹ������������䣬����ΪҪʹ��MySQL����������������Ҫ��������������
            // ����ͨ��Class.forName�������ؽ�ȥ��Ҳ����ͨ����ʼ������������������������ʽ������
            Class.forName("com.mysql.jdbc.Driver");// ��̬����mysql����
            // or:
            // com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
            // or��
            // new com.mysql.jdbc.Driver();
 
            System.out.println("�ɹ�����MySQL��������");
            // һ��Connection����һ�����ݿ�����
            conn = DriverManager.getConnection(url);
            // Statement������кܶ෽��������executeUpdate����ʵ�ֲ��룬���º�ɾ����
            Statement stmt = conn.createStatement();
            //sql = "create table student(NO char(20),name varchar(20),primary key(NO))";
            //int result = stmt.executeUpdate(sql);// executeUpdate���᷵��һ����Ӱ����������������-1��û�гɹ�
            int rss;
            //if (result != -1) {
                System.out.println("�������ݱ�ɹ�");
                //sql = "insert into log(ID,Sname,Rname,RAddr,SPhone,RPhone,SAddr,Rzip,Szip) values(6,'213','123','HUST',12,1,'CUG',430074,430074)";
                //sql = "insert into log values("+ID+", "+Sname+", "+Rname+", "+Raddr+", "+Saddr+", "+SPhone+", "+RPhone+", "+Rzip+", "+Szip+")";
                sql = "insert into log(ID,Sname,Rname,RAddr,SPhone,RPhone,SAddr,Rzip,Szip) values('"+ID+"','"+Sname+"','"+Rname+"','"+Raddr+"','"+SPhone+"','"+RPhone+"','"+Saddr+"','"+Rzip+"','"+Szip+"')";
                rss = stmt.executeUpdate(sql);
                
                sql = "select * from log";
                ResultSet rs = stmt.executeQuery(sql);// executeQuery�᷵�ؽ���ļ��ϣ����򷵻ؿ�ֵ
                /*System.out.println("ID\t������");
                while (rs.next()) {
                    System.out
                            .println(rs.getString(1) + "\t" + rs.getString(2));// ��������ص���int���Ϳ�����getInt()
                }*/
            //}
        } catch (SQLException e) {
            System.out.println("MySQL��������");
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