/**
 * @(#)DefaultCommentGenerator.java, Dec 15, 2015. 
 * 
 * Created by Hoswey
 * 
 * Copyright 2015 Feigong, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.yy.mbg.support.comment;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;

public class DefaultCommentGenerator extends org.mybatis.generator.internal.DefaultCommentGenerator {

    public DefaultCommentGenerator() {
        super();
    }


    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
            IntrospectedColumn introspectedColumn) {

        StringBuilder sb = new StringBuilder();

        field.addJavaDocLine("/**");
        sb.append(" *  "); //$NON-NLS-1$
        sb.append(introspectedColumn.getRemarks());
        sb.append(",所属表字段为");
        sb.append(introspectedTable.getFullyQualifiedTable());
        sb.append('.');
        sb.append(introspectedColumn.getActualColumnName());
        field.addJavaDocLine(sb.toString());

        field.addJavaDocLine(" */"); //$NON-NLS-1$
    }

}
