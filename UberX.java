//la herencia en java se usa con la palabra reservada
//extends
class UberX extends Car {
    String brand;
    String model;

    //el constructor debe coincidir con el de la clase padre
    public UberX(String license, Acount driver,String brand,String model){
        //super hace referencia al metodo constructor
        //de la clase padre
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
    @Override
    void printDataCar() {
        // TODO Auto-generated method stub
        super.printDataCar();
        System.out.println("MODEL " +   model + " BRAND "+brand);
    }
}
