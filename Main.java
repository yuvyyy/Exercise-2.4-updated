
public class Main {
	public static void main(String[] args) {
		Car X = new Car();
		
		System.out.println("----------------- Car X------------------");
		System.out.println();
		X.setModel("Citroen C4 Cactus 1.6 BlueHDi");
		X.setEngineType("Diesel");
		X.setColour("Hello Yellow, Polar White, Sport Red, Tapenade Grey,Jelly Red");
		X.setMaxSpeed(114);
		X.setWeight(1610);
		X.setPrice(148980);
		
		System.out.println("Model " + X.getModel());
		System.out.println("Colour  " + X.getColour());
		System.out.println("EngineType " + X.getEngineType());
		System.out.println("MaxSpeed  " + X.getMaxSpeed() + " mPH ");
		System.out.println("Weight  " + X.getWeight() + " KG  " );
		System.out.println("Price  RM " + X.getPrice());
		

		System.out.println();

		System.out.println("----------------- Car Y------------------");
		System.out.println();
		Car Y = new Car();
		Y.setModel("Lamborgini Huracan EVO");
		Y.setEngineType("Petrol");
		Y.setColour("Grey, Blue, Oragne, Black");
		Y.setMaxSpeed(202);
		Y.setWeight(1422);
		Y.setPrice(15);
		
		System.out.println("Model " + Y.getModel());
		System.out.println("Colour  " + Y.getColour());
		System.out.println("Engine Type " + X.getEngineType());
		System.out.println("Max Speed  " + Y.getMaxSpeed() + " mPH");
		System.out.println("Weight  " + Y.getWeight() + " KG" );
		System.out.println("Price  RM " + Y.getPrice() + " Million");
		
	}

}