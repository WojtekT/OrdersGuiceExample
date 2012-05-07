package pl.com.orders_guice;

import pl.com.orders_guice.articles.Article;
import pl.com.orders_guice.articles.ArticleService;
import roboguice.activity.RoboActivity;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.inject.Inject;
import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;

@EActivity(R.layout.main)
public class OrdersActivity extends RoboActivity {

	@ViewById
	protected ListView listView;
	
	@Inject
	protected Context context;
	
	@Inject
	protected ArticleService articles;
	
	@AfterViews
	protected void afterViews() {
		listView.setAdapter(new ArrayAdapter<Article>(context, android.R.layout.test_list_item, articles.list()));
	}
	
}
