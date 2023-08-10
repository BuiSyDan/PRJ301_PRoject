package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import model.Cart;

public final class listProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_varStatus_end_begin.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Single : Mangosteen</title>\n");
      out.write("        <!--/tags -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Elite Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("            function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!-- //tags -->\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("        <link href=\"css/easy-responsive-tabs.css\" rel='stylesheet' type='text/css'/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("\n");
      out.write("        <!-- //for bootstrap working -->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800\" rel=\"stylesheet\">\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,900,900italic,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- header -->\n");
      out.write("        <div class=\"header\" id=\"home\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <ul>\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    <li ><i class=\"fa fa-phone\" aria-hidden=\"true\"></i> 01234567898</li>\n");
      out.write("                    <li ><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i> kimkim01@gmail.com</li>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //header -->\n");
      out.write("        <!-- header-bot -->\n");
      out.write("        <div class=\"header-bot\">\n");
      out.write("            <div class=\"header-bot_inner_wthreeinfo_header_mid\">\n");
      out.write("                <div class=\"col-md-4 header-middle\">\n");
      out.write("                    <form action=\"search\" method=\"post\">\n");
      out.write("                        <input type=\"search\" name=\"keyword\" placeholder=\"Tìm kiếm...\" required=\"\">\n");
      out.write("                        <input type=\"submit\" value=\" \">\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <!-- header-bot -->\n");
      out.write("                <div class=\"col-md-4 logo_agile\">\n");
      out.write("                    <h1><a href=\"home\"><span>M</span>angosteen<i class=\"fa fa-shopping-bag top_logo_agile_bag\" aria-hidden=\"true\"></i></a></h1>\n");
      out.write("                </div>\n");
      out.write("                <!-- header-bot -->\n");
      out.write("                <div class=\"col-md-4 agileits-social top_content\">\n");
      out.write("                    <ul class=\"social-nav model-3d-0 footer-social w3_agile_social\">\n");
      out.write("                        <li class=\"share\"> </li>\n");
      out.write("                        <li><a  class=\"facebook\">\n");
      out.write("                                <div class=\"front\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></div>\n");
      out.write("                                <div class=\"back\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("                        <li><a class=\"twitter\"> \n");
      out.write("                                <div class=\"front\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></div>\n");
      out.write("                                <div class=\"back\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("                        <li><a  class=\"instagram\">\n");
      out.write("                                <div class=\"front\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></div>\n");
      out.write("                                <div class=\"back\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("                        <li><a  class=\"pinterest\">\n");
      out.write("                                <div class=\"front\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></div>\n");
      out.write("                                <div class=\"back\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //header-bot -->\n");
      out.write("        <!-- banner -->\n");
      out.write("        <div class=\"ban-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"top_nav_left\">\n");
      out.write("                    <nav class=\"navbar navbar-default\">\n");
      out.write("                        <div class=\"container-fluid\">\n");
      out.write("                            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                            <div class=\"navbar-header\">\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                            <div class=\"collapse navbar-collapse menu--shylock\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                                <ul class=\"nav navbar-nav menu__list\">\n");
      out.write("                                    <li class=\"active menu__item menu__item--current\"><a class=\"menu__link\" href=\"home\">Trang chủ <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                                    <li class=\" menu__item\"><a class=\"menu__link\" href=\"about.jsp\">Mangosteen</a></li>\n");
      out.write("                                    <li class=\"dropdown menu__item\">\n");
      out.write("                                        <a href=\"#\" class=\"dropdown-toggle menu__link\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Romand<span class=\"caret\"></span></a>\n");
      out.write("                                        <ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("                                            <div class=\"agile_inner_drop_nav_info\">\n");
      out.write("                                                <div class=\"col-sm-6 multi-gd-img1 multi-gd-text \">\n");
      out.write("                                                    <a href=\"shop-now\"><img src=\"images/top1_1.png\" alt=\" \"/></a>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-3 multi-gd-img\">\n");
      out.write("                                                    <ul class=\"multi-column-dropdown\">\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                                                    </ul>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-3 multi-gd-img\">\n");
      out.write("                                                    <ul class=\"multi-column-dropdown\">\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"clearfix\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"dropdown menu__item\">\n");
      out.write("                                        <a href=\"#\" class=\"dropdown-toggle menu__link\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Gilaa<span class=\"caret\"></span></a>\n");
      out.write("                                        <ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("                                            <div class=\"agile_inner_drop_nav_info\">\n");
      out.write("                                                <div class=\"col-sm-3 multi-gd-img\">\n");
      out.write("                                                    <ul class=\"multi-column-dropdown\">\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-3 multi-gd-img\">\n");
      out.write("                                                    <ul class=\"multi-column-dropdown\">                                        \n");
      out.write("                                                    </ul>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-sm-6 multi-gd-img multi-gd-text \">\n");
      out.write("                                                    <a href=\"shop-now\"><img src=\"images/top2_2.png\" alt=\" \"/></a>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"clearfix\"></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                    <!--                                    <li class=\"menu__item dropdown\">\n");
      out.write("                                                                            <a class=\"menu__link\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Short Codes <b class=\"caret\"></b></a>\n");
      out.write("                                                                            <ul class=\"dropdown-menu agile_short_dropdown\">\n");
      out.write("                                                                                <li><a href=\"icons.html\">Web Icons</a></li>\n");
      out.write("                                                                                <li><a href=\"typography.html\">Typography</a></li>\n");
      out.write("                                                                            </ul>\n");
      out.write("                                                                        </li>-->\n");
      out.write("                                    <li class=\" menu__item\"><a class=\"menu__link\" href=\"contact.jsp\">Liên hệ</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\t\n");
      out.write("                </div>\n");
      out.write("                <!--cart-->\n");
      out.write("                <div class=\"top_nav_right\">\n");
      out.write("                    <div class=\"wthreecartaits wthreecartaits2 cart cart box_1\"> \n");
      out.write("                        <form action=\"carts\" method=\"post\" class=\"last\"> \n");
      out.write("                            <button class=\"w3view-cart\" type=\"submit\" name=\"submit\" value=\"\"><i class=\"fa fa-cart-arrow-down\" aria-hidden=\"true\"></i></button> (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cart.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(")\n");
      out.write("                        </form>  \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //banner-top -->\n");
      out.write("        <!-- Modal1 -->\n");
      out.write("        <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <!-- Modal content-->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body modal-body-sub_agile\">\n");
      out.write("                        <div class=\"col-md-8 modal_body_left modal_body_left1\">\n");
      out.write("                            <h3 class=\"agileinfo_sign\">Đăng Nhập <span> Mangosteen</span></h3>\n");
      out.write("                            <form action=\"#\" method=\"post\">\n");
      out.write("                                <div class=\"styled-input agile-styled-input-top\">\n");
      out.write("                                    <input type=\"text\" name=\"Name\" required=\"\">\n");
      out.write("                                    <label>Tên đăng nhập</label>\n");
      out.write("                                    <span></span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"styled-input\">\n");
      out.write("                                    <input type=\"text\" name=\"Password\" required=\"\"> \n");
      out.write("                                    <label>Mật khẩu</label>\n");
      out.write("                                    <span></span>\n");
      out.write("                                </div> \n");
      out.write("                                <input type=\"submit\" value=\"Đăng nhập\">\n");
      out.write("                            </form>\n");
      out.write("                            <ul class=\"social-nav model-3d-0 footer-social w3_agile_social top_agile_third\">\n");
      out.write("                                <li><a  class=\"facebook\">\n");
      out.write("                                        <div class=\"front\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></div>\n");
      out.write("                                        <div class=\"back\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("                                <li><a  class=\"twitter\"> \n");
      out.write("                                        <div class=\"front\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></div>\n");
      out.write("                                        <div class=\"back\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("                                <li><a  class=\"instagram\">\n");
      out.write("                                        <div class=\"front\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></div>\n");
      out.write("                                        <div class=\"back\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("                                <li><a class=\"pinterest\">\n");
      out.write("                                        <div class=\"front\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></div>\n");
      out.write("                                        <div class=\"back\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                            <p><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal2\" > Bạn không có tài khoản?</a></p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 modal_body_right modal_body_right1\">\n");
      out.write("                            <img src=\"images/log_pic.jpg\" alt=\" \"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- //Modal content-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //Modal1 -->\n");
      out.write("        <!-- Modal2 -->\n");
      out.write("        <div class=\"modal fade\" id=\"myModal2\" tabindex=\"-1\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <!-- Modal content-->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body modal-body-sub_agile\">\n");
      out.write("                        <div class=\"col-md-8 modal_body_left modal_body_left1\">\n");
      out.write("                            <h3 class=\"agileinfo_sign\">Đăng kí <span>Mangosteen</span></h3>\n");
      out.write("                            <form action=\"#\" method=\"post\">\n");
      out.write("                                <div class=\"styled-input agile-styled-input-top\">\n");
      out.write("                                    <input type=\"text\" name=\"Name\" required=\"\">\n");
      out.write("                                    <label>Tên Đăng Nhập</label>\n");
      out.write("                                    <span></span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"styled-input\">\n");
      out.write("                                    <input type=\"email\" name=\"Email\" required=\"\"> \n");
      out.write("                                    <label>Email</label>\n");
      out.write("                                    <span></span>\n");
      out.write("                                </div> \n");
      out.write("                                <div class=\"styled-input\">\n");
      out.write("                                    <input type=\"password\" name=\"password\" required=\"\"> \n");
      out.write("                                    <label>Mật khẩu</label>\n");
      out.write("                                    <span></span>\n");
      out.write("                                </div> \n");
      out.write("                                <div class=\"styled-input\">\n");
      out.write("                                    <input type=\"password\" name=\"Confirm Password\" required=\"\"> \n");
      out.write("                                    <label>Xác nhận lại mật khẩu</label>\n");
      out.write("                                    <span></span>\n");
      out.write("                                </div> \n");
      out.write("                                <input type=\"submit\" value=\"Đăng kí\">\n");
      out.write("                            </form>\n");
      out.write("                            <ul class=\"social-nav model-3d-0 footer-social w3_agile_social top_agile_third\">\n");
      out.write("                                <li><a href=\"#\" class=\"facebook\">\n");
      out.write("                                        <div class=\"front\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></div>\n");
      out.write("                                        <div class=\"back\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("                                <li><a href=\"#\" class=\"twitter\"> \n");
      out.write("                                        <div class=\"front\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></div>\n");
      out.write("                                        <div class=\"back\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("                                <li><a href=\"#\" class=\"instagram\">\n");
      out.write("                                        <div class=\"front\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></div>\n");
      out.write("                                        <div class=\"back\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("                                <li><a href=\"#\" class=\"pinterest\">\n");
      out.write("                                        <div class=\"front\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></div>\n");
      out.write("                                        <div class=\"back\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                            <p><a href=\"#\">By clicking register, I agree to your terms</a></p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 modal_body_right modal_body_right1\">\n");
      out.write("                            <img src=\"images/log_pic.jpg\" alt=\" \"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- //Modal content-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //Modal2 -->\n");
      out.write("        <!--/single_page-->\n");
      out.write("        <!-- /banner_bottom_agile_info -->\n");
      out.write("        <div class=\"page-head_agile_info_w3l\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h3 style=\"color: #ac2925\">Danh sách tất cả sản phẩm <span> </span></h3>\n");
      out.write("                <!--/w3_short-->\n");
      out.write("                <div class=\"services-breadcrumb\">\n");
      out.write("                    <div class=\"agile_inner_breadcrumb\">\n");
      out.write("                        <ul class=\"w3_short\">\n");
      out.write("                            <li><a href=\"home\" style=\"color: #ac2925\">Trang chủ</a><i>|</i></li>\n");
      out.write("                            <li>Admin</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!--//w3_short-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- banner-bootom-w3-agileits -->\n");
      out.write("\n");
      out.write("        <!--//single_page-->\n");
      out.write("        <div class=\"banner-bootom-w3-agileits\">\n");
      out.write("            <div class=\"container\" >\n");
      out.write("\n");
      out.write("                <h3>List Product</h3><br/>\n");
      out.write("                <button><a href =\"create-product\">Create New<a/></button><br/><br/>\n");
      out.write("                <table border=\"1\" style=\"text-align: center\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>Name</th>\n");
      out.write("                            <th>Category</th>\n");
      out.write("                            <th>Quantity</th>\n");
      out.write("                            <th>Price</th>\n");
      out.write("                            <!--                            <th>Description</th>-->\n");
      out.write("                            <!--                            <th>Imagine</th>\n");
      out.write("                                                        <th>Imagine2</th>\n");
      out.write("                                                        <th>Imagine3</th>-->\n");
      out.write("                            <th>Created_date</th>\n");
      out.write("                            <th>Status</th>\n");
      out.write("                            <th>Action</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("                <nav aria-label=\"Page navigation example\" style=\"text-align: right\" >\n");
      out.write("                    <ul class=\"pagination\">\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--/grids-->\n");
      out.write("                <div class=\"coupons\">\n");
      out.write("                    <div class=\"coupons-grids text-center\">\n");
      out.write("                        <div class=\"w3layouts_mail_grid\">\n");
      out.write("                            <div class=\"col-md-3 w3layouts_mail_grid_left\">\n");
      out.write("                                <div class=\"w3layouts_mail_grid_left1 hvr-radial-out\">\n");
      out.write("                                    <i class=\"fa fa-truck\" aria-hidden=\"true\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3layouts_mail_grid_left2\">\n");
      out.write("                                    <br>\n");
      out.write("                                    <h3>MIỄN PHÍ VẬN CHUYỂN</h3>\n");
      out.write("                                    <p></p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3 w3layouts_mail_grid_left\">\n");
      out.write("                                <div class=\"w3layouts_mail_grid_left1 hvr-radial-out\">\n");
      out.write("                                    <i class=\"fa fa-headphones\" aria-hidden=\"true\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3layouts_mail_grid_left2\">\n");
      out.write("                                    <br>\n");
      out.write("                                    <h3> HỖ TRỢ 24/7 </h3>\n");
      out.write("                                    <p></p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3 w3layouts_mail_grid_left\">\n");
      out.write("                                <div class=\"w3layouts_mail_grid_left1 hvr-radial-out\">\n");
      out.write("                                    <i class=\"fa fa-shopping-bag\" aria-hidden=\"true\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3layouts_mail_grid_left2\">\n");
      out.write("                                    <br>\n");
      out.write("                                    <h3>THANH TOÁN KHI NHẬN HÀNG </h3>\n");
      out.write("                                    <p></p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-3 w3layouts_mail_grid_left\">\n");
      out.write("                                <div class=\"w3layouts_mail_grid_left1 hvr-radial-out\">\n");
      out.write("                                    <i class=\"fa fa-gift\" aria-hidden=\"true\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3layouts_mail_grid_left2\">\n");
      out.write("                                    <br>\n");
      out.write("                                    <h3>QUÀ TẶNG</h3>\n");
      out.write("                                    <p></p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"clearfix\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> </div> </div>\n");
      out.write("        <!--grids-->\n");
      out.write("        <!-- footer -->\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"footer_agile_inner_info_w3l\">\n");
      out.write("                <div class=\"col-md-3 footer-left\">\n");
      out.write("                    <h2><a href=\"home\"><span>M</span>angosteen </a></h2>\n");
      out.write("                    <p>Lorem ipsum quia dolor\n");
      out.write("                        sit amet, consectetur, adipisci velit, sed quia non \n");
      out.write("                        numquam eius modi tempora.</p>\n");
      out.write("                    <ul class=\"social-nav model-3d-0 footer-social w3_agile_social two\">\n");
      out.write("                        <li><a  class=\"facebook\">\n");
      out.write("                                <div class=\"front\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></div>\n");
      out.write("                                <div class=\"back\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("                        <li><a  class=\"twitter\"> \n");
      out.write("                                <div class=\"front\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></div>\n");
      out.write("                                <div class=\"back\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("                        <li><a  class=\"instagram\">\n");
      out.write("                                <div class=\"front\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></div>\n");
      out.write("                                <div class=\"back\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("                        <li><a  class=\"pinterest\">\n");
      out.write("                                <div class=\"front\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></div>\n");
      out.write("                                <div class=\"back\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></div></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9 footer-right\">\n");
      out.write("                    <div class=\"sign-grds\">\n");
      out.write("                        <div class=\"col-md-4 sign-gd\">\n");
      out.write("                            <h4>Các trang <span></span> </h4>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"home\">Trang chủ</a></li>\n");
      out.write("                                <li><a href=\"category.jsp\">Romand</a></li>\n");
      out.write("                                <li><a href=\"category.jsp\">Gilaa</a></li>\n");
      out.write("                                <li><a href=\"about.jsp\">Mangosteen</a></li>\n");
      out.write("                                <!--                                <li><a href=\"typography.html\">Short Codes</a></li>-->\n");
      out.write("                                <li><a href=\"contact.jsp\">Liên hệ</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-5 sign-gd-two\">\n");
      out.write("                            <h4>Liên Hệ <span>Mangosteen</span></h4>\n");
      out.write("                            <div class=\"w3-address\">\n");
      out.write("                                <div class=\"w3-address-grid\">\n");
      out.write("                                    <div class=\"w3-address-left\">\n");
      out.write("                                        <i class=\"fa fa-phone\" aria-hidden=\"true\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"w3-address-right\">\n");
      out.write("                                        <h6>Số điện thoại</h6>\n");
      out.write("                                        <p>+1 234 567 8901</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"clearfix\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3-address-grid\">\n");
      out.write("                                    <div class=\"w3-address-left\">\n");
      out.write("                                        <i class=\"fa fa-envelope\" aria-hidden=\"true\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"w3-address-right\">\n");
      out.write("                                        <h6>Địa chỉ Email </h6>\n");
      out.write("                                        <p>Email : kimkim01@gmail.com</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"clearfix\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3-address-grid\">\n");
      out.write("                                    <div class=\"w3-address-left\">\n");
      out.write("                                        <i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"w3-address-right\">\n");
      out.write("                                        <h6>Địa chỉ</h6>\n");
      out.write("                                        <p>Số 32, Đường Hùng Vương, phường Nam Thành, tp Ninh Bình. \n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"clearfix\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3 sign-gd flickr-post\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //footer -->\n");
      out.write("\n");
      out.write("        <!-- login -->\n");
      out.write("        <div class=\"modal fade\" id=\"myModal4\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content modal-info\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\t\t\t\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body modal-spa\">\n");
      out.write("                        <div class=\"login-grids\">\n");
      out.write("                            <div class=\"login\">\n");
      out.write("                                <div class=\"login-bottom\">\n");
      out.write("                                    <h3>Sign up for free</h3>\n");
      out.write("                                    <form>\n");
      out.write("                                        <div class=\"sign-up\">\n");
      out.write("                                            <h4>Email :</h4>\n");
      out.write("                                            <input type=\"text\" value=\"Type here\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                                        this.value = 'Type here';\n");
      out.write("                                                    }\" required=\"\">\t\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"sign-up\">\n");
      out.write("                                            <h4>Password :</h4>\n");
      out.write("                                            <input type=\"password\" value=\"Password\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                                        this.value = 'Password';\n");
      out.write("                                                    }\" required=\"\">\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"sign-up\">\n");
      out.write("                                            <h4>Re-type Password :</h4>\n");
      out.write("                                            <input type=\"password\" value=\"Password\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                                        this.value = 'Password';\n");
      out.write("                                                    }\" required=\"\">\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"sign-up\">\n");
      out.write("                                            <input type=\"submit\" value=\"REGISTER NOW\" >\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"login-right\">\n");
      out.write("                                    <h3>Sign in with your account</h3>\n");
      out.write("                                    <form>\n");
      out.write("                                        <div class=\"sign-in\">\n");
      out.write("                                            <h4>Email :</h4>\n");
      out.write("                                            <input type=\"text\" value=\"Type here\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                                        this.value = 'Type here';\n");
      out.write("                                                    }\" required=\"\">\t\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"sign-in\">\n");
      out.write("                                            <h4>Password :</h4>\n");
      out.write("                                            <input type=\"password\" value=\"Password\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                                        this.value = 'Password';\n");
      out.write("                                                    }\" required=\"\">\n");
      out.write("                                            <a href=\"#\">Forgot password?</a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"single-bottom\">\n");
      out.write("                                            <input type=\"checkbox\"  id=\"brand\" value=\"\">\n");
      out.write("                                            <label for=\"brand\"><span></span>Remember Me.</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"sign-in\">\n");
      out.write("                                            <input type=\"submit\" value=\"SIGNIN\" >\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <p>By logging in you agree to our <a href=\"#\">Terms and Conditions</a> and <a href=\"#\">Privacy Policy</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //login -->\n");
      out.write("        <a href=\"#home\" class=\"scroll\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\n");
      out.write("        <!-- js -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-2.1.4.min.js\"></script>\n");
      out.write("        <!-- //js -->\n");
      out.write("        <script src=\"js/modernizr.custom.js\"></script>\n");
      out.write("        <!-- Custom-JavaScript-File-Links --> \n");
      out.write("        <!-- cart-js -->\n");
      out.write("        <script src=\"js/minicart.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                                                // Mini Cart\n");
      out.write("                                                paypal.minicart.render({\n");
      out.write("                                                    action: '#'\n");
      out.write("                                                });\n");
      out.write("\n");
      out.write("                                                if (~window.location.search.indexOf('reset=true')) {\n");
      out.write("                                                    paypal.minicart.reset();\n");
      out.write("                                                }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!-- //cart-js --> \n");
      out.write("        <!-- single -->\n");
      out.write("        <script src=\"js/imagezoom.js\"></script>\n");
      out.write("        <!-- single -->\n");
      out.write("        <!-- script for responsive tabs -->\t\t\t\t\t\t\n");
      out.write("        <script src=\"js/easy-responsive-tabs.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                                                $(document).ready(function () {\n");
      out.write("                                                    $('#horizontalTab').easyResponsiveTabs({\n");
      out.write("                                                        type: 'default', //Types: default, vertical, accordion           \n");
      out.write("                                                        width: 'auto', //auto or any width like 600px\n");
      out.write("                                                        fit: true, // 100% fit in a container\n");
      out.write("                                                        closed: 'accordion', // Start closed if in accordion view\n");
      out.write("                                                        activate: function (event) { // Callback function if tab is switched\n");
      out.write("                                                            var $tab = $(this);\n");
      out.write("                                                            var $info = $('#tabInfo');\n");
      out.write("                                                            var $name = $('span', $info);\n");
      out.write("                                                            $name.text($tab.text());\n");
      out.write("                                                            $info.show();\n");
      out.write("                                                        }\n");
      out.write("                                                    });\n");
      out.write("                                                    $('#verticalTab').easyResponsiveTabs({\n");
      out.write("                                                        type: 'vertical',\n");
      out.write("                                                        width: 'auto',\n");
      out.write("                                                        fit: true\n");
      out.write("                                                    });\n");
      out.write("                                                });\n");
      out.write("        </script>\n");
      out.write("        <!-- FlexSlider -->\n");
      out.write("        <script src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                                                // Can also be used with $(document).ready()\n");
      out.write("                                                $(window).load(function () {\n");
      out.write("                                                    $('.flexslider').flexslider({\n");
      out.write("                                                        animation: \"slide\",\n");
      out.write("                                                        controlNav: \"thumbnails\"\n");
      out.write("                                                    });\n");
      out.write("                                                });\n");
      out.write("        </script>\n");
      out.write("        <!-- //FlexSlider-->\n");
      out.write("        <!-- //script for responsive tabs -->\t\t\n");
      out.write("        <!-- start-smoth-scrolling -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.easing.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("                                                jQuery(document).ready(function ($) {\n");
      out.write("                                                    $(\".scroll\").click(function (event) {\n");
      out.write("                                                        event.preventDefault();\n");
      out.write("                                                        $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\n");
      out.write("                                                    });\n");
      out.write("                                                });\n");
      out.write("        </script>\n");
      out.write("        <!-- here stars scrolling icon -->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                /*\n");
      out.write("                 var defaults = {\n");
      out.write("                 containerID: 'toTop', // fading element id\n");
      out.write("                 containerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("                 scrollSpeed: 1200,\n");
      out.write("                 easingType: 'linear' \n");
      out.write("                 };\n");
      out.write("                 */\n");
      out.write("\n");
      out.write("                $().UItoTop({easingType: 'easeOutQuart'});\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- //here ends scrolling icon -->\n");
      out.write("\n");
      out.write("        <!-- for bootstrap working -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.js\"></script>\n");
      out.write("        <!--        <script>\n");
      out.write("                    function showmess(id) {\n");
      out.write("                        var op = confirm('Do you want to delete?');\n");
      out.write("                        if (op === true) {\n");
      out.write("                            window.location.href = 'delete?id=' + id;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                </script>-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ac == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <li > <a href=\"login\" ><i class=\"fa fa-unlock-alt\" aria-hidden=\"true\"></i> Đăng Nhập </a></li>\n");
        out.write("                        <li > <a href=\"signup\" ><i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i> Đăng kí </a></li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ac != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <li > <a href=\"logout\" ><i class=\"fa fa-lock-alt\" aria-hidden=\"true\"></i> Đăng xuất </a></li>\n");
        out.write("                        <li > <i class=\"fa fa-lock-alt\" aria-hidden=\"true\"></i> Xin chào ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ac.displayname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listCategoryRomand}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("R");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <li><a href=\"category-controller?categoryId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${R.categoryId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${R.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li><br/>\n");
          out.write("                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listCategoryGilaa}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("G");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <li><a href=\"category-controller?categoryId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${G.categoryId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${G.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li><br/>\n");
          out.write("                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lp}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("product");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <tr>\n");
          out.write("                        <form action=\"status\" method=\"post\">\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.category_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("<!--                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.imagine}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"height: 100px; width: 100px\"></td>\n");
          out.write("                            <td><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.imagine2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"height: 100px; width: 100px\"></td>\n");
          out.write("                            <td><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.imagine3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"height: 100px; width: 100px\"></td>-->\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.created_date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td><input onchange=\"this.form.submit()\" type=\"radio\" name=\"status\" value=\"0\"> Disable  \n");
          out.write("                                <input onchange=\"this.form.submit()\" type=\"radio\" name=\"status\" value=\"1\">  Enable </td>\n");
          out.write("                            <td><button><a href =\"update-product?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Update<a/></button><br/><br/><button><a href =\"delete-product?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Delete<a/></button> </tr></td>           \n");
          out.write("                        </form>\n");
          out.write("                        </tr>      \n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setBegin(1);
    _jspx_th_c_forEach_3.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_3.setVarStatus("i");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <li class=\"page-item\"><a class=\"page-link\" href=\"list-products?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_varStatus_end_begin.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
