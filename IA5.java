package pkg1;
class TimeTable {
    int year;
    String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    int[] period = {1, 2, 3, 4, 5, 6, 7};
    String[] batch = {"4MW23CS", "4MW23CS", "4MW23CS", "4MW23CS"};
    String[][] subject = {
        {"OOPJ", "DBMS", "CN", "DM", "OS", "FLAT"},
        {"DBMS", "OOPJ", "CN", "DM", "OS", "SE"},
        {"CN", "DBMS", "OOPJ", "DM", "OS", "FLAT"},
        {"DM", "CN", "DBMS", "OOPJ", "OS", "SE"},
        {"OS", "DM", "CN", "DBMS", "OOPJ", "FLAT"},
        {"FLAT", "OS", "DM", "CN", "DBMS", "SE"}
    };
    String[][] faculty = {
        {"Kuthyar Sir", "Chaitra Madam", "Rao Sir", "Sharma Sir", "Joshi Sir", "Karthik Sir"},
        {"Chaitra Madam", "Kuthyar Sir", "Rao Sir", "Sharma Sir", "Joshi Sir", "Karthik Sir"},
        {"Rao Sir", "Chaitra Madam", "Kuthyar Sir", "Sharma Sir", "Joshi Sir", "Karthik Sir"},
        {"Sharma Sir", "Rao Sir", "Chaitra Madam", "Kuthyar Sir", "Joshi Sir", "Karthik Sir"},
        {"Joshi Sir", "Sharma Sir", "Rao Sir", "Chaitra Madam", "Kuthyar Sir", "Karthik Sir"},
        {"Karthik Sir", "Joshi Sir", "Sharma Sir", "Rao Sir", "Chaitra Madam", "Kuthyar Sir"}
    };
    boolean isLab;
    String section;

    TimeTable(int y1, String s1) {
        this.year = y1;
        this.section = s1;
    }

    public void printTimeTable() {
        String heading = year + "-" + batch[year - 1];
        System.out.println("TimeTable of Year " + heading + " Section " + section);
        System.out.println("Day\tPeriod\tSubject\tFaculty");
        for (int i = 0; i < day.length; i++) {
            for (int j = 0; j < period.length; j++) {
                System.out.println(day[i] + "\t" + period[j] + "\t" + subject[i][j % subject[i].length] + "\t" + faculty[i][j % faculty[i].length]);
            }
            System.out.println(); 
        }
    }
}

public class IA5 {
    public static void main(String[] args) {
        TimeTable tt2A = new TimeTable(2, "A");
        TimeTable tt2B = new TimeTable(2, "B");
        tt2A.printTimeTable();
        System.out.println("\n-----------------------------------------------\n");
        tt2B.printTimeTable();
    }
}


