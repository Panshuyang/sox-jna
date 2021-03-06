/*
 *  Copyright 2019 Anthem Engineering LLC.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.anthemengineering.sox.jna;

import com.anthemengineering.sox.jna.SoxLibrary.sox_output_message_handler_t;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : sox.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
@SuppressWarnings({"unused", "JavaDoc"})
public class sox_globals_t extends Structure {
	/**
	 * public:<br>
	 * messages are only written if globals.verbosity &gt;= message.level
	 */
	public int verbosity;
	/**
	 * client-specified message output callback<br>
	 * C type : sox_output_message_handler_t
	 */
	public sox_output_message_handler_t output_message_handler;
	/**
	 * see sox_bool<br>
	 * true to use pre-determined timestamps and PRNG seed<br>
	 * C type : sox_bool
	 */
	public int repeatable;
	public size_t bufsiz;
	public size_t input_bufsiz;
	/**
	 * Can be used to re-seed libSoX's PRNG<br>
	 * C type : sox_int32_t
	 */
	public int ranqd1;
	/**
	 * Private: tracks the name of the handler currently using stdin<br>
	 * C type : const char*
	 */
	public Pointer stdin_in_use_by;
	/**
	 * Private: tracks the name of the handler currently using stdout<br>
	 * C type : const char*
	 */
	public Pointer stdout_in_use_by;
	/**
	 * Private: tracks the name of the handler currently writing an output message<br>
	 * C type : const char*
	 */
	public Pointer subsystem;
	/**
	 * Private: client-configured path to use for temporary files<br>
	 * C type : char*
	 */
	public Pointer tmp_path;
	/**
	 * see sox_bool<br>
	 * Private: true if client has requested use of 'magic' file-type detection<br>
	 * C type : sox_bool
	 */
	public int use_magic;
	/**
	 * see sox_bool<br>
	 * Private: true if client has requested parallel effects processing<br>
	 * C type : sox_bool
	 */
	public int use_threads;
	public size_t log2_dft_min_size;
	public sox_globals_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("verbosity", "output_message_handler", "repeatable", "bufsiz", "input_bufsiz", "ranqd1", "stdin_in_use_by", "stdout_in_use_by", "subsystem", "tmp_path", "use_magic", "use_threads", "log2_dft_min_size");
	}
	public sox_globals_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends sox_globals_t implements Structure.ByReference {
		
	};
	public static class ByValue extends sox_globals_t implements Structure.ByValue {
		
	};
}
