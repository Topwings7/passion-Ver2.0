package com.tj.top.customerController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	/*회원 로그인페이지 이동*/
	@RequestMapping(value="clogin_view.do")
	public String cLogin() {
		return "customer/clogin_view";
	}
	/*회원 로그인*/
	@RequestMapping(value="cloginconfirm.do")
	public String cLoginCheck() {
		//loginService구현
		return "main/main";
	}
	/*회원 로그아웃*/
	@RequestMapping(value="clogout.do")
	public String cLogout() {
		//logoutService구현
		return "main/main";
	}
	/*회원 가입폼이동*/
	@RequestMapping(value="cjoin_view.do")
	public String cJoinForm() {
		return "customer/cjoin_view";
	}
	/*회원 유효성검사*/
	@RequestMapping(value="cidConfirm.do")
	public String cidConfirm() {
		//cid컨펌 서비스구현
		return "customer/cidConfirm";
	}
	/*회원 가입*/
	@RequestMapping(value="cjoin.do")
	public String cjoin() {
		//cjoinservice구현
		return "customer/clogin_view";
	}
	/*회원 수정폼이동*/
	@RequestMapping(value="cmodify_view.do")
	public String cModifiyForm() {
		return "customer/cmodify_view";
	}
	@RequestMapping(value="cmodifyConfirm.do")
	public String cmodifyConfirm() {
		//gmodifyConfirmService 구현
		return "customer/cmodifyConfirm";
	}
	@RequestMapping(value="cmodify.do")
	public String cmodify() {
		//modifyService구현
		return "main/main";
	}
	@RequestMapping(value="customerOut.do")
	public String cDelect() {
		//cdelete구현
		return "redirect:main.do";
	}
	
}
