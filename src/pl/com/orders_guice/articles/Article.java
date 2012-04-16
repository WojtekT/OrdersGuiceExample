package pl.com.orders_guice.articles;

public class Article {

	private String name;

	public Article(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Article [name=" + name + "]";
	}
}
