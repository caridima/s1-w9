public class CardMain{
    public static void main(String[] args) {
        Card c1 = new Card (10,2);
        Card c2 = new Card(2,1);
        boolean c1Bigger = c1.outranks(c2);
        boolean c2Bigger = c2.outranks(c1);
        System.out.println(c1Bigger);
        System.out.println(c2Bigger);
        
    }

}