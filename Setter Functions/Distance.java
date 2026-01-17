class Distance {
	int KM;
        int M;
	void setKm(int a)
	{ 
		this.KM = a;
	}
	void setM(int b)
	{ 
		this.M = b;
	}
	}//Distance class ends here
class TestDistance {
	public static void main(String args[]){
		Distance d1;
		d1= new Distance();
		d1.setKm(10);
                d1.setM(200);
		System.out.println("Distance in Km:"+d1.KM+"\nDistance in Metres:"+d1.M);
		
	}   //main ends here

} //test class ends here