
public class ForLoop {
	public static void main(String[] args) {
		String names = "Ismail Ali; Sajjad ;Syed Nadeem;aftab ali;gufran;zabee;nufayl ali";
		String[] name = names.split(";");
		
		/*
		 * for (int i=0;i<name.length;i++) { String fullname = name[i];
		 * 
		 * 
		 * // String[] sName = fullname.split(" "); if (sName.length <2) continue;
		 * 
		 * System.out.format("First Name is %s and Last Name is %s\n", sName[0],
		 * sName[1]); }
		 */
		
		for(String n:name) {
			String[] sName = n.split(" ");
			if (sName.length <2)
				continue;
			
			System.out.format("First Name is %s and Last Name is %s\n", sName[0], sName[1]);

			
		}
//		
	}

}
