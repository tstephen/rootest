package com.knowprocess.rootest.web;
import com.knowprocess.rootest.model.Bar;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/bars")
@Controller
@RooWebScaffold(path = "bars", formBackingObject = Bar.class)
@RooWebJson(jsonObject = Bar.class)
public class BarController {
}
