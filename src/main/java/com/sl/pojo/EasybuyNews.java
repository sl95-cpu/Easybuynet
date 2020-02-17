package com.sl.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EasybuyNews {

  private long id;
  private String title;
  private String content;
  private String createTime;

}
