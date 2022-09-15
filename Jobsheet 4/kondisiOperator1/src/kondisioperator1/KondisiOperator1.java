//Percobaan 8 Penggunaan operator Kondisi (?:)
package kondisioperator1;

/**
 *
 * @author 21343013-Ranny Erzitha
 */
public class KondisiOperator1 {
    public static void main(String[] args) {
       int score = 0;
       char answer = 'a';
       
       score = (answer == 'b')?10 :0;
       System.out.println("Score = "+ score);
    }
    
}
