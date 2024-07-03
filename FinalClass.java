final class FinalClass {
    final int finalDataMember = 10;

    final void finalMethod() {
        System.out.println("This is a final method. It cannot be overridden.");
    }

    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        System.out.println("Final data member: " + obj.finalDataMember);
        obj.finalMethod();
    }
}
