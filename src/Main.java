import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Article> articles = new ArrayList<>();
		int lastArticleId = 0;

		while (true) {
			System.out.println("< 프로그램 시작 >");
			System.out.printf("* 명령어 : ");
			String cmd = sc.nextLine().trim();

			if (cmd.equals("article write")) {
				System.out.println("< 게시물 작성 >");
				int id = lastArticleId + 1;
				System.out.printf("* 제목 : ");
				String title = sc.nextLine();
				System.out.printf("* 내용 : ");
				String body = sc.nextLine();
				String regDate = Util.getNowDateStr();

				Article article = new Article(id, title, body, regDate);

				articles.add(article);
				lastArticleId++;

//				System.out.println(article);

				System.out.printf("%d번 글이 %s에 작성되었습니다. :) \n", article.id, article.regDate);

			}
			// list 리스트
			else if (cmd.equals("article list")) {
				System.out.println("< 게시물 목록 >");

				if (articles.size() == 0) {
					System.out.println("게시물이 없습니다. :( ");
					continue;
				}
				System.out.println("번 호 |    날  짜    | 제 목");
				for (int i = articles.size() - 1; i >= 0; i--) {
					Article article = articles.get(i);
					System.out.printf(" %d | %s  | %s \n", article.id, article.regDate, article.title);

				}
			} else {
				System.out.printf("%s 는 존재하지 않는 명령어 입니다.:( \n", cmd);
			}

			if (cmd.equals("exit")) {
				System.out.println("== 프로그램을 종료합니다 ==");
				break;
			}
		}

	}
}
