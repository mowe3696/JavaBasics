package javabasics.intercompany;

import java.util.ArrayList;

public class Entity {
	String name;
	double Rev_Acc = 0;
	double Exp_Acc = 0;
	double Rev_Elim_Acc = 0;
	double Exp_Elim_Acc = 0;
	double Bal_Rev = Rev_Acc - Rev_Elim_Acc;
	double Bal_Exp = Exp_Acc - Exp_Elim_Acc;
	
	public Entity(String name) {
		this.name = name;
	}
	
	ArrayList<Intercompany> intercompanies = new ArrayList<Intercompany>();
	
	// prints balance of entity
	public void show() {
		System.out.println("--------------Balance of " + this.name + "----------------");
		System.out.println("Revenue Account:  " + Rev_Acc + 
							"   Expense Account:  "+ Exp_Acc);
		System.out.println("Rev Elim Account: " + Rev_Elim_Acc +
							"     Exp Elim Account: "+ Exp_Elim_Acc);
		System.out.println("Bal Rev  Account: " + Bal_Rev +
				"     Bal Exp  Account: "+ Bal_Exp);
		
	}
	
	// prints balance of all intercompanies with transactions (with THIS entity)
	public void showIC() {
		for(Intercompany ic: intercompanies) {
		System.out.println("\n");
		System.out.println("----------------Balance of "+ ic.name + "--------------");
		System.out.println("Revenue Account:  " + ic.Rev_Acc + 
							"     Expense Account:  "+ ic.Exp_Acc);
		}
	}
}
