package org.koreait;

import org.koreait.config.AppCtx;
import org.koreait.models.board.BoardDao;
import org.koreait.models.board.BoardData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ExjoinApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExjoinApplication.class, args);

/*		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		BoardDao boardDao = ctx.getBean(BoardDao.class);

		// register
		BoardData data = BoardData.builder()
				.poster("저자2")
				.subject("제목2")
				.content("내용2")
				.build();
		boolean result = boardDao.register(data);
		System.out.println("결과 : " + result);
		System.out.println(data);

		long total = boardDao.getTotal();
		System.out.println("총 갯수 : " + total);

            // gets()
            //List<BoardData> items = boardDao.gets();
            //items.stream().forEach(System.out::println);

            // get() : 21
           // BoardData item = boardDao.get(25L);
            //System.out.println(item);

		ctx.close();

 */
	}

}
