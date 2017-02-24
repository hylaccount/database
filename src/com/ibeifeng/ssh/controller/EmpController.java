package com.ibeifeng.ssh.controller;

import com.ibeifeng.ssh.model.Employee;
import com.ibeifeng.ssh.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;
/**
 * Created by zmzy on 2017/2/21.
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

    private IEmpService empService;
    @Resource
    public void setEmpService(IEmpService empService) {
        this.empService = empService;
    }
    @RequestMapping("/list")
    public String list(Model model){
        List<Employee> list = empService.list();
        model.addAttribute("emps",list);
        return "emp/list";
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return "emp/add";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(Employee employee){
        empService.sava(employee);
        return "redirect:/emp/list";
    }
}
