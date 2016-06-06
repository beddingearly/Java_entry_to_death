class Order{
	private String orderNo;
	private OrderStatus orderStatus;
	class OrderStatus{
		private boolean isShipped;
		private boolean isPaid;
		public OrderStatus(boolean shipped, boolean paid){
			isShipped = shipped;
			isPaid = paid;
		}
		public void printStatus(){
			System.out.println(isShipped);
			System.out.println(isPaid);
		}
	}
	public void printOrder(){
		System.out.println("---");
		System.out.println(orderNo);
		System.out.println(orderStatus.isShipped);
		System.out.println(orderStatus.isPaid);
		System.out.println("///");
		orderStatus.printStatus();
	}
	public Order(String no, boolean shipped, boolean paid){
		orderNo = no;
		orderStatus = new OrderStatus(shipped, paid);
	}
}

public class Ch9_1_1 {

	public static void main(String[] args) {
		Order order1 = new Order("order001", false, false);
		Order order2 = new Order("order002", true, false);
		order1.printOrder();
		order2.printOrder();
	}

}
