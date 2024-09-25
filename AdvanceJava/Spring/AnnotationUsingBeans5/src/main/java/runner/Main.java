package runner;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import seasonfinder.Finder;

public class Main {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext  ctx = new FileSystemXmlApplicationContext("/src/main/resources/config.xml");
		Finder f = (Finder)ctx.getBean(Finder.class);
		f.messageDay("Som");
	}
}
