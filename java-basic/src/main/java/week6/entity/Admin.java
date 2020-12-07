package week6.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Admin
 * @Description
 * @Author TYTTPE
 * @Date 2020/11/16
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Admin {
    private Integer id;
    private String account;
    private String password;
    private String adminName;
}
