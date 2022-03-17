//las clases en java deben tener el mismo nombre del archivo

class Main {
    
    public static void main(String[] args) {
        System.out.println("hola mundo");
        //creando un objeto de la clase car
        
        //el objeto de empezar por el nombre de la clase
        //luego el nombre del objeto
        //luego el metodo constructor
        Car car = new Car("AMQ123",new Acount("Andres Herrera","AND123"));
       // car.license = "AMQ123";
       // car.passenger = 4;
      //  car.driver = "Eduardo Ramos";
        //car.printDataCar();
        //creamos objeto de la clase car
        Car car2 = new Car("AMQ123",new Acount("Andres Herrera","AND123"));
        /*car2.license = "QWE567";
        car2.passenger = 3;
        car2.driver = "Andres Ramos";*/
        car2.printDataCar();

    }

}