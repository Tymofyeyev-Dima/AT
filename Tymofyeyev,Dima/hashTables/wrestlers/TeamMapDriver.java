package wrestlers;

public class TeamMapDriver {

	public static void main(String[] args) {
		TeamMap a=new TeamMap(new Wrestler("Bob",157));
		a.addWrestler(new Wrestler("Fred",129));
		a.addWrestler(new Wrestler("Jake",100));
		a.addWrestler(new Wrestler("Arnold",199));
		a.addWrestler(new Wrestler("Stan",120));

		Wrestler juan = new Wrestler("Juan",180);
		a.addWrestler(juan);
		System.out.println(a);

		a.changeWeightGroup(juan,10);
		System.out.println("Juan is in Weight Group " +a.getWrestlerGroup(juan));
		System.out.println();
		System.out.println(a);

	}

}
