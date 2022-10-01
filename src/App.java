class App {
    public static void main(String[] args) {
        Human petya = new Human("Иванов", "Петр", Sex.MALE);
        Human vanya = new Human("Иванов", "Иван", Sex.MALE);
        Human masha = new Human("Иванова", "Мария", Sex.FEMALE);
        Human vova = new Human("Иванов", "Владимир", Sex.MALE);
        Human valya = new Human("Иванова", "Валентина", Sex.FEMALE);
        Human sidor = new Human("Петров", "Сидор", Sex.MALE);
        Human agafia = new Human("Петрова", "Агафья", Sex.FEMALE);
        Tree gen1 = new Tree(vanya, masha, petya);
        Tree gen2 = new Tree(valya, sidor, vova);
        Research re1 = new Research(gen1);
        Research re2 = new Research(gen2);
        re1.father();
        re1.mother();
        re1.son();
        re2.father();
        re2.mother();
        re2.son();


    }
}