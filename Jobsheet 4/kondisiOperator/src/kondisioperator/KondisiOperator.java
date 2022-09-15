package kondisioperator;

/**
 *
 * @author 21343013-Ranny Erzitha
 */
public class KondisiOperator {

    public static void main(String[] args) {
    String status = "";
    int grade = 50;
    
    //Mendapatkan status pelajar
    status = (grade >= 60) ? "Passed" : "Fail";
    
    //Print status
    System.out.println(status);
    }
    
}
