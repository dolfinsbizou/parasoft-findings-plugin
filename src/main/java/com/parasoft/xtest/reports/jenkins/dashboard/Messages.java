/*
 * Copyright 2017 Parasoft Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.parasoft.xtest.reports.jenkins.dashboard;

import com.parasoft.xtest.common.nls.NLS;

/**
 * Provides localized messages for this package.
 */
final class Messages
    extends NLS
{
    static {
        // initialize resource bundle
        NLS.initMessages(Messages.class);
    }

    /**
     * Just to prevent instantiation.
     */
    private Messages() {}

    public static String PORTLET_WARNINGS_TABLE;

    public static String PORTLET_WARNINGS_PRIORITY_GRAPH;

    public static String PORTLET_WARNINGS_NEW_VS_FIXED_GRAPH;

    public static String PORTLET_WARNINGS_TOTALS_GRAPH;
	
} // final class Messages