package exo8;

import java.awt.List;
import java.util.ArrayList;

public class Group implements element {

	private ArrayList<Personnel> group = new ArrayList<Personnel>();

	public void add(Personnel pers)
	{
		group.add(pers);
	}
	
	public void remove(Personnel pers)
	{
		group.remove(pers);
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		for (Personnel graphic : group) {
            graphic.print();
		}
	}
	
	
}
