$(function(){
	$('#dg').datagrid({
	toolbar: [{
		iconCls: 'icon-edit',
		handler: function(){alert('edit')}
	},'-',{
		iconCls: 'icon-help',
		handler: function(){alert('help')}
	}]
});


		
});

function loadData(data){
	
}
