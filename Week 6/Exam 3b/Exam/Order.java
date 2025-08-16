public class Order {
   private int orderNum;
   private double orderAmount;
   private double orderDiscount;

   public Order(int orderNumber, double orderAmt, double orderDisc) {
      orderNum = orderNumber;
      orderAmount = orderAmt;
      orderDiscount = orderDisc;
   }

   public double finalOrderTotal() {
      return orderAmount - orderAmount * orderDiscount;
   }
}
