import java.util.List;

public class TestsWuzzufJobs {
    public void test(){
        IO jDAO = new IO();
        List<JobDetails> jobs = jDAO.ReadCSVFile("/home/nidaa/IdeaProjects/Wuzzuf/src/main/java/Wuzzuf_Jobs.csv");

        JobDataService.FilterJobsByTitle(jobs, "Translator");

        //FilterJobsByCountry();
        //FilterJobsByLevel();
        //FilterJobsByYearsExp();
    }


}
