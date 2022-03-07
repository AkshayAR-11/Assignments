package Lambda_Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Words{
	String word;

	public Words(String word) {
		super();
		this.word = word;
	}
	

	public void setWord(String word) {
		this.word = word;
	}


	public String getWord() {
		return word;
	}
	public String toString() {
		return word;
		
	}
	
}
public class lambdaQ4 {

	public static void main(String[] args) {
		Words word1 = new Words("Akshay");
		Words word2 = new Words("Aayush");
		Words word3 = new Words("Bhavanish");
		Words word4 = new Words("Vignesh");
		Words word5 = new Words("Ayush");
		
		List<Words> wordsList = new ArrayList<>();
		wordsList.add(word1);
		wordsList.add(word2);
		wordsList.add(word3);
		wordsList.add(word4);
		wordsList.add(word5);
		
		
		PrintWords(wordsList,p->p.getWord().length()%2!=0);

	}

	private static void PrintWords(List<Words> wordsList,Predicate<Words> predicate) {
		wordsList.removeIf(predicate);
		for(Words words:wordsList) {
			
			System.out.println(words);
		}
	}

}