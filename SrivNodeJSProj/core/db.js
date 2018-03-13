/*var sqldb = require('mysql');
var settings = require('../settings');

exports.executesql = function (sql,callback) {
	
	var conn = new sqldb.connection(settings.dbConfig);
	conn.connect()
	.then(function () {
		var req =  new sqldb.request(conn);
		req.query(sql)
		.then(function (recordset){
			callback(recordset);
		})
		.catch(function (err) {
			console.log(err);
			callback(null,err);
		});
	})
	.catch(function (err) {
		console.log(err);
		callback(null,err);		
	});
	
}*/