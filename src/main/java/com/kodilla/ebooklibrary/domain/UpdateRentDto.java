package com.kodilla.ebooklibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UpdateRentDto {
  private int userId;
  private int id;
  private String customerName;
  private LocalDate rentDate;
  private LocalDate expirationDate;
}
