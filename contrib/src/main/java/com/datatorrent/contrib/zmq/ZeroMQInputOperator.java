/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.datatorrent.contrib.zmq;

/**
 * Input adapter operator with a single output port, which consumes byte array data from the ZeroMQ and outputs byte array.
 * <p></p>
 *
 * @displayName Single Port Zero MQ input operator
 * @category Messaging
 * @tags input operator, string
 *
 * @since 3.0.0
 */
public class ZeroMQInputOperator extends AbstractSinglePortZeroMQInputOperator<byte[]>
{
  @Override
  public byte[] getTuple(byte[] message) {
    return message;
  }
}
