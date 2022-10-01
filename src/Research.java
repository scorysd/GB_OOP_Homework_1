public class Research {
    private Tree tree;
    private Human people;

    public Research(Tree tree) {
        this.tree = tree;
    }

    public void father() {
        System.out.println("Отец " + tree.getSon().getSecondName() + " это " + tree.getFather().getSecondName());
    }

    public void son() {
        System.out.println("Ребенок " + tree.getFather().getSecondName() + " и " + tree.getMother().getSecondName() + " это " + tree.getSon().getSecondName());
    }

    public void mother() {
        System.out.println("Мать " + tree.getSon().getSecondName() + " это " + tree.getMother().getSecondName());
    }
}

