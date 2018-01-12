package by.htp_gvozdev.task.bean;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Sentence {
	private List<Word> sentence = new ArrayList<>();

	public Sentence() {
	}

	public Sentence(List<Word> sentence) {
		try {
			this.sentence = sentence;
		} catch (ConcurrentModificationException e) {
			System.err.println(e);
		}
	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(List<Word> sentence) {
		try {
			this.sentence = sentence;
		} catch (ConcurrentModificationException e) {
			System.err.println(e);
		}
	}

	public List<Word> addWord(Word newWord) {
		sentence.add(newWord);
		return sentence;
	}

	public void printSentence() {
		for (Word word : sentence) {
			System.out.print(word.getWord() + " ");
		}
		System.out.println();
	}
	
	
}
