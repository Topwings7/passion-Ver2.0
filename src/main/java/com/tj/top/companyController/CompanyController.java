package com.tj.top.companyController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CompanyController {
	
	/*회사소개 페이지 이동*/
	@RequestMapping(value="company_view.do")
	public String companyView() {
		return "company/company_view";
	}
	
}
