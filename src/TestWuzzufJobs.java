import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestWuzzufJobs {

    public static void display(Map<String,Long> mp, String cell){

        System.out.println("Popularity\t\t| "+cell);
        System.out.println("-----------------------------------------");
        mp.forEach((key,value)-> System.out.println(value+"\t\t\t\t| "+key ));

    }

    public static void test(){

        List<JobDetails> dataSet=new IO("Wuzzuf_Jobs.csv").getDataSet();

        JobsDataService serv=new JobsDataService(dataSet);



        display(serv.FilterJobsByTitle(),"Title");
        System.out.println();

        display(serv.FilterJobsByCountry(),"Countery");
        System.out.println();

        display(serv.FilterJobsByLevel(),"Level");
        System.out.println();

        display(serv.FilterJobsByYearsExp(),"yearExp");
        System.out.println();


    }


}


