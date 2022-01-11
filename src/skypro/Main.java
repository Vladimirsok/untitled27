package skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
            System.out.println("Authors:");
            Author alexanderPushkin = new Author("Alexander", "Pushkin");
            Author alexanderPushkin2 = new Author("Alexander", "Pushkin");
            Author levTolstoy = new Author("Lev", "Tolstoy");

            System.out.println("Authors copies equal: " + alexanderPushkin.equals(alexanderPushkin2));
            System.out.println("Authors copies equal by hashCode : " + (alexanderPushkin.hashCode() == alexanderPushkin2.hashCode()));
            System.out.println("Authors equal: " + alexanderPushkin.equals(levTolstoy));
            System.out.println("Authors equal by hashCode: " + (alexanderPushkin.hashCode() == levTolstoy.hashCode()));


            System.out.println(alexanderPushkin);
            System.out.println(levTolstoy);

            System.out.println("==================================");

            System.out.println("Books:");

            Book queenOfSpades = new Book(alexanderPushkin, "QueenOfSpades", 1834);
            Book queenOfSpades2 = new Book(alexanderPushkin, "QueenOfSpades", 1834);
            Book warAndPeace = new Book (levTolstoy ,"War and Peace", 1869 );

            System.out.println("Authors copies equal: " + queenOfSpades.equals(queenOfSpades2));
            System.out.println("Authors copies equal by hashCode : " + (queenOfSpades.hashCode() == queenOfSpades2.hashCode()));
            System.out.println("Authors equal: " + queenOfSpades.equals(warAndPeace) );
            System.out.println("Authors equal by hashCode: " + (queenOfSpades.hashCode() == warAndPeace.hashCode()));
        }


    }



