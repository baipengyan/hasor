/*
 * Copyright 2008-2009 the original author or authors.
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
package org.more.beans.resource.namespace;
import org.more.beans.ValueMetaData;
import org.more.beans.define.Date_ValueMetaData;
import org.more.beans.define.QuickProperty_ValueMetaData;
import org.more.beans.resource.QuickParserEvent;
import org.more.beans.resource.QuickPropertyParser;
/**
 * 时间类型属性值解析器。
 * @version 2010-9-23
 * @author 赵永春 (zyc@byshell.org)
 */
public class QPP_Date implements QuickPropertyParser {
    public ValueMetaData parser(QuickParserEvent event) {
        QuickProperty_ValueMetaData meta = event.getOldMetaData();
        if (meta.getDate() == null)
            return null;
        Date_ValueMetaData newMETA = new Date_ValueMetaData();
        newMETA.setDateString(meta.getDate());
        newMETA.setFormatString(meta.getFormat());
        return newMETA;
    }
}