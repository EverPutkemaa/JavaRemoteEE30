package UserValidatorHomeW2;



public class Engine {

    private String engineType;

    public Engine() {

        String type = new String();
        if ("economy".equalsIgnoreCase(type)) {
            this.engineType = "diesel";
        } else if ("luxury".equalsIgnoreCase(type)) {
            this.engineType = "electric";
        }else {
            this.engineType = "petrol";
        }
    }

    public String getEngineType() {
        return engineType;
    }

}

