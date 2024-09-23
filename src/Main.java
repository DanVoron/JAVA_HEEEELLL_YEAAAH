import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

while (true){
    System.out.println("Введите кол-во гостей");
    int n = scanner.nextInt();
    int countCut = 0;
    if(n==1){
        countCut=0;
    }else     if (n%2==0){
        countCut = n/2;
    } else {
        countCut=n;
    }


    System.out.println(String.format("Нужно %d надрезов",countCut));

}


        //sout для println
//        System.out.print("Положите пиво в пивоприёмник");
//        System.out.println("!!!");
//        int n = scanner.nextInt();
//        System.out.println(n*5);
    }

    public void huina(){
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        String stroka="123";
        char z = 'z';
        boolean trye = true;
        if(trye){
            System.out.print("G");
        }else if(!trye){
            //gege
        }
        else{
            //lmao
        }
        System.out.println("Hello world!");
    }
}