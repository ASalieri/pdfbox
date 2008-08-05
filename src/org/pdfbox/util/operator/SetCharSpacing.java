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
package org.pdfbox.util.operator;

import java.util.List;
import org.pdfbox.cos.COSNumber;
import org.pdfbox.util.PDFOperator;

/**
 *
 * <p>Titre : PDFEngine Modification.</p>
 * <p>Description : Structal modification of the PDFEngine class :
 * the long sequence of conditions in processOperator is remplaced by
 * this strategy pattern</p>
 * <p>Copyright : Copyright (c) 2004</p>
 * <p>Soci�t� : DBGS</p>
 * @author Huault : huault@free.fr
 * @version $Revision: 1.5 $
 */
public class SetCharSpacing extends OperatorProcessor
{
    /**
     * process : Tc Set character spacing.
     * @param operator The operator that is being executed.
     * @param arguments List
     */
    public void process(PDFOperator operator, List arguments)
    {
        //set character spacing
        if( arguments.size() > 0 )
        {
            //There are some documents which are incorrectly structured, and have
            //a wrong number of arguments to this, so we will assume the last argument
            //in the list
            Object charSpacing = arguments.get( arguments.size()-1 );
            if( charSpacing instanceof COSNumber )
            {
                COSNumber characterSpacing = (COSNumber)charSpacing;
                context.getGraphicsState().getTextState().setCharacterSpacing( characterSpacing.floatValue() );
            }
        }
    }
}
