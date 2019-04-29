/*
 * Copyright 2019 Crown Copyright
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

package uk.gov.gchq.gaffer.sketches.clearspring.cardinality.function;

import com.clearspring.analytics.stream.cardinality.HyperLogLogPlus;
import com.fasterxml.jackson.annotation.JsonInclude;

import uk.gov.gchq.koryphe.function.KorypheFunction;

public class IterableToHyperLogLogPlus extends KorypheFunction<Iterable<Object>, HyperLogLogPlus> {
    @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)
    private int p = 5;

    @JsonInclude(value = JsonInclude.Include.NON_DEFAULT)
    private int sp = 5;

    public IterableToHyperLogLogPlus() {
    }

    public IterableToHyperLogLogPlus(final int p, final int sp) {
        this.p = p;
        this.sp = sp;
    }

    @Override
    public HyperLogLogPlus apply(final Iterable<Object> o) {
        final HyperLogLogPlus hllp = new HyperLogLogPlus(p, sp);
        for (final Object obj : o) {
            if (null != obj) {
                hllp.offer(obj);
            }
        }
        return hllp;
    }

    public int getP() {
        return p;
    }

    public void setP(final int p) {
        this.p = p;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(final int sp) {
        this.sp = sp;
    }
}
