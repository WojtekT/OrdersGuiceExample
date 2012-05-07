package pl.com.orders_guice.module;

import pl.com.orders_guice.articles.ArticleService;
import roboguice.config.AbstractAndroidModule;

public class OrdersModule extends AbstractAndroidModule {
	
	@Override
	protected void configure() {
		bind(ArticleService.class).to(ArticleServiceImpl.class);
	}
}