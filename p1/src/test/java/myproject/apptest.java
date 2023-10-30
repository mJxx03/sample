package myproject;
import org.testng.Assert;
import org.testng.annotations.Test;
public class apptest {
	public void testlogin1() {
		apptest myapp=new apptest();
		Assert.assertEquals(0,myapp.userlogin("abc","abc123"));
		}
	public void testlogin2() {
		apptest myapp=new apptest();
		Assert.assertEquals(0,myapp.userlogin("Vit","vit123"));
		}
	}
