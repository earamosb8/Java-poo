class Car {
    Integer id;
    String license;
    Acount driver;
    Integer passenger;

    public Car(String license, Acount driver ){
        //this hace referencia al atributo de clase
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("License: " + license + " Driver: " + driver.name );
    }
}
