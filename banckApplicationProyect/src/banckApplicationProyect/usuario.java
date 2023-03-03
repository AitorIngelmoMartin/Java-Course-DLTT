package banckApplicationProyect;

import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class usuario {

	protected ArrayList<String> ListOfAccountNames = new ArrayList<String>();
	protected int arrayPosition;
	usuario(String userName) {
		ListOfAccountNames.add(userName);
	}

	private void registerUser( String userName) {
		ListOfAccountNames.add(userName);

	}
	abstract void loadMenu();

	abstract BigDecimal makeAPay(int payAmount);

	abstract BigDecimal makeATransfer(String accountName, BigDecimal transferCuantity);

	abstract String seeOldOperations();
}
