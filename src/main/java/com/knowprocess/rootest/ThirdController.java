package com.knowprocess.rootest;
import com.knowprocess.rootest.model.Third;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = Third.class)
@Controller
@RequestMapping("/thirds")
public class ThirdController {
}
