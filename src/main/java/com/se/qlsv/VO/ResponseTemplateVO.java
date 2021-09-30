package com.se.qlsv.VO;


import com.se.qlsv.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseTemplateVO {
    private User user;
    private Department department;
}
