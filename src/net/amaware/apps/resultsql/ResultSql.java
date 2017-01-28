package net.amaware.apps.resultsql;
import net.amaware.app.MainAppSql;
import net.amaware.autil.*;
//
/**
* @author AMAWARE - Angelo M Adduci
* 
*/
public class ResultSql {
	//Properties file to being used
  final static String propFileName            = "ResultSql.properties";
	//Common communications Class
	static ACommDb acomm = null;
	//Architecture Class
	static MainAppSql  mainSqlApp= null;
	//Application Classes
	//The following use an SQL file that is selected by users
	//static Default_SqlApp _MainSqlApp = new Default_SqlApp();
	static ResultSqlApp _resultSqlApp = new ResultSqlApp();
	//The following contains a doRequest() method with SQL that gets executed:
	//static CMN_BATCN_PARMS_SqlApp _MainSqlApp = new CMN_BATCN_PARMS_SqlApp(); 
  //
	
	public static void main(String[] args) {
		final String thisClassName = "ResultSql";
		//
		try { //setup the com class with properties file and log file prop key
			acomm = new ACommDb(propFileName);

			mainSqlApp = new MainAppSql(acomm, _resultSqlApp, args);
			
			mainSqlApp.doProcess(acomm, thisClassName);

			
			//mainApp.getHtmlServ().outPageLine(acomm, thisClassName+" completed ");
			acomm.end();

		} catch (AExceptionSql e1) {
			

			//mainSqlApp.getHtmlServ().writeLine(
			//		thisClassName +"<br>Msg{"+ e1.getExceptionMsg() + "}"
			//		+"<br>MsgArea{"+ e1.getExceptionMsgArea() + "}"
			//		);
			
			
			throw e1;
			
			
		} catch (AException e1) {
			
			//mainSqlApp.getHtmlServ().writeLine(
			//		thisClassName +"<br>Msg{"+ e1.getExceptionMsg() + "}"
			//		+"<br>MsgArea{"+ e1.getExceptionMsgArea() + "}"
			//		);
			
			
			throw e1;
		}

		//
		
		
	}

//
//END CLASS
//	
}

