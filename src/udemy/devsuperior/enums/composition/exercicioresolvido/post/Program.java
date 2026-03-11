package udemy.devsuperior.enums.composition.exercicioresolvido.post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post post1 = new Post(simpleDateFormat.parse("21/06/2018 13:05:44"), "Traveling to New Zeland", "I'm going to visit this wonderful country!", 12);
		Comment comment1p1 = new Comment("Have a nice trip");
		Comment commen2tp1 = new Comment("Wow that's awesome!");
		
		post1.addComment(comment1p1);
		post1.addComment(commen2tp1);
		
		System.out.println(post1);
		
		Post post2 = new Post(simpleDateFormat.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
		Comment comment1p2 = new Comment("Good night");
		Comment comment2p2 = new Comment("May the Force be with you");
		
		post2.addComment(comment1p2);
		post2.addComment(comment2p2);
		
		System.out.println(post2);
		
	}

}
