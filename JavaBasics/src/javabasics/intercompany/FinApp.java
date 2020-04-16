package javabasics.intercompany;

import java.util.ArrayList;

public class FinApp {
	
	static ArrayList<Entity> entities = new ArrayList<Entity>(); 
	
	// post intercompany revenue
	public static void postRevenue(Entity e, Intercompany ic, int amount){
		e.Rev_Acc += amount;

		e.intercompanies.add(ic);
			
		for (Intercompany icc : e.intercompanies) {
			if(icc.name.equals(ic.name)) {
				icc.Exp_Acc += amount;
			}
		}
	}
	
	// eliminates all intercompanie revenues
	// elimination of expense is missing
	public static void eliminate() {
		System.out.println("Starting Elimination");
		for(Entity e: entities) {
			System.out.println("Starting Entity: " + e.name);
			for(Intercompany ic: e.intercompanies) {
				System.out.println("Starting Intercompany :" + ic.name);
				e.Rev_Elim_Acc += ic.Rev_Acc;
				e.Exp_Elim_Acc += ic.Exp_Acc;
			}
		}
	}
	

	public static void main(String[] args) {
		Entity e1 =  new Entity("e1");
		Intercompany ic2 = new Intercompany("ic2");
		Intercompany ic3 = new Intercompany("ic3");
		
		postRevenue(e1, ic2, 100);
		postRevenue(e1, ic3, 50);
		e1.show();
		e1.showIC();
		
		entities.add(e1);
		
		eliminate();
		System.out.println("\nElimination done!\n");

		e1.show();
		e1.showIC();
	}

}

