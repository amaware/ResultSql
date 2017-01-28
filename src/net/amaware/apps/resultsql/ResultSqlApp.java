/**
 * 
 */
package net.amaware.apps.resultsql;

import net.amaware.serv.HtmlTargetServ;
import net.amaware.serv.SourceServ;
import net.amaware.serv.SourceProperty;
//import net.amaware.app.MainSqlApp;
import net.amaware.app.DataStoreReport;
import net.amaware.app.SqlApp;
import net.amaware.aproc.AiSourceProcess;
//import net.amaware.aproc.SourceExcelProc;
import net.amaware.aproc.SourceSqlProc;
import net.amaware.autil.*;
/**
 * @author Angelo M Adduci 
 * 
 *************************************************************************************
 * Order and mode of execution 
 * (1) Batch: -input file is passed as param to program or drag/drop to *.bat file
 *	          -PROPERTIES for sourceName= OR sourceNameFull=
 *
 * (2) Eclipse: -Input file is selected and "Run ResultSQL" is exec
 *               WITH: Arguments in Run Config: ${resource_loc}
 *	            -PROPERTIES for sourceName= OR sourceNameFull=
 *
 * (3) doRequest() method gets invoked if (1) or (2) do not get triggered
 * 
 *************************************************************************************
 *	***Options for Report output***see SqlApp.java
 *	         Default | Change to
 *	parm-cmd REPORT-ON-PARM-FALSE |  REPORT-ON-PARM-TRUE
 *	parm-cmd REPORT-ON-TITLE-TRUE |  REPORT-ON-TITLE-FALSE
 *	parm-cmd REPORT-ON-STATEMENT-TRUE | REPORT-ON-STATEMENT-FALSE
 *	parm-cmd REPORT-COL-SIZE
 *
 */

public class ResultSqlApp extends SqlApp {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	final String thisClassName = this.getClass().getName();

	//

	/**
	 * 
	 */
	public ResultSqlApp() {
		super();

	}

	@Override
	public String doRequest(ACommDb acomm) {

		return doRequest( acomm);
		//return doRequestInline( acomm);
	}
	
	public String doRequestInline(ACommDb acomm) {
		//return "parm-cmd report-on-parm-true;parm-cmd report-col-size 1.2em;"
		return "parm-cmd report-on-parm-true;"
		+ " SELECT current timestamp " 
        + "  , '"+ thisClassName+ " default doRequest() method initiated' "
        + "  , ' Batch: Pass parm that is SQL File with SQL extention' "
        + "  , ' Eclipse: Select File with SQL extention...setup: Under Arguments in Run Config copy this: ${resource_loc}' "
        + "  , ' Batch/Eclipse set PROPERTIES sourceName= OR sourceNameFull=' "
		+ " FROM sysibm.sysdummy1  "
		+ "; ";
	}
	
	//
	// END
	//	
}
