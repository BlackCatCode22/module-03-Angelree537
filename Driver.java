//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    MyStuff myCar = new MyStuff();
    myCar.carBrand = "Toyota";
    myCar.model = "Tacoma";
    myCar.year = 2016;
    myCar.licensePlate = "2l3JK5";
    myCar.SalvageTitle = false;

    System.out.println(myCar.carBrand);
        System.out.println(myCar.model);
    }
}