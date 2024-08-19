import junit.framework.Assert;
import org.junit.Test;

public class ExchangeMarkTests {

        //1
        @Test
        public void test2(){
            var actualResult = getMarkResult(20);
            Assert.assertEquals("Оценка: ","2", actualResult);
        }
        //2
        @Test
        public void test3(){
            var actualResult = getMarkResult(40);
            Assert.assertEquals("Оценка: ","3", actualResult);
        }
        //3
        @Test
        public void test4(){
            var actualResult = getMarkResult(60);
            Assert.assertEquals("Оценка: ","4", actualResult);
        }
        //4
        @Test
        public void test5(){
            var actualResult = getMarkResult(80);
            Assert.assertEquals("Оценка: ","5", actualResult);
        }
        //5
        @Test
        public void testMaximalMarks(){
            var actualResult = getMarkResult(100);
            Assert.assertEquals("Оценка: ","5", actualResult);
        }
        //6
        @Test
        public void testOverMaxMarks(){
            var actualResult = getMarkResult(101);
            Assert.assertEquals("no mark result", actualResult);
        }
        //7
        @Test
        public void testMinMarks(){
          var actualResult = getMarkResult(0);
           Assert.assertEquals("2", actualResult);
        }

    private String getMarkResult(Integer mark)
    {
        if(mark>=0 && mark <=35) return "2";
        if(mark>35 && mark <=56) return "3";
        if(mark>56 && mark<71) return "4";
        if(mark>72 && mark<100) return "5";
        return "no mark result";
    }


}
