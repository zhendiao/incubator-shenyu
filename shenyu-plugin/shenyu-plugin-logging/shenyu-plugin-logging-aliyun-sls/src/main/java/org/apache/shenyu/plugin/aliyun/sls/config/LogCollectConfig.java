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

package org.apache.shenyu.plugin.aliyun.sls.config;

import org.apache.shenyu.plugin.logging.common.config.GenericGlobalConfig;

import java.util.Optional;

/**
 * LogCollectConfig.
 */
public class LogCollectConfig {

    public static final LogCollectConfig INSTANCE = new LogCollectConfig();

    private GlobalLogConfig globalLogConfig;

    /**
     * get global log config.
     *
     * @return global log config
     */
    public GlobalLogConfig getGlobalLogConfig() {
        return Optional.ofNullable(globalLogConfig).orElse(new GlobalLogConfig());
    }

    /**
     * set global log config.
     *
     * @param globalLogConfig global log config.
     */
    public void setGlobalLogConfig(final GlobalLogConfig globalLogConfig) {
        this.globalLogConfig = globalLogConfig;
    }

    /**
     * global log config.
     */
    public static class GlobalLogConfig extends GenericGlobalConfig {

        /**
         * aliyun sls address.
         * please seee https://help.aliyun.com/document_detail/29008.htm?spm=a2c4g.11186623.0.0.cc7a3de5dJNKOe#reference-wgx-pwq-zdb
         */
        private String host;

        /**
         * aliyun access id.
         */
        private String accessId;

        /**
         * aliyun accessKey.
         */
        private String accessKey;

        /**
         * aliyun sls project name.
         */
        private String projectName = "shenyu";

        /**
         * aliyun sls logstore name.
         */
        private String logStoreName = "shenyu-logstore";

        /**
         * aliyun sls ttl.
         */
        private Integer ttlInDay = 3;

        /**
         * aliyun shard.
         */
        private Integer shardCount = 10;

        /**
         * aliyun sls topic.
         * aliyun query by topic
         */
        private String topic = "shenyu-topic";

        /**
         * send thread.
         */
        private Integer sendThreadCount = 1;

        /**
         * ioThread.
         */
        private Integer ioThreadCount = 1;

        /**
         * get host.
         *
         * @return host
         */
        public String getHost() {
            return host;
        }

        /**
         * set host.
         *
         * @param host host name
         */
        public void setHost(final String host) {
            this.host = host;
        }

        /**
         * get access id.
         *
         * @return accessId
         */
        public String getAccessId() {
            return accessId;
        }

        /**
         * set accessId.
         *
         * @param accessId accessId
         */
        public void setAccessId(final String accessId) {
            this.accessId = accessId;
        }

        /**
         * get accessKey.
         *
         * @return accessKey
         */
        public String getAccessKey() {
            return accessKey;
        }

        /**
         * set accessKey.
         *
         * @param accessKey accessKey
         */
        public void setAccessKey(final String accessKey) {
            this.accessKey = accessKey;
        }

        /**
         * get project name.
         *
         * @return project name
         */
        public String getProjectName() {
            return projectName;
        }

        /**
         * set project.
         *
         * @param projectName project name
         */
        public void setProjectName(final String projectName) {
            this.projectName = projectName;
        }

        /**
         * get logStore name.
         *
         * @return logStore name
         */
        public String getLogStoreName() {
            return logStoreName;
        }

        /**
         * set logStore name.
         *
         * @param logStoreName logStoreName
         */
        public void setLogStoreName(final String logStoreName) {
            this.logStoreName = logStoreName;
        }

        /**
         * get ttl.
         *
         * @return ttl
         */
        public Integer getTtlInDay() {
            return ttlInDay;
        }

        /**
         * set ttl.
         *
         * @param ttlInDay ttl
         */
        public void setTtlInDay(final Integer ttlInDay) {
            this.ttlInDay = ttlInDay;
        }

        /**
         * get aliyun shard.
         *
         * @return shard count
         */
        public Integer getShardCount() {
            return shardCount;
        }

        /**
         * set aliyun shard.
         *
         * @param shardCount shardCount
         */
        public void setShardCount(final Integer shardCount) {
            this.shardCount = shardCount;
        }

        /**
         * get aliyun search topic.
         *
         * @return topic
         */
        public String getTopic() {
            return topic;
        }

        /**
         * set aliyun search toic.
         *
         * @param topic topic
         */
        public void setTopic(final String topic) {
            this.topic = topic;
        }

        /**
         * get send thread count.
         *
         * @return send thread count
         */
        public Integer getSendThreadCount() {
            return sendThreadCount;
        }

        /**
         * send thread count.
         *
         * @param sendThreadCount send thread count
         */
        public void setSendThreadCount(final Integer sendThreadCount) {
            this.sendThreadCount = sendThreadCount;
        }

        /**
         * get io thread count.
         *
         * @return io thread count
         */
        public Integer getIoThreadCount() {
            return ioThreadCount;
        }

        /**
         * set send thread count.
         *
         * @param ioThreadCount io thread count.
         */
        public void setIoThreadCount(final Integer ioThreadCount) {
            this.ioThreadCount = ioThreadCount;
        }
    }
}
