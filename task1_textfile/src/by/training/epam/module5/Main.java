package by.training.epam.module5;
/*
 * Задача 1.  
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать, 
 * вывести на консоль содержимое, дополнить, удалить. 
 */
public class Main {

	public static void main(String[] args) {
		TextFile textFile = new TextFile();
		Directory directory = new Directory("users/user-name/songs");
		String text = "Happiness is a butterfly\n"
				+ "Try to catch it like every night\n"
				+ "It escapes from my hands into moonlight\n"
				+ "Every day is a lullaby\n"
				+ "I hum it on the phone like every night";
		String name = "Song";
		View view = View.getInstance();
		
		textFile.setName(name);
		textFile.setDirectory(directory);
		textFile.setContent(text);
		
		view.showContent(textFile);
		
		textFile.addText("\nAnd sing it for my babies on the tour life");
		view.showContent(textFile);
		
		textFile.deleteText("\nTry to catch it like every night");
		view.showContent(textFile);
		
	}

}
