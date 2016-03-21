package thingCount;


import static java.lang.System.*;

public class HistogramList2Runner
{
	public static void main(String[] args)
	{
		HistoList2 test = new HistoList2();
		String testString = "ABCDEFABCDEFFEDCBAAAAABBBBBCCCDAAAAAAAEEFFF";
		for(char c : testString.toCharArray())
		{
			test.add(c);
		}
		System.out.println(test);
		
		HistoList2 test2 = new HistoList2();
		int[] testInt = new int[] {11, 22, 33, 44, 55, 66, 33, 44, 22, 11, 11, 11, 11, 22, 11, 11, 11};
		for(int i: testInt){
			test2.add(i);
		}
		System.out.println(test2);
		//System.out.println(test2.indexOf(11));
		//System.out.println(test2.nodeAt(6).getValue());
			

		
		
		
	}
}