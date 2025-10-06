package tag;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class Demo extends TagSupport {
	
	public int side;
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}


	@Override
	public int doStartTag() throws JspException {
		
		try {
			
			JspWriter out = pageContext.getOut();
			out.print("<h1>Squre Area="+side*side+"</h1>");
			out.print("<h1>This is Another Custom Tag</h1>");
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		return SKIP_BODY;
	}

}
