var app = angular.module('alvescake');
app.value('BASE_URL', '/api/');
app.config(function ($stateProvider,$locationProvider,$mdThemingProvider){
    config.routes($stateProvider);


    $mdThemingProvider.theme('default')
    .primaryPalette('pink', {
      'default': '400', // by default use shade 400 from the pink palette for primary intentions
      'hue-1': '100', // use shade 100 for the <code>md-hue-1</code> class
      'hue-2': '600', // use shade 600 for the <code>md-hue-2</code> class
      'hue-3': 'A100' // use shade A100 for the <code>md-hue-3</code> class
    })
    // If you specify less than all of the keys, it will inherit from the
    // default shades
    .accentPalette('purple', {
      'default': '200' // use shade 200 for default, and keep all other shades the same
    });
}).
run(['$location','$rootScope', function($location,$rootScope) {
    //configurando localização do momentjs
    //moment.locale('pt-br');

    //acionando evento de inciação
    $rootScope.$broadcast('appInitSucess');
    console.log('Iniciou angular!')
}]);
