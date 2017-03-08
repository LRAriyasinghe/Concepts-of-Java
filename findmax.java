class findmax{
	public static void main(String args[]){
		int max;
		int min;

		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int z=Integer.parseInt(args[2]);

		if(x>y){
			if(x>z){
				max=x;
				min=y;
				}
			else{
				max=z;
				min=y;
			
				}

			}
		else{

			if(y>z){

				max=y;
				min=z;
				}
			else{
				max=z;
				min=x;
				}
			}
		System.out.println("Max : "+ max +" Min : "+ min);
}


}