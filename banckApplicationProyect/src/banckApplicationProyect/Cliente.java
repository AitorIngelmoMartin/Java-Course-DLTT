package banckApplicationProyect;

import java.math.BigDecimal;

class Cliente extends usuario {

	Cliente(String userName) {
		super(userName);

	}

	@Override
	void loadMenu() {
		// TODO Auto-generated method stub
		System.out.println("*======================================*");
		System.out.printf("Buenos días " + ListOfAccountNames.get(0)).println();
	}

	@Override
	BigDecimal makeAPay(int payAmount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	BigDecimal makeATransfer(String accountName, BigDecimal transferCuantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String seeOldOperations() {
		// TODO Auto-generated method stub
		return null;
	}


}
