if(config==undefined)var config={};

config.routes=function ($stateProvider, $locationProvider) {

    //$locationProvider.html5Mode(false);
    //$httpProvider.interceptors.push( pservicosInterceptor );

     $stateProvider
                  .state('main', {
                    abstract: true,
                    templateUrl: 'views/main.html'
                  })
                  .state('main.home', {
                    url: '/',
                    templateUrl: 'views/home.html'
                  })
                  .state('main.revendedor',{
                     url:'/revendedor',
                     templateUrl:'views/revendedor/cadastro.html'
                  })
                  .state('main.listagem',{
                     url:'/revendedor/listar',
                     templateUrl:'views/revendedor/listagem.html'
                  })
                  .state('main.material',{
                    url:'/material',
                    templateUrl:'views/material-designer/material.html'
                  });
    /*
    $routeProvider.
        when('/', {
            templateUrl: 'views/home.html'
        }).
        when('/revendedor', {
            templateUrl: 'views/revendedor/cadastro.html',
            caseInsensitiveMatch: true
        }).
      
        when('/material', {
            templateUrl: 'views/material-designer/material.html',
            caseInsensitiveMatch: true
        }).
         
        otherwise({
            template: "<div>página não encontrada</div>"
        });
    */    
}
