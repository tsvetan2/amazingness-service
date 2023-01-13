package org.amazing;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class AmazingService
{
    @Inject
    AmazingnessCalculator amazingnessCalculator;
    public boolean isPersonAmazing(String name){
        return amazingnessCalculator.isPersonAmazing( name );
    }
}
