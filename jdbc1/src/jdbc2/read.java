package jdbc2;
import java.io.BufferedReader;  
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileReader;  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.InputStreamReader;  
import java.io.RandomAccessFile;  
import java.io.Reader; 
public class read {
	 public static void readFileByLines(String fileName) {  
	        File file = new File(fileName);  
	        BufferedReader reader = null;  
	        try {  
	            System.out.println("����Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���У�");  
	            reader = new BufferedReader(new FileReader(file));  
	            String tempString = null;  
	            int line = 1;  
	            // һ�ζ���һ�У�ֱ������nullΪ�ļ�����  
	            while ((tempString = reader.readLine()) != null) {  
	                // ��ʾ�к�  
	                System.out.println(tempString);  
	                line++;  
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
	 public static void main(String[] args) {  
	        String fileName = "C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/Rec161219123327.txt";  
	        readFileByLines(fileName);
	    } 

}
