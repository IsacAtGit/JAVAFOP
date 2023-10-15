package day08.solved;

class Rat {
	int roomInBelly = 5;

	public void eatCheese(int bitesOfCheese) {
		// Keep eating as long as there is roomInBelly and some cheese
		// is left
		while (bitesOfCheese > 0 && roomInBelly > 0) {
			bitesOfCheese--;//decrement the value
			roomInBelly--;   //decrement the value
		}
		System.out.println(bitesOfCheese + " pieces of cheese left");
	}
	public void showRoomInBelly() {
		System.out.println("Room in belly: " + roomInBelly);
	}
}
 
public class RatDemo {
	public static void main(String[] args) {
		Rat rat = new Rat();
		rat.roomInBelly = 5;  //assigning the values
		rat.eatCheese(10);    //passing 10 in the parameter
		// Calling Belly Capacity
		rat.showRoomInBelly();
	}
}
