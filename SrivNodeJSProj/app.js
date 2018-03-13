 
/**
 * Module dependencies.
 */

var express = require('express')
  , routes = require('./routes')
  , user = require('./routes/user')
  , http = require('http')
  , path = require('path')
  , mysql = require('mysql')
  , bodyParser = require('body-parser')
  , async = require('async')
  , html = require('html');

var mongoose = require('mongoose');
mongoose.connect('mongodb://localhost/Reports');

var ReportslistSchema = new mongoose.Schema ({
	SLNo: {type:Number, require:true},
	FName: {type:String, require:true},
	LName: {type:String, require:true},
	FatherName: {type:String, require:true},
	PFNum: {type:String, require:true},
	ESINum: {type:String, require:true},
	Daysworked: {type:Number, require:true},
	Basicwage: {type:Number, require:true},
	EmpDA: {type:Number, require:true},
	EmpHRA: {type:Number, require:true},
	EmpOverTimeHrs: {type:Number, require:true},
	EmpOverTimeWages: {type:Number, require:true},
	Gross: {type:Number, require:true},
	DeductionEPF: {type:Number, require:true},
	DeductionESIC: {type:Number, require:true},
	DeductionPT: {type:Number, require:true},
	DeductionLWF: {type:Number, require:true},
	NetAmount: {type:Number, require:true},
	VendorName: {type:String, require:true},
	VendorAddress: {type:String, require:true},
	EmplrName: {type:String, require:true},
	EmplrAddress: {type:String, require:true},
	Month: {type:String, require:true},
	EsicRegNo: {type:String, require:true},
	EpfRegNo: {type:String, require:true},
	ProfTaxRegNo: {type:String, require:true}	
})

//var ToReports = mongoose.model('toReports',Reportslist);
var ToReports = mongoose.model('Reportsdata',ReportslistSchema);


//var todo = new Todo({name: 'Master NodeJS', completed: false, note: 'Getting there...'});

