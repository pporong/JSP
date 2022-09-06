public class Article {
	public int id;
	public String title;
	public String body;
	public String regDate;
//	public LocalDateTime updateDate;

	public Article(int id, String title, String body, String regDate) {
		this.id = id;
		this.title = title;
		this.body = body;
		this.regDate = regDate;
//		this.updateDate = updateDate;
	}


//	@Override
//	public String toString() {
//		return "Article [id=" + id + ", title=" + title + ", body=" + body + ", regDate=" + regDate + ", updateDate="
//				+ updateDate + "]";
//	}
	




	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", body=" + body + ", regDate=" + regDate + "]";
	}


}
