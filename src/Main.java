import sun.util.resources.LocaleData;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        String s = "EEEE DD MMMM yyyy HH:mm";
//        SimpleDateFormat date = new SimpleDateFormat(s);
//        String format = date.format(new Date());
//        System.out.println(format);
//        System.out.println(LocalDate.now());
//
//        LocalDate of = LocalDate.of(2020,3,21);
//        LocalDate to = LocalDate.of(2010,4,27);
//        DateTimeFormatter isoLocalDate = DateTimeFormatter.ISO_LOCAL_DATE;
//        TemporalAccessor parse = isoLocalDate.parse("2022-06-16");
//        System.out.println(parse);


//        HashMap<User, Car> CarHashMap = new HashMap<>();
//
//        System.out.println(System.currentTimeMillis());

//        Date date = new Date();
//        Date date1 = new Date(System.currentTimeMillis());
//
//        System.out.println(date);
//        System.out.println(date1);
//
//        int c = 0;
//        for (int i = 0; i < 100000; i++){
//            c++;
//            System.out.println(c);
//        }
//
//        Date date2 = new Date();
//        System.out.println(date2);

//        while (true) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(new Date());
//        }

//        User user0 = new User("User0",35);
//        User user1 = new User("User1",28);
//        User user2 = new User("User2",36);
//        User user3 = new User("User3",44);
//        User user4 = new User("User4",19);
//        User user5 = new User("User5",54);
//
//        System.out.println(user5 + " " + user5.hashCode());
//
//        System.out.println();
//
        Car car0 = new Car("Tesla_X1", true);
        Car car1 = new Car("Tesla_X2", true);
        Car car2 = new Car("Tesla_X3", true);
        Car car3 = new Car("Tesla_X4", true);
        Car car4 = new Car("Tesla_X5", true);
        Car car5 = new Car("Tesla_X6", true);
//
//        System.out.println();
//
        HashSet<Car>  cars = new HashSet<>();

        cars.add(car0);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        Stream<Car> stream = cars.stream();

        Operation operation = (a, b) -> a - b;
        System.out.println(operation.test(10, 10));

//        cars.stream().filter(car -> car.getModel().endsWith("X6")).forEach(System.out::println);


//
//        System.out.println(cars.contains(new Car("Tesla_X2", false)));
//
//        cars.forEach(System.out::println);
//
//        System.out.println();
//
//        CarHashMap.put(user0, car0);
//        CarHashMap.put(user1, car1);
//        CarHashMap.put(user2, car2);
//        CarHashMap.put(user3, car3);
//        CarHashMap.put(user4, car4);
//
//        CarHashMap.put(user5, car5);
//
//        CarHashMap.forEach((user, car) -> {
//                    System.out.println(user + " " + user.hashCode() + " " + car);
//                });
//
//
//        System.out.println();


    }

    interface Operation{
        int test(int a, int b);
    }


}
