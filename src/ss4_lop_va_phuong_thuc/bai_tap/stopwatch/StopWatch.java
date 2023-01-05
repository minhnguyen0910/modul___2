package ss4_lop_va_phuong_thuc.bai_tap.stopwatch;

import javax.xml.crypto.Data;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class StopWatch {
    public Date date = new Date();
    private  long startTime;
    private  long endTime;
    public StopWatch() {


    }
    long start() {
        startTime = ZonedDateTime.now().toInstant().toEpochMilli();
        return startTime;
    }
    long stop() {
        endTime = ZonedDateTime.now().toInstant().toEpochMilli();
        return endTime;
    }
    String getter() {
        return "Start time:" + this.startTime + " and stop time:" +this.endTime;
    }
    long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
