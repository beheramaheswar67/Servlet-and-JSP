package tag;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class Welcome extends TagSupport {
	public String msg;  // Here we are set the value Dynamically
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public int doStartTag() throws JspException {
		
		try {
			
			JspWriter out = pageContext.getOut();
			out.print("<h1>"+msg+"Good Morning</h1>");
			
		}catch (Exception e) {
			e.printStackTrace();
		}


		
		return SKIP_BODY;
	}
	
}
