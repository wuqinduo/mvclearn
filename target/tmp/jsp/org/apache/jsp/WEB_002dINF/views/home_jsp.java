package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"ZH\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Home</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"https://cdn.bootcss.com/element-ui/1.1.2/theme-default/index.css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"https://cdn.bootcss.com/element-ui/1.1.2/index.js\"></script>\n");
      out.write("<script src=\"https://cdn.bootcss.com/vue/2.1.8/vue.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        <!--这是我们的View-->\n");
      out.write("        <div id=\"app\">\n");
      out.write("            {{ message }}\n");
      out.write("        </div>\n");
      out.write("        <el-button>默认按钮</el-button>\n");
      out.write("<script>\n");
      out.write("        // 这是我们的Model\n");
      out.write("        var exampleData = {\n");
      out.write("            message: 'Hello World!'\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // 创建一个 Vue 实例或 \"ViewModel\"\n");
      out.write("        // 它连接 View 与 Model\n");
      out.write("        new Vue({\n");
      out.write("            el: '#app',\n");
      out.write("            data: exampleData\n");
      out.write("        })\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
