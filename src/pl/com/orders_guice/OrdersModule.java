package pl.com.orders_guice;

import pl.com.orders_guice.articles.ArticleService;
import pl.com.orders_guice.articles.ArticleServiceImpl;
import roboguice.config.AbstractAndroidModule;

public class OrdersModule extends AbstractAndroidModule {
	
	@Override
	protected void configure() {
		this.bind(ArticleService.class).to(ArticleServiceImpl.class);
	}
}