package agreegation.tutorial;

public class Test {
	public static void main(String[] args) {
		
	Order order1 = new Order();
	Food food = new Food();
	food.setFoodName("Burgger");
	food.setUnitPrice(20);
	food.setQuantityAvailable(30);
	food.setFoodType("Chinese");
	food.setCuisine("ABC");	
	food.setQuantityAvailable(10);
	
	Food food1 = new Food();
	food1.setFoodName("Pizza");
	food1.setUnitPrice(120);
	food1.setFoodType("Chinese");
	food1.setCuisine("ABC");	
	food1.setQuantityAvailable(10);
	
	
	Food food2 = new Food();
	food2.setFoodName("Pizza");
	food2.setUnitPrice(120);
	food2.setFoodType("Chinese");
	food2.setCuisine("Italian cuisine");	
	food2.setQuantityAvailable(10);
	
	
	Food foodArray[] = new Food[3];
	foodArray[0] = food;
	foodArray[1] = food1;
	foodArray[2] = food2;
	
	order1.setOrderedFoods(foodArray);
	
	System.out.println("Your status : " + order1.getTotalNoOfOrders());
	System.out.println("You have to paid : " + order1.calculateTotalPrice("Debit Card"));
	}	
}
