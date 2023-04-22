import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class natural_sort {
	public static void main(String[] args)
	{

		List<Integer> values
			= Arrays.asList(212, 324, 435, 566, 133, 100, 121);
		// naturalOrder is a static method
		values.sort(Comparator.naturalOrder());
		System.out.println(values);
	}
}
 
    

