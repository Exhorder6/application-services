/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package mozilla.appservices;

public class LockboxMegazord {
    public static void init() {
        System.setProperty("mozilla.appservices.fxaclient_ffi_lib_name", "lockbox");
        System.setProperty("mozilla.appservices.logins_ffi_lib_name", "lockbox");
        System.setProperty("mozilla.appservices.rc_log_ffi_lib_name", "lockbox");
        LibZeroingAllocator.zeroing_allocator_enable();
    }

    @SuppressWarnings("JniMissingFunction")
    static class LibZeroingAllocator {
        static { com.sun.jna.Native.register(LibZeroingAllocator.class, "lockbox"); }
        static native void zeroing_allocator_enable();
    }
}
