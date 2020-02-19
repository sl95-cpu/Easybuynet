package com.sl.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EasybuyProductCategory {
  private long id;
  private String name;
  private long parentId;
  private long type;
  private String iconClass;




}
