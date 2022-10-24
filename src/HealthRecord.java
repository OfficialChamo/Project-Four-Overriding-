public class HealthRecord {
    public void details (){
        System.out.println("Saman's height 5 ft");
    }
}
class A extends HealthRecord{
    @Override
    public void details() {
        super.details();
        System.out.println("Amara's weight 60 KG");
    }
}
class B extends HealthRecord{
    @Override
    public void details() {
        System.out.println("Kamal's surname is Dissanayake");
    }

    public static void main(String[] args) {
        A a = new A();
        HealthRecord b = new B();
        a.details();
        b.details();
    }

}