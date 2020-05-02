public class Person{
	String name;
	int age;
	
	void talk(){
		
		System.out.print("Hello ...its me" + name);
		System.out.print("I am old..."+ age);
		
	}
//Class Demo9{
	
		public static void main(String args[]) {
			
			long c=System.currentTimeMillis(); 
			// public static long currentTimeMillis();
				
			
			//System.out.println(" The classs template itself=" + Person);
			
			System.out.println( "creating an instance of james");
			Person james = new Person();
			System.out.println(james);
			
			System.out.println("toString() of james =" + james );
			System.out.println("hash code =" + james.hashCode());
			
			System.out.println( "creating an instance of jessica");
			Person jessica = new Person();
			System.out.println(jessica);
			System.out.println("toString() of jessica =" + james );
			System.out.println("hash code =" + jessica.hashCode());
			
			System.out.println("last one " + c );
			Person fl = new Person();
			String name = fl(String test);
			int age = fl(int 10);
			//void fl.talk();
			//System.out.println(Person.talk(james));
			
			

//System.out.println(c);
//System.out.println();
//System.out.println();

//System.out.println( "new instances address");



//System.out.println("toString() of james =" + james.name.hashCode() );
//System.out.println("toString() of james =" + james.age );

System.out.println("tiem "+ c);

//Person res=james.talk();

//System.out.println(" chekc " + res );
 }

}
	
	