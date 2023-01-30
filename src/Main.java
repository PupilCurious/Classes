public class Main {
    public static void main(String[] args) {
        //Reference Type
        CustomerManager customerManager = new CustomerManager(); // stack - heap yapısından dolayı bu boşa düştü
        CustomerManager customerManager1 = new CustomerManager();
        customerManager = customerManager1;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //Value Type
        int number1 = 10;
        int number2 = 20;
        number2=number1;
        number1 = 30;
        System.out.println(number2);

        int[] numbers1 = new int[] {1,2,3};
        int[] numbers2 = new int[] {4,5,6};

        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers1[0]);

    }
}