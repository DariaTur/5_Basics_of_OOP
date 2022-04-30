package by.training.epam.module5;

public class View {
	private static View instance;
	
	private View() {};
	
	public static View getInstance() {
		if(instance == null) {
			instance = new View();
		}
		
		return instance;
	}
	
	public void showContent(TextFile file) {
		System.out.println();
		System.out.println(file.getContent());
	}
}
