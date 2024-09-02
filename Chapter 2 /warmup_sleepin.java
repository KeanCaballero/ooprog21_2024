public class WarmupSleepIn {
   public boolean sleepIn(boolean weekday, boolean vacation) {
      if (!weekday){
         return true;
      } else if (vacation){
         return true;
      } else {
         return false;
      }
   }
   
   public static void main (String [] args){
      WarmupSleepIn warmupSleepIn = new WarmupSleepIn();
      System.out.println(warmupSleepIn.sleepIn(false, false));
      System.out.println(warmupSleepIn.sleepIn(true, false));
      System.out.println(warmupSleepIn.sleepIn(false, true));
   }
}
