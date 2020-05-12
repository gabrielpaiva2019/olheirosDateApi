package com.olheiros.dateOlheiros;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@Controller
public class DateOlheirosController {

    @GetMapping
    @ResponseBody
    public ResponseEntity<String> currentMonth() {

        String date = String.valueOf(Calendar.getInstance().get(Calendar.MONTH));

        return ResponseEntity.ok(date);

    }
}
