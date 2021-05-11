/*
 * Copyright (c) 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
package com.sap.xsk.hdb.ds.processors.hdbtablefunction;

import static com.sap.xsk.utils.XSKConstants.SHOULD_ADD_ESCAPE_SYMBOL_DEFAULT_VALUE;
import static java.text.MessageFormat.format;

import com.sap.xsk.hdb.ds.model.hdbtablefunction.XSKDataStructureHDBTableFunctionModel;
import com.sap.xsk.hdb.ds.processors.AbstractXSKProcessor;
import com.sap.xsk.utils.XSKConstants;
import com.sap.xsk.utils.XSKHDBUtils;
import java.sql.Connection;
import java.sql.SQLException;
import org.eclipse.dirigible.database.sql.DatabaseArtifactTypes;
import org.eclipse.dirigible.database.sql.SqlFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HDBTableFunctionCreateProcessor extends AbstractXSKProcessor<XSKDataStructureHDBTableFunctionModel> {

  private static final Logger logger = LoggerFactory.getLogger(HDBTableFunctionCreateProcessor.class);

  public void execute(Connection connection, XSKDataStructureHDBTableFunctionModel hdbTableFunction) throws SQLException {
    logger.info("Processing Create TableFunction: " + hdbTableFunction.getName());

    String tableFunctionName = XSKHDBUtils.escapeArtifactName(connection, hdbTableFunction.getName(),
        SHOULD_ADD_ESCAPE_SYMBOL_DEFAULT_VALUE);
    if (!SqlFactory.getNative(connection).exists(connection, tableFunctionName, DatabaseArtifactTypes.FUNCTION)) {
      String sql = XSKConstants.XSK_HDBTABLEFUNCTION_CREATE + hdbTableFunction.getContent();
      executeSql(sql, connection);
    } else {
      logger.warn(format("TableFunction [{0}] already exists during the create process", hdbTableFunction.getName()));
    }
  }
}
