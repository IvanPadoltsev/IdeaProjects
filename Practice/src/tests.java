import java.sql.SQLOutput;

public class tests {

    public static void main(String[] args) {

        int x = 10;
        System.out.println("Первоначальное значение x: " + x);
        int y = x++;
        System.out.println("Значение y = x++: " + y);
        System.out.println("Значение x после x++: " + x);
        y = ++x;
        System.out.println("Значение y = ++x: " + y);

        int len = "hello".length();
        System.out.println(len);

        int [] arr = {10, 2, 3, 40, 5, 60, 7, 8};
        System.out.println("Количество значений в массиве: " + arr.length);



        byte b;
        short s = 3_____00;
        b = (byte)s; // приведение типов, присваиваем большое число меньшему по размеру типу
        System.out.println(b);


        func(2,8);

    }

        public static void func (int a, int b) {
            int result = 1;
            for (int i = 1; i <= b; i++)
                result *= a;
            System.out.println("Число " + a + " в степени " + b + " = " + result);
        }
}