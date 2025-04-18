public class App {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        System.out.println("BEM VINDO AO TABUADA FÀCIL!");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--==-=-==-=-=-==-=-=-=-=");
        System.out.print("qual a tabuada que você quer entre 1 e 10? ");
        int num = (int) Double.parseDouble(scanner.nextLine());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--==-=-==-=-=-==-=-=-=-=");

        while (num > 10 || num < 1){
            System.out.print("qual a tabuada que você quer entre 1 e 10? ");
            num = (int) Double.parseDouble(scanner.nextLine());
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--==-=-==-=-=-==-=-=-=-=");
        }

        for (int n = 1; n <= 10; n++ ){
            int res = num * n;
            System.out.println(num +"X"+ n +"=" + res);
        }
    }
}
