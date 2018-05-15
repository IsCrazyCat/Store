package com.store.utils;

import javax.inject.Inject;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.Types;

/**
 * @Author guojunguang
 * @Date 2018/4/20 0020
 * @Description
 */
public class DBToJavaBean {

    @Inject
    private Connection conn;

    public void toJavaBean(){

        ResultSet rs = null;
        try{
            DatabaseMetaData dbmd = conn.getMetaData();
            System.out.println("数据库已知的用户: "+ dbmd.getUserName());
            System.out.println("数据库的系统函数的逗号分隔列表: "+ dbmd.getSystemFunctions());
            System.out.println("数据库的时间和日期函数的逗号分隔列表: "+ dbmd.getTimeDateFunctions());
            System.out.println("数据库的字符串函数的逗号分隔列表: "+ dbmd.getStringFunctions());
            System.out.println("数据库供应商用于 'schema' 的首选术语: "+ dbmd.getSchemaTerm());
            System.out.println("数据库URL: " + dbmd.getURL());
            System.out.println("是否允许只读:" + dbmd.isReadOnly());
            System.out.println("数据库的产品名称:" + dbmd.getDatabaseProductName());
            System.out.println("数据库的版本:" + dbmd.getDatabaseProductVersion());
            System.out.println("驱动程序的名称:" + dbmd.getDriverName());
            System.out.println("驱动程序的版本:" + dbmd.getDriverVersion());

            System.out.println("数据库中使用的表类型");
            rs = dbmd.getTableTypes();
            while (rs.next()) {
                System.out.println(rs.getString("TABLE_TYPE"));
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally{
            try{
                rs.close();
                conn.close();
            }catch (Exception e){
                e.printStackTrace();
            }


        }
    }

    public String getObjectType(int type){
        switch(type){
            case Types.ARRAY:return null;
            case Types.BIGINT:return "Long";
            case Types.BINARY:return null;
            case Types.BIT:return "Byte";
            case Types.BLOB:return "Blob";
            case Types.BOOLEAN:return "Boolean";
            case Types.CHAR:return "String";
            case Types.CLOB:return "Clob";
            case Types.DATALINK:return null;
            case Types.DATE:return "Date";
            case Types.DECIMAL:return "Double";
            case Types.DISTINCT:return null;
            case Types.DOUBLE:return "Double";
            case Types.FLOAT:return "Float";
            case Types.INTEGER:return "Integer";
            case Types.NUMERIC:return "Integer";
            case Types.JAVA_OBJECT:return null;
            case Types.LONGVARBINARY:return null;
            case Types.LONGVARCHAR:return null;
            case Types.NULL:return null;
            case Types.OTHER:return null;
            case Types.REAL:return null;
            case Types.REF:return null;
            case Types.SMALLINT:return "Short";
            case Types.STRUCT:return null;
            case Types.TIME:return "Time";
            case Types.TIMESTAMP:return "Timestamp";
            case Types.TINYINT:return "Short";
            case Types.VARBINARY:return null;
            case Types.VARCHAR:return "String";
            default :return null;
        }
    }

    public String getCommonlyType(int type){
        switch(type){
            case Types.ARRAY:return null;
            case Types.BIGINT:return "long";
            case Types.BINARY:return null;
            case Types.BIT:return "byte";
            case Types.BLOB:return "String";
            case Types.BOOLEAN:return "boolean";
            case Types.CHAR:return "String";
            case Types.CLOB:return "String";
            case Types.DATALINK:return null;
            case Types.DATE:return "Date";
            case Types.DECIMAL:return "double";
            case Types.DISTINCT:return null;
            case Types.DOUBLE:return "double";
            case Types.FLOAT:return "float";
            case Types.INTEGER:return "int";
            case Types.NUMERIC:return "int";
            case Types.JAVA_OBJECT:return null;
            case Types.LONGVARBINARY:return null;
            case Types.LONGVARCHAR:return null;
            case Types.NULL:return null;
            case Types.OTHER:return null;
            case Types.REAL:return null;
            case Types.REF:return null;
            case Types.SMALLINT:return "short";
            case Types.STRUCT:return null;
            case Types.TIME:return "Time";
            case Types.TIMESTAMP:return "Timestamp";
            case Types.TINYINT:return "short";
            case Types.VARBINARY:return null;
            case Types.VARCHAR:return "String";
            default :return null;
        }
    }

}
