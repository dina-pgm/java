package loop;
class program
{
	void data(int size)
	{
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
	}}



   class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program v= new program();
		 v.data(5);

	}

}
