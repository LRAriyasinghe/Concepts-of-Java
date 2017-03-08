class prime{
	public static void main(String args[]){

		int x=Integer.parseInt(args[0]);
		boolean cond=false;
		int i;

		for(i=x-1;i>=1;i--)
				{
				if(x%i==0)
					{	
						cond=true;
						break;	
					}
				else
					{	
						cond=false;
						continue;
					}
		
		}

		if(cond==true){
		System.out.println("This is a prime number");
			}
		else{
		System.out.println("This is not a prime number");
		}
	}
}