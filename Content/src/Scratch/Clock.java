package Scratch;

import javax.print.attribute.standard.JobHoldUntil;

import static java.lang.Math.abs;

public class Clock {
    /**
     * time of the minute hand to the nearest whole integer
     */
    private int minuteH;
    /**
     * time of the hour hand to the nearest whole integer
     */
    private int hourH;

    /**
     * Clock constructor that generates our clock, given the hours and minutes
     * @param hours 1 through 12
     * @param minutes 0 through 60
     */
    public Clock(int hours, int minutes){
        hourH = hours;
        minuteH = minutes;
    }

    /**
     * print to the console the current time of clock instance
     */
    public void tellTime(){
        if(minuteH < 10){
            System.out.println("It is " + hourH +":" + "0"+minuteH);
        }
        else{
        System.out.println("It is " + hourH +":" + minuteH);
        }
    }


    /**
     * Finds the angle between the hour and minute hand
     * @return the acute angle in degrees
     */
    public double findDiffDegrees(){
        double h = this.hourH;
        double m = this.minuteH;

        // Convert to time position to degrees 360/60 = 6 360/12 = 30; Angle starts at 12oclock
        int degreesPerMinute = 360/60;
        int degreesPerHour = 360/12;

        // the hour hand position moves slightly depending on the current position of the minute hand.
        double hDegrees = h * degreesPerHour +  (m/60) * degreesPerHour;
        double mDegrees = m * degreesPerMinute;

         // Angle should be positive & should be acute (d < 180)
        double diff = abs(mDegrees-hDegrees);
        if(diff > 180){
            return 360 - diff;
        }
        return diff;

        /** Question GOTCHAs!
         * 1) as the minute hand moves around on the clock, the hour hand will move correspondingly. One full rotation
         * of the minute equals to 1 full hour. we can use that to determine the degree change caused by the minute hand.
         *
         * 2) We are trying to find the angle that is less than 180 deg, so when an angle is larger than 180, the
         * conjugate angle is the value we should return. And so, we need to subtract it from 360 to find it
         *  a1 + a2 = 360  ---> a1 = 360 - a2
         *
         * 3) using the wrong primitive, int is a 32bit primative that will truncate to the anything less that a whole
         * integer, using it to calculate a value > 1 will result in 0. This caused an issue in calculating the true
         * HDegrees (hour hand in degrees).
         */




    }

}
