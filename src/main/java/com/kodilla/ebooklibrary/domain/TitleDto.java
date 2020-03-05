package com.kodilla.ebooklibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TitleDto {
  private int id;
  private String author;
  private String title;
  private int year;
}
