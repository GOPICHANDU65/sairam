public class Customdatatypemethodperameter {
    public Student getStudent() {
        Student chandu = new Student();
        chandu.name = "HARI";
        chandu.rollno = 105;
        chandu.email = "chandu@gmail.com";
        Address address = new Address();
        address.houseno = "18";
        address.street = "jayanthiroad";
        address.village = "peddapuram";
        address.pincode = 521181;
        chandu.Address = address;
        Country country = new Country();
        country.country = "india";
        address.Country = country;
        return chandu;


    }

    public Student getstudent(Address add){
     Student chandu=new Student();
     chandu.name="hari";
     chandu.rollno=105;
     chandu.email="chandu@gmail.com";
     chandu.Address=add;
     return chandu;


    }
    public static void main(String[]args){
        Address address=new Address();
        address.houseno="18";
        address.street="jayanthiroad";
        address.village="peddapuram";
        address.pincode=521181;
        Customdatatypemethodperameter abc=new Customdatatypemethodperameter();
        System.out.println(abc.getstudent(address));

    }
}








