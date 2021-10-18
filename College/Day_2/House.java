class House
{
    String house_name,address,pin_code;
    public static void main(String[] args)
    {
        House h = new House();
        h.make();
        System.out.println("Building Name: "+h.house_name);
        System.out.println("Address: "+h.address); 
        System.out.println("Pin Code: "+h.pin_code);
    }
    void make()
    {
       house_name="ABC Building";
       address="1A, ABC Building, Srinagar";
       pin_code="700075";
    }
}
