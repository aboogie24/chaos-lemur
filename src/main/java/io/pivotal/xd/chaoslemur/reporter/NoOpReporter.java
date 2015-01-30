/*
 * Copyright 2014-2015 the original author or authors.
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

package io.pivotal.xd.chaoslemur.reporter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

final class NoOpReporter implements Reporter {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void sendEvent(String title, String message) {
        this.logger.info("{}:\n{}", title, message);
    }

}
