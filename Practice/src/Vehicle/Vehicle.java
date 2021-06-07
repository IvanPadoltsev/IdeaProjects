package Vehicle;

public class Vehicle {
    int passengers;         // количество пассажиров
    int fueltank;           // объём бака (л)
    double fuelconsumption;    // расход литров на 100 км


// Конструктор класса Vehicle
    Vehicle(int p, int t, double c) {
        passengers = p;
        fueltank = t;
        fuelconsumption = c;
    }

// Определение дальности поездки на полном баке
        double range () {
        return fueltank * (100 / fuelconsumption);
        }

// Расчет объема топлива, необходимого транспортному
// средству для преодоления заданного расстояния
        double fuelneeded(int kilometers) {
        return (double) kilometers / (100 / fuelconsumption);
        }
}
