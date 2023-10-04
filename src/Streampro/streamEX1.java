package Streampro;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamEX1 {

	String Actor;
	String MovieName;
	int realisedYear;
	

	public String getActor() {
		return Actor;
	}

	public String getMovieName() {
		return MovieName;
	}

	public int getRealisedYear() {
		return realisedYear;
	}

	public streamEX1(String actor, String movieName, int realisedYear) {
		Actor = actor;
		MovieName = movieName;
		this.realisedYear = realisedYear;
	}

	
	
	@Override
	public String toString() {
		return "Actor=" + Actor + ", MovieName=" + MovieName + ", realisedYear=" + realisedYear  ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<streamEX1> obj=new ArrayList<>();
		obj.add(new streamEX1("vijay","Master",2021));
		obj.add(new streamEX1("vijay","leo",2023));
		obj.add(new streamEX1("Sk","Doctor",2021));
		obj.add(new streamEX1("Ajith","visvasam",2020));
		obj.add(new streamEX1("vijay","leo",2023));
 
		/*
		 * Stream<streamEX1> fil=obj.stream().filter(X->X.realisedYear==2021);
		 * fil.forEach(X->System.out.println(X));
		 * obj.stream().filter(X->X.realisedYear==2021).forEach(X->System.out.println(X)
		 * );
		 * 
		 * obj.stream().filter(X->X.realisedYear==2021).forEach(System.out::println);
		 * obj.stream().filter(Y->Y.getRealisedYear()==2021).forEach(System.out::println
		 * );
		 * 
		 * 
		 * 
		 * obj.stream().filter(X->X.realisedYear==2021).map(Z->Z.MovieName).forEach(X->
		 * System.out.println(X));
		 * 
		 * obj.stream().filter(X->X.getRealisedYear()==2023).map(streamEX1::getMovieName
		 * ).forEach(System.out::println);
		 * 
		 * 
		 * obj.stream().map(X->X.MovieName).sorted((a,b)->a.compareToIgnoreCase(b)).
		 * forEach(X->System.out.println(X));
		 * 
		 * obj.stream().sorted((a,b)->{ if(a.realisedYear>b.realisedYear) { return 1; }
		 * else if(a.realisedYear<b.realisedYear) { return -1; } else return 0;
		 * }).forEach(X->System.out.println(X));
		 * obj.stream().filter(x->x.Actor.equals("vijay")).map(x->x.MovieName).distinct(
		 * ).forEach(System.out::println);
		 * obj.stream().filter(x->x.Actor.equals("vijay")).map(x->x.MovieName).distinct(
		 * ).collect(Collectors.toList()).forEach(System.out::println);
		 */
		Map<Integer,List<streamEX1>>  m=obj.stream().collect(Collectors.groupingBy(x->x.realisedYear));
		System.out.println(m.get(2023));
		Set<Map.Entry<Integer, List<streamEX1>>> set=m.entrySet();
		for(Map.Entry<Integer, List<streamEX1>> e:set)
		{
			System.out.println(e.getKey()+" "+e.getValue());
			  e.getValue
			  ().stream().map(x->x.Actor+" "+x.MovieName+" "+x.realisedYear).forEach(System
			 .out::println); e.getValue
			 ().stream().forEach(x->System.out.println(x.Actor));
			 
		}
		}

	 

}