public class A {
    public Student getStudent(){
     Student chandu = new Student();
     chandu.name = "HARI";
     chandu.rollno = 105;
     chandu.email = "chandu@gmail.com";
     return chandu;

    }
        public static void main(String[]args){
        A og = new A();
        System.out.println(og.getStudent().name);
        System.out.println(og.getStudent().rollno);
        System.out.println(og.getStudent().email);
        System.out.println(og.getAddress().houseno);
        System.out.println(og.getAddress().street);
        System.out.println(og.getAddress().village);
        System.out.println(og.getAddress().pincode);
        }
    public Address getAddress(){
        Address chandu = new Address();
        chandu.houseno = "1\18";
        chandu.street = "jayanthiroad";
        chandu.village = "peddapuram";
        chandu.pincode = 521181;
        return chandu;

    }

}
