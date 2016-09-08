package gif;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class image {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedImage src1 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/1.jpg"));
        BufferedImage src2 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/2.jpg"));
        BufferedImage src3 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/3.jpg"));
        BufferedImage src4 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/4.jpg"));
        BufferedImage src5 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/5.jpg"));
        BufferedImage src6 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/6.jpg"));
        BufferedImage src7 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/7.jpg"));
        BufferedImage src8 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/8.jpg"));
        BufferedImage src9 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/9.jpg"));
        BufferedImage src10 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/10.jpg"));
        BufferedImage src11 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/11.jpg"));
        BufferedImage src12 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/12.jpg"));
        BufferedImage src13 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/13.jpg"));
        BufferedImage src14 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/14.jpg"));
        BufferedImage src15 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/15.jpg"));
        BufferedImage src16 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/16.jpg"));
        BufferedImage src17 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/17.jpg"));
        BufferedImage src18 = ImageIO.read(new File("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/18.jpg"));
        //BufferedImage src3 = ImageIO.read(new File("c:/ship3.jpg")); 
        AnimatedGifEncoder e = new AnimatedGifEncoder(); 
        e.setRepeat(0); 
        e.start("C:/Users/beddingearly/Documents/Tencent Files/137602260/FileRecv/MobileFile/Image/laoma.gif"); 
        e.setDelay(3000); // 1 frame per sec 
        e.addFrame(src1); 
        e.setDelay(1500); 
        e.addFrame(src2); 
        e.setDelay(1500); 
        e.addFrame(src3); 
        e.setDelay(1500); 
        e.addFrame(src4); 
        e.setDelay(1500); 
        e.addFrame(src5); 
        e.setDelay(1500); 
        e.addFrame(src6); 
        e.setDelay(1500);
        e.addFrame(src7); 
        e.setDelay(1500);
        e.addFrame(src8); 
        e.setDelay(1500);
        e.addFrame(src9); 
        e.setDelay(1500);
        e.addFrame(src10); 
        e.setDelay(1500);
        e.addFrame(src11); 
        e.setDelay(1500);
        e.addFrame(src12); 
        e.setDelay(1500);
        e.addFrame(src13); 
        e.setDelay(1500);
        e.addFrame(src14); 
        e.setDelay(1500);
        e.addFrame(src15); 
        e.setDelay(1500);
        e.addFrame(src16); 
        e.setDelay(1500);
        e.addFrame(src17); 
        e.setDelay(1500);
        e.addFrame(src18); 
        e.setDelay(1500);
        e.finish(); 

	}

}
