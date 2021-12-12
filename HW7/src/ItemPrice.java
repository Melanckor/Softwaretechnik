

public class ItemPrice implements Visitor{

	public ItemPrice() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visitGlass(Glass g) {
		double price=0;
		switch(g.tickness) {
		case 1:price= 2 * g.lenght;break;
		case 2:price= (1.2) * g.lenght;break;
		case 3: price = 0.7*g.lenght;break;
		
		}
		System.out.println("Total Cost of "+ g.name+" is : "+ price + " ");
	}

	@Override
	public void visitElectronic(Electronic e) {
		double price = 0;
		if(e.fragile) {
			double Kilo = (e.weight/10);
		    price = 5*Kilo;
			
		}else {
			double Kilo = (e.weight/15);
		    price = 5*Kilo;
			}
		System.out.println("Total Cost of "+ e.name + " is : "  + price + " ");
	}

	@Override
	public void visitFurniture(Furniture f) {
		double price =0 ;
	    int Kilo = f.weight;
	    price = Kilo;
	   
	    System.out.println("Total Cost of "+f.name +" is : "+ price + " ");
	}
	
	public void getPrice(HouseholdItem item){
		item.accept(this);
		}

}
