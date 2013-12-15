package com.knowprocess.rootest.web;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.knowprocess.rootest.model.Foo;

@RequestMapping("/foos")
@Controller
@RooWebScaffold(path = "foos", formBackingObject = Foo.class)
@RooWebJson(jsonObject = Foo.class)
public class FooController {

}
