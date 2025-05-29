public class Parent extends Person {
    private Parent spouse;
    private Child[] children;
    private int childCount;

    public Parent(String name, int age, Parent spouse) {
        super(name, age);
        this.spouse = spouse;
        this.children = new Child[10];
        this.childCount = 0;
    }

    public Parent(String name, int age) {
        super(name, age);
        this.spouse = null;
        this.children = new Child[10];
        this.childCount = 0;
    }

    public Parent getSpouse() {
        return spouse;
    }

    public void setSpouse(Parent spouse) {
        this.spouse = spouse;
    }

    public Child[] getChildren() {
        Child[] actualChildren = new Child[childCount];
        System.arraycopy(children, 0, actualChildren, 0, childCount);
        return actualChildren;
    }

    public void setChildren(Child[] children) {
        this.children = children;
        this.childCount = children.length;
    }

    public void addChild(Child child) {
        if (childCount == children.length) {
            Child[] newChildren = new Child[children.length * 2];
            System.arraycopy(children, 0, newChildren, 0, children.length);
            children = newChildren;
        }
        children[childCount] = child;
        childCount++;
    }
} 