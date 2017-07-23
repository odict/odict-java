// automatically generated by the FlatBuffers compiler, do not modify

package org.odict.java.schema;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Etymology extends Table {
  public static Etymology getRootAsEtymology(ByteBuffer _bb) { return getRootAsEtymology(_bb, new Etymology()); }
  public static Etymology getRootAsEtymology(ByteBuffer _bb, Etymology obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Etymology __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String description() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer descriptionAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public Usage usages(int j) { return usages(new Usage(), j); }
  public Usage usages(Usage obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int usagesLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }

  public static int createEtymology(FlatBufferBuilder builder,
      int descriptionOffset,
      int usagesOffset) {
    builder.startObject(2);
    Etymology.addUsages(builder, usagesOffset);
    Etymology.addDescription(builder, descriptionOffset);
    return Etymology.endEtymology(builder);
  }

  public static void startEtymology(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addDescription(FlatBufferBuilder builder, int descriptionOffset) { builder.addOffset(0, descriptionOffset, 0); }
  public static void addUsages(FlatBufferBuilder builder, int usagesOffset) { builder.addOffset(1, usagesOffset, 0); }
  public static int createUsagesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startUsagesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endEtymology(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

