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

package com.github.stokito.gag.annotation.enforceable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Causes the annotated method or all the methods of the annotated class to
 * become noop. Void methods do nothing; methods returning primitive numeric
 * values return the equivalent of 0; methods returning boolean return false;
 * methods returning objects return null.
 * <p/>
 * Feel like turning off a method? How about a whole class? Why waste time using a bunch of // and /* * /.
 * Use a {@code @Noop} and, boom, no more behavior.
 * <pre>
 * public class FluxCapacitor {
 *
 *     &#064;Noop("let's see how long before Emmett realizes he's not travelling in time")
 *     public void setDate(Date date) {
 *         this.date = date;
 *     }
 *
 *     public void setSpeed(int speed) {
 *         this.speed = speed;
 *     }
 *
 * }
 * </pre>
 */
@Retention(RetentionPolicy.CLASS)
@Target({
        ElementType.METHOD,
        ElementType.CONSTRUCTOR,
        ElementType.TYPE})
public @interface Noop {
    String value() default "";
}
