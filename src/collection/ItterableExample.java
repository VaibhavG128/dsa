package collection;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItterableExample {
	
	static String name;
	public static void usingIterator(List<String> list)
	{
		Instant start  = Instant.now();
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		Instant end = Instant.now();
		Duration timeduration = Duration.between(start, end);
		System.err.println("time to complete = "+timeduration.toMillis()+" milisec");
		name = name +  timeduration.toMillis();
			
	}
	
	public static void usingForEach(List<String> list)
	{
		Instant start  = Instant.now();
		list.forEach((element)->{System.out.println(element);});
		Instant end = Instant.now();
		Duration timeduration = Duration.between(start, end);
		System.err.println("time to complete = "+timeduration.toMillis()+" milisec");
		name = name +  timeduration.toMillis();

			
	}
	public static void usingForLoop(List<String> list)
	{
		Instant start  = Instant.now();
		for(String element:list)
		{
			System.out.println(element);
		}
		Instant end = Instant.now();
		Duration timeduration = Duration.between(start, end);
		System.err.println("time to complete = "+timeduration.toMillis()+" milisec");
		
			
	}
	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();
		list.add("I");
		list.add("AM");
		list.add("THE");
		list.add("GREAT");
		usingForLoop(list);
		usingForEach(list);
		usingIterator(list);
	}

}
