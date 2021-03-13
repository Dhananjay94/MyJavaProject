public class ExceptionDemo{
	
	public static void main(String[] args)
	{
		try{
			int c=4/2;
			System.out.println("c");
		}
		catch(Exception e){
			System.out.println("In Catch Exception!");
		}
		finally{
			System.out.println("In Finally Exception!");
		}
	}

}