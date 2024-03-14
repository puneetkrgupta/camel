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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Perform operations on the Qdrant Vector Database.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface LangchainEmbeddingsEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Langchain4j Embeddings component.
     */
    public interface LangchainEmbeddingsEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedLangchainEmbeddingsEndpointBuilder advanced() {
            return (AdvancedLangchainEmbeddingsEndpointBuilder) this;
        }
        /**
         * The EmbeddingModel engine to use.
         * 
         * The option is a:
         * &lt;code&gt;dev.langchain4j.model.embedding.EmbeddingModel&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param embeddingModel the value to set
         * @return the dsl builder
         */
        default LangchainEmbeddingsEndpointBuilder embeddingModel(
                dev.langchain4j.model.embedding.EmbeddingModel embeddingModel) {
            doSetProperty("embeddingModel", embeddingModel);
            return this;
        }
        /**
         * The EmbeddingModel engine to use.
         * 
         * The option will be converted to a
         * &lt;code&gt;dev.langchain4j.model.embedding.EmbeddingModel&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param embeddingModel the value to set
         * @return the dsl builder
         */
        default LangchainEmbeddingsEndpointBuilder embeddingModel(
                String embeddingModel) {
            doSetProperty("embeddingModel", embeddingModel);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Langchain4j Embeddings component.
     */
    public interface AdvancedLangchainEmbeddingsEndpointBuilder
            extends
                EndpointProducerBuilder {
        default LangchainEmbeddingsEndpointBuilder basic() {
            return (LangchainEmbeddingsEndpointBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedLangchainEmbeddingsEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedLangchainEmbeddingsEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface LangchainEmbeddingsBuilders {
        /**
         * Langchain4j Embeddings (camel-langchain-embeddings)
         * Perform operations on the Qdrant Vector Database.
         * 
         * Category: ai
         * Since: 4.5
         * Maven coordinates: org.apache.camel:camel-langchain-embeddings
         * 
         * @return the dsl builder for the headers' name.
         */
        default LangchainEmbeddingsHeaderNameBuilder langchainEmbeddings() {
            return LangchainEmbeddingsHeaderNameBuilder.INSTANCE;
        }
        /**
         * Langchain4j Embeddings (camel-langchain-embeddings)
         * Perform operations on the Qdrant Vector Database.
         * 
         * Category: ai
         * Since: 4.5
         * Maven coordinates: org.apache.camel:camel-langchain-embeddings
         * 
         * Syntax: <code>langchain-embeddings:embeddingId</code>
         * 
         * Path parameter: embeddingId (required)
         * The id
         * 
         * @param path embeddingId
         * @return the dsl builder
         */
        default LangchainEmbeddingsEndpointBuilder langchainEmbeddings(
                String path) {
            return LangchainEmbeddingsEndpointBuilderFactory.endpointBuilder("langchain-embeddings", path);
        }
        /**
         * Langchain4j Embeddings (camel-langchain-embeddings)
         * Perform operations on the Qdrant Vector Database.
         * 
         * Category: ai
         * Since: 4.5
         * Maven coordinates: org.apache.camel:camel-langchain-embeddings
         * 
         * Syntax: <code>langchain-embeddings:embeddingId</code>
         * 
         * Path parameter: embeddingId (required)
         * The id
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path embeddingId
         * @return the dsl builder
         */
        default LangchainEmbeddingsEndpointBuilder langchainEmbeddings(
                String componentName,
                String path) {
            return LangchainEmbeddingsEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Langchain4j Embeddings component.
     */
    public static class LangchainEmbeddingsHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final LangchainEmbeddingsHeaderNameBuilder INSTANCE = new LangchainEmbeddingsHeaderNameBuilder();

        /**
         * The Finish Reason.
         * 
         * The option is a: {@code dev.langchain4j.model.output.FinishReason}
         * type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * LangchainEmbeddingsFinishReason}.
         */
        public String langchainEmbeddingsFinishReason() {
            return "CamelLangchainEmbeddingsFinishReason";
        }

        /**
         * The Input Token Count.
         * 
         * The option is a: {@code int} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * LangchainEmbeddingsInputTokenCount}.
         */
        public String langchainEmbeddingsInputTokenCount() {
            return "CamelLangchainEmbeddingsInputTokenCount";
        }

        /**
         * The Output Token Count.
         * 
         * The option is a: {@code int} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * LangchainEmbeddingsOutputTokenCount}.
         */
        public String langchainEmbeddingsOutputTokenCount() {
            return "CamelLangchainEmbeddingsOutputTokenCount";
        }

        /**
         * The Total Token Count.
         * 
         * The option is a: {@code int} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * LangchainEmbeddingsTotalTokenCount}.
         */
        public String langchainEmbeddingsTotalTokenCount() {
            return "CamelLangchainEmbeddingsTotalTokenCount";
        }

        /**
         * A dense vector embedding of a text.
         * 
         * The option is a: {@code float[]} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code LangchainEmbeddingsVector}.
         */
        public String langchainEmbeddingsVector() {
            return "CamelLangchainEmbeddingsVector";
        }
    }
    static LangchainEmbeddingsEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class LangchainEmbeddingsEndpointBuilderImpl extends AbstractEndpointBuilder implements LangchainEmbeddingsEndpointBuilder, AdvancedLangchainEmbeddingsEndpointBuilder {
            public LangchainEmbeddingsEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new LangchainEmbeddingsEndpointBuilderImpl(path);
    }
}