import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> workers = new ArrayList<>();
        worker Hunter = new worker("Hunter", "McCurdy", "000001", 2006, "Mr", 11.00);
        workers.add(String.valueOf(Hunter));
        worker Austin = new worker("Austin", "Iles", "000002", 2007, "Mr", 12.00);
        workers.add(String.valueOf(Austin));
        worker Shane = new worker("Shane", "Frederick", "000003", 2007, "Mr", 13.00);
        workers.add(String.valueOf(Shane));
        System.out.println("Week 1");
        System.out.println(Hunter.caclulateWeeklyPay(40));
        System.out.println(Austin.caclulateWeeklyPay(40));
        System.out.println(Shane.caclulateWeeklyPay(40));

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Week 2");

        System.out.println(Hunter.caclulateWeeklyPay(50));
        System.out.println(Austin.caclulateWeeklyPay(50));
        System.out.println(Shane.caclulateWeeklyPay(50));

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Week 3");

        System.out.println(Hunter.caclulateWeeklyPay(40));
        System.out.println(Austin.caclulateWeeklyPay(40));
        System.out.println(Shane.caclulateWeeklyPay(40));
    }
}