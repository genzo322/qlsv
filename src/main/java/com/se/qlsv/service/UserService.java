package com.se.qlsv.service;

import com.se.qlsv.VO.Department;
import com.se.qlsv.VO.ResponseTemplateVO;

import com.se.qlsv.entity.User;
import com.se.qlsv.repository.UserReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserReposity userReposity;
    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userReposity.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userReposity.findById(userId).get();
        vo.setUser(user);
        Department department =
                restTemplate.getForObject("http://localhost:9001/department/"
                                + user.getDepartmentId(),
                        Department.class);

        vo.setDepartment(department);

        return vo;
    }
}
