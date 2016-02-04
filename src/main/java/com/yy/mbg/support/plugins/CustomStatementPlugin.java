/**
 * @(#)CustomStatementPlugin.java, Dec 15, 2015. 
 * 
 * Created by Hoswey
 * 
 * Copyright 2015 Feigong, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.yy.mbg.support.plugins;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.XmlElement;

public class CustomStatementPlugin extends PluginAdapter {
    public CustomStatementPlugin() {
    }

    @Override
    public void initialized(IntrospectedTable introspectedTable) {

        introspectedTable.setUpdateByPrimaryKeySelectiveStatementId("updateByPrimaryKey"); //$NON-NLS-1$
    }

    public boolean validate(List<String> warnings) {
        System.out.println("2222");

        return true;
    }

    public boolean clientInsertSelectiveMethodGenerated(Method method, Interface interfaze,
            IntrospectedTable introspectedTable) {
        System.out.println("2222");

        return false;
    }

    public boolean clientInsertSelectiveMethodGenerated(Method method, TopLevelClass topLevelClass,
            IntrospectedTable introspectedTable) {
        System.out.println("2222");

        return false;
    }

    public boolean sqlMapInsertSelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        System.out.println("2222");
        return false;
    }

    public boolean providerInsertSelectiveMethodGenerated(Method method, TopLevelClass topLevelClass,
            IntrospectedTable introspectedTable) {
        System.out.println("1111");
        return false;
    }

    public boolean clientUpdateByPrimaryKeyMethodGenerated(Method method, Interface interfaze,
            IntrospectedTable introspectedTable) {
        System.out.println("1111");

        return false;
    }

    public boolean clientUpdateByPrimaryKeyMethodGenerated(Method method, TopLevelClass topLevelClass,
            IntrospectedTable introspectedTable) {
        System.out.println("1111");

        return false;
    }

    public boolean sqlMapUpdateByPrimaryKeyElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        System.out.println("1111");

        return false;
    }

    public boolean providerUpdateByPrimaryKeyMethodGenerated(Method method, TopLevelClass topLevelClass,
            IntrospectedTable introspectedTable) {
        return false;
    }

    public boolean clientUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(Method method, Interface interfaze,
            IntrospectedTable introspectedTable) {

        return false;
    }

    public boolean clientUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
            IntrospectedTable introspectedTable) {

        return false;
    }

    public boolean sqlMapUpdateByPrimaryKeyWithoutBLOBsElementGenerated(XmlElement element,
            IntrospectedTable introspectedTable) {

        return false;
    }

    public boolean providerUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
            IntrospectedTable introspectedTable) {
        return false;
    }

}
