package jp.co.disney.lady.sango.disney.controllers;

import jp.co.disney.lady.sango.disney.infrastructures.WorkProductRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingControllers {

    @Autowired
    private WorkProductRepositoryImpl workProductRepositoryImpl;

    @ResponseBody
    @RequestMapping("/test")
    public String getPing() {
        System.out.println(workProductRepositoryImpl.getWorkProducts());
        return "test";
    }

    @ResponseBody
    @RequestMapping("/create")
    public String getCreate() {
        workProductRepositoryImpl.createWorkProduct("test");
        return "results";
    }
}
