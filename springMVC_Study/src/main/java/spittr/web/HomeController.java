package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/*@Controller
public class HomeController {
    @RequestMapping(value="/",method=GET)
    public String home(){
        return "home";
    }
}*/

@Controller
@RequestMapping({"/","/homepage"})
public class HomeController{
    @RequestMapping(method=GET)
    /**
     * description:home()方法返回视图名
     *
     * @param
     * @return java.lang.String
     */
    public String home(){
        return "home";
    }
}
