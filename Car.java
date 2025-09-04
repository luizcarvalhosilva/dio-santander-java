public class Car {
    // Atributos
    private String model;
    private int manufacturingYear;
    private int mileage = 0;
    private boolean isElectric;
    private String color; 

    // Construtor 1
    public Car(String model, int manufacturingYear) {
        this.model = model;
        this.manufacturingYear = manufacturingYear;
    }

    // Construtor 2
    public Car(int mileage) {
        this.mileage = mileage;
    }

    // Método de instância (mensagem para o objeto)
    public void showInfo() {
        System.out.println("Modelo: " + model + " | Ano: " + manufacturingYear + " | Km: " + mileage);
    }

    // Método static (mensagem para a classe)
    public static void showGeneralInfo() {
        System.out.println("Todos os carros têm 4 rodas por padrão.");
    }

    public static void main(String[] args) {
        // Usando o primeiro construtor
        Car car1 = new Car("Civic", 2020);
        car1.mileage = 25000;
        car1.showInfo();
    }
}