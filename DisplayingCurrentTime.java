
package displayingcurrenttime;

public class DisplayingCurrentTime {

    public static void main(String[] args) {
        long totalmilliseconds = System.currentTimeMillis();
        long totalseconds = totalmilliseconds/1000;
        long currentseconds = totalseconds%60;
        long totalminutes = currentseconds/60;
        long currentminutes = totalminutes%60;
        long totalhour = currentminutes/60;
        long currenthour = totalhour%24;
        
        System.out.println("Current time is:"+currenthour+":"+currentminutes+":"+currentseconds+" GMT" );
    }

}
