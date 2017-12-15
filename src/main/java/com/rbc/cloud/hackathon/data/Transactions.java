/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.rbc.cloud.hackathon.data;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Transactions extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4931646170972685475L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Transactions\",\"namespace\":\"com.rbc.cloud.hackathon.data\",\"fields\":[{\"name\":\"TransactionId\",\"type\":\"string\"},{\"name\":\"CustId\",\"type\":\"string\"},{\"name\":\"TransactionType\",\"type\":\"string\"},{\"name\":\"TransactionAmount\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Transactions> ENCODER =
      new BinaryMessageEncoder<Transactions>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Transactions> DECODER =
      new BinaryMessageDecoder<Transactions>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Transactions> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Transactions> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Transactions>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Transactions to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Transactions from a ByteBuffer. */
  public static Transactions fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence TransactionId;
  @Deprecated public java.lang.CharSequence CustId;
  @Deprecated public java.lang.CharSequence TransactionType;
  @Deprecated public java.lang.CharSequence TransactionAmount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Transactions() {}

  /**
   * All-args constructor.
   * @param TransactionId The new value for TransactionId
   * @param CustId The new value for CustId
   * @param TransactionType The new value for TransactionType
   * @param TransactionAmount The new value for TransactionAmount
   */
  public Transactions(java.lang.CharSequence TransactionId, java.lang.CharSequence CustId, java.lang.CharSequence TransactionType, java.lang.CharSequence TransactionAmount) {
    this.TransactionId = TransactionId;
    this.CustId = CustId;
    this.TransactionType = TransactionType;
    this.TransactionAmount = TransactionAmount;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return TransactionId;
    case 1: return CustId;
    case 2: return TransactionType;
    case 3: return TransactionAmount;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: TransactionId = (java.lang.CharSequence)value$; break;
    case 1: CustId = (java.lang.CharSequence)value$; break;
    case 2: TransactionType = (java.lang.CharSequence)value$; break;
    case 3: TransactionAmount = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'TransactionId' field.
   * @return The value of the 'TransactionId' field.
   */
  public java.lang.CharSequence getTransactionId() {
    return TransactionId;
  }

  /**
   * Sets the value of the 'TransactionId' field.
   * @param value the value to set.
   */
  public void setTransactionId(java.lang.CharSequence value) {
    this.TransactionId = value;
  }

  /**
   * Gets the value of the 'CustId' field.
   * @return The value of the 'CustId' field.
   */
  public java.lang.CharSequence getCustId() {
    return CustId;
  }

  /**
   * Sets the value of the 'CustId' field.
   * @param value the value to set.
   */
  public void setCustId(java.lang.CharSequence value) {
    this.CustId = value;
  }

  /**
   * Gets the value of the 'TransactionType' field.
   * @return The value of the 'TransactionType' field.
   */
  public java.lang.CharSequence getTransactionType() {
    return TransactionType;
  }

  /**
   * Sets the value of the 'TransactionType' field.
   * @param value the value to set.
   */
  public void setTransactionType(java.lang.CharSequence value) {
    this.TransactionType = value;
  }

  /**
   * Gets the value of the 'TransactionAmount' field.
   * @return The value of the 'TransactionAmount' field.
   */
  public java.lang.CharSequence getTransactionAmount() {
    return TransactionAmount;
  }

  /**
   * Sets the value of the 'TransactionAmount' field.
   * @param value the value to set.
   */
  public void setTransactionAmount(java.lang.CharSequence value) {
    this.TransactionAmount = value;
  }

  /**
   * Creates a new Transactions RecordBuilder.
   * @return A new Transactions RecordBuilder
   */
  public static com.rbc.cloud.hackathon.data.Transactions.Builder newBuilder() {
    return new com.rbc.cloud.hackathon.data.Transactions.Builder();
  }

  /**
   * Creates a new Transactions RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Transactions RecordBuilder
   */
  public static com.rbc.cloud.hackathon.data.Transactions.Builder newBuilder(com.rbc.cloud.hackathon.data.Transactions.Builder other) {
    return new com.rbc.cloud.hackathon.data.Transactions.Builder(other);
  }

  /**
   * Creates a new Transactions RecordBuilder by copying an existing Transactions instance.
   * @param other The existing instance to copy.
   * @return A new Transactions RecordBuilder
   */
  public static com.rbc.cloud.hackathon.data.Transactions.Builder newBuilder(com.rbc.cloud.hackathon.data.Transactions other) {
    return new com.rbc.cloud.hackathon.data.Transactions.Builder(other);
  }

  /**
   * RecordBuilder for Transactions instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Transactions>
    implements org.apache.avro.data.RecordBuilder<Transactions> {

    private java.lang.CharSequence TransactionId;
    private java.lang.CharSequence CustId;
    private java.lang.CharSequence TransactionType;
    private java.lang.CharSequence TransactionAmount;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.rbc.cloud.hackathon.data.Transactions.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.TransactionId)) {
        this.TransactionId = data().deepCopy(fields()[0].schema(), other.TransactionId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.CustId)) {
        this.CustId = data().deepCopy(fields()[1].schema(), other.CustId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.TransactionType)) {
        this.TransactionType = data().deepCopy(fields()[2].schema(), other.TransactionType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.TransactionAmount)) {
        this.TransactionAmount = data().deepCopy(fields()[3].schema(), other.TransactionAmount);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Transactions instance
     * @param other The existing instance to copy.
     */
    private Builder(com.rbc.cloud.hackathon.data.Transactions other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.TransactionId)) {
        this.TransactionId = data().deepCopy(fields()[0].schema(), other.TransactionId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.CustId)) {
        this.CustId = data().deepCopy(fields()[1].schema(), other.CustId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.TransactionType)) {
        this.TransactionType = data().deepCopy(fields()[2].schema(), other.TransactionType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.TransactionAmount)) {
        this.TransactionAmount = data().deepCopy(fields()[3].schema(), other.TransactionAmount);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'TransactionId' field.
      * @return The value.
      */
    public java.lang.CharSequence getTransactionId() {
      return TransactionId;
    }

    /**
      * Sets the value of the 'TransactionId' field.
      * @param value The value of 'TransactionId'.
      * @return This builder.
      */
    public com.rbc.cloud.hackathon.data.Transactions.Builder setTransactionId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.TransactionId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'TransactionId' field has been set.
      * @return True if the 'TransactionId' field has been set, false otherwise.
      */
    public boolean hasTransactionId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'TransactionId' field.
      * @return This builder.
      */
    public com.rbc.cloud.hackathon.data.Transactions.Builder clearTransactionId() {
      TransactionId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'CustId' field.
      * @return The value.
      */
    public java.lang.CharSequence getCustId() {
      return CustId;
    }

    /**
      * Sets the value of the 'CustId' field.
      * @param value The value of 'CustId'.
      * @return This builder.
      */
    public com.rbc.cloud.hackathon.data.Transactions.Builder setCustId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.CustId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'CustId' field has been set.
      * @return True if the 'CustId' field has been set, false otherwise.
      */
    public boolean hasCustId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'CustId' field.
      * @return This builder.
      */
    public com.rbc.cloud.hackathon.data.Transactions.Builder clearCustId() {
      CustId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'TransactionType' field.
      * @return The value.
      */
    public java.lang.CharSequence getTransactionType() {
      return TransactionType;
    }

    /**
      * Sets the value of the 'TransactionType' field.
      * @param value The value of 'TransactionType'.
      * @return This builder.
      */
    public com.rbc.cloud.hackathon.data.Transactions.Builder setTransactionType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.TransactionType = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'TransactionType' field has been set.
      * @return True if the 'TransactionType' field has been set, false otherwise.
      */
    public boolean hasTransactionType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'TransactionType' field.
      * @return This builder.
      */
    public com.rbc.cloud.hackathon.data.Transactions.Builder clearTransactionType() {
      TransactionType = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'TransactionAmount' field.
      * @return The value.
      */
    public java.lang.CharSequence getTransactionAmount() {
      return TransactionAmount;
    }

    /**
      * Sets the value of the 'TransactionAmount' field.
      * @param value The value of 'TransactionAmount'.
      * @return This builder.
      */
    public com.rbc.cloud.hackathon.data.Transactions.Builder setTransactionAmount(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.TransactionAmount = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'TransactionAmount' field has been set.
      * @return True if the 'TransactionAmount' field has been set, false otherwise.
      */
    public boolean hasTransactionAmount() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'TransactionAmount' field.
      * @return This builder.
      */
    public com.rbc.cloud.hackathon.data.Transactions.Builder clearTransactionAmount() {
      TransactionAmount = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Transactions build() {
      try {
        Transactions record = new Transactions();
        record.TransactionId = fieldSetFlags()[0] ? this.TransactionId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.CustId = fieldSetFlags()[1] ? this.CustId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.TransactionType = fieldSetFlags()[2] ? this.TransactionType : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.TransactionAmount = fieldSetFlags()[3] ? this.TransactionAmount : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Transactions>
    WRITER$ = (org.apache.avro.io.DatumWriter<Transactions>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Transactions>
    READER$ = (org.apache.avro.io.DatumReader<Transactions>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
