public class Car {
        private String mark; // deklaracja zmiennej
        private int year;
        private boolean isItWork;
        private String petrol;


        public Car() {} // konstruktor bezparametrowy

        public Car(String mark, int year, boolean isItWork)  { // parametrowy konstruktor klasy

            this.mark = mark; // uzupelnienie zmiennej
            this.year = year;
            this.isItWork = isItWork;
        }
public Car(String mark, String petrol) {
          this.mark = mark;
          this.petrol = petrol;
}

        public void carDetails(){
            System.out.println(mark + " " + year + " " + isItWork);
        }
        public void carInfo(){
            System.out.println(mark + " " + petrol);
        }

        public String getMark(){
            return mark;
        }

        public int getYear(){
            return year;
        }

        public boolean getIsItWork(){
            return isItWork;
        }

        public String getPetrol(){
            return petrol;
        }

        public void setMark(String mark){
            this.mark = mark;


        }

        public void setYear(int year){
            this.year = year;
        }

        public void setItWork(boolean isItWork){
            this.isItWork = isItWork;
        }

        public void setPetrol(String petrol){
            this.petrol = petrol;
        }

    public void startEngine() {
    }

    public void stopEngine() {
    }
}