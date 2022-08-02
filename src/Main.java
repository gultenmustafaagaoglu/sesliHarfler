
public class Main {
    public static void main(String[] args) {

   /*     char harf='E';
        switch (harf) {
            case 'A':
            case 'I':
                System.out.println("Kalin sesli");
                break;
            default:
                System.out.println("Ince sesli");
        }*/

        //Mükemmel Sayı
      /*  int number = 28;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i==0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println("Mukemmel sayidir");
        }else {
            System.out.println("Mukemmel sayi degildir");
        }*/

        //Arkadaş Sayılar
     /*   int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i=1; i<sayi1; i++){
            if(sayi1 % i==0){
                toplam1 = toplam1 + i;
            }
        }
        for (int i=1; i<sayi2; i++){
            if (sayi2 % i==0){
                toplam2 = toplam2 + i;
            }
        }
        if (sayi1==toplam2 && sayi2==toplam1){
            System.out.println("Bu iki sayi arkadastir");
        }else {
            System.out.println("Bu iki sayi arkadas degildir");
        }*/

        //Sayı Bulma
       /* int[] sayilar = new int[] {1,2,4,5,6,8};
        int aranacak = 5;
        boolean varMi=false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
            if (varMi){
                System.out.println("Sayi mevcuttur");
            }
            else {
                System.out.println("Sayi mevcut degildir");
            }*/
     /*   Scanner input = new Scanner(System.in);
        System.out.println("Sinav Notunuzu Giriniz : ");
        int a = input.nextInt();
        int b= input.nextInt();
        top(a,b);
    }

    public static void top(int a,int b) {

       int toplam = a+b;

        System.out.println("sonuc: "+toplam);

    }*/
      int toplam=topla2(5,9,14,56);
        System.out.println(toplam);
    }
    public static int topla2(int...sayilar){
        int toplam=0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}

