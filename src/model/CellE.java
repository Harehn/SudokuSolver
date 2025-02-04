package model;

import model.base.Cell;

public class CellE extends Cell {

	public CellE(int aNumber, boolean aGiven, boolean aSolved) {
		super(aNumber, aGiven, aSolved);
		if (!this.getGiven()) {
			for (int i=1; i<10;i++) {
				this.addPossible_number(Integer.valueOf(i));
			}
		}
	}
	
	// Return True if there is an error, False otherwise
	public boolean reset() {
		try {
			if (this.getGiven() || this.getSolved()) {
				if (this.getNumber() <=9 && this.getNumber() >= 0) {
					for (int i=1; i<10;i++) {
						this.removePossible_number(Integer.valueOf(i));
					}
					return true;
				}
			}
			return false;
		} catch(Exception e){
			return true;
		}
	}
	
	public boolean remove(int num) {
		return this.removePossible_number(Integer.valueOf(num));
	}
	
	public void removeAllPossibleNumebers() {
		for (int i=1; i<10;i++) {
			this.removePossible_number(Integer.valueOf(i));
		}
	}
	
	//Return True if a nakedSingle was found
	public boolean nakedSingle() {
		if(this.numberOfPossible_numbers()==1) {
			this.setNumber(this.getPossible_number(0));
			this.setSolved(true);
			this.removeAllPossibleNumebers();
			return true;
		}
		return false;
	}
	
	//Return True if can contain a num
	public boolean canContain(int num) {
		return this.indexOfPossible_number(Integer.valueOf(num)) != -1;
	}
	
	public String possibleNumbersAsString() {
		Integer[] nums = this.getPossible_numbers();
		String toReturn = "";
		for(Integer num: nums) {
			toReturn += num.toString();
		}
		return toReturn;
	}
}
