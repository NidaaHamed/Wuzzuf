import java.util.List;

public class TestsWuzzufJobs {
    public void test(){
        IO jDAO = new IO();
        List<JobDetails> jobs = jDAO.ReadCSVFile("../Wuzzuf_Jobs.csv");

        //FilterJobsByCountry();
        //FilterJobsByLevel();
        //FilterJobsByTitle();
        //FilterJobsByYearsExp();
    }


}
