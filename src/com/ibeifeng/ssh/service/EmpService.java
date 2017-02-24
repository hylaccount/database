package com.ibeifeng.ssh.service;

import com.ibeifeng.ssh.dao.IEmpDao;
import com.ibeifeng.ssh.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/2/21.
 */
@Service
public class EmpService implements IEmpService {

    private IEmpDao empDao;
    @Resource
    public void setEmpDao(IEmpDao empDao) {
        this.empDao = empDao;
    }

    @Override
    public void sava(Employee employee) {
        empDao.add(employee);
    }

    @Override
    public Employee load(int id) {
        return empDao.load(id);
    }

    @Override
    public List<Employee> list() {
        return empDao.list("from Employee");
    }

    @Override
    public List<Employee> list(int pageIndex, int pageSize) {
        return empDao.list("from Employee",null,pageIndex,pageSize);
    }
}
