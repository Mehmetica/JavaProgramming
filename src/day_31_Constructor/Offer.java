package day_31_Constructor;

public class Offer {

    String location,companyName,jobTitle;
    double salary;
    boolean hasBenefit,hasPTO,isWFH,isFullTime;



    public void setInfo(String location, String companyName, String jobTitle,
                      double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH,
                      boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        System.out.println();
        return "\ncompanyName="+companyName+
                "\nlocation='" + location + '\''   +
                ", \njobTitle='" + jobTitle + '\'' +
                ", \nsalary=" + salary +
                ", \nhasBenefit=" + hasBenefit +
                ", \nhasPTO=" + hasPTO +
                ", \nisWFH=" + isWFH +
                ", \nisFullTime=" + isFullTime +
                "}\n"
                ;
    }
}
