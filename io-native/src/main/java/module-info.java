/*
 *   Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

module io.ballerina.stdlib.io {
    requires io.ballerina.jvm;
    requires org.slf4j;
    exports org.ballerinalang.stdlib.io.channels;
    exports org.ballerinalang.stdlib.io.channels.base;
    exports org.ballerinalang.stdlib.io.channels.base.data;
    exports org.ballerinalang.stdlib.io.csv;
    exports org.ballerinalang.stdlib.io.nativeimpl;
    exports org.ballerinalang.stdlib.io.readers;
    exports org.ballerinalang.stdlib.io.utils;
}