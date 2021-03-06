/*
 * Copyright (C) 2012 Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.airlift.drift.codec;

import io.airlift.drift.annotations.ThriftField;
import io.airlift.drift.annotations.ThriftStruct;

import java.util.Objects;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("Bonk")
public final class BonkField
{
    @ThriftField(1)
    public String message;

    @ThriftField(2)
    public int type;

    public BonkField()
    {
    }

    public BonkField(String message, int type)
    {
        this.message = message;
        this.type = type;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BonkField bonkField = (BonkField) o;
        return type == bonkField.type &&
                Objects.equals(message, bonkField.message);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(message, type);
    }

    @Override
    public String toString()
    {
        return toStringHelper(this)
                .add("message", message)
                .add("type", type)
                .toString();
    }
}