//var toReports = new ToReports({SLNo:1,FName:"Venkata",LName:"Dinesh16"});//,"FatherName":"Madan Mohan","PFNum":"AEPF123455","ESINum":"ESI2345EPF","Daysworked":20,"Basicwage":50000,"EmpDA":10000,"EmpHRA":10000,"EmpOverTimeHrs":10,"EmpOverTimeWages":2000,"Gross":60000,"DeductionEPF":5000,"DeductionESIC":200,"DeductionPT":200,"DeductionLWF":200,"NetAmount":90000,"VendorName":"AT & T","VendorAddress":"Chennai","EmplrName":"Sriv TCH","EmplrAddress":"Prince Info City-II,Chennai","Month":"Nov","EsicRegNo":"ESIC12345678Q","EpfRegNo":"EPF12345ZWDRW","ProfTaxRegNo":"TAN12345SDGFE""SLNo":1,"FName":"Venkata","LName":"Dinesh16","FatherName":"Madan Mohan","PFNum":"AEPF123455","ESINum":"ESI2345EPF","Daysworked":20,"Basicwage":50000,"EmpDA":10000,"EmpHRA":10000,"EmpOverTimeHrs":10,"EmpOverTimeWages":2000,"Gross":60000,"DeductionEPF":5000,"DeductionESIC":200,"DeductionPT":200,"DeductionLWF":200,"NetAmount":90000,"VendorName":"AT & T","VendorAddress":"Chennai","EmplrName":"Sriv TCH","EmplrAddress":"Prince Info City-II,Chennai","Month":"Nov","EsicRegNo":"ESIC12345678Q","EpfRegNo":"EPF12345ZWDRW","ProfTaxRegNo":"TAN12345SDGFE"
//var Reportsdata = new ToReports({SLNo:1,FName:"Venkata",LName:"Dinesh16",FatherName:"Madan Mohan",PFNum:"AEPF123455",ESINum:"ESI2345EPF",Daysworked:20,Basicwage:50000,EmpDA:10000,EmpHRA:10000,EmpOverTimeHrs:10,EmpOverTimeWages:2000,Gross:60000,DeductionEPF:5000,DeductionESIC:200,DeductionPT:200,DeductionLWF:200,NetAmount:90000,VendorName:"AT & T",VendorAddress:"Chennai",EmplrName:"Sriv TCH",EmplrAddress:"Prince Info City-II,Chennai",Month:"Nov",EsicRegNo:"ESIC12345678Q",EpfRegNo:"EPF12345ZWDRW",ProfTaxRegNo:"TAN12345SDGFE"});
//var Reportsdata = new ToReports({SLNo:2,FName:"Venkata",LName:"Ganesh15",FatherName:"Madan Mohan1",PFNum:"AEPF12355",ESINum:"ESI2345EPF",Daysworked:20,Basicwage:30000,EmpDA:10000,EmpHRA:8000,EmpOverTimeHrs:12,EmpOverTimeWages:2500,Gross:60000,DeductionEPF:5000,DeductionESIC:200,DeductionPT:200,DeductionLWF:200,NetAmount:75000,VendorName:"AT & T",VendorAddress:"RMZ Millenium,Chennai",EmplrName:"Sriv TCH",EmplrAddress:"Prince Info City-II,Chennai",Month:"Nov",EsicRegNo:"ESIC12345678Q",EpfRegNo:"EPF12345ZWDRW",ProfTaxRegNo:"TAN12345SDGFE"});
//var Reportsdata = new ToReports({SLNo:3,FName:"Venkata3",LName:"Dinesh14",FatherName:"Madan Mohan2",PFNum:"AEPF123455",ESINum:"ESI2345EPF",Daysworked:20,Basicwage:50000,EmpDA:10000,EmpHRA:10000,EmpOverTimeHrs:10,EmpOverTimeWages:2000,Gross:60000,DeductionEPF:5000,DeductionESIC:200,DeductionPT:200,DeductionLWF:200,NetAmount:90000,VendorName:"AT & T",VendorAddress:"Chennai",EmplrName:"Sriv TCH",EmplrAddress:"Prince Info City-II,Chennai",Month:"Nov",EsicRegNo:"ESIC12345678Q",EpfRegNo:"EPF12345ZWDRW",ProfTaxRegNo:"TAN12345SDGFE"});
//var Reportsdata = new ToReports({SLNo:4,FName:"Venkata4",LName:"Ganesh13",FatherName:"Madan Mohan3",PFNum:"AEPF12355",ESINum:"ESI2345EPF",Daysworked:20,Basicwage:30000,EmpDA:10000,EmpHRA:8000,EmpOverTimeHrs:12,EmpOverTimeWages:2500,Gross:60000,DeductionEPF:5000,DeductionESIC:200,DeductionPT:200,DeductionLWF:200,NetAmount:75000,VendorName:"AT & T",VendorAddress:"RMZ Millenium,Chennai",EmplrName:"Sriv TCH",EmplrAddress:"Prince Info City-II,Chennai",Month:"Nov",EsicRegNo:"ESIC12345678Q",EpfRegNo:"EPF12345ZWDRW",ProfTaxRegNo:"TAN12345SDGFE"});
//var Reportsdata = new ToReports({SLNo:5,FName:"Venkata5",LName:"Dinesh12",FatherName:"Madan Mohan4",PFNum:"AEPF123455",ESINum:"ESI2345EPF",Daysworked:20,Basicwage:50000,EmpDA:10000,EmpHRA:10000,EmpOverTimeHrs:10,EmpOverTimeWages:2000,Gross:60000,DeductionEPF:5000,DeductionESIC:200,DeductionPT:200,DeductionLWF:200,NetAmount:90000,VendorName:"AT & T",VendorAddress:"Chennai",EmplrName:"Sriv TCH",EmplrAddress:"Prince Info City-II,Chennai",Month:"Nov",EsicRegNo:"ESIC12345678Q",EpfRegNo:"EPF12345ZWDRW",ProfTaxRegNo:"TAN12345SDGFE"});
//Save it to database
//Reportsdata.save(function(err){
//if(err)
// console.log(err);
//else
//console.log(Reportsdata);
//});
//var Reports = mongoose.model("Reports",reportsschema);
/*var JsonDB = require('node-json-db');
var db = new JsonDB("myDataBase", true, false);
*/
//LOGGER
var log4js = require('log4js');
//log4js.configure('./config/log4js.json');
var log = log4js.getLogger("server");

/*
var objExpress = express.Router();
*/
// all environments

var app = express();
app.set('port', process.env.PORT || 3030);
app.set('view engine', 'html');
app.set('views',path.join(__dirname + '/views'));
app.use(bodyParser.json()); // Body parser use JSON data
var urlencodedParser = bodyParser.urlencoded({ extended: true });
app.use(express.static(path.join(__dirname, 'public')));
//app.use("/node_modules", express.static('node_modules'));
//app.use("/public/js",express.static('public'));

/*var pool = mysql.createPool({
	connectionLimit : 25,
	host     : '127.0.0.1',
	user     : 'root',
	password : 'root',
	database : 'invoicedb',	
	port :'3306'
});*/

log.debug('Server is starting....');

