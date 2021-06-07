package Vehicle;

public class main {
    public static void main(String[] args) {
        double benz;
    Vehicle Bus = new Vehicle(80, 250, 35);
    Vehicle Lambo = new Vehicle(2, 60, 20);
    Vehicle Corolla = new Vehicle(4, 40, 10);

            int distance = 500;

        benz = Lambo.fuelneeded(distance);
        System.out.println("Дальность поездки Ламбы на полном баке = " + Lambo.range() + " км");
        System.out.println("Чтобы проехать " + distance + " км " + "Ламбе потребуется " + benz + " литров бенза!");
        System.out.println();

        benz = Bus.fuelneeded(distance);
        System.out.println("Дальность поездки автобуса на полном баке = " + Bus.range() + " км");
        System.out.println("Чтобы проехать " + distance + " км " + "автобусу потребуется " + benz + " литров бенза!");

    }
}
