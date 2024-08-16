/**
 * I 'm listen to fujiikaze's new song. If fujiikaze send his new song i will listen to it before every one in my class.
 */
package test;

import java.util.Scanner;

public class Test2 {

    public static class Classroom{
        /**
         * create a class to define the class.
         */
        public String className;
        public static int classmateNum;

        public Classroom(String className) {
            this.className = className;
        }

        public void delClass(){
            className = null;
        }

        public static class Classmate {
        /**
         * create a class to define different students.
         */ 
            public static int listNum;
            public static String myName;
            public String studentName;
            public int timeStampInt;
            public String timeStampStr;//the timestamp when student listen to fujiikaze's new song.
            
            public Classmate(String studentName) {
                this.studentName = studentName;
                listNum++;
            }
            
            public static void clearListNum() {
                listNum = 0;
            }

            public static void myNameIs(String myname) {
                myName = myname;
            }

            public int getStudentNumber() {
                
                return classmateNum;
            }

            public String getTimeStampStr(String studentName){
                if (studentName != myName) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("now your studentName is "+studentName+", please input the time you listened to fujiikaze's new song(yyyy-MM-dd HH:mm:ss):");
                    String date = sc.nextLine();
                    timeStampStr = DateUtil.dateToTimeStamp(date, "yyyy-MM-dd HH:mm:ss");
                }

                else{
                    timeStampStr = DateUtil.timeStamp();
                }
                return timeStampStr;
            }

            public int getTimeStampInt (String studentName) {
                timeStampStr = getTimeStampStr(studentName);
                timeStampInt = Integer.valueOf(timeStampStr).intValue();
                return timeStampInt;
            }
        }
    }

    
    public static void main(String[] args) {
        //initialize
        Classroom.Classmate.clearListNum();
        boolean newSongFlag = true;
        //me
        Classroom.Classmate.myNameIs("gotou hitori");
        //number of classmates
        Scanner sc = new Scanner(System.in);
        System.out.println("please input how many members in your class:");
        Classroom.classmateNum = sc.nextInt();
        int [] timeStampArr = new int[Classroom.classmateNum];
        //class name
        Classroom class1 = new Classroom("class101");
        
        if (newSongFlag) {
            Classroom.Classmate student1 = new Classroom.Classmate("gotou hitori");
            timeStampArr[0] = student1.getTimeStampInt("gotou hitori");
            student1.getStudentNumber();
            System.out.println("whoami: "+Classroom.Classmate.myName);

            Classroom.Classmate student2 = new Classroom.Classmate("kita ikuyo");
            timeStampArr[1] = student2.getTimeStampInt("kita ikuyo");
            student2.getStudentNumber();


            Classroom.Classmate student3 = new Classroom.Classmate("yamada ryou");
            timeStampArr[2] = student3.getTimeStampInt("yamada ryou");
            student3.getStudentNumber();


            Classroom.Classmate student4 = new Classroom.Classmate("ijichi nijika");
            timeStampArr[3] = student4.getTimeStampInt("ijichi nijika");
            student4.getStudentNumber();


            /*for (int i = 0; i < timeStampArr.length; i++) {
                System.out.println(timeStampArr[i]);
            }*/

            QuickSort.quickSort(timeStampArr, 0, timeStampArr.length - 1);
            //System.out.println(timeStampArr[0]);

            if (timeStampArr[0] != student1.timeStampInt) {
                System.out.println("sorry, others had already listened to fujiikaze's new song.");
            }
            if (timeStampArr[0] == student1.timeStampInt) {
                System.out.println("congratulations, you are the first one who had listened to fujiikaze's new song in your class.");
            }
        }
        
        sc.close();
        class1.delClass();
            //System.out.println(Classroom.classmateNum);
            //System.out.println(student3.timeStampInt);
            /**
             *  if (newSongFlag) {
             *      //System.out.println(mytimestamp + watanabetimestamp);
             *      System.out.println(<?"yes, you are the first one listen to fujiikaze's new song in your class.":"no");
             *  }
             */
    }
}
