package br.com.digitalhouse.demo.services;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class Age {

    public static long getAge(Integer day, Integer month, Integer year) {
        LocalDate start = LocalDate.of(year, month, day);
        LocalDate end = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth());
        return ChronoUnit.YEARS.between(start, end);
    }
}
