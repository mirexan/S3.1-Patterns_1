package level_01.classes;

import java.util.ArrayList;
import java.util.List;

public class Undo {
	private List<String> commands;
	private static Undo instance;

	private Undo() {
		this.commands = new ArrayList<String>();
	}
	public static Undo getInstance()
	{
		if (instance == null)
		{
			instance = new Undo();
		}
		return instance;
	}
	public void addCommand(String command){
		this.commands.add(command);
	}
	public String undoCommand(){
		String lastOrder = this.commands.getLast();
		this.commands.removeLast();
		return lastOrder;
	}
	public void showHistory(){
		System.out.println(String.join(", ", this.commands));
	}
}
