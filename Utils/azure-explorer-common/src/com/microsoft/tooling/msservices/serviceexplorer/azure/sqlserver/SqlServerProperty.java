/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.tooling.msservices.serviceexplorer.azure.sqlserver;

import com.microsoft.azure.toolkit.lib.database.entity.FirewallRuleEntity;
import com.microsoft.azure.toolkit.lib.sqlserver.SqlServer;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SqlServerProperty {

    private SqlServer server;
    private List<FirewallRuleEntity> firewallRules;

}