package com.anthemengineering.sox.jna;
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
public class lsx_enum_item extends Structure {
	/**
	 * < String name of enumeration.<br>
	 * C type : const char*
	 */
	public Pointer text;
	/** < Integer value of enumeration. */
	public int value;
	public lsx_enum_item() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("text", "value");
	}
	/**
	 * @param text < String name of enumeration.<br>
	 * C type : const char*<br>
	 * @param value < Integer value of enumeration.
	 */
	public lsx_enum_item(Pointer text, int value) {
		super();
		this.text = text;
		this.value = value;
	}
	public lsx_enum_item(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends lsx_enum_item implements Structure.ByReference {
		
	};
	public static class ByValue extends lsx_enum_item implements Structure.ByValue {
		
	};
}