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

package nl.gridshore.cqrs4j.eventhandler;

import nl.gridshore.cqrs4j.DomainEvent;

/**
 * An EventProcessingScheduler is responsible for scheduling events for execution. Typically, an
 * EventProcessingScheduler will schedule events for a single {@link EventListener}.
 *
 * @author Allard Buijze
 * @see EventListener
 * @since 0.3
 */
public interface EventProcessingScheduler {

    /**
     * Schedule an event for processing.
     * <p/>
     * Important note: Implementations are responsible for maintaining thread safety.
     *
     * @param event the event to schedule
     */
    void scheduleEvent(DomainEvent event);
}
