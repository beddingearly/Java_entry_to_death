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
	setTitle("物流信息更新");
	this.setLayout(null);
	setBounds(400, 150, 700, 350);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	JPanel jpl = new JPanel();
	JLabel lable2 = new JLabel(" 快递单号： ");
	lable2.setFont(new java.awt.Font("宋体",1,16));
	JButton button1 = new JButton("查询");
	button1.setFont(new java.awt.Font("宋体",1,18));
	JButton button2 = new JButton("重置");
	button2.setFont(new java.awt.Font("宋体",1,18));
	//ID1=new JTextField ("",20);
	//ID1.setFont(new java.awt.Font("宋体",1,18));
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
            System.out.println("以行为单位读取文件内容，一次读一整行：");  
            reader = new BufferedReader(new FileReader(file));  
            
            
            // 一次读入一行，直到读入null为文件结束  
            while ((tempString[line] = reader.readLine()) != null) {  
                // 显示行号  
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
        // MySQL的JDBC URL编写方式：jdbc:mysql://主机名称：连接端口/数据库的名称?参数=值
        // 避免中文乱码要指定useUnicode和characterEncoding
        // 执行数据库操作之前要在数据库管理系统上创建一个数据库，名字自己定，
        // 下面语句之前就要先创建javademo数据库
        String url = "jdbc:mysql://localhost:3306/t?"
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
            
                System.out.println("创建数据表成功");
                sql = "select * from travel";
                
                
                ResultSet rs = stmt.executeQuery(sql);// executeQuery会返回结果的集合，否则返回空值
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
    					
    					System.out.println("更新成功");
    					
    				}
                }
               // }

                System.out.println("ID\tLocation");
                while (rs.next()) {
                    System.out.println(rs.getString(1) + "\t" + rs.getString(2));// 入如果返回的是int类型可以用getInt()
                }
            //}
        } catch (SQLException e) {
            System.out.println("MySQL操作错误");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
        }
        return indexx;
	}
 
}