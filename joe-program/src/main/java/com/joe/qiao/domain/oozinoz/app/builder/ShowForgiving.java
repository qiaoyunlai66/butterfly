package com.joe.qiao.domain.oozinoz.app.builder;

/*
 * Copyright (c) 2001, 2005. Steven J. Metsker. Steve Metsker makes no
 * representations or warranties about the fitness of this software for any
 * particular purpose, including the implied warranty of merchantability. Please
 * use this software as you wish with the sole restriction that you may not
 * claim that you wrote it.
 */

import com.joe.qiao.domain.oozinoz.oozinoz.reservation.ForgivingBuilder;
import com.joe.qiao.domain.oozinoz.oozinoz.reservation.Reservation;
import com.joe.qiao.domain.oozinoz.oozinoz.reservation.ReservationBuilder;
import com.joe.qiao.domain.oozinoz.oozinoz.reservation.ReservationParser;

public class ShowForgiving {
    public static void main(String[] args) {
        /* Remove "DollarsPerHead, 9.95" to see how that impl is calculated if omitted. */
        String sample = "Date, November 5, Headcount, 250, "
                + "City, Springfield, DollarsPerHead, 9.95, HasSite, False";
        ReservationBuilder builder = new ForgivingBuilder();
        try {
            new ReservationParser(builder).parse(sample);
            Reservation res = builder.build();
            System.out.println("Forgiving builder: " + res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
