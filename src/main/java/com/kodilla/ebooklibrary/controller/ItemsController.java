package com.kodilla.ebooklibrary.controller;

import com.kodilla.ebooklibrary.domain.dto.*;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/items/")
class ItemsController {
  private Random rnd = new Random();

  @GetMapping(path = "/")
  public List<ItemDto> getItems(@RequestParam int userId, @RequestParam int titleId) {
    ItemDto[] items = {
        new ItemDto(1, LocalDate.of(2019, 10, 24), ItemStatus.AVAILABLE),
        new ItemDto(2, LocalDate.of(2017, 1, 1), ItemStatus.RENTED)
    };
    return Arrays.asList(items);
  }

  @PostMapping(path = "/")
  public int createItem(@RequestBody CreateItemDto createItemDto) {
    return rnd.nextInt(50) + 1;
  }

  @PutMapping(path = "/")
  public UpdatedItemDto updateItem(@RequestBody ModifyItemDto modifyItemDto) {
    return new UpdatedItemDto(modifyItemDto.getId(), modifyItemDto.getPurchaseDate());
  }

  @DeleteMapping(path = "/")
  public boolean deleteItem(@RequestParam int userId, @RequestParam int id) {
    return rnd.nextBoolean();
  }
}
