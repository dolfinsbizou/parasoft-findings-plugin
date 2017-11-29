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

package com.parasoft.xtest.reports.jenkins.xunit;

import org.jenkinsci.lib.dtkit.descriptor.TestTypeDescriptor;
import org.jenkinsci.lib.dtkit.type.TestType;
import org.kohsuke.stapler.DataBoundConstructor;

import hudson.Extension;

/** 
 * Identifies our tests.
 */
public class ParasoftSOAtest9xType 
    extends TestType 
{
    private static final long serialVersionUID = -636297282706314455L;

    @DataBoundConstructor
    public ParasoftSOAtest9xType(String pattern, boolean skipNoTestFiles, boolean failIfNotNew, boolean deleteOutputFiles, boolean stopProcessingIfError) 
    {
        super(pattern, skipNoTestFiles, failIfNotNew, deleteOutputFiles, stopProcessingIfError);
    }

    @Extension
    public static class ParasoftSOAtest9xTypeDescriptor extends TestTypeDescriptor<ParasoftSOAtest9xType> {

        public ParasoftSOAtest9xTypeDescriptor() 
        {
            super(ParasoftSOAtest9xType.class, ParasoftSOAtest9xInputMetric.class);
        }
    }
}
