/**
 * Copyright 2010 Google Inc.
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

package com.github.stokito.gag.annotation.disclaimer;

import com.github.stokito.gag.annotation.team.Visionary;
import com.github.stokito.gag.enumeration.Consequence;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Indicates that the annotated code should not be modified without consulting
 * the specified person. For example:
 * <p/>
 * <pre>
 *   &#064;HandsOff(
 *       byOrderOf = "Jules Winnfield",
 *       onPainOf = Consequence.ICE_COLD_STARE)
 *   public class MysteriousBriefcase {
 * </pre>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Visionary("Paul Cowan")
public @interface HandsOff {
    String byOrderOf();

    Consequence onPainOf();
}
