package com.tj.top.mainController;



import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tj.top.dto.Master;
import com.tj.top.service.MasterService;

@Controller
public class MainController {
	@Autowired
	MasterService mService;
	private static final Logger log = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(value="main")
	public String mainForm() {
		return "main/main";
	}
	/*관리자 로그인페이지이동*/
	@RequestMapping(value="mlogin_view.do")
	public String mLoginForm() {
		return "master/mlogin_view";
	}
	/*관리자 로그인*/
	@RequestMapping(value="mloginconfirm.do")
	public String mLoginCheck(Master master, Model model, HttpSession session) {
		int result = mService.mloginchk(master);
		
		if (result == 1) {
			session.setAttribute("master", master);
			model.addAttribute("mloginsucess", "로그인성공");
		} else {
			model.addAttribute("mloginerror", "아이디와 비밀번호가 다릅니다");
		}
			
		return "main/main";
	}
	/*관리자 로그아웃*/
	@RequestMapping(value="mlogout.do")
	public String mLogout(HttpSession session) {
		session.removeAttribute("master");
		return "main/main";
	}
	
	
}
