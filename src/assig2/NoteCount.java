package assig2;

public class NoteCount {

	public void counting(int[] denominations, int amount)
	{
		int notes[] = new int[denominations.length];
		
		for(int i = 0; i < denominations.length; i++)
		{
			if(amount == 0)
				break;
			notes[i] = amount/denominations[i];
			amount -= notes[i]*denominations[i];
		}
		int noOfNotes = 0;
		for(int i = 0; i<notes.length; i++)
		{
			if(notes[i] != 0)
				System.out.println(notes[i]+" X "+denominations[i]);
			noOfNotes += notes[i];
		}
		System.out.println("Total number of notes: "+noOfNotes);
	}

}
