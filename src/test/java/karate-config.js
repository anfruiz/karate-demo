function fn() {

  config = {
    urlBase: 'https://rickandmortyapi.com',
  };

  karate.configure('connectTimeout', 5000);
  karate.configure('readTimeout', 5000);
  return config;
}