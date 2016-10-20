/*
 * Copyright 2016 Crown Copyright
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

package koryphe.tuple.function;

import koryphe.function.stateless.transformer.TransformerContext;
import koryphe.tuple.Tuple;
import koryphe.tuple.adapter.TupleAdapter;

/**
 * A <code>TupleTransformer</code> transforms input {@link Tuple}s by applying a
 * {@link koryphe.function.stateless.transformer.Transformer} to the tuple values.
 * @param <R> The type of reference used by tuples.
 */
public class TupleTransformer<R, I, O> extends TransformerContext<Tuple<R>, I, TupleAdapter<R, I>, O, TupleAdapter<R, O>> {
    /**
     * Default constructor - for serialisation.
     */
    public TupleTransformer() { }

    /**
     * Transform an input tuple.
     * @param input Input tuple.
     * @return Input tuple with transformed content.
     */
    @Override
    public Tuple<R> execute(final Tuple<R> input) {
        return super.execute(input);
    }
}
