package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ModelAndView;



public interface MemberCommand {
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
