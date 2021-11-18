package com.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest extends TestCase {
    @Test
    public void testAddHotel() {
        HotelReservation obj = new HotelReservation();
        obj.addHotel();
        Assert.assertEquals(3, obj.hotelReservation.size());
    }
}