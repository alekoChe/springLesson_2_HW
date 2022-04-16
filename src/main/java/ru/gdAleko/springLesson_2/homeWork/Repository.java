package ru.gdAleko.springLesson_2.homeWork;

import org.springframework.stereotype.Component;

@Component
public interface Repository {
    Product findById(Long id);
}
