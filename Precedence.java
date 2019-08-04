/*
 *	姓名：赵子豪
 *	日期：2019年7月10日
 */
//	Precedence.java
import java.util.*;

public class Precedence {
	public static void main(String[] args) {
		int x = 1, y = 2, z = 3;
		int a = x + y - 2/2 + z;
		int b = x + (y - 2) / (2 + z);
		System.out.println("a = " + a + " b = " + b);
	}
}
