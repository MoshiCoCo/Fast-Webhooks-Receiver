package top.misec.webhooks.utils;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class UtilsTest {

    @Test
    public void testCaseTest() throws ParseException {

        String s = DateUtil.date2String(new Date());
        Date zeroTimeDate = DateUtil.getZeroTimeDate(Calendar.getInstance(), 0);
        String zeroTime = DateUtil.getZeroTime(Calendar.getInstance(), 0);
        Date timeDate = DateUtil.getTimeDate(0);
        Date date = DateUtil.string2date("2021-01-01 00:00:00");


        log.info("s-{}", s);
        log.info("zeroTimeDate-{}", zeroTimeDate);
        log.info("zeroTime-{}", zeroTime);
        log.info("timeDate-{}", timeDate);
        log.info("date-{}", date);

    }

}