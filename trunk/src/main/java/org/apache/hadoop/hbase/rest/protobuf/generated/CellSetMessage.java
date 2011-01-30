// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CellSetMessage.proto

package org.apache.hadoop.hbase.rest.protobuf.generated;

public final class CellSetMessage {
  private CellSetMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CellSet extends
      com.google.protobuf.GeneratedMessage {
    // Use CellSet.newBuilder() to construct.
    private CellSet() {
      initFields();
    }
    private CellSet(boolean noInit) {}
    
    private static final CellSet defaultInstance;
    public static CellSet getDefaultInstance() {
      return defaultInstance;
    }
    
    public CellSet getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_CellSet_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_CellSet_fieldAccessorTable;
    }
    
    public static final class Row extends
        com.google.protobuf.GeneratedMessage {
      // Use Row.newBuilder() to construct.
      private Row() {
        initFields();
      }
      private Row(boolean noInit) {}
      
      private static final Row defaultInstance;
      public static Row getDefaultInstance() {
        return defaultInstance;
      }
      
      public Row getDefaultInstanceForType() {
        return defaultInstance;
      }
      
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_CellSet_Row_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_CellSet_Row_fieldAccessorTable;
      }
      
      // required bytes key = 1;
      public static final int KEY_FIELD_NUMBER = 1;
      private boolean hasKey;
      private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
      public boolean hasKey() { return hasKey; }
      public com.google.protobuf.ByteString getKey() { return key_; }
      
      // repeated .org.apache.hadoop.hbase.rest.protobuf.generated.Cell values = 2;
      public static final int VALUES_FIELD_NUMBER = 2;
      private java.util.List<org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell> values_ =
        java.util.Collections.emptyList();
      public java.util.List<org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell> getValuesList() {
        return values_;
      }
      public int getValuesCount() { return values_.size(); }
      public org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell getValues(int index) {
        return values_.get(index);
      }
      
