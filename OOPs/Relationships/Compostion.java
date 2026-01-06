class Engine{
    public void start(){
        System.out.println("Engine started");
    }

    public void stop(){
        System.out.println("Engine stopped");
    }
}

class  Car{

    private Engine engine;
    public Car(){
        engine = new Engine();
    }

    public void start(){
        engine.start();
        System.out.println("The car is runnig");
    }
    public void park(){
        engine.stop();
        System.out.println("The car is parked");
    }

}

public class Compostion{

    public static void main(String[] args) {
        
        Car alto = new Car();
        alto.start();
        alto.park();
    }
}