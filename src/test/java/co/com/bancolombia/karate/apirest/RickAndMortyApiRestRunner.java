package co.com.bancolombia.karate.apirest;

import com.intuit.karate.junit5.Karate;

public class RickAndMortyApiRestRunner {

    @Karate.Test
    Karate runner() {
        return Karate.run("classpath:co/com/bancolombia/karate/features/apirest/rickandmortyapirest.feature")
                .relativeTo(getClass());
    }
}
