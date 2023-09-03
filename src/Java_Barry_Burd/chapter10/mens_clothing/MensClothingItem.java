package Java_Barry_Burd.chapter10.mens_clothing;

public class MensClothingItem {
    // Declaration of Fields:
    private MensClothingKind kind;
    private String name;

    // Constructor:
    public MensClothingItem(MensClothingKind kind, String name){
        this.kind = kind;
        this.name = name;
    }

    // Getters and Setters:
    public MensClothingKind getKind() {
        return kind;
    }
    public void setKind(MensClothingKind kind) {
        this.kind = kind;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
