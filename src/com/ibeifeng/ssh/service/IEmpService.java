package com.ibeifeng.ssh.service;

import com.ibeifeng.ssh.model.Employee;

import java.util.List;

/**
 * Created by Administrator on 2017/2/21.
 */
public interface IEmpService {
    public void sava(Employee employee);
    public Employee load(int id);
    public List<Employee> list();
    public List<Employee> list(int pageIndex,int pageSize);
}
