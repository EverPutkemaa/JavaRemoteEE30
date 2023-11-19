package UserValidatorHomeW2;

public class Main {

    public static void main(String[]args) {
        MovieCreator.setDefaultTitle("Inception");
        MovieCreator.setDefaultDirector("Cristopher Nolan");
        MovieCreator.setDefaultYearOfRelease(2010);
        MovieCreator.setDefaultGenre("Science Fiction");
        MovieCreator.setDefaultDistributor("Warner Bros.");

        Movie inception = MovieCreator.creatorMovie();

        System.out.println(inception);

        Car economyCar = new Car("Toyota", "economy");
        System.out.println("Make: " + economyCar.getMake());
        System.out.println("Type: " + economyCar.getType());
        System.out.println("Engine Type: " + economyCar.getEngine().getEngineType());

        Car luxuryCar = new Car("Mercedes","luxury");
        System.out.println("Make: " + luxuryCar.getMake());
        System.out.println("Type: " + luxuryCar.getType());
        System.out.println("Engine Type: " + luxuryCar.getEngine().getEngineType());

        Car regularCar = new Car("Honda","sedan");

        System.out.println("Make: " + regularCar.getMake());
        System.out.println("Type: " + regularCar.getType());
        System.out.println("Engine Type: " + regularCar.getEngine().getEngineType());
    }


}
