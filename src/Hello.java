import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;

public class Hello {
	public static void main(String[] args) {
		int a = -16;
		System.out.println(a>>4);
	}
	
	@Test
	public void test(){
		Calendar cale = null; 
		// 获取当月第一天和最后一天  
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");  
        // 获取前月的第一天  
        cale = Calendar.getInstance();  
        cale.add(Calendar.MONTH, 0);  
        String firstday = format.format(cale.getTime());  
        
        System.out.println("本月第一天和最后一天分别是 ： " + firstday);  
	}
	
}