      private void initFields() {
      }
      public final boolean isInitialized() {
        if (!hasKey) return false;
        return true;
      }
      
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        getSerializedSize();
        if (hasKey()) {
          output.writeBytes(1, getKey());
        }
        for (org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell element : getValuesList()) {
          output.writeMessage(2, element);
        }
        getUnknownFields().writeTo(output);
      }
      
      private int memoizedSerializedSize = -1;
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;
      
        size = 0;
        if (hasKey()) {
          size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(1, getKey());
        }
        for (org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell element : getValuesList()) {
          size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(2, element);
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSerializedSize = size;
        return size;
      }
      
      public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data).buildParsed();
      }
      public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data, extensionRegistry)
                 .buildParsed();
      }
      public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data).buildParsed();
      }
      public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data, extensionRegistry)
                 .buildParsed();
      }
      public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input).buildParsed();
      }
      public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input, extensionRegistry)
                 .buildParsed();
      }
      public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        Builder builder = newBuilder();
        if (builder.mergeDelimitedFrom(input)) {
          return builder.buildParsed();
        } else {
          return null;
        }
      }
      public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Builder builder = newBuilder();
        if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
          return builder.buildParsed();
        } else {
          return null;
        }
      }
      public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input).buildParsed();
      }
      public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input, extensionRegistry)
                 .buildParsed();
      }
      
      public static Builder newBuilder() { return Builder.create(); }
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder(org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row prototype) {
        return newBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() { return newBuilder(this); }
      
      public static final class Builder extends
          com.google.protobuf.GeneratedMessage.Builder<Builder> {
        private org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row result;
        
        // Construct using org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row.newBuilder()
        private Builder() {}
        
        private static Builder create() {
          Builder builder = new Builder();
          builder.result = new org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row();
          return builder;
        }
        
        protected org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row internalGetResult() {
          return result;
        }
        
        public Builder clear() {
          if (result == null) {
            throw new IllegalStateException(
              "Cannot call clear() after build().");
          }
          result = new org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row();
          return this;
        }
        
        public Builder clone() {
          return create().mergeFrom(result);
        }
        
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row.getDescriptor();
        }
        
        public org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row getDefaultInstanceForType() {
          return org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row.getDefaultInstance();
        }
        
        public boolean isInitialized() {
          return result.isInitialized();
        }
        public org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row build() {
          if (result != null && !isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return buildPartial();
        }
        
        private org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row buildParsed()
            throws com.google.protobuf.InvalidProtocolBufferException {
          if (!isInitialized()) {
            throw newUninitializedMessageException(
              result).asInvalidProtocolBufferException();
          }
          return buildPartial();
        }
        
        public org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row buildPartial() {
          if (result == null) {
            throw new IllegalStateException(
              "build() has already been called on this Builder.");
          }
          if (result.values_ != java.util.Collections.EMPTY_LIST) {
            result.values_ =
              java.util.Collections.unmodifiableList(result.values_);
          }
          org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row returnMe = result;
          result = null;
          return returnMe;
        }
        
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row) {
            return mergeFrom((org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }
        
        public Builder mergeFrom(org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row other) {
          if (other == org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row.getDefaultInstance()) return this;
          if (other.hasKey()) {
            setKey(other.getKey());
          }
          if (!other.values_.isEmpty()) {
            if (result.values_.isEmpty()) {
              result.values_ = new java.util.ArrayList<org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell>();
            }
            result.values_.addAll(other.values_);
          }
          this.mergeUnknownFields(other.getUnknownFields());
          return this;
        }
        
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder(
              this.getUnknownFields());
          while (true) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                this.setUnknownFields(unknownFields.build());
                return this;
              default: {
                if (!parseUnknownField(input, unknownFields,
                                       extensionRegistry, tag)) {
                  this.setUnknownFields(unknownFields.build());
                  return this;
                }
                break;
              }
              case 10: {
                setKey(input.readBytes());
                break;
              }
              case 18: {
                org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell.Builder subBuilder = org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell.newBuilder();
                input.readMessage(subBuilder, extensionRegistry);
                addValues(subBuilder.buildPartial());
                break;
              }
            }
          }
        }
        
        
        // required bytes key = 1;
        public boolean hasKey() {
          return result.hasKey();
        }
        public com.google.protobuf.ByteString getKey() {
          return result.getKey();
        }
        public Builder setKey(com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  result.hasKey = true;
          result.key_ = value;
          return this;
        }
        public Builder clearKey() {
          result.hasKey = false;
          result.key_ = getDefaultInstance().getKey();
          return this;
        }
        
        // repeated .org.apache.hadoop.hbase.rest.protobuf.generated.Cell values = 2;
        public java.util.List<org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell> getValuesList() {
          return java.util.Collections.unmodifiableList(result.values_);
        }
        public int getValuesCount() {
          return result.getValuesCount();
        }
        public org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell getValues(int index) {
          return result.getValues(index);
        }
        public Builder setValues(int index, org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell value) {
          if (value == null) {
            throw new NullPointerException();
          }
          result.values_.set(index, value);
          return this;
        }
        public Builder setValues(int index, org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell.Builder builderForValue) {
          result.values_.set(index, builderForValue.build());
          return this;
        }
        public Builder addValues(org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell value) {
          if (value == null) {
            throw new NullPointerException();
          }
          if (result.values_.isEmpty()) {
            result.values_ = new java.util.ArrayList<org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell>();
          }
          result.values_.add(value);
          return this;
        }
        public Builder addValues(org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell.Builder builderForValue) {
          if (result.values_.isEmpty()) {
            result.values_ = new java.util.ArrayList<org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell>();
          }
          result.values_.add(builderForValue.build());
          return this;
        }
        public Builder addAllValues(
            java.lang.Iterable<? extends org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell> values) {
          if (result.values_.isEmpty()) {
            result.values_ = new java.util.ArrayList<org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.Cell>();
          }
          super.addAll(values, result.values_);
          return this;
        }
        public Builder clearValues() {
          result.values_ = java.util.Collections.emptyList();
          return this;
        }
        
        // @@protoc_insertion_point(builder_scope:org.apache.hadoop.hbase.rest.protobuf.generated.CellSet.Row)
      }
      
      static {
        defaultInstance = new Row(true);
        org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.internalForceInit();
        defaultInstance.initFields();
      }
      
      // @@protoc_insertion_point(class_scope:org.apache.hadoop.hbase.rest.protobuf.generated.CellSet.Row)
    }
    
    // repeated .org.apache.hadoop.hbase.rest.protobuf.generated.CellSet.Row rows = 1;
    public static final int ROWS_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row> rows_ =
      java.util.Collections.emptyList();
    public java.util.List<org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row> getRowsList() {
      return rows_;
    }
    public int getRowsCount() { return rows_.size(); }
    public org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row getRows(int index) {
      return rows_.get(index);
    }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      for (org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row element : getRowsList()) {
        if (!element.isInitialized()) return false;
      }
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row element : getRowsList()) {
        output.writeMessage(1, element);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row element : getRowsList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, element);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet result;
      
      // Construct using org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet();
        return builder;
      }
      
      protected org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.getDescriptor();
      }
      
      public org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet getDefaultInstanceForType() {
        return org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.rows_ != java.util.Collections.EMPTY_LIST) {
          result.rows_ =
            java.util.Collections.unmodifiableList(result.rows_);
        }
        org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet) {
          return mergeFrom((org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet other) {
        if (other == org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.getDefaultInstance()) return this;
        if (!other.rows_.isEmpty()) {
          if (result.rows_.isEmpty()) {
            result.rows_ = new java.util.ArrayList<org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row>();
          }
          result.rows_.addAll(other.rows_);
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row.Builder subBuilder = org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addRows(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      
      // repeated .org.apache.hadoop.hbase.rest.protobuf.generated.CellSet.Row rows = 1;
      public java.util.List<org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row> getRowsList() {
        return java.util.Collections.unmodifiableList(result.rows_);
      }
      public int getRowsCount() {
        return result.getRowsCount();
      }
      public org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row getRows(int index) {
        return result.getRows(index);
      }
      public Builder setRows(int index, org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.rows_.set(index, value);
        return this;
      }
      public Builder setRows(int index, org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row.Builder builderForValue) {
        result.rows_.set(index, builderForValue.build());
        return this;
      }
      public Builder addRows(org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.rows_.isEmpty()) {
          result.rows_ = new java.util.ArrayList<org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row>();
        }
        result.rows_.add(value);
        return this;
      }
      public Builder addRows(org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row.Builder builderForValue) {
        if (result.rows_.isEmpty()) {
          result.rows_ = new java.util.ArrayList<org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row>();
        }
        result.rows_.add(builderForValue.build());
        return this;
      }
      public Builder addAllRows(
          java.lang.Iterable<? extends org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row> values) {
        if (result.rows_.isEmpty()) {
          result.rows_ = new java.util.ArrayList<org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row>();
        }
        super.addAll(values, result.rows_);
        return this;
      }
      public Builder clearRows() {
        result.rows_ = java.util.Collections.emptyList();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:org.apache.hadoop.hbase.rest.protobuf.generated.CellSet)
    }
    
    static {
      defaultInstance = new CellSet(true);
      org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:org.apache.hadoop.hbase.rest.protobuf.generated.CellSet)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_CellSet_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_CellSet_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_CellSet_Row_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_CellSet_Row_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024CellSetMessage.proto\022/org.apache.hadoo" +
      "p.hbase.rest.protobuf.generated\032\021CellMes" +
      "sage.proto\"\260\001\n\007CellSet\022J\n\004rows\030\001 \003(\0132<.o" +
      "rg.apache.hadoop.hbase.rest.protobuf.gen" +
      "erated.CellSet.Row\032Y\n\003Row\022\013\n\003key\030\001 \002(\014\022E" +
      "\n\006values\030\002 \003(\01325.org.apache.hadoop.hbase" +
      ".rest.protobuf.generated.Cell"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_CellSet_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_CellSet_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_CellSet_descriptor,
              new java.lang.String[] { "Rows", },
              org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.class,
              org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Builder.class);
          internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_CellSet_Row_descriptor =
            internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_CellSet_descriptor.getNestedTypes().get(0);
          internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_CellSet_Row_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_CellSet_Row_descriptor,
              new java.lang.String[] { "Key", "Values", },
              org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row.class,
              org.apache.hadoop.hbase.rest.protobuf.generated.CellSetMessage.CellSet.Row.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.hadoop.hbase.rest.protobuf.generated.CellMessage.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
