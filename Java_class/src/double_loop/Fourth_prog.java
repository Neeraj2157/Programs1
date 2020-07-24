package double_loop;

public class Fourth_prog 
{
	

		public static void main(String[] args)
		{
		int i,j,k;
		for(i=1;i<=5;i++)
			{
				for(j=5;j>=1;j--)
					{
						if(i==j)
							{
								for(k=j;k>=1;k--)
									{
										System.out.print("*");
									}
							}
				else
					{
						System.out.print(" ");
					}
					}
						System.out.println();
		
		}


		}
}
