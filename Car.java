
public class Car {
	String model;
	String enginetype;
	String colour;
	double maxspeed;
	double weight;
	double price;
	
		public void setModel(String model) {
			this.model = model;
		}
		
		public void setEngineType(String enginetype) {
			this.enginetype = enginetype;
		}
		
		public void setColour(String colour) {
			this.colour = colour;
		}
		
		public void setMaxSpeed(double maxspeed) {
			this.maxspeed = maxspeed;
		}
		
		public void setWeight(double weight) {
			this.weight = weight;
		}
		
		
		public void setPrice(double price) {
			this.price = price;
		}
		//Create Getter Method
		public String getModel() {
			return this.model;
		}
		
		public String getEngineType() {
			return this.enginetype;
		}
		
		public String getColour() {
			return this.colour;
		}

		public double getMaxSpeed() {
			return this.maxspeed;
		}
		
		public double getWeight() {
			return this.weight;
		}

		public double getPrice() {
			return this.price;
		}
}

