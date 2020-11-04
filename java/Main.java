class Main {
 public static void main(String[] args) {
     System.out.println("Hola mundo de nuevo :)");
    //  instancia un objeto para la clase Car
     Car car = new Car();
    //  ajusta las propiedades dle objeto instancias
     car.license="AMQ123";
     car.driver = "Oscar Silvera";
     car.passengenger = 6;
     car.printDataCar();

    //  instancia un objeto para la clase Car
      Car car2 = new Car();
     //  ajusta las propiedades dle objeto instancias
     car2.license="WXYS456";
     car2.driver = "Maryluz Cardorna";
     car2.passengenger = 6;
     car2.printDataCar();
 }
 
}