Feature: Rick and Morty GraphQL

    Background: Set urlBase and Queries
        * url urlBase + '/graphql'
        * def charactersQuery = read('queries/characterQuery.graphql')
        * def episodesQuery = read('queries/episodeQuery.graphql')

    Scenario: Characters graphql request
        Given request { query: '#(charactersQuery)' }
        When method POST
        Then status 200
        * match each $.data.characters.results[*].name contains "Smith"

    Scenario: Episode graphql request
        Given request { query: '#(episodesQuery)' }
        When method POST
        Then status 200
        * match response.data.episodes.results[0].episode == "S05E02"
