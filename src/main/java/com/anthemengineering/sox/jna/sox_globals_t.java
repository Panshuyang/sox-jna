package com.anthemengineering.sox.jna;
import com.anthemengineering.sox.jna.SoxLibrary.sox_output_message_handler_t;
import com.ochafik.lang.jnaerator.runtime.NativeSize;
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
public class sox_globals_t extends Structure {
	/**
	 * public:<br>
	 * < messages are only written if globals.verbosity >= message.level
	 */
	public int verbosity;
	/**
	 * < client-specified message output callback<br>
	 * C type : sox_output_message_handler_t
	 */
	public sox_output_message_handler_t output_message_handler;
	/**
	 * @see sox_bool<br>
	 * < true to use pre-determined timestamps and PRNG seed<br>
	 * C type : sox_bool
	 */
	public int repeatable;
	public NativeSize bufsiz;
	public NativeSize input_bufsiz;
	/**
	 * < Can be used to re-seed libSoX's PRNG<br>
	 * C type : sox_int32_t
	 */
	public int ranqd1;
	/**
	 * < Private: tracks the name of the handler currently using stdin<br>
	 * C type : const char*
	 */
	public Pointer stdin_in_use_by;
	/**
	 * < Private: tracks the name of the handler currently using stdout<br>
	 * C type : const char*
	 */
	public Pointer stdout_in_use_by;
	/**
	 * < Private: tracks the name of the handler currently writing an output message<br>
	 * C type : const char*
	 */
	public Pointer subsystem;
	/**
	 * < Private: client-configured path to use for temporary files<br>
	 * C type : char*
	 */
	public Pointer tmp_path;
	/**
	 * @see sox_bool<br>
	 * < Private: true if client has requested use of 'magic' file-type detection<br>
	 * C type : sox_bool
	 */
	public int use_magic;
	/**
	 * @see sox_bool<br>
	 * < Private: true if client has requested parallel effects processing<br>
	 * C type : sox_bool
	 */
	public int use_threads;
	public NativeSize log2_dft_min_size;
	public sox_globals_t() {
		super();
	}
	protected List<? > getFieldOrder() {
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