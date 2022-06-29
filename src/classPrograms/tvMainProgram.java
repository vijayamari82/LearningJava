package classPrograms;

public class tvMainProgram {

	public static void main(String[] args) {
		
		tvDetails sony  = new tvDetails();
		tvDetails samsung  = new tvDetails();
		tvDetails lg  = new tvDetails();
		sony.model="Bravia";
		sony.inches=22;
	    sony.type="Smart tv";
	    
	    samsung.model="samsung";
		samsung.inches=40;
	    samsung.type="Smart tv";
		
	    lg.model="NANO";
		lg.inches=55;
		lg.type="Smart tv";
	    
		System.out.println("SonyTV Model :" + sony.model);
		System.out.println("SonyTV Model :" + sony.inches);
		System.out.println("SonyTV Model :" + sony.type);
					    
		System.out.println("SonyTV Model :" + samsung.model);
		System.out.println("SonyTV Model :" + samsung.inches);
		System.out.println("SonyTV Model :" + samsung.type);
		samsung.samsungdetails();
			    
		System.out.println("SonyTV Model :" + lg.model);
		System.out.println("SonyTV Model :" + lg.inches);
		System.out.println("SonyTV Model :" + lg.type);
		lg.lgdetails();
		
						
}

}
