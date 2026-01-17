package Pk1;

class Vehicle {
	
    int speed;
    int fuelCapacity;
    String color;
    String model;

    // Default Constructor
    Vehicle() {
        System.out.println("Vehicle Default Constructor");
        this.speed = 80;
        this.fuelCapacity = 40;
        this.color = "Black";
        this.model = "Generic Model";
    }

    // Parameterized Constructor
    Vehicle(int speed, int fuelCapacity, String color, String model) {
        System.out.println("Vehicle Parameterized Constructor");
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        this.color = color;
        this.model = model;
    }

    // Setters
    void setSpeed(int speed) 
    { 
    	this.speed = speed; 
    	}
    
    void setFuelCapacity(int fuelCapacity) 
    { 
    	this.fuelCapacity = fuelCapacity; 
    	}
    
    void setColor(String color) 
    { 
    	this.color = color; 
    	}
    void setModel(String model) 
    { 
    	this.model = model; 
    	}

    // Getters
    int getSpeed() 
    { 
    	return speed; 
    	}
    int getFuelCapacity() 
    { 
    	return fuelCapacity; 
    	}
    
    String getColor() 
    { 
    	return color; 
    	}
    String getModel() 
    { 
    	return model; 
    	}
    

    // Display
    void display() {
        System.out.println("Speed: " + this.speed);
        System.out.println("Fuel Capacity: " + this.fuelCapacity);
        System.out.println("Color: " + this.color);
        System.out.println("Model: " + this.model);
    }
}



class Bike extends Vehicle {

    int mileage;
    String type;

    // Default Constructor
    Bike() {
        super();
        System.out.println("Bike Default Constructor");
        this.mileage = 50;
        this.type = "Sports";
    }

    // Parameterized Constructor
    Bike(int speed, int fuelCapacity, String color, String model,int mileage, String type) {

        super(speed, fuelCapacity, color, model);
        System.out.println("Bike Parameterized Constructor");

        this.mileage = mileage;
        this.type = type;
    }

    // Setters
    void setMileage(int mileage) 
    { 
    	this.mileage = mileage; 
    	}
    
    void setType(String type) 
    { 
    	this.type = type; 
    	}
    

    // Getters
    int getMileage() 
    { 
    	return mileage; 
    	}
    
    String getType() 
    { 
    	return type; 
    	}

    // Display
    void display() 
    {
        super.display();
        System.out.println("Mileage: " + this.mileage);
        System.out.println("Type: " + this.type);
    }
}



class car extends Vehicle {

    int seatingCapacity;
    String transmission;

    // Default Constructor
    car() {
        super();
        System.out.println("Vehicle Default Constructor");
        this.seatingCapacity = 5;
        this.transmission = "Automatic";
    }

    // Parameterized Constructor
    car(int speed, int fuelCapacity, String color, String model,int seatingCapacity, String transmission) {

        super(speed, fuelCapacity, color, model);
        System.out.println("Vehicle Parameterized Constructor");

        this.seatingCapacity = seatingCapacity;
        this.transmission = transmission;
    }

    // Setters
    void setSeatingCapacity(int seatingCapacity)
      { 
    	this.seatingCapacity = seatingCapacity; 
    	}
    void setTransmission(String transmission) 
    { 
    	this.transmission = transmission; 
    	}

    // Getters
    int getSeatingCapacity() 
    { 
    	return seatingCapacity; 
    	}
    String getTransmission() 
    { 
    	return transmission; 
    	}

    // Display
    void display() {
        super.display();
        System.out.println("Seating Capacity: " + this.seatingCapacity);
        System.out.println("Transmission: " + this.transmission);
    }
}



class TestVehilce {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        v1.display();
        System.out.println();

        Bike b1 = new Bike();
        b1.display();
        System.out.println();

        car c1 = new car();
        c1.display();
    }
}

