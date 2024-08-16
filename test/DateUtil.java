/**
 * classbin.Class DeteUtil is used when needing to operate with date & time. The functions are as follow.
 * change timestamp to date
 * change date to timestamp
 * get the current timestamp
 */
package test;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    /**
     * Convert timestamp to date format string
     * @param seconds string accurate to seconds
     * @param formatStr
     * @return
     */
    public static String timeStampToDate(String seconds,String format) {
        if(seconds == null || seconds.isEmpty() || seconds.equals("null")){
            return "";
        }
        if(format == null || format.isEmpty()){
            format = "yyyy-MM-dd HH:mm:ss";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date(Long.valueOf(seconds+"000")));
    }
    /**
     * Convert date format string to timestamp
     * @param date string accurate to date
     * @param format as "yyyy-MM-dd HH:mm:ss"
     * @return
     */
    public static String dateToTimeStamp(String date_str,String format){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return String.valueOf(sdf.parse(date_str).getTime()/1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * Get the current timestamp (accurate to seconds)
     * @return
     */
    public static String timeStamp(){
        long time = System.currentTimeMillis();
        String t = String.valueOf(time/1000);
        return t;
    }

    /*public static void main(String[] args) {
        String timeStamp = timeStamp();
        System.out.println("timeStamp="+timeStamp); //output:timeStamp=1723709367
        System.out.println(System.currentTimeMillis());//output:1723709367405
        //output timestamp

        String date = timeStampToDate(timeStamp, "yyyy-MM-dd HH:mm:ss");
        System.out.println("date="+date);//output:date=2024-08-15 16:09:27

        String timeStamp2 = dateToTimeStamp(date, "yyyy-MM-dd HH:mm:ss");
        System.out.println(timeStamp2);  //output:1723709367
    }*/
}