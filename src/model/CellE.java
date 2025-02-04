package model;

import model.base.Cell;

public class CellE extends Cell {

	public CellE(int aNumber, boolean aGiven, boolean aSolved) {
		super(aNumber, aGiven, aSolved);
		
		for (int i=1; i<10;i++) {
			this.addPossible_number(Integer.valueOf(i));
		}
	}
	
	// Return True if there is an error, False other wise
	public boolean reset() {
		try {
			if (this.getGiven() || this.getSolved()) {
				if (this.getNumber() <=9 && this.getNumber() >= 0) {
					this.getPossible_numbers();
				}
			}
		} catch(Exception e){
			
		}
		return false;
	}

}
