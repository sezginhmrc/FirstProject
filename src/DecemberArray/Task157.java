package DecemberArray;

public class Task157 {
    public static void main(String[] args) {
        timeConversion("07:05:45PM");
        //outputshouldbelike 19:05:45
        // logically look at the output what is the different ?
        // at this input only needs the change first element after split by : semi colon and remove the pm..
        // think simply
        // lets say in 12 hours format time is  3:05:45pm
        // and in order to make it 24 format add 12  in all conditions
    }

    public static void  timeConversion (String s){

        // 12 hour format midnight is 12:00:00 am noon is 12:00:00 pm
        // 24 hours format midnight is 00:00:00  noon is  12:00:00 pm
        // converting 12 hour format to 24 hours format !
        String[] time = s.split(":");
        int t=0;
        if(s.contains("PM")){
            t=Integer.parseInt(time[0])+12;
            System.out.println(t+s.substring(s.indexOf(":"),s.length()-2));

        }else{
            System.out.println(s.substring(0,s.length()-2));
        }




    }
}
