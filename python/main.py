from car import Car

if __name__ == "__main__":
    print("Hola mundo")
    
    car = Car()
    car.license = "QWUZ-123"
    car.driver = "Oscar Silvera"
    car.passegenger = 12
    print(vars(car))
    
    car2 = Car()
    car2.license = "QWUZ-123"
    car2.driver = "Oscar Silvera"
    car2.passegenger = 12
    print(vars(car2))    