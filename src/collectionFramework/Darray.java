package collectionFramework;

public class Darray {

	public static void main(String[] args) {
		
		String[][] State= {
				{"Colorado","Connecticut","Delaware"},
				  {"New York","New Hampshire","North Carolina"},
				    {"North Dakota","Nebraska","Nevada"}
				           };
		
		for(int i=0;i<State.length;i++) {
			System.out.println();
			for(int j=0;j<State[i].length;j++) {
				System.out.print(State[i][j]+" ");
			}
		}
		

	}

}
