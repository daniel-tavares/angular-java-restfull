(function() {

    var app = angular.module('revendedor');

    app.controller('RevendedorController', ['$location','$mdDialog','RevendedorService', function($location, $mdDialog,  RevendedorService) {
    													 
	     console.log("Carregou controller revendedor...");    	
    	 
    	 vm=this;
     	 vm.sexo =null;
         vm.revendedores= null;
         vm.selected = [];

         carregaDadosCadastro();

         vm.showDetailsRevendedor = function(revendedor){
             var detail = $mdDialog.alert({
             	title:'Detalhe Revendedor',
             	textContent: revendedor.nome,
             	ok:'SAIR'
             });

             $mdDialog.show(detail)
                      .finally(function(){
                      	detail = undefined;
                      }); 
         }

           
         vm.create = function(revendedor){
         	console.log('Criando novo revendedor', revendedor);
               
         }

    
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