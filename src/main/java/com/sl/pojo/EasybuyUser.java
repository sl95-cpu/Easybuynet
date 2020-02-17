package com.sl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EasybuyUser {
  private long id;
  private String loginName;
  private String userName;
  private String password;
  private long sex;
  private String identityCode;
  private String email;
  private String mobile;
  private long type;

}
