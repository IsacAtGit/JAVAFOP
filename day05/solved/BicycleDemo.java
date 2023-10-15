package day05.solved;

class Bicycle {
	

		int speed = 0;  //Initial speed and initial gear
		int gear = 1;

		void changeGear(int newValue) { //gear change will reflect on the gear attribute
                                        //by the parameter value
			gear = newValue;
		}

		void speedUp(int increment) {//speed increase will reflect on the speed attribute
                                      //by the parameter value
			speed = speed + increment;
		}

		void applyBrakes(int decrement) { //speed decrease will reflect on the speed attribute
                                           //by the parameter value
			speed = speed - decrement;
		}

		void printStates() {
			System.out.println(" speed:" + speed + " gear:" + gear);//print the current speed and gear
		}
	
}

public class BicycleDemo {
	public static void main(String[] args) {

		
		// Bicycle objects
		Bicycle bike1 = new Bicycle(); //object created for bike 1
		Bicycle bike2 = new Bicycle(); //object created for bike2

		// Invoke methods on
		// those objects
		bike1.speedUp(10);
		bike1.changeGear(2);
		bike1.printStates();

		bike2.speedUp(10);
		bike2.changeGear(2);
		bike2.speedUp(10);
		bike2.changeGear(3);
		bike2.printStates();
	}
}
