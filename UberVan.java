import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    public UberVan(String license, Acount driver,
    Map<String, Map<String,Integer>> typeCarAccepted,ArrayList<String> seatsMaterial){
       super(license,driver);
       this.typeCarAccepted = typeCarAccepted;
       this.seatsMaterial = seatsMaterial;
   } 

   public UberVan(String license,Acount driver){
       super(license,driver);
   }

   //polimorfismo = cambiar el comportamiento de un metodo que viene de una clase padre
   @Override
   public void setPassenger(Integer passenger) {
    if(passenger == 6){
        this.passenger = passenger;
    }else{
        System.out.println("Necesiras asignar 6 pasajeros"); 
    }
   }
    
}
