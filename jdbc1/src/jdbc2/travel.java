package jdbc2;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField; 

//
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
//

public class travel extends JFrame implements ActionListener{
	JTextField ID1;
	JTextField Sname1;
	static int line = 0;  
	static String[] tempString= new String [20];;  

	/*public travel () {
	//setFont(new java.awt.Font("Dialog",2,45000));
	setTitle("������Ϣ����");
	this.setLayout(null);
	setBounds(400, 150, 700, 350);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	JPanel jpl = new JPanel();
	JLabel lable2 = new JLabel(" ��ݵ��ţ� ");
	lable2.setFont(new java.awt.Font("����",1,16));
	JButton button1 = new JButton("��ѯ");
	button1.setFont(new java.awt.Font("����",1,18));
	JButton button2 = new JButton("����");
	button2.setFont(new java.awt.Font("����",1,18));
	//ID1=new JTextField ("",20);
	//ID1.setFont(new java.awt.Font("����",1,18));
	//ID1.setVisible(true);
	Sname1=new JTextField ("",2000);
	Sname1.setEditable(false);
	lable2.setBounds(0, 0, 150, 50);
	//ID1.setBounds(150, 0, 200, 50);
	button1.setBounds(100,250, 200, 50); 
	button2.setBounds(350,250, 200, 50);
	Sname1.setBounds(0,50, 700, 150);
	this.getContentPane().add(button2);
	this.getContentPane().add(button1);
	this.getContentPane().add(lable2);
	//this.getContentPane().add(ID1);
	this.getContentPane().add(Sname1);
	//this.getContentPane().add(jpl);
	button1.addActionListener(this);
	BHandler h = new BHandler();
	button2.addActionListener(h);
	setVisible(true);
	}
	private class BHandler implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        // TODO Auto-generated method stub
	        //JTextField textField = new JTextField();
	        ID1.setText("");
	    }
	}*/
	///////////////////////
	public static void readFileByLines(String fileName) {  
        File file = new File(fileName);  
        BufferedReader reader = null;  
        try {  
            System.out.println("����Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���У�");  
            reader = new BufferedReader(new FileReader(file));  
            
            
            // һ�ζ���һ�У�ֱ������nullΪ�ļ�����  
            while ((tempString[line] = reader.readLine()) != null) {  
                // ��ʾ�к�  
                System.out.println(tempString[line]);  
                line++;  
               // System.out.println(line);
            }  
            reader.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            if (reader != null) {  
                try {  
                    reader.close();  
                } catch (IOException e1) {  
                }  
            }  
        }  
    }  
	///////////////////////
	

	public void actionPerformed(ActionEvent arg0) {
	//String ID=ID1.getText();
/*	try {
		//Sname1.setText(sad(ID));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	//System.out.println(ID);
	}
	
	//read
	
	
	//
    public static void main(String[] args) throws Exception {
    	new travel ();
    	String fileName = "C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/Rec161219123327.txt";  
        readFileByLines(fileName);
        for(int i=0;i<line;i++)
        {
        	System.out.println(tempString[i]);
            sad(i);
        }
 
    }
	private static String sad(int i) throws SQLException {
		Connection conn = null;
        String sql;
        int result;
        String id;
        String index;
        String indexx=null;
        Scanner s = new Scanner(System.in);
        // MySQL��JDBC URL��д��ʽ��jdbc:mysql://�������ƣ����Ӷ˿�/���ݿ������?����=ֵ
        // ������������Ҫָ��useUnicode��characterEncoding
        // ִ�����ݿ����֮ǰҪ�����ݿ����ϵͳ�ϴ���һ�����ݿ⣬�����Լ�����
        // �������֮ǰ��Ҫ�ȴ���javademo���ݿ�
        String url = "jdbc:mysql://localhost:3306/t?"
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
            
                System.out.println("�������ݱ�ɹ�");
                sql = "select * from travel";
                
                
                ResultSet rs = stmt.executeQuery(sql);// executeQuery�᷵�ؽ���ļ��ϣ����򷵻ؿ�ֵ
                //id = s.next();
                System.out.println(line);
        
                
                id = tempString[i];
                //System.out.println(i);
                System.out.println(id.toString());
              //  id="20161201";
                while(rs.next()){
                	
    				if(rs.getString(1).equals(id)){
    					
    					index = rs.getString(2);
    					indexx = rs.getString(2)+" Tokyo";
    					//rs.last();
    					//rs.updateString(id, indexx);
    					sql = "update travel set Location = "+"'"+indexx+"' where ID = '"+id+"'";
    					result = stmt.executeUpdate(sql);
    					
    					System.out.println("���³ɹ�");
    					
    				}
                }
               // }

                System.out.println("ID\tLocation");
                while (rs.next()) {
                    System.out.println(rs.getString(1) + "\t" + rs.getString(2));// ��������ص���int���Ϳ�����getInt()
                }
            //}
        } catch (SQLException e) {
            System.out.println("MySQL��������");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
        return indexx;
	}
 
}