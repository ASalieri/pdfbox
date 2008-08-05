/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package test.pdfbox;

import test.pdfbox.cos.TestCOSString;
import test.pdfbox.filter.TestFilters;
import test.pdfbox.pdmodel.TestFDF;
import test.pdfbox.pdmodel.interactive.form.TestFields;
import test.pdfbox.util.TestDateUtil;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This is a holder for all test cases in the pdfbox system.
 *
 * @author <a href="mailto:ben@benlitchfield.com">Ben Litchfield</a>
 * @version $Revision: 1.9 $
 */
public class TestAll extends TestCase
{

    /**
     * Constructor.
     *
     * @param name The name of the test to run.
     */
    public TestAll( String name )
    {
        super( name );
    }

    /**
     * The main method to run tests.
     *
     * @param args The command line arguments.
     */
    public static void main( String[] args )
    {
        String[] arg = {TestAll.class.getName() };
        junit.textui.TestRunner.main( arg );
    }

    /**
     * This will get the suite of test that this class holds.
     *
     * @return All of the tests that this class holds.
     */
    public static Test suite()
    {
        TestSuite suite = new TestSuite();
        suite.addTest( TestDateUtil.suite() );
        suite.addTest( TestFilters.suite() );
        suite.addTest( TestFDF.suite() );
        suite.addTest( TestFields.suite() );
        suite.addTest( TestFDF.suite() );
        suite.addTest( TestCOSString.suite() );
        return suite;
    }
}
