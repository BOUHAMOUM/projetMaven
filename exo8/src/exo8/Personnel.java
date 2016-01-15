package exo8;

import java.sql.Date;
import java.util.ArrayList;

public class Personnel implements element{
	private final String nom;
	private final String prenom;
	private final Date date_naissance;
	private final String fonction;
	private ArrayList telephone = new ArrayList();
	
 
    public static class Builder {
    	private final String nom;
    	private final String prenom;
    	private String fonction = "";
    	private ArrayList telephone =  new ArrayList();
		private Date date_naissance = new Date(2000,10,10);   	
 
		public Builder(String nom, String prenom) {
			this.nom      = nom;
			this.prenom = prenom;
		}
		
		public Builder telephone(ArrayList telephone) {
			this.telephone = telephone;
			return this;
		}
		
		public Builder date_naissance(Date date_naissance){
			this.date_naissance = date_naissance;
			return this;
		}
		
		public Builder fonction (String fonction)
		{
			this.fonction = fonction;
			return this;
		}
		
		public Personnel build() {
			return new Personnel(this);
		}
    }
    
    private Personnel(Builder builder)
    {
    	nom = builder.nom;
    	prenom = builder.prenom;
    	fonction = builder.fonction;
    	date_naissance = builder.date_naissance;
    	telephone = builder.telephone;
    }
    
	public static void main(String args[]) {
	
		Personnel per = new Personnel.Builder(new String("red"),new String("elmbl")).fonction("directeur").build();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}
}
