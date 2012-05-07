package pl.com.orders_guice.module;

import java.util.ArrayList;
import java.util.List;

import pl.com.orders_guice.articles.Article;
import pl.com.orders_guice.articles.ArticleService;

public class ArticleServiceImpl implements ArticleService {

	@Override
	public List<Article> list() {
		List<Article> result = new ArrayList<Article>();
		for (int i = 0; i < 10; i += 1) {
			result.add(new Article("order " + i));
		}
		return result;
	}
}
