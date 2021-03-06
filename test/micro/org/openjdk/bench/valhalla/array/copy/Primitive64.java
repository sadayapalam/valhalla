/*
 * Copyright (c) 2020, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.openjdk.bench.valhalla.array.copy;

import org.openjdk.bench.valhalla.array.util.PrimitiveStates;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.CompilerControl;

public class Primitive64 extends PrimitiveStates {

    @Benchmark
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public void p64byte_copy(Primitive64byte s, Primitive64byte d) {
        byte[] src = s.arr;
        byte[] dst = d.arr;
        for (int i = 0; i < src.length; i++) {
            dst[i] = src[i];
        }
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public void p64byte_arraycopy(Primitive64byte s, Primitive64byte d) {
        System.arraycopy(s.arr, 0, d.arr, 0, s.arr.length);
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public void p64int_copy(Primitive64int s, Primitive64int d) {
        int[] src = s.arr;
        int[] dst = d.arr;
        for (int i = 0; i < src.length; i++) {
            dst[i] = src[i];
        }
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public void p64int_arraycopy(Primitive64int s, Primitive64int d) {
        System.arraycopy(s.arr, 0, d.arr, 0, s.arr.length);
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public void p64long_copy(Primitive64long s, Primitive64long d) {
        long[] src = s.arr;
        long[] dst = d.arr;
        for (int i = 0; i < src.length; i++) {
            dst[i] = src[i];
        }
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public void p64long_arraycopy(Primitive64long s, Primitive64long d) {
        System.arraycopy(s.arr, 0, d.arr, 0, s.arr.length);
    }

}
