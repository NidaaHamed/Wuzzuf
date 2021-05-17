import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IO {
    public IO(){

    }
    List<JobDetails> ReadCSVFile(String fileName){
        List<JobDetails> jobs = new ArrayList<>();
        // create an instance of BufferedReader

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // read the first line from the text file which will be head column
            String line = br.readLine();
            // loop until all lines are read
            if (line != null) {
                line = br.readLine(); // the first real data
            }
            while (line != null) {
                //System.out.println("the line " + line);
                // use string.split to load a string array with the values from each line of the file, using a comma as the delimiter
                String[] attributes = line.split(",");
                JobDetails job = createJobDetails(attributes);
                // adding Pyramid into ArrayList
                jobs.add(job);
                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
       return jobs;
    }
    public JobDetails createJobDetails(String[] metadata) {

        String Title = metadata[0];
        String Company = metadata[1];
        String Location = metadata[2];
        String Type = metadata[3];
        String Level = metadata[4];
        String YearsExp = metadata[5];

        // create and return Pyramid of this metadata
        return new JobDetails(Title, Company, Location, Type, Level, YearsExp);
    }
}
