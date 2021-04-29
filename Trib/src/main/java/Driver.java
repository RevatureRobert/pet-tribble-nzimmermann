
import com.challenge.dao.TribbleDao;

public class Driver {



    public static void main(String[] args) {
        System.out.println("Connecting to database");
        TribbleDao tbdao = new TribbleDao();

        tbdao.getTribbleColor(1);

    }



}
