package com.olheiros.dateOlheiros;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@Controller
public class DateOlheirosController {

    @GetMapping("/trueDate")
    @ResponseBody
    public ResponseEntity<DateModel> currentMonth() {

        DateModel dateModel = new DateModel();
        dateModel.setDay(String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH)));
        dateModel.setMonth(String.valueOf(Calendar.getInstance().get(Calendar.MONTH)));
        dateModel.setYear(String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));

        return ResponseEntity.ok(dateModel);

    }
}
