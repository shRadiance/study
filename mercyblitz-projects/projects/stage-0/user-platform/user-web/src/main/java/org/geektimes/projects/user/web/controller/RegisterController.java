package org.geektimes.projects.user.web.controller;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.service.UserService;
import org.geektimes.projects.user.service.impl.UserServiceImpl;
import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * @author sunhao
 * @date 2021/2/28 21:46
 * @Description:
 */
@Path("/register")
public class RegisterController implements PageController {

    @GET
    @POST
    @Path("/form")
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        System.out.println("--/register/from--");
        System.out.println(request.getParameter("name"));
        System.out.println(request.getParameter("email"));
        UserService userService = new UserServiceImpl();
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setEmail(request.getParameter("email"));
        user.setPassword(request.getParameter("password"));
        user.setPhoneNumber(request.getParameter("phoneNumber"));
        boolean register = userService.register(user);
        return register ? "register-success.jsp" : "register-fail.jsp";
    }


}
