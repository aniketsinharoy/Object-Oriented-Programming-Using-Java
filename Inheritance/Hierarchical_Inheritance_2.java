class Company
{
    String ad, n_ceo;
    void address()
    {
        ad="<Address_of_the_parent_company>";
        n_ceo="<Name_of_CEO_of_the_parent_company>";
        System.out.println("Address: "+ad+"\nName of CEO: "+n_ceo);
    }
}
class Amazon extends Company
{
    void address()
    {
        ad="Seattle, Washington, United States";
        n_ceo="Andy Jassy";
        System.out.println("Address: "+ad+"\nName of CEO: "+n_ceo);
    }
}
class Flipkart extends Company
{
    void address()
    {
        ad="Bangalore, Karnataka, India";
        n_ceo="Kalyan Krishnamurthy";
        System.out.println("Address: "+ad+"\nName of CEO: "+n_ceo);
    }
}
class Hierarchical_Inheritance_2
{
    public static void main(String args[])
    {
        Amazon a=new Amazon();
        a.address();
        Flipkart f=new Flipkart();
        f.address();
    }
}
