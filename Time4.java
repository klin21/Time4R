public class Time4
{
   private int totalSeconds;

   public Time4 (int h, int m, int s)
   { 
       totalSeconds = s + 60 * m + 3600 * h;
   }
   public Time4 (int h, int m)
   {
       totalSeconds = m * 60 + h * 3600;
   }
   public Time4 (int totalSec)
   {
       totalSeconds = totalSec;
   }

   public static boolean isValidTime (int h, int m, int s)
   {
       return ((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60));
   }
   public static boolean isValidTime (int h, int m)
   {
       return ((h >= 0 && h < 24) && (m >= 0 && m < 60));
   }
   
   public int getHours()
   { 
       return totalSeconds / 3600;
   }
   public int getMins()
   {
       return (totalSeconds%3600) / 60;
   }
   public int getSecs()
   {
       return totalSeconds - (getHours() * 3600) - (getMins() * 60) ;
   }
   public int getTotalSecs()
   {
       return totalSeconds;
   }
   
   public int compareTo (Time4 other)
   {
       return this.getTotalSecs() - other.getTotalSecs();
   }

   private String writeTwoDigits (int n)
   {
       if (n < 10)
       {
           return "0" + n;
       }
       else 
       {
           return "" + n;
       }
   }
   
   private String dayNight (int n)
   {
       if ((0 <= n) && (n <= 12))
       {
           return "AM";
       }
       else
       {
           return "PM";
       }
   }
   
   public String toStringAmPm()
   {
       String ans = dayNight(getHours());
       return ans;
   }
   public String toString()
   {
       String ans = "The time is " + writeTwoDigits(getHours()) + ":" 
       + writeTwoDigits(getMins()) + ":" + writeTwoDigits(getSecs()) + " " +
       toStringAmPm();
       return ans;
   }
}