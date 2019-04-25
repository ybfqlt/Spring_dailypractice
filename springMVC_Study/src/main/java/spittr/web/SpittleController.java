package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.data.SpittleRepository;

/**
 * ClassName    springMVC_Study-SpittleController
 * Description
 *
 * @author: ltt
 * @date: 19-4-21 下午10:47
 * @since: JDK 1.8
 */

@Controller
@RequestMapping("/spittles")   //给该类所有配置的映射地址前加上了一个地址
public class SpittleController {
     private SpittleRepository spittleRepository;

     @Autowired
     public SpittleController(SpittleRepository spittleRepository) {
         this.spittleRepository = spittleRepository;
     }
    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model) {
        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
        // /WEB-INF/views/spittles.jsp
        //当controller没有显式设定模型，也没有返回视图名，只是返回对象或集合时，
        //处理器会将值放入模型，视图名根据请求路径推断
        return "spittles";
    }
}
