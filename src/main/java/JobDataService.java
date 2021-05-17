import java.util.List;

public class JobDataService {
    public static void FilterJobsByTitle(List<JobDetails> jobs, String Title){
      for(JobDetails j:jobs){
          if(j.getTitle()==Title){
              System.out.println(j);
          }
      }
    }
//    FilterJobsByCountry(List <JobDetails> jobs, String country){
//
//    }
//    FilterJobsByLevel(List <JobDetails> jobs, string level){
//
//    }
//    LinkedHashMap<String, Long> sortMap(Map<String, Long> map){
//
//    }
//    FilterJobsByYearsExp(List <JobDetails> jobs, String YearsExp){
//
//    }

}
