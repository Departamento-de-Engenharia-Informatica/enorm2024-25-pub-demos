package pt.ipp.isep.mei.enorm.pam.publico.domain;

import java.util.ArrayList;
import java.util.List;

import pt.ipp.isep.mei.enorm.pam.publico.domain.Article;

public class Repository {
	
	private List<Article> articles;
	
	private static Repository repository=null;
	
	private Repository() {
		articles=new ArrayList<Article>();
	}
	
	public static Repository getRepository() {
		if (repository==null) {
			repository=new Repository();
		}
		return repository;
	}
	
	public List<Article> getArticles() {
		return articles;
	}
	
	public void saveArticle(Article a) {
		articles.add(a);
	}
	
	public Article getArticleByTitle(String title) {
		for (Article p: articles) {
			if (p.getTitle().compareTo(title)==0) return p;
		}
		return null;
	}	
}
