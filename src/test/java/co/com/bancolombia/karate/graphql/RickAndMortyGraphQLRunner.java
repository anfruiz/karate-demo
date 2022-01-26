package co.com.bancolombia.karate.graphql;

import com.intuit.karate.junit5.Karate;

public class RickAndMortyGraphQLRunner {

    @Karate.Test
    Karate runner() {
        return Karate.run("classpath:co/com/bancolombia/karate/features/graphql/rickandmortygraphql.feature")
                .relativeTo(getClass());
    }
}
