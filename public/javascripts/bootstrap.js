define(['require','angular','./app/todo'], function(require,ng){
	'use strict';
	require(['domReady!'],function(document){
		ng.bootstrap(document,['todo']);
	});
});