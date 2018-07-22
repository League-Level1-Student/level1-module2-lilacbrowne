
public class PopcornMaker {

	public static void main(String[] args) {
	Microwave micro = new Microwave(); 

Popcorn Popcorn = new Popcorn("buttered");
micro.putInMicrowave(Popcorn );
micro.setTime(10);
micro.startMicrowave();
	Popcorn.eat();
	
	}
	
}
