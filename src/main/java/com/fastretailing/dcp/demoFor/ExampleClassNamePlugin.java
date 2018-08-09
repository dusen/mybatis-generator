package com.fastretailing.dcp.demoFor;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

public class ExampleClassNamePlugin extends PluginAdapter {
    


    @Override
    public void initialized(IntrospectedTable table) {
        super.initialized(table);
        
        String name = table.getExampleType();
        table.setExampleType(name.replaceAll("Example", "Condition"));
        
        name = table.getCountByExampleStatementId();
        table.setCountByExampleStatementId(name.replaceAll("Example", "Condition"));
        
        name = table.getDeleteByExampleStatementId();
        table.setDeleteByExampleStatementId(name.replaceAll("Example", "Condition"));
        
        name = table.getExampleWhereClauseId();
        table.setExampleWhereClauseId(name.replaceAll("Example", "Condition"));
        
        name = table.getMyBatis3UpdateByExampleWhereClauseId();
        table.setMyBatis3UpdateByExampleWhereClauseId(name.replaceAll("Example", "Condition"));
        
        name = table.getSelectByExampleStatementId();
        table.setSelectByExampleStatementId(name.replaceAll("Example", "Condition"));
        
        name = table.getSelectByExampleWithBLOBsStatementId();
        table.setSelectByExampleWithBLOBsStatementId(name.replaceAll("Example", "Condition"));
        
        name = table.getUpdateByExampleSelectiveStatementId();
        table.setUpdateByExampleSelectiveStatementId(name.replaceAll("Example", "Condition"));
        
        name = table.getUpdateByExampleStatementId();
        table.setUpdateByExampleStatementId(name.replaceAll("Example", "Condition"));
        
        name = table.getUpdateByExampleWithBLOBsStatementId();
        table.setUpdateByExampleWithBLOBsStatementId(name.replaceAll("Example", "Condition"));
    }

    public boolean validate(List<String> warnings) {
        return true;
    }
}
