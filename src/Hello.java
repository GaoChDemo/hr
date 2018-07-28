import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;

public class Hello {
	public static void main(String[] args) {
		int a = -16;
		System.out.println(a>>4);
	}
	
	public void getNextMonth(String date){
		String[] da = date.split("-");
		System.out.println(da);
		int dain = Integer.parseInt(da[1]);
		int dainy = Integer.parseInt(da[0]);
		
		dain++;
		if(dain > 12){
			dain -= 12;
			dainy = Integer.parseInt(da[0]);
			dainy += 1;
		}
		String dains;
		if(dain < 10){
			dains = "0" + String.valueOf(dain);
		}else{
			dains = String.valueOf(dain);
		}
		
		String dainys = String.valueOf(dainy);
		
		System.out.println(dainys+"-"+dains);
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
