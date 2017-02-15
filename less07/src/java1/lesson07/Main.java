package java1.lesson07;

public class Main {

    static class Cat {
        String name;
        int appetite;
        boolean satiety;
        Plate myPlate;

        public Cat(String name, int appetite){
            this.name = name;
            this.appetite = appetite;
            this.satiety = false;
            this.myPlate = null;
        }

        public boolean eat(Plate food){
            satiety = food.decreaseFood(appetite);
            return satiety;
        }

    }
    static class Plate {
        int food;
        Cat myCat;

        public Plate(int food){
            this.food = food;
            this.myCat = null;
        }

        public boolean decreaseFood(int quantity){
            if(food - quantity >= 0) {
                food -= quantity;
                return true;
            }
            return false;
        }

        public String info(){
            return "Plate: " + food;
        }
    }
    public static void main(String[] args) {
        Cat [] cats = new Cat[3];
        cats[0] = new Cat("Wallie", 15);
        cats[1] = new Cat("Sofie", 10);
        cats[2] = new Cat("Mars", 3);
        Plate plate = new Plate(20);

        for(int i = 0; i < cats.length; i++){
            if(cats[i].eat(plate)){
                System.out.println(cats[i].name + " ate " + cats[i].appetite + " points of food. I'm not hungry");
                System.out.println(plate.info());
            }
            else {
                System.out.println(cats[i].name + " lack " + Math.abs(plate.food - cats[i].appetite) + " points of food. I'm hungry");
            }
        }

    }
}
