package org.synyx.urlaubsverwaltung.publicholiday;

import de.focus_shift.jollyday.core.HolidayManager;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class PublicHolidayConfigurationTest {

    @Test
    void ensureThatHolidaysManagerMapContainsAllKeys() {
        final Map<String, HolidayManager> holidayManagers = new PublicHolidayConfiguration().holidayManagerMap();
        assertThat(holidayManagers)
                .hasSize(17)
                .containsKeys("de", "at", "ca", "co", "ch", "gb", "gr", "mt", "it", "hr", "es", "nl", "lt", "be", "pl", "se", "us");
    }
}
