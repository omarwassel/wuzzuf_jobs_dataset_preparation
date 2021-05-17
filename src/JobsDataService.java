import java.util.*;

public class JobsDataService {
    private List<JobDetails> jobs;

    public JobsDataService(List<JobDetails> dataSet) {
        this.jobs = dataSet;
    }

    public Map<String, Long> FilterJobsByTitle(){
        Map<String ,Long> titlePopularity=new HashMap<String ,Long>();
        for(JobDetails job: jobs){
            String title=job.getTitle();
            Long counter=titlePopularity.get(title);
            titlePopularity.put(title,counter==null?1:counter+1);
        }

        return sortMap(titlePopularity);
    }

    public Map<String, Long> FilterJobsByCountry(){
        Map<String ,Long> counteryPopularity=new HashMap<String ,Long>();
        for(JobDetails job: jobs){
            String countery=job.getCountry();
            Long counter=counteryPopularity.get(countery);
            counteryPopularity.put(countery,counter==null?1:counter+1);
        }

        return sortMap(counteryPopularity);
    }

    public Map<String, Long> FilterJobsByLevel(){
        Map<String ,Long> levelPopularity=new HashMap<String ,Long>();
        for(JobDetails job: jobs){
            String level=job.getLevel();
            Long counter=levelPopularity.get(level);
            levelPopularity.put(level,counter==null?1:counter+1);
        }

        return sortMap(levelPopularity);
    }

    public Map<String, Long> FilterJobsByYearsExp(){
        Map<String ,Long> yearExpPopularity=new HashMap<String ,Long>();
        for(JobDetails job: jobs){
            String yearExp=job.getYearExp();
            Long counter=yearExpPopularity.get(yearExp);
            yearExpPopularity.put(yearExp,counter==null?1:counter+1);
        }

        return sortMap(yearExpPopularity);
    }

    public Map<String,Long> sortMap(Map<String,Long> mp) {
        Map<String, Long> treeMap = new TreeMap<String, Long>((Comparator<String>) (o1, o2) -> o1.compareTo(o2));
        treeMap.putAll(mp);
        return treeMap;
    }

}
