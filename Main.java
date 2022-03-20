//las clases en java deben tener el mismo nombre del archivo
// si no se define modificador de acceso a la clase
//ella toma el valor default : el cual permite que 
//esta clase sea accedida desde otras clases y paquetes
class Main {
    
    public static void main(String[] args) {
        System.out.println("hola mundo");
        //creando un objeto de la clase car
        
        //el objeto de empezar por el nombre de la clase
        //luego el nombre del objeto
        //luego el metodo constructor
        UberX uberX = new UberX("AMQ123",new Acount("Andres Herrera","AND123"),"Chevrolet","Sonic");
       // car.license = "AMQ123";
        uberX.setPassenger(4);
      //  car.driver = "Eduardo Ramos";
        uberX.printDataCar();
        //creamos objeto de la clase car
        //Car car2 = new Car("AMQ123",new Acount("Andres Herrera","AND123"));
        /*car2.license = "QWE567";
        car2.passenger = 3;
        car2.driver = "Andres Ramos";*/
        //car2.printDataCar();
        UberVan uberVan =  new UberVan("QKJ",new Acount("Eduarrdo Herrera","AND123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

    }

}