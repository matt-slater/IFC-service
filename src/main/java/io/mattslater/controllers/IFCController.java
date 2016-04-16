package io.mattslater.controllers;

import io.mattslater.model.IFCDate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.threeten.extra.chrono.InternationalFixedDate;
import java.time.temporal.ChronoField;

/**
 * Created by synapserelapse on 4/15/16.
 */
@Controller
@RequestMapping("/ifcdate")
public class IFCController {



    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody IFCDate getIFCDate() {
        InternationalFixedDate ifd = InternationalFixedDate.now();
        int month = ifd.get(ChronoField.MONTH_OF_YEAR);
        int date = ifd.get(ChronoField.DAY_OF_MONTH);
        int day = ifd.get(ChronoField.DAY_OF_WEEK);
        int year = ifd.get(ChronoField.YEAR);
        return new IFCDate(date, day, month, year);
    }

}
