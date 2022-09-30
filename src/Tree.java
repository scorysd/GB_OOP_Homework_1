public class Tree {
    Human son;
    Human parent1;
    Human parent2;
       Tree (Human parent1, Human parent2, Human son){
           this.parent1 = parent1;
           this.parent2 = parent2;
           this.son = son;
       }
    public Human getFather(){
        return parent1;
    }
    public Human getMother(){
        return parent2;
    }
    public Human getSon(){
        return son;
    }
}
