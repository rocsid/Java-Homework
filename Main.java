public class Main {
    public static void main(String[] args) {
    Address addr = new Address("Москва", "Тверская");
    ImmutableStudent student = new ImmutableStudent("Иван", 20, addr);

    System.out.println("До: " + student);

    addr.setCity("Питер");
    System.out.println("После изменения addr: " + student);

    student.getAddress().setCity("Казань");
    System.out.println("После getAddress().setCity: " + student);
    }
}
