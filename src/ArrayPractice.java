
 class ArrayPractice {

	public static void main(String[] args) {
		int marks[]=new int[5];
		marks[0]=97;//physics
		marks[1]=92;//chemistry
		marks[2]=88;//mathematics
		marks[3]=89;//hindi
		marks[4]=95;//english
        System.out.println("marks[0]="+97);
        System.out.println("marks[1]="+92);
        System.out.println("marks[2]="+88);
        System.out.println("marks[3]="+89);
        System.out.println("marks[4]="+95);
        
        int marksEnglish[]= {20,30,40,50};
        
        int sum=0;
        for(int i=0;i<marksEnglish.length;i++) {
        	sum=sum+marksEnglish[i]; //0 +20
        	System.out.println("Sum ="+sum);
        }
        int avg=sum/marksEnglish.length;
        		
        System.out.println("Average of matks = "+avg);		
        		
        		
        		
        		
        		
        
     
	}

}