//TEST CONNECTION
/*pool.getConnection(function (err, connection) {
	if (!err) {
		console.log("Database is connected ... ");
		log.info('Database is connected ... ');
	} else {
		console.log("Error connecting database ... ");
		log.error('Error connecting database ... ');	
		console.log(err,err.message);
		connection && connection.release();
	}
	console.log("releasing connection ... ");
});
*/
app.get("/", function (req, res) {
    res.sendFile('index.html', { root: path.join(__dirname, './public') });
});

/*app.get("/home", function (req, res) {
    res.sendFile('home.html', { root: path.join(__dirname, './public') });
});

app.get("/vendorcomplainces", function (req, res) {
    res.sendFile('vendorcomplainces.html', { root: path.join(__dirname, './public') });
});
*/
http.createServer(app).listen(app.get('port'), function(){
  console.log('Express server listening on port ' + app.get('port'));
});

app.use(function(req, res, next) {
	  //res.writeHead(200,{'Content-Type':'application/json'});
	  res.header("Access-Control-Allow-Origin", "*");
	  res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
	  res.setHeader('Content-Type', 'application/json');
	  next();
	});

/*app.get('/api/mongodb/toReports', function (req, res, next) {
	ToReports.find(function(err, toReports){
	    if(err) res.send(err);
	    console.log(toReports);
	    res.json(toReports);
	  });
	});

*/
app.get('/api/mongodb/toReports', function (req, res, next) {
	ToReports.find(function(err, Reportsdata){
	    if(err) res.send(err);
	    console.log(Reportsdata);
	    return res.send(JSON.stringify(Reportsdata));
	    //res.json(Reportsdata);
	  });
	});



/*app.get('/api/mongodb/SavetoReports', function (req, res, next) {
	ToReports.find(function(err, toReports){
	    if(err) res.send(err);
	console.log(toReports);
	    res.json(toReports);
	  });
	});*/



/*app.post('/rest/loggedinuser',function(req, res, next)  {
	console.log('request :::', req.body);
	pool.getConnection(function (err, connection) {
		connection.query('SELECT count(*) as result from login where UserName = ? and Password =?',[req.body.name,req.body.pass], function (err, result) {
			console.log('request--------', result);
			
			if (result != 1 && !err) {		        
				console.error(err);
		        //return res.send(err);
		    	//res.render('/login.html');
		    	//res.sendFile('login.html');
		    	res.sendFile('login.html', { root: path.join(__dirname, './public') });
		    } else {
		    	console.log('request received:', result);
				//res.render('/home.html');
				//req.forwa
		        //return res.send(result);
				//res.sendFile('home.html', { root: path.join(__dirname, './public') });
				//res.redirect('/home');
				res.sendFile('index.html', { root: path.join(__dirname, './public') });
				//res.json(result);

		    }	
	
	    if (err) {
	        console.error(err);
	        return res.send(err);
	    } else {
	    	console.log('request received:', result);
	        return res.send(result);
	    	//res.sendFile('home.html', { root: path.join(__dirname, './public') });
	    }	
	
});
});
});
*/



//app.get('/rest/vendordetails',urlencodedParser, function(req, res, next)  {
/*app.get('/rest/vendor/vendordetails', function(req, res, next)  {
		pool.getConnection(function (err, connection) {
		connection.query('SELECT * from invoicedb.vendor', function (err, result) {
			if (err) {
		        console.error(err);
		        return res.send(err);
		    } else {
		    	//console.log('vendors results:', result);		    	
		    	//res.end(JSON.stringify(result));
		    	//req.headers['content-type'] = "application/json";
		    	//res.setContentType("text/plain");
		    	//res.headers['content-type'] = "application/json";
		    	//res.setHeader('Content-Type', 'application/json');
		    	//var jsonResults = [];
		    	//var json = JSON.stringify({vendorsResult:result});		    	
		        //console.log('JSON-result:', res.json(result));
		        
		        //jsonResults.push(json);
		    	//return res.send(jsonResults);
		    	//return res.json(result);
		        //return res.json(json);
		        console.log(result[0].SLNo);
		        console.log(result[1].ProfTaxRegNo);
		    	console.log('JSON:', result);
		    	console.log('JSON.stringify(result):', JSON.stringify(result));
		    	return res.send(JSON.stringify(result));
		    	//return res.send(JSON.stringify({vendor: result}));		    	
		        //return res.send(JSON.stringify({vendorsResult:result}));
		       //res.end(JSON.stringify(result));
		    	//return res.send(result);
		    }	
			
		});
		
	});
});
*/
/*var data = db.getData('/rest/vendor/vendordetails');

console.log('JSON data:', data);	*/