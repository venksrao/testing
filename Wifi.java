import java.util.Scanner;
public class Wifi {

	public String name;
	public double location;
	public boolean status;
	
		Wifi(){
		}
		Wifi(String name, double location, boolean status){
				this.name=name;
				this.location=location;
				this.status=status;
			}
			
			public String getname(){
				return this.name;
			}
			public double getlocation(){
				return this.location;
			}
			public boolean getstatus(){
				return this.status;
			}

			/*public boolean resetValue(){
				return value = !value;
            } */
	public static void main(String args[]){
		
		// for (String s: args) {
        //    System.out.println(s);
		// }
		
		System.out.print(" Please enter number of devices to add / register :" );
		Scanner sc = new Scanner(System.in);
		//Wifi wf = new Wifi("router",1.00,true);
		int dev = sc.nextInt();
		dev+=1;
	    String[] wf1= new String[dev];
		System.out.println( "device allocations are:  " + wf1.length);
		System.out.print("Do you want to start the loop? >>: press ENTER" );
		for( int i=1; i<wf1.length; i++) {
		System.out.print("enter device name: ");
		String name = sc.next();
		//String name = wf.name;
		System.out.print("enter device location: ");
		String loc = sc.next();
		double location = Double.parseDouble(loc);
		//boolean status = wf.status;
		//Boolean status = sc.next();
		System.out.print("enter device status: ");
		Boolean status = Boolean.parseBoolean(sc.next());
		//System.out.println("device "+ name + " " + location + " " + wf.status);
		wf1[i]= name +","+location + "," + status;
		System.out.println("device is "+ name + " " + location + " " + status + " is added to array ");
		//Wifi[] wf1;
		//}	
		}	
  		System.out.println("Now showing the devices in array :" + dev);
		System.out.println("=========================================");
		
		for(int j=1; j<dev; j++){
			System.out.println("device number : " + j + " details: " + wf1[j] + "  ");
		}
		System.out.println("/******* selecting device ********/");
		System.out.print("enter the device index to update:" );
		int item = sc.nextInt();
		System.out.println("device number : " + item + " and, the details are : " + wf1[item] + "  ");
		
		String line = wf1[item];

		Scanner scanner = new Scanner(line);
		String tokens[] = scanner.nextLine().split(",");

		System.out.println(tokens[0]);
		System.out.println(tokens[1]);
		System.out.println(tokens[2]);
		
		boolean value = Boolean.parseBoolean(tokens[2]);
		if ( value == true) {
			value = false;
			//System.out.println( " given true :" + value );
			} else{ value=false;}
		//resetValue();
		System.out.println( " updated value :" + value );
		
 }
}

