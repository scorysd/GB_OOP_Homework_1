class app {
    public static void main(String[] args) {
        Human petya = new Human("Иванов", "Петр", 1);
        Human vanya = new Human("Иванов", "Иван", 1);
        Human masha = new Human("Иванова", "Мария", 0);
        Human vova = new Human("Иванов", "Владимир", 1);
        Human valya = new Human("Иванова", "Валентина", 0);
        Human sidor = new Human("Петров", "Сидор", 1);
        Human agafia = new Human("Петрова", "Агафья", 0);
        Tree BTree = new Tree(vanya, masha, petya);
        Human father = BTree.getFather();
        Human son = BTree.getSon();
        System.out.println(father.getFirstName());
        System.out.println(father.getSecondName());
        System.out.println(son.getFirstName());
        System.out.println(son.getSecondName());

    }
}