package org.amazing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith( MockitoExtension.class )
public class AmazingUnitTest
{
    @Mock
    AmazingnessCalculator amazingnessCalculator;
    @InjectMocks
    AmazingService amazingService;

    @Test
    void checkIfPersonAmazing() {
        when(amazingnessCalculator.isPersonAmazing( "Tsvetan Tsvetkov" )).thenReturn( true );
        boolean isAmazing = amazingService.isPersonAmazing( "Tsvetan Tsvetkov" );
        assertTrue(isAmazing);
    }
}
