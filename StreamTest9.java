package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class StreamTest9 {
	public static void main(String[] args) {
     int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int minimum = IntStream.of(numbers).min().getAsInt();
		System.out.println(" minimum : "+minimum);
		int maximum = IntStream.of(numbers).max().getAsInt();
		System.out.println(" maximum : "+maximum);
		int total   = IntStream.of(numbers).sum();
		System.out.println(" total : "+total);
		double average = IntStream.of(numbers).average().getAsDouble();
		System.out.println(" average : "+average);
		int firstValue = IntStream.of(numbers).findFirst().getAsInt();
		System.out.println(" firstValue : "+firstValue);   
		  
		IntStream.range(1, 4).forEach(System.out::println);
		System.out.println();
		IntStream.rangeClosed(1, 4).forEach(System.out::println);   

		List<Integer> even = IntStream.of(numbers).filter(i->i%2==0).boxed().collect(Collectors.toList());
		
		for(int evenData : even) {
			System.out.println(" evenData : "+evenData);
		}
		
		int reduceProcessing = IntStream.of(numbers).reduce((a, b)->a-b).getAsInt();
		
		System.out.println(" reduceProcessing "+reduceProcessing);     
		

		//DoubleStream
		
       /** double[] numbers = new double[] {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
		
		double minimum = DoubleStream.of(numbers).min().getAsDouble();
		System.out.println(" minimum : "+minimum);
		double maximum = DoubleStream.of(numbers).max().getAsDouble();
		System.out.println(" maximum : "+maximum);
		double total   = DoubleStream.of(numbers).sum();
		System.out.println(" total : "+total);
		double average = DoubleStream.of(numbers).average().getAsDouble();
		System.out.println(" average : "+average);
		double firstValue = DoubleStream.of(numbers).findFirst().getAsDouble();
		System.out.println(" firstValue : "+firstValue);   
		  
		

		List<Double> even = DoubleStream.of(numbers).filter(i->i%2==0).boxed().collect(Collectors.toList());
		
		for(double evenData : even) {
			System.out.println(" evenData : "+evenData);
		}
		
		double reduceProcessing = DoubleStream.of(numbers).reduce((a, b)->a-b).getAsDouble();
		
		System.out.println(" reduceProcessing "+reduceProcessing);  **/
		
		//LongStream
		
  /**    long[] numbers = new long[] {1,2,3,4,5,6,7,8,9,10};
		
		long minimum = LongStream.of(numbers).min().getAsLong();
		System.out.println(" minimum : "+minimum);
		long maximum = LongStream.of(numbers).max().getAsLong();
		System.out.println(" maximum : "+maximum);
		long total   = LongStream.of(numbers).sum();
		System.out.println(" total : "+total);
		double average = LongStream.of(numbers).average().getAsDouble();
		System.out.println(" average : "+average);
		long firstValue = LongStream.of(numbers).findFirst().getAsLong();
		System.out.println(" firstValue : "+firstValue);   
		  
		LongStream.range(1, 4).forEach(System.out::println);
		System.out.println();
		LongStream.rangeClosed(1, 4).forEach(System.out::println);   

		List<Long> even = LongStream.of(numbers).filter(i->i%2==0).boxed().collect(Collectors.toList());
		
		for(long evenData : even) {
			System.out.println(" evenData : "+evenData);
		}
		
		long reduceProcessing = LongStream.of(numbers).reduce((a, b)->a+b).getAsLong();
		
		System.out.println(" reduceProcessing "+reduceProcessing);   **/
	}        
}
