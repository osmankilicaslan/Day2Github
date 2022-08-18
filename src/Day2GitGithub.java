public class Day2GitGithub {
    /*
    1- git init --> Local repo olusturmak icin yani .git ile klasorumuzun icindeki dosyalari
    iliskilendirmek icin kullanilir.
    2- git add . --> Working space'den (yani yerel) dosyalarimi staging area'ya (yani commitlemek icin beklenen yer)
    gonderir
    3- git status --> Working space'deki ve staging area'daki durumu gosterir.
    4- git commit -m"mesaj" --> Stagingarea'dan commit stora dosyalarımı göndermek icin kullanilir.
    (commit yani versiyon yani sürüm olusturmus olurum)
    5- git push --> Uzak repo'ya (yani remote=Github) göndermek icin kullandigimiz komut
    Yalnız git push kumutunu direkt kullanmak istersek bir kez;
       git remote add origin adres    -->(github'da olusturdugumuz repository'nin adresi yazilir.
       git push -u origin master
    NOT: Bu iki komutu tek seferde kullandiktan sonra ikinci commitlerim icin sadece git push kullaniriz.
    6-git commit -a -m"mesaj" --> aynı anda add ve commit yapar ama öncesinde bir kez git add . kullanmak gerekir.
    7-git pull --> remote repository'deki degisikligi yerele ceker.



     */

    public static void main(String[] args) {
        System.out.println("Github'ı da öğrendim");
    }
}
