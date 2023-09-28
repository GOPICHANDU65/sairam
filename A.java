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
        }
}
