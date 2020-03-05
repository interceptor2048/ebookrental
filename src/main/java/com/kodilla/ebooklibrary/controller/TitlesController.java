package com.kodilla.ebooklibrary.controller;

import com.kodilla.ebooklibrary.domain.CreateTitleDto;
import com.kodilla.ebooklibrary.domain.DeleteDto;
import com.kodilla.ebooklibrary.domain.TitleDto;
import com.kodilla.ebooklibrary.domain.UpdateTitleDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/titles/") class TitlesController {
  private Random rnd = new Random();

  @GetMapping(path = "/")
  public List<TitleDto> getTitles(@RequestParam int userId) {
    return List.of(new TitleDto(1, "Jan Kowalski", "Mój pierwszy eBook", 2020),
        new TitleDto(2, "Bryan Carston", "Breaking Bad", 2009),
        new TitleDto(3, "Jessie Pinkman", "Blue crystal with pepper", 2010));
  }

  @PostMapping(path = "/")
  public int createTitle(@RequestBody CreateTitleDto createTitleDto) {
    return rnd.nextInt(50) + 1;
  }

  @PutMapping(path = "/")
  public TitleDto updateTitle(@RequestBody UpdateTitleDto updateTitleDto) {
    return new TitleDto(
        updateTitleDto.getId(),
        updateTitleDto.getAuthor(),
        updateTitleDto.getTitle(),
        updateTitleDto.getYear());
  }

  @DeleteMapping(path = "/")
  public boolean deleteTitle(@RequestBody DeleteDto deleteDto) {
    return rnd.nextBoolean();
  }
}
