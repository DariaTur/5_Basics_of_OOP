package by.training.epam.module5;

public class TextFile extends File{
	private StringBuilder content;
	
	public TextFile() {
		super();
		content = new StringBuilder("");
	}
	
	public TextFile(String name, Directory directory, String content) {
		super(name, directory);
		this.content = new StringBuilder(content);
	}

	public void addText(String text) {
		content.append(text);
	}
	
	public void deleteText(String text) {
		content.delete(content.indexOf(text),content.indexOf(text)+text.length());
	}

	public StringBuilder getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = new StringBuilder(content);
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31*result + (content == null ? 0 : content.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if(this.getClass() != obj.getClass())
			return false;
		TextFile tf = (TextFile) obj;
	
		return super.equals(tf) && content.toString().equals(tf.toString());
	}

	@Override
	public String toString() {
		return "TextFile [name = " + this.getName()+"directory = "+this.getDirectory()+", content = " + content + "]";
	}
	
	
}
