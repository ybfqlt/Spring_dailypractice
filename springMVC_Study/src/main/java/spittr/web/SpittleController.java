package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.Spittle;
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
    private static final String MAX_LONG_AS_STRING = "9223372036854775870";
     private SpittleRepository spittleRepository;

     @Autowired
     public SpittleController(SpittleRepository spittleRepository) {
         this.spittleRepository = spittleRepository;
     }
    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model) {
        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
        return "spittles";
    }
}
