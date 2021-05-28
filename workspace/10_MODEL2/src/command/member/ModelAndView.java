package command.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ModelAndView {
	
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response);
}
