

package interfaces;

interface CollegeData{
    public void collegeDetails();
    public void studentData();
}
interface HostelData{
    public void hostelDetails();
    public void studentRecord();
}


public class StudentData implements CollegeData,HostelData
{
    @Override
    public void collegeDetails() {
        System.out.println("College Name : Khadir Mohideen College " );
        System.out.println("College Grade : A+ ");
        System.out.println("University Name : Bharathidasan University ");
    }

    @Override
    public void studentData() {
        System.out.println("Courses Offered : BCA , BBA , MCA , MBA ");
    }

    @Override
    public void hostelDetails() {
        System.out.println("Hostel Name : Bharathidasan Hostel");
        System.out.println("Hostel Location : Thiruchchirapalli ");
    }

    @Override
    public void studentRecord() {
        System.out.println("Student selected on : Percentage and financial Condition");
    }
    public static void main(String[] args) {
        StudentData sd = new StudentData();
        sd.collegeDetails();
        sd.studentData();
        sd.hostelDetails();
        sd.studentRecord();
    }





}