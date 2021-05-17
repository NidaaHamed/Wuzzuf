public class JobDetails {
    private String Title;
    private String Company;
    private String Location;
    private String Type;
    private String Level;
    private String YearsExp;

    public JobDetails(String Title, String Company, String Location, String Type, String Level, String YearsExp){
        this.Title=Title;
        this.Company=Company;
        this.Location=Location;
        this.Type=Type;
        this.Level=Level;
        this.YearsExp=YearsExp;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public String getYearsExp() {
        return YearsExp;
    }

    public void setYearsExp(String yearsExp) {
        YearsExp = yearsExp;
    }
}
