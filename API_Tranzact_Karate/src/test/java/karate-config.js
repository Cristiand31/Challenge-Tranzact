function fn() {
  var env = karate.env; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);
  if (!env) {
    env = 'dev';
  }
  var config = {
    env: env,
    myVarName: 'someValue',
    myName:'Cristian',
    myURL:'https://reqres.in',
    username:'admin',
    password:'adminpassword'
  }
  if (env == 'dev') {
    // customize
    // e.g. config.foo = 'bar';
    config.username='user';
    config.password='userpassword';
  } else if (env == 'e2e') {
    // customize
  }
  return config;
}