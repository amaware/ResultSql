--
--overrides:
--parm-cmd report-on-parm-true; 
--parm-cmd REPORT-ON-STATEMENT-FALSE;
--parm-cmd REPORT-ON-TITLE-FALSE;
--parm-cmd REPORT-ON-FOOTER-FALSE;
--parm-cmd report-col-size .8em;
--parm-var parm-var-sym=~;
----------------------------------------------------------------------------
--db access----
--
parm-cmd propBasePropFile buslist-amaware.properties;
--
parm-cmd DBMAXROWSRETURN 1000;
--
----------------------------------------------------------------------------
--
--parm-var parm-var-sym=~;
--parm-var blogName= <> "";
--   WHERE blog_name ~blogName
--
--parm-cmd report-on-parm-false;parm-cmd report-col-size .8em;
   SELECT current timestamp 
     , ' ResultSql.sql was run by ResultSql'
     FROM sysibm.sysdummy1
	 WITH UR
    report-title Result.sql
--  report-break 1, 2 		
--  report-break-sum 3	
	;

SELECT current timestamp 
     , ' Batch Run '
     , ' Pass parm that is SQL File with SQL extention'
     FROM sysibm.sysdummy1
     WITH UR  
     report-title Running in Batch
	 ;

SELECT current timestamp 
     , ' Eclipse Run '
     , ' Select File with SQL extention'     
     , ' Eclipse setup: Under Arguments in Run Config copy this: ${resource_loc}'
     FROM sysibm.sysdummy1
	 WITH UR  
	 report-title Running from Eclipse
	 ;

