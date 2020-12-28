package com.tj.top.noticeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {
	@RequestMapping(value="notice_view.do")
	public String noticeListView(){
		return "notice/notice_view";
	}
	@RequestMapping(value="noticeWrite_view.do")
	public String noticeWriteView(){
		return "notice/noticeWrite_view";
	}
	@RequestMapping(value="noticeWrite.do")
	public String noticeWrite(){
		return "notice_view.do";
	}

}
