/*
 * Copyright (c) 2010. Gridshore
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

package nl.gridshore.cqrs4j;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author Allard Buijze
 */
public class StubDomainEvent extends DomainEvent implements Serializable {

    public StubDomainEvent() {
    }

    public StubDomainEvent(int sequenceNumber) {
        setSequenceNumber(sequenceNumber);
    }

    public StubDomainEvent(UUID aggregateIdentifier) {
        setAggregateIdentifier(aggregateIdentifier);
    }

    public StubDomainEvent(UUID aggregateIdentifier, int sequenceNumber) {
        setAggregateIdentifier(aggregateIdentifier);
        setSequenceNumber(sequenceNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StubDomainEvent aggregate [");
        sb.append(getAggregateIdentifier());
        sb.append("] sequenceNo [");
        sb.append(getSequenceNumber());
        sb.append("]");
        return sb.toString();
    }
}