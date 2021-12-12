

public class ItemInstructions implements Visitor {

	

	@Override
	public void visitGlass(Glass g) {
		int x,y,z;
		x= g.width+1 ;
		y=g.lenght+1;
		z= g.height+1;
		System.out.println(g.name+ " should be packed in a box with bubble wraps,"
				+ " the dimensions of the box are: Width ="+ x + "Length = "+y + "height= " +z);
	}

	@Override
	public void visitElectronic(Electronic e) {
		// TODO Auto-generated method stub
		int x,y,z;
		x= e.width+1 ;
		y=e.lenght+1;
		z= e.height+1;
		System.out.println(e.name+ " should be covered with Polyethylene foam film and packed in a"
				+ " the dimensions of the box are: Width ="+ x + "Length = "+y + "height= " +z);
	}

	@Override
	public void visitFurniture(Furniture f) {
		// TODO Auto-generated method stub
		System.out.println(f.name+ " should be covered with waterproof covers with an area of the "+ f.lenght +" x " +f.width);
		
	}
	public void getInstruction(HouseholdItem item){
		item.accept(this);
		}
}
