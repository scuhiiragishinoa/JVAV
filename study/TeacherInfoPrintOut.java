package study;
/**
 * iobin.Print a teacher's information
 */
public class TeacherInfoPrintOut {
    public static void main(String[] args) {
        String name = "Hiiragishinoa";
        byte age = 19;
        boolean sex = true;
        double height = 180.1;
        boolean isSingle = true;

    
        System.out.println("name:\t"+name);
        System.out.println("age:\t"+age);

        if (sex) {
            System.out.println("sex:\tmale");
        }
        else{
            System.out.println("sex:\tfemale");
        }

        System.out.println("height:\t"+height);
        if (isSingle) {
            System.out.println("single?\t"+"yes");
        }
        else{
            System.out.println("single?\t"+"no");
        }
    }
}
