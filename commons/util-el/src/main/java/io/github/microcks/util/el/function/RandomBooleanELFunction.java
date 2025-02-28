/*
 * Copyright The Microcks Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.microcks.util.el.function;

import io.github.microcks.util.el.EvaluationContext;

import java.util.Random;

/**
 * Implementation of ELFunction that generates a random boolean.
 * @author laurent
 */
public class RandomBooleanELFunction implements ELFunction {

   private Random random = new Random();

   @Override
   public String evaluate(EvaluationContext evaluationContext, String... args) {
      return String.valueOf(random.nextBoolean());
   }
}
