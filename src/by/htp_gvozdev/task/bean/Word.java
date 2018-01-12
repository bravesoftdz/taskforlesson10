package by.htp_gvozdev.task.bean;

public class Word {
	private String word;

	public Word(String newWord) {
		this.word = newWord;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (word != other.word)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		return (int) (31 * (word == null ? word.hashCode() : word.hashCode()));
	}

	@Override
	public String toString() {
		return getClass().getName() + "@name" + word;
	}
}
