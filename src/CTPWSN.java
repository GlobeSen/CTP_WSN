/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'CTPWSN'
 * message type.
 */

public class CTPWSN extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 20;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 3;

    /** Create a new CTPWSN of size 20. */
    public CTPWSN() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new CTPWSN of the given data_length. */
    public CTPWSN(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new CTPWSN with the given data_length
     * and base offset.
     */
    public CTPWSN(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new CTPWSN using the given byte array
     * as backing store.
     */
    public CTPWSN(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new CTPWSN using the given byte array
     * as backing store, with the given base offset.
     */
    public CTPWSN(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new CTPWSN using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public CTPWSN(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new CTPWSN embedded in the given message
     * at the given base offset.
     */
    public CTPWSN(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new CTPWSN embedded in the given message
     * at the given base offset and length.
     */
    public CTPWSN(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <CTPWSN> \n";
      try {
        s += "  [msgType=0x"+Long.toHexString(get_msgType())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [leftUp_x=0x"+Long.toHexString(get_leftUp_x())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [leftUp_y=0x"+Long.toHexString(get_leftUp_y())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [rightDown_x=0x"+Long.toHexString(get_rightDown_x())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [rightDown_y=0x"+Long.toHexString(get_rightDown_y())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [start_time=0x"+Long.toHexString(get_start_time())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [end_time=0x"+Long.toHexString(get_end_time())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [dataType=0x"+Long.toHexString(get_dataType())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [data=0x"+Long.toHexString(get_data())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [hop=0x"+Long.toHexString(get_hop())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: msgType
    //   Field type: int, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'msgType' is signed (false).
     */
    public static boolean isSigned_msgType() {
        return false;
    }

    /**
     * Return whether the field 'msgType' is an array (false).
     */
    public static boolean isArray_msgType() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'msgType'
     */
    public static int offset_msgType() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'msgType'
     */
    public static int offsetBits_msgType() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'msgType'
     */
    public int get_msgType() {
        return (int)getUIntElement(offsetBits_msgType(), 16);
    }

    /**
     * Set the value of the field 'msgType'
     */
    public void set_msgType(int value) {
        setUIntElement(offsetBits_msgType(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'msgType'
     */
    public static int size_msgType() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'msgType'
     */
    public static int sizeBits_msgType() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: leftUp_x
    //   Field type: int, unsigned
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'leftUp_x' is signed (false).
     */
    public static boolean isSigned_leftUp_x() {
        return false;
    }

    /**
     * Return whether the field 'leftUp_x' is an array (false).
     */
    public static boolean isArray_leftUp_x() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'leftUp_x'
     */
    public static int offset_leftUp_x() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'leftUp_x'
     */
    public static int offsetBits_leftUp_x() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'leftUp_x'
     */
    public int get_leftUp_x() {
        return (int)getUIntElement(offsetBits_leftUp_x(), 16);
    }

    /**
     * Set the value of the field 'leftUp_x'
     */
    public void set_leftUp_x(int value) {
        setUIntElement(offsetBits_leftUp_x(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'leftUp_x'
     */
    public static int size_leftUp_x() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'leftUp_x'
     */
    public static int sizeBits_leftUp_x() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: leftUp_y
    //   Field type: int, unsigned
    //   Offset (bits): 32
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'leftUp_y' is signed (false).
     */
    public static boolean isSigned_leftUp_y() {
        return false;
    }

    /**
     * Return whether the field 'leftUp_y' is an array (false).
     */
    public static boolean isArray_leftUp_y() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'leftUp_y'
     */
    public static int offset_leftUp_y() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'leftUp_y'
     */
    public static int offsetBits_leftUp_y() {
        return 32;
    }

    /**
     * Return the value (as a int) of the field 'leftUp_y'
     */
    public int get_leftUp_y() {
        return (int)getUIntElement(offsetBits_leftUp_y(), 16);
    }

    /**
     * Set the value of the field 'leftUp_y'
     */
    public void set_leftUp_y(int value) {
        setUIntElement(offsetBits_leftUp_y(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'leftUp_y'
     */
    public static int size_leftUp_y() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'leftUp_y'
     */
    public static int sizeBits_leftUp_y() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: rightDown_x
    //   Field type: int, unsigned
    //   Offset (bits): 48
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'rightDown_x' is signed (false).
     */
    public static boolean isSigned_rightDown_x() {
        return false;
    }

    /**
     * Return whether the field 'rightDown_x' is an array (false).
     */
    public static boolean isArray_rightDown_x() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'rightDown_x'
     */
    public static int offset_rightDown_x() {
        return (48 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'rightDown_x'
     */
    public static int offsetBits_rightDown_x() {
        return 48;
    }

    /**
     * Return the value (as a int) of the field 'rightDown_x'
     */
    public int get_rightDown_x() {
        return (int)getUIntElement(offsetBits_rightDown_x(), 16);
    }

    /**
     * Set the value of the field 'rightDown_x'
     */
    public void set_rightDown_x(int value) {
        setUIntElement(offsetBits_rightDown_x(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'rightDown_x'
     */
    public static int size_rightDown_x() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'rightDown_x'
     */
    public static int sizeBits_rightDown_x() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: rightDown_y
    //   Field type: int, unsigned
    //   Offset (bits): 64
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'rightDown_y' is signed (false).
     */
    public static boolean isSigned_rightDown_y() {
        return false;
    }

    /**
     * Return whether the field 'rightDown_y' is an array (false).
     */
    public static boolean isArray_rightDown_y() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'rightDown_y'
     */
    public static int offset_rightDown_y() {
        return (64 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'rightDown_y'
     */
    public static int offsetBits_rightDown_y() {
        return 64;
    }

    /**
     * Return the value (as a int) of the field 'rightDown_y'
     */
    public int get_rightDown_y() {
        return (int)getUIntElement(offsetBits_rightDown_y(), 16);
    }

    /**
     * Set the value of the field 'rightDown_y'
     */
    public void set_rightDown_y(int value) {
        setUIntElement(offsetBits_rightDown_y(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'rightDown_y'
     */
    public static int size_rightDown_y() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'rightDown_y'
     */
    public static int sizeBits_rightDown_y() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: start_time
    //   Field type: int, unsigned
    //   Offset (bits): 80
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'start_time' is signed (false).
     */
    public static boolean isSigned_start_time() {
        return false;
    }

    /**
     * Return whether the field 'start_time' is an array (false).
     */
    public static boolean isArray_start_time() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'start_time'
     */
    public static int offset_start_time() {
        return (80 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'start_time'
     */
    public static int offsetBits_start_time() {
        return 80;
    }

    /**
     * Return the value (as a int) of the field 'start_time'
     */
    public int get_start_time() {
        return (int)getUIntElement(offsetBits_start_time(), 16);
    }

    /**
     * Set the value of the field 'start_time'
     */
    public void set_start_time(int value) {
        setUIntElement(offsetBits_start_time(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'start_time'
     */
    public static int size_start_time() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'start_time'
     */
    public static int sizeBits_start_time() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: end_time
    //   Field type: int, unsigned
    //   Offset (bits): 96
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'end_time' is signed (false).
     */
    public static boolean isSigned_end_time() {
        return false;
    }

    /**
     * Return whether the field 'end_time' is an array (false).
     */
    public static boolean isArray_end_time() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'end_time'
     */
    public static int offset_end_time() {
        return (96 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'end_time'
     */
    public static int offsetBits_end_time() {
        return 96;
    }

    /**
     * Return the value (as a int) of the field 'end_time'
     */
    public int get_end_time() {
        return (int)getUIntElement(offsetBits_end_time(), 16);
    }

    /**
     * Set the value of the field 'end_time'
     */
    public void set_end_time(int value) {
        setUIntElement(offsetBits_end_time(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'end_time'
     */
    public static int size_end_time() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'end_time'
     */
    public static int sizeBits_end_time() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: dataType
    //   Field type: int, unsigned
    //   Offset (bits): 112
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'dataType' is signed (false).
     */
    public static boolean isSigned_dataType() {
        return false;
    }

    /**
     * Return whether the field 'dataType' is an array (false).
     */
    public static boolean isArray_dataType() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'dataType'
     */
    public static int offset_dataType() {
        return (112 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'dataType'
     */
    public static int offsetBits_dataType() {
        return 112;
    }

    /**
     * Return the value (as a int) of the field 'dataType'
     */
    public int get_dataType() {
        return (int)getUIntElement(offsetBits_dataType(), 16);
    }

    /**
     * Set the value of the field 'dataType'
     */
    public void set_dataType(int value) {
        setUIntElement(offsetBits_dataType(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'dataType'
     */
    public static int size_dataType() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'dataType'
     */
    public static int sizeBits_dataType() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: data
    //   Field type: int, unsigned
    //   Offset (bits): 128
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'data' is signed (false).
     */
    public static boolean isSigned_data() {
        return false;
    }

    /**
     * Return whether the field 'data' is an array (false).
     */
    public static boolean isArray_data() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'data'
     */
    public static int offset_data() {
        return (128 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'data'
     */
    public static int offsetBits_data() {
        return 128;
    }

    /**
     * Return the value (as a int) of the field 'data'
     */
    public int get_data() {
        return (int)getUIntElement(offsetBits_data(), 16);
    }

    /**
     * Set the value of the field 'data'
     */
    public void set_data(int value) {
        setUIntElement(offsetBits_data(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'data'
     */
    public static int size_data() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'data'
     */
    public static int sizeBits_data() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: hop
    //   Field type: short, unsigned
    //   Offset (bits): 144
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'hop' is signed (false).
     */
    public static boolean isSigned_hop() {
        return false;
    }

    /**
     * Return whether the field 'hop' is an array (false).
     */
    public static boolean isArray_hop() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'hop'
     */
    public static int offset_hop() {
        return (144 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'hop'
     */
    public static int offsetBits_hop() {
        return 144;
    }

    /**
     * Return the value (as a short) of the field 'hop'
     */
    public short get_hop() {
        return (short)getUIntElement(offsetBits_hop(), 8);
    }

    /**
     * Set the value of the field 'hop'
     */
    public void set_hop(short value) {
        setUIntElement(offsetBits_hop(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'hop'
     */
    public static int size_hop() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'hop'
     */
    public static int sizeBits_hop() {
        return 8;
    }

}
