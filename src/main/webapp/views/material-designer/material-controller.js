(function() {

    var app = angular.module('material');

    app.controller('MaterialController', ['$location','$mdDialog', function($location, $mdDialog) {
    													 
	    console.log("Carregou Material Designer Exemplos...");    	
        vm = this;

        // FONTES ICONES

        vm.icones = [
            {name: 'home'        , color: "#777" },
            {name: 'add'   , color: "rgb(89, 226, 168)" },
            {name: 'face', color: "#A00" },
            {name: 'delete'    , color:"#00A" },
             // Use theming to color the font-icon
            {name: 'settings'    , color:"#A00", theme:"md-warn md-hue-5"}
          ];

        vm.iconConfig = [
         {size:48, padding:10},
         {size:36, padding:6},
         {size:24, padding:2},
         {size:12, padding:0}
        ];
      // -----------------------------------------------------------------------------


     
     }]);
})();



function carregaDadosCadastro(){
	vm.sexo = [{id:1, descricao:"MASCULINO"},
    	            {id:2, descricao:"FEMININO"}];

    vm.revendedores=[
        {id:1, tipoPessoa:'FISICA', nome:'Daniel Tavares', cpfCnpj:'87654329000',dataNascimento:'25/03/2013', nomeIndicante:'Bianca nunes', cpfIndicante:'87654323411'},
        {id:2, tipoPessoa: 'JURIDICA', nome:'Nome da Empresa',cpfCnpj:'85478996548214', dataNascimento:'25/03/2013', nomeIndicante:'Bianca nunes', cpfIndicante:'87654323411'}
    ];
}