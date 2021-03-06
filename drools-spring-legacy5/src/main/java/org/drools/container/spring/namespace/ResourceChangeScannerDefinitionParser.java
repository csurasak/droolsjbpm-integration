/*
 * Copyright 2010 JBoss Inc
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

package org.drools.container.spring.namespace;

import org.drools.container.spring.beans.ResourceChangeScannerBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class ResourceChangeScannerDefinitionParser extends AbstractBeanDefinitionParser {

    private static final String ID = "id";
    private static final String INTERVAL = "interval";
    private static final String ENABLED = "enabled";

    protected AbstractBeanDefinition parseInternal(Element element,
                                                   ParserContext parserContext) {

        BeanDefinitionBuilder factory = BeanDefinitionBuilder.rootBeanDefinition( ResourceChangeScannerBeanFactory.class );

        factory.addPropertyValue( ID,
                                  element.getAttribute( ID ) );
        factory.addPropertyValue( INTERVAL,
                                  element.getAttribute( INTERVAL ) );
        factory.addPropertyValue( ENABLED,
                                  element.getAttribute( ENABLED ) );

        return factory.getBeanDefinition();
    }

}
