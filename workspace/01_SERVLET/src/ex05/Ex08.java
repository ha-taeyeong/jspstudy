package ex05;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex08
 */
@WebServlet("/Ex08")
public class Ex08 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex08() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 요청 처리
		// 1) 인코딩
		request.setCharacterEncoding("utf-8");
		// 2) 파라미터 저장
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String gender = request.getParameter("gender");
		String[] favor = request.getParameterValues("favor");
		String[] phone = request.getParameterValues("phone");
		String proposal = request.getParameter("proposal");
		String address = request.getParameter("address");
		
		// 2. 응답 처리
		// 1) content-type
		response.setContentType("text/html; charset=utf-8");
		// 2) 출력 스트림 생성
		PrintWriter out = response.getWriter();
		// 3) 응답 생성
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\">");
		out.println("<title>제목</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<ul>");
		out.println("<li>아이디 : " + id + "</li>");
		out.println("<li>비밀번호 : " + pw + "</li>");
		out.println("<li>성별 : " + gender + "</li>");
		out.println("<li>관심언어 : " + Arrays.deepToString(favor) + "</li>");
		out.println("<li>연락처 : " + phone[0] + "-" + phone[1] + "-" + phone[2] + "</li>");
		out.println("<li>제안 : <pre>" + proposal + "</pre></li>");
		out.println("<li>주소 : " + address + "</li>");
		out.println("</body>");
		out.println("</html>");
		out.flush();	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
