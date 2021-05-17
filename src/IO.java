import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IO {
    private String dataSetPath;
    private List<JobDetails> dataSet;


    public IO(String dataSetPath) {
        this.dataSetPath = dataSetPath;
        this.dataSet=new ArrayList<JobDetails>();

    }

    public String getDataSetPath() {
        return dataSetPath;
    }

    public void setDataSetPath(String dataSetPath) {
        this.dataSetPath = dataSetPath;
    }

    public List<JobDetails> getDataSet() {
        readDataSet();
        return dataSet;
    }


    private void readDataSet() {
        try {
            CSVReader reader = new CSVReader(new FileReader(dataSetPath));

            // skip table header row  omar ahmed
            String[] nextLine= reader.readNext();
            while ( (nextLine = reader.readNext()) != null) {

                dataSet.add(reformateJobDetails(nextLine));
            }
        } catch (FileNotFoundException e) {
            System.out.printf(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private JobDetails reformateJobDetails(String []JobDetailsString){

        String[] skills=JobDetailsString[7].split(",");

        JobDetails jobDetails =new JobDetails(
                JobDetailsString[0],
                JobDetailsString[1],
                JobDetailsString[2],
                JobDetailsString[3],
                JobDetailsString[4],
                JobDetailsString[5],
                JobDetailsString[6],
                skills);

        return jobDetails;
    }
}
