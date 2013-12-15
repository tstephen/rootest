package com.knowprocess.rootest;
import com.knowprocess.rootest.model.FooEmbedded;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = FooEmbedded.class)
@Controller
@RequestMapping("/fooembeddeds")
public class FooEmbeddedController {
}
