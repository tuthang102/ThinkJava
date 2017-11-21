public class BeerSong {
    public static void main(String [] args) {
        beerSong(3);
    }
    public static void beerSong(int n) {
        if (n>0) {
            System.out.println(n + " bottles of beers on the wall,");
            System.out.println(n + " bottles of beer,");
            System.out.println("ya' take one down, ya' pass it around");
            System.out.println();
            beerSong(n-1);
        }
        else {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer");
            System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
            System.out.println("’cause there are no more bottles of beer on the wall!");
        }
    }

}
