import java.util.Arrays;

public class JobDetails {

    private String title;
    private String company;
    private String location;
    private String type;
    private String level;
    private String yearExp;
    private String country;
    private String[] skills;

    public JobDetails(String title, String company, String location, String type, String level, String yearExp, String country, String[] skills) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.type = type;
        this.level = level;
        this.yearExp = yearExp;
        this.country = country;
        this.skills = skills;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getYearExp() {
        return yearExp;
    }

    public void setYearExp(String yearExp) {
        this.yearExp = yearExp;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "JobDetails{" +
                "title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", level='" + level + '\'' +
                ", yearExp='" + yearExp + '\'' +
                ", country='" + country + '\'' +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}
