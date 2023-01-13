package org.amazing;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class AmazingnessCalculator
{
    public static List<String> amazingNames = List.of("Tsvetan Tsvetkov",
            "Daniel Rankov", "Alex Alexandrov", "Andrey Balevski", "Danail Denev","Daniel Obretenov", "Dimo Hristov",
            "Emil Doganov", "Emil Petleshkov", "Evgeniy Hristov", "Georgi Vasilev", "Ivan Ivanov", "Kamen Blagoev",
            "Lyubomir Tochev", "Radoslav Topalov", "Stefan Minchev", "Stoyan Stoyanov",
            "Tsvetomira Koleva", "Vasil Beshev", "Dimitar Vasilev", "Yosif Peev", "Yordan Babukov");

    public boolean isPersonAmazing(String name){
        System.out.println(amazingNames);
        System.out.println(name);
        System.out.println(amazingNames.contains( name ));
        if(amazingNames.contains( name )) {
            return true;
        }
        return false;
    }
}
