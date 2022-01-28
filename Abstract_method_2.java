abstract class Bank
{
	String bank_name,branch_name,ifsc_code;
	int rate_of_interest;
	void display()
	{
		System.out.println("BANK NAME: "+bank_name);
		System.out.println("BRANCH NAME: "+branch_name);
		System.out.println("IFSC CODE: "+ifsc_code);
	}
	abstract int getroi();
}
class SBI extends Bank
{
	SBI()
	{
		bank_name="SBI BANK";
		branch_name="Garia";
		ifsc_code="SBIN0005368";
	}
	int getroi()
	{
		rate_of_interest=6;
		return (rate_of_interest);
	}
}
class HDFC extends Bank
{
	HDFC()
	{
		bank_name="HDFC BANK";
		branch_name="Garia";
		ifsc_code="HDFC0009474";
	}
	int getroi()
	{
		rate_of_interest=9;
		return (rate_of_interest);
	}
}
class AXIS extends Bank
{
	AXIS()
	{
		bank_name="AXIS BANK";
		branch_name="Garia";
		ifsc_code="UTIB0000232";
	}
	int getroi()
	{
		rate_of_interest=8;
		return (rate_of_interest);
	}
}
class PNB extends Bank
{
	PNB()
	{
		bank_name="PNB BANK";
		branch_name="South Garia";
		ifsc_code="PUNB0320000";
	}
	int getroi()
	{
		rate_of_interest=7;
		return (rate_of_interest);
	}
}
class Abstract_method_2
{
	public static void main(String[] args)
	{
		SBI s = new SBI();
		HDFC h = new HDFC();
		AXIS a = new AXIS();
		PNB p = new PNB();
		System.out.println("Fixed Deposit Amount: Rs. 50000");
		System.out.println("The person must choose the below bank for FD.");
		if(s.getroi()>=h.getroi() && s.getroi()>=a.getroi() && s.getroi()>=p.getroi())
		{
			s.display();
		}
		else if(h.getroi()>=s.getroi() && h.getroi()>=a.getroi() && h.getroi()>=p.getroi())
		{
			h.display();
		}
		else if(a.getroi()>=s.getroi() && a.getroi()>=h.getroi() && a.getroi()>=p.getroi())
		{
			a.display();
		}
		else
		{
			p.display();
		}
	}
}
