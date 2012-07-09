/*
*  Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.siddhi.core.projector.attibute.aggregator.sum;

import org.wso2.siddhi.core.projector.attibute.aggregator.Aggregator;
import org.wso2.siddhi.query.api.definition.Attribute;

public class SumAggregatorInt implements Aggregator {

    private long value = 0L;
    private Attribute.Type type = Attribute.Type.LONG;

    public Object getValue() {
        return value;
    }

    public Attribute.Type getType() {
        return this.type;
    }

    @Override
    public Object add(Object obj) {
        value += ((Integer) obj).longValue();
        return value;
    }

    @Override
    public Object remove(Object obj) {
        value -= ((Integer) obj).longValue();
        return value;
    }

    @Override
    public Aggregator createNewInstance() {
        return new SumAggregatorInt();
    }
}
