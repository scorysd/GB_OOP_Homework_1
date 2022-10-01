public class Tree {
    private Human son;
    private Human parent1;
    private Human parent2;

    Tree(Human parent1, Human parent2, Human son) {
        this.parent1 = parent1;
        this.parent2 = parent2;
        this.son = son;
    }

    public Human getFather() {
        if (this.parent1.getSex() == Sex.MALE)
            return parent1;
        else {
            return parent2;
        }
    }

    public Human getMother() {
        if (this.parent1.getSex() == Sex.FEMALE)
            return parent1;
        else {
            return parent2;
        }
    }

    public Human getSon() {
        return son;
    }
}
