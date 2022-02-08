
public class ColeSilverBranch {
	
	private String name;
	private String rank;
	
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColeSilverBranch name1 = new ColeSilverBranch();
		name1.setName("Cole");
		System.out.println("Name1 = " + name1.getName());
		name1.setRank("Silver");
		System.out.println("Name1 rank = " + name1.getRank());
		
	}

}
