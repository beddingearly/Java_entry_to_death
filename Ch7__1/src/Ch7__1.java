class Box{
	private int width;
	private int height;
	private int length;
	
	public Box(int width, int height, int length){
		this.width = width;
		this.height = height;
		this.length = length;
		
	}
	
	public int getC(){
		return (width * height + width * length + height * length) * 2;
	}
	
	public int getV(){
		return width * height * length;
	}
}
public class Ch7__1 {

	public static void main(String[] args) {
		Box b = new Box(1,1,1);
		System.out.println(b.getC());
		System.out.println(b.getV());

	}

}
