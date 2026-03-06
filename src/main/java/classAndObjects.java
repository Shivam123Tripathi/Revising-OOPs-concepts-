class Car{
        String brand;
        int speed;

        void  drive(){
            System.out.println(brand + "is driving at " + speed + "km/h");

            //here we created blueprint called car(this is class)
            //car will have brand(brand property)
            //car will have speed(speed property)
            //car will have behaviour (function drive() )

        }
        public class Main{
            public static void main(String[] args) {
                Car c = new Car();//obj is created (in heap memory)
                c.brand = "Toyota";
                c.speed = 100;

                c.drive();//Toyota is driving at 100 km/h

                //now from blueprint of car we have created real car instance.
                //in heap memory
                //an object a real instance of a class

            }
        }
    }



