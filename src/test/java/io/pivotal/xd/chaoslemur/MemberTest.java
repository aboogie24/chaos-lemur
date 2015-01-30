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

package io.pivotal.xd.chaoslemur;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public final class MemberTest {

    private final Member member = new Member("test-id", "test-deployment", "test-job", "test-name");

    private final Member compare = new Member("compare-id", "compare-deployment", "compare-job", "compare-name");

    @Test
    public void test() {
        assertEquals("test-id", this.member.getId());
        assertEquals("test-deployment", this.member.getDeployment());
        assertEquals("test-job", this.member.getJob());
        assertEquals("test-name", this.member.getName());

        assertEquals("[id: test-id, deployment: test-deployment, job: test-job, name: test-name]",
                this.member.toString());
    }

    @Test
    public void compareTo() {
        assertTrue(this.member.compareTo(compare) > 0);
    }

}
