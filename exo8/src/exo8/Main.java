package exo8;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList teleP2 = new ArrayList();
		teleP2.add("021457896");
		
		Personnel per1 = new Personnel.Builder(new String("souk"),new String("elmbl")).fonction("directeur").build();;
		Personnel per = new Personnel.Builder(new String("souk"),new String("elmbl")).telephone(teleP2).build();
		
		Group group = new Group();
		group.add(per1);
		group.add(per);	
		group.print();
	}

}
