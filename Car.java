class Car {
    Integer id;
    String license;
    Acount driver;
    private Integer passenger;

    public Car(String license, Acount driver ){
        //this hace referencia al atributo de clase
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        if(passenger != null){
            System.out.println("License: " + license + " Driver: " + driver.name + " Pasajeros: " + passenger );
        }
    }
        
    public Integer getPassenger(){
        return passenger;
    }
    public void setPassenger(Integer passenger){
        if(passenger == 4){
            this.passenger = passenger;
        }else{
            System.out.println("Necesiras asignar 4 pasajeros"); 
        }
       
    }
}
