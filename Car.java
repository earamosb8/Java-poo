class Car {
    private Integer id;
    private String license;
    private Acount driver;
    protected Integer passenger;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Acount getDriver() {
        return driver;
    }

    public void setDriver(Acount driver) {
        this.driver = driver;
    }

    
}
