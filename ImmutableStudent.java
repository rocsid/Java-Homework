public class ImmutableStudent {
    private final String name;
    private final int age;
    private final Address address;

    public ImmutableStudent(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address);
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public Address getAddress() {
        return new Address(address);
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + address;
    }
}
