public class Main {


    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 4500;
        int miles = service.calculate(price);
        System.out.println(miles);


    }
}
