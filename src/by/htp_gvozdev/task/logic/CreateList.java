package by.htp_gvozdev.task.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp_gvozdev.task.bean.Sentence;
import by.htp_gvozdev.task.bean.Text;
import by.htp_gvozdev.task.bean.Word;

public class CreateList {

	public static void getCreateList() {

		String header = "HEADER";
		String sentenceFirst = "\"Hello World.\"";
		String sentenceSecond = "This is the very first phrase written by the newcomer.";

		Sentence topic = new Sentence(createSentence(header));
		Sentence sentence1 = new Sentence(createSentence(sentenceFirst));
		Sentence sentence2 = new Sentence(createSentence(sentenceSecond));

		Text text = new Text(sentence1, topic);
		text.addText(sentence2);

		text.printText();
	}

	private static List<Word> createSentence(String inputString) {

		List<Word> result = new ArrayList<>();
		String[] string = inputString.split(" ");
		for (String s : string) {
			result.add(new Word(s));
		}
		return result;
	}

}
