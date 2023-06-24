package test_29_9_22;
import java.util.*;

public class Transaction {
	private static ArrayList<CreditCard> creditCards =  new ArrayList<CreditCard>();
	private double amount;
	private CreditCard card;
	public Transaction(double amount, int digits, int code) throws Exception{
		boolean flag1=false;
		boolean flag2 = false;
		if(digits<99 || digits >1000 || code <1000 || code > 9999) {
			throw new InvalidValuesException("code or cvv are wrong");
		}
		else {
			flag1=true;
		}
		boolean flag = this.isCard(digits, code);
		
		if(!flag) {
			throw new UnrecognizedCardException("cvv not in list!");
		}
		else {
			flag2=true;
		}
		
		if(flag1 && flag2) {
			this.amount=amount;
		}
		
	}
	public boolean isCard(int digits, int code) {
		boolean flag = false;
		for(CreditCard c:creditCards) {
			if(c.is3BackDigits(digits)&&c.isCode(code)) {
				flag=true;
			}
		}
		return flag;
	}
	
	public Transaction(Transaction other) {
		amount=other.amount;
		card=other.card;
		creditCards=other.creditCards;
	}
	
	public void addCard(CreditCard card) {
		creditCards.add(card);
	}
	
	
	

	public static void main(String[] args) throws Exception {
		CreditCard card = new CreditCard("a","s",111,1111);
		boolean a = true;
		creditCards.add(card);
		Scanner input = new Scanner(System.in);
		int cvv;
		int code;
		int count =3;
		while(count>0) {
			System.out.print("please enter cvv:");
			cvv = input.nextInt();
			System.out.print("please enter code:");
			code = input.nextInt();
			try {
				Transaction transaction = new Transaction(100 , cvv, code);
				if(transaction.isCard(cvv, code)) {
					count=0;
					System.out.println("correct number");
					a =  false;
				}
			}
			catch(UnrecognizedCardException e) {
				System.out.println(e.getMessage());
				count--;
			}
			catch(InvalidValuesException e) {
				System.out.println(e.getMessage());
	
			}
			if(count==0 && a) {
				System.out.println("Three try's");
			}
		}
		input.close();
	}

}
