package WebLesson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8"); // 文字化け対策

		List<Word> words = new ArrayList<>();
		WordDAO wdao = new WordDAO();

		String english = req.getParameter("english");
		String japanese = req.getParameter("japanese");

//		req.setAttribute("english", english);
//		req.setAttribute("japanese", japanese);

		Word wd = new Word(english, japanese);
		words.add(wd);

		int count = wdao.registWords(words);
//		System.out.println(count + "件の登録が完了しました。\n");

//		List<Word> wList = new ArrayList<>();
//		wList = wdao.getWords();

		int wordNum = wdao.getWords().size();
//		for (Word tmp : wList){
//				System.out.println(tmp);
//				wordNum++;
//		}

		req.setAttribute("count", count);
		req.setAttribute("wordNum", wordNum);

//		System.out.println("\n登録されている単語は" + wordNum + "件です");

		req.getRequestDispatcher("result.jsp").forward(req,res);
	}
}
