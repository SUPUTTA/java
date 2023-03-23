package conditional;

public class NestedSwitch {
    public static void main(String[] args) {
        char branch = 'C';
        int collegeYear = 4;
        switch(collegeYear) {
            case 1: System.out.println("English, Maths, Science");
            break;
            case 2:
                switch(branch) {
                    case 'E': System.out.println("Electronics, English, Network Systems");
                    break;
                    case 'C': System.out.println("Electronic devices and Communication, Electrical Engineering");
                    break;
                    case 'S': System.out.println("Mechanical, Civil, IT");
                    break;
                }
                switch(branch) {
                    case 'M': System.out.println("Maths, Science and Chemistry");
                    break;
                    case 'N': System.out.println("Construction, Engineering, CS");
                    break;
                    case 'O': System.out.println("Operating System, Java, Python");
                    break;
                }
                switch(branch) {
                    case 'P': System.out.println("Physics, Social and English");
                    break;
                    case 'R': System.out.println("Radar Systems, Networking, Solar Eclipse");
                    break;
                    case 'O': System.out.println("OS, OM, OO");
                    break;
                }
            default:
                System.out.println("Syllabus not included in any branch");
        }
    }
}
