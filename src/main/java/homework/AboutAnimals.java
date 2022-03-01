package homework;

public class AboutAnimals {
    public static void main(String[] args) {

        //About animals properties
        Animal squirrel = new Animal("Sciurus Aberti", "Gray", "Pipa");
        System.out.println(squirrel.getAnimalBreed() + " " + squirrel.getAnimalColor() + " " + squirrel.getAnimalName());

        Animal elephant = new Animal("Big Elephant", "Gray", "Bimbo");
        System.out.println(elephant.getAnimalBreed() + " " + elephant.getAnimalColor() + " " + elephant.getAnimalName());

        Animal giraffe = new Animal("Spotted Giraffe", "Yellow", "Bamble");
        System.out.println(giraffe.getAnimalBreed() + " " + giraffe.getAnimalColor() + " " + giraffe.getAnimalName());

        Animal monkey = new Animal("Small Monkey", "Black", "Sindy");
        System.out.println(monkey.getAnimalBreed() + " " + monkey.getAnimalColor() + " " + monkey.getAnimalName());

        Animal flamingos = new Animal("Fat Flamingos", "Rose", "Lamoo");
        System.out.println(flamingos.getAnimalBreed() + " " + flamingos.getAnimalColor() + " " + flamingos.getAnimalName());

        Animal snake = new Animal("Anakonda", "Black", "Miska");
        System.out.println(snake.getAnimalBreed() + " " + snake.getAnimalColor() + " " + snake.getAnimalName());

        System.out.println("");

        //About animal energy
        Animal cat = new Animal("Siberian", "White", "Borja");
        System.out.println(cat.getAnimalBreed() + " " + cat.getAnimalColor() + " " + cat.getAnimalName());
        cat.feed();
        cat.walk();
        cat.train();
        cat.play();
        cat.feed();
        cat.sleep();
    }
}


