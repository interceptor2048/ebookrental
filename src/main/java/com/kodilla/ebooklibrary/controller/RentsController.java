package com.kodilla.ebooklibrary.controller;

import com.kodilla.ebooklibrary.domain.CreateRentDto;
import com.kodilla.ebooklibrary.domain.RentDto;
import com.kodilla.ebooklibrary.domain.UpdateRentDto;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/rents/")
class RentsController {
  private Random rnd = new Random();

  @GetMapping(path = "/")
  public List<RentDto> getRents(@RequestParam int userId, @RequestParam int itemId) {
    RentDto[] rents = {
        new RentDto(1, "Jan Kowalski", LocalDate.now(), LocalDate.now().plusDays(5)),
        new RentDto(2, "Tomasz Nowak", LocalDate.now().minusDays(2), LocalDate.now().plusDays(3))
    };
    return Arrays.asList(rents);
  }

  @PostMapping(path = "/")
  public int createRent(@RequestBody CreateRentDto createRentDto) {
    return rnd.nextInt(50) + 1;
  }

  @PutMapping(path = "/")
  public RentDto updateRent(@RequestBody UpdateRentDto updateRentDto) {
    return new RentDto(
        updateRentDto.getId(),
        updateRentDto.getCustomerName(),
        updateRentDto.getRentDate(),
        updateRentDto.getExpirationDate());
  }

  @DeleteMapping(path = "/")
  public boolean deleteRent(@RequestParam int userId, @RequestParam int id) {
    return rnd.nextBoolean();
  }
}
