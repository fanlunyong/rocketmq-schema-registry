/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.schema.registry.client.config;

import java.util.Map;

public class SerdeConfig {
    public final static String SKIP_SCHEMA_REGISTRY =
            "skip.schema.registry";
    public final static boolean SKIP_SCHEMA_REGISTRY_DEFAULT = false;
    public final static String DESERIALIZE_TARGET_TYPE =
            "deserialize.target.type";
    /**
     * use target version schema to serialize/deserialize without recordId.
     * version default null, will use the latest version.
     */
    public final static String USE_TARGET_VERSION_SCHEMA =
            "use.target.version.schema";

    public final static boolean USE_TARGET_VERSION_SCHEMA_DEFAULT = false;

    public final static String SCHEMA_TARGET_VERSION =
            "schema.target.version";

    public final static long SCHEMA_TARGET_VERSION_DEFAULT = -1;

    /**
     * specific cluster
     */
    public final static String SCHEMA_CLUSTER = "schema.cluster";
    /**
     * specific tenant
     */
    public final static String SCHEMA_TENANT = "schema.tenant";


    protected Map<String, Object> configs;

    public boolean skipSchemaRegistry() {
        return (boolean) configs.getOrDefault(SKIP_SCHEMA_REGISTRY, SKIP_SCHEMA_REGISTRY_DEFAULT);
    }

    public Class<?> deserializeTargetType() {
        return (Class) configs.get(DESERIALIZE_TARGET_TYPE);
    }

    public boolean useTargetVersionSchema() {
        return (boolean) configs.getOrDefault(USE_TARGET_VERSION_SCHEMA, USE_TARGET_VERSION_SCHEMA_DEFAULT);
    }

    public long schemaTargetVersion() {
        return (long) configs.getOrDefault(SCHEMA_TARGET_VERSION, SCHEMA_TARGET_VERSION_DEFAULT);
    }
}
