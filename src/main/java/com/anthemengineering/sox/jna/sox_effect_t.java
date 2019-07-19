package com.anthemengineering.sox.jna;
import com.ochafik.lang.jnaerator.runtime.NativeSize;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * Client API:<br>
 * Effect information.<br>
 * <i>native declaration : sox.h:1607</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class sox_effect_t extends Structure {
	/**
	 * < global effect parameters<br>
	 * C type : sox_effects_globals_t*
	 */
	public com.anthemengineering.sox.jna.sox_effects_globals_t.ByReference global_info;
	/**
	 * < Information about the incoming data stream<br>
	 * C type : sox_signalinfo_t
	 */
	public sox_signalinfo_t in_signal;
	/**
	 * < Information about the outgoing data stream<br>
	 * C type : sox_signalinfo_t
	 */
	public sox_signalinfo_t out_signal;
	/**
	 * < Information about the incoming data encoding<br>
	 * C type : const sox_encodinginfo_t*
	 */
	public com.anthemengineering.sox.jna.sox_encodinginfo_t.ByReference in_encoding;
	/**
	 * < Information about the outgoing data encoding<br>
	 * C type : const sox_encodinginfo_t*
	 */
	public com.anthemengineering.sox.jna.sox_encodinginfo_t.ByReference out_encoding;
	/**
	 * < The handler for this effect<br>
	 * C type : sox_effect_handler_t
	 */
	public sox_effect_handler_t handler;
	/**
	 * < increment if clipping occurs<br>
	 * C type : sox_uint64_t
	 */
	public long clips;
	/** < 1 if MCHAN, number of chans otherwise */
	public NativeSize flows;
	/** < flow number */
	public NativeSize flow;
	/**
	 * < Effect's private data area (each flow has a separate copy)<br>
	 * C type : void*
	 */
	public Pointer priv;
	/**
	 * < output buffer<br>
	 * C type : sox_sample_t*
	 */
	public IntByReference obuf;
	/** < output buffer: start of valid data section */
	public NativeSize obeg;
	/** < output buffer: one past valid data section (oend-obeg is length of current content) */
	public NativeSize oend;
	/** < minimum input buffer content required for calling this effect's flow function; set via lsx_effect_set_imin() */
	public NativeSize imin;
	public sox_effect_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("global_info", "in_signal", "out_signal", "in_encoding", "out_encoding", "handler", "clips", "flows", "flow", "priv", "obuf", "obeg", "oend", "imin");
	}
	public sox_effect_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends sox_effect_t implements Structure.ByReference {
		
	};
	public static class ByValue extends sox_effect_t implements Structure.ByValue {
		
	};
}