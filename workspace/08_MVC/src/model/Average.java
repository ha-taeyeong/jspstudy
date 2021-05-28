package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;

public class Average implements ScoreCommand {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) {

		int kor = 0;
		int eng = 0;
		int mat = 0;
		
		try {
			kor = Integer.parseInt(request.getParameter("kor"));
			eng = Integer.parseInt(request.getParameter("eng"));
			mat = Integer.parseInt(request.getParameter("mat"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		request.setAttribute("avarage", (kor + eng + mat) / 2.0);
		return new ModelAndView("views/output.jsp", false);
	}

}
