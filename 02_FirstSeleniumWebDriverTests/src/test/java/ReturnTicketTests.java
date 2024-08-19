import junit.framework.Assert;
import org.junit.Test;

public class ReturnTicketTests {

    //1
    @Test
    public void more10Days(){
        int actualResult = getRefundTicketPricePercent(241, false  , false);
        Assert.assertEquals("Вернется такой %: ",100, actualResult);
    }
    //2
    @Test
    public void more6Days(){
        int actualResult = getRefundTicketPricePercent(144, false  , false);
        Assert.assertEquals("Вернется такой %: ", 50, actualResult);
    }
    //3
    @Test
    public void more3Days(){
        int actualResult = getRefundTicketPricePercent(73, false  , false);
        Assert.assertEquals("Вернется такой %: ",30, actualResult);
    }
    //4
    @Test
    public void less3Days(){
        int actualResult = getRefundTicketPricePercent(24, false  , false);
        Assert.assertEquals("Вернется такой %: ",0, actualResult);
    }
    //5
    @Test
    public void wasCanceled(){
        int actualResult = getRefundTicketPricePercent(0, true  , true);
        Assert.assertEquals("Вернется такой %: ",100, actualResult);
    }

    private Integer getRefundTicketPricePercent(Integer hoursBeforeConcert, Boolean wasConcertCancelled, Boolean wasConcertRescheduled)

    {

        if(wasConcertCancelled && wasConcertRescheduled) return 100;
        if(hoursBeforeConcert>240) return 100;
        if(hoursBeforeConcert>=144 && hoursBeforeConcert<=240) return 50;
        if(hoursBeforeConcert>3 && hoursBeforeConcert<=144) return 30;
        return 0;
    }

}
