package level_01;

import level_01.classes.Undo;

public class Main {
	public static void main(String[] args) {
		Undo undo = Undo.getInstance();
		undo.addCommand("mkdir carpeta");
		undo.addCommand("cd carpeta");
		undo.showHistory();
// Output: mkdir carpeta, cd carpeta
		undo.undoCommand();
		undo.showHistory();
		// Output: mkdir carpeta
	}
}
