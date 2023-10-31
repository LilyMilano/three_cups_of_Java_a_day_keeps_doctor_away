package Java_Barry_Burd.chapter14.main;

class SomeClass {
    private int myField = 10;    // Class Field

    // Getter and Setter:
    public int getMyField() {
        return myField;
    }
    public void setMyField(int myField) {
        this.myField = myField;
    }
}

class SomeOtherClass {
    public static void main(String[] args) {
        SomeClass someObject = new SomeClass();
        System.out.println(someObject.getMyField());   // 10
    }
}