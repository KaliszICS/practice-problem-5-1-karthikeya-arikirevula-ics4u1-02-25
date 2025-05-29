public class Child extends Person {
    private Parent parent1;
    private Parent parent2;
    private Child[] siblings;
    private int siblingCount;

    public Child(String name, int age, Parent parent1, Parent parent2) {
        super(name, age);
        this.parent1 = parent1;
        this.parent2 = parent2;
        this.siblings = new Child[10];
        this.siblingCount = 0;
    }

    public Parent getParent1() {
        return parent1;
    }

    public Parent getParent2() {
        return parent2;
    }

    public Child[] getSiblings() {
        Child[] actualSiblings = new Child[siblingCount];
        System.arraycopy(siblings, 0, actualSiblings, 0, siblingCount);
        return actualSiblings;
    }

    public void setSiblings(Child[] siblings) {
        this.siblings = siblings;
        this.siblingCount = siblings.length;
    }

    public void addSibling(Child child) {
        if (siblingCount == siblings.length) {
            Child[] newSiblings = new Child[siblings.length * 2];
            System.arraycopy(siblings, 0, newSiblings, 0, siblings.length);
            siblings = newSiblings;
        }
        siblings[siblingCount] = child;
        siblingCount++;
    }
}