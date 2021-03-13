public class ThrowExceptionDemo{

	public static void main(String[] s){
		try{
			int a=10;
			for(int i=0;;i++)
			{
				a--;
				if(a<0)
				{
					//throw new NullPointerException();   for defined exception
					throw new Exception("My Exception");
				}	
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("In Finally block.....");
		}
	}
}