package com.roo.test.domain;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/golds")
@Controller
@RooWebScaffold(path = "golds", formBackingObject = Gold.class)
public class GoldController {
}
