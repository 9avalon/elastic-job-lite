/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 */

package com.dangdang.ddframe.job.util.event.fixture;

import com.dangdang.ddframe.job.util.trace.TraceEvent;
import com.dangdang.ddframe.job.util.trace.TraceEventListener;
import com.dangdang.ddframe.job.util.trace.TraceEventType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public final class TestTraceEvenListener implements TraceEventListener {
    
    private final Caller caller;
    
    @Override
    public TraceEventType getType() {
        return TraceEventType.LITE;
    }
    
    @Override
    public void listen(final TraceEvent traceEvent) {
        caller.call();
    }
}
