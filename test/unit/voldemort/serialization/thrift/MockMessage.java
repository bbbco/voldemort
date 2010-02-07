/**
 * Autogenerated by Thrift
 * 
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 * 
 * Here is the thrift file that defines the MockMessage struct.
 * 
 * #!thrift --gen java
 * 
 * namespace java voldemort.serialization.thrift
 * 
 * struct MockMessage { 1: string name, 2: map<i64, map<string, i32>> mappings,
 * 3: list<i16> intList, 4: set<string> strSet, }
 */
package voldemort.serialization.thrift;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.TFieldRequirementType;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.MapMetaData;
import org.apache.thrift.meta_data.SetMetaData;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
import org.apache.thrift.protocol.TMap;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolUtil;
import org.apache.thrift.protocol.TSet;
import org.apache.thrift.protocol.TStruct;
import org.apache.thrift.protocol.TType;

@SuppressWarnings("serial")
public class MockMessage implements TBase<MockMessage._Fields>, java.io.Serializable, Cloneable {

    private static final TStruct STRUCT_DESC = new TStruct("MockMessage");

    private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short) 1);
    private static final TField MAPPINGS_FIELD_DESC = new TField("mappings", TType.MAP, (short) 2);
    private static final TField INT_LIST_FIELD_DESC = new TField("intList", TType.LIST, (short) 3);
    private static final TField STR_SET_FIELD_DESC = new TField("strSet", TType.SET, (short) 4);

    public String name;
    public Map<Long, Map<String, Integer>> mappings;
    public List<Short> intList;
    public Set<String> strSet;

    /**
     * The set of fields this struct contains, along with convenience methods
     * for finding and manipulating them.
     */
    public enum _Fields implements TFieldIdEnum {
        NAME((short) 1, "name"),
        MAPPINGS((short) 2, "mappings"),
        INT_LIST((short) 3, "intList"),
        STR_SET((short) 4, "strSet");

        private static final Map<Integer, _Fields> byId = new HashMap<Integer, _Fields>();
        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static {
            for(_Fields field: EnumSet.allOf(_Fields.class)) {
                byId.put((int) field._thriftId, field);
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not
         * found.
         */
        public static _Fields findByThriftId(int fieldId) {
            return byId.get(fieldId);
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if(fields == null)
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not
         * found.
         */
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        private final short _thriftId;
        private final String _fieldName;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public String getFieldName() {
            return _fieldName;
        }
    }

    // isset id assignments

    public static final Map<_Fields, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new EnumMap<_Fields, FieldMetaData>(_Fields.class) {

        {
            put(_Fields.NAME, new FieldMetaData("name",
                                                TFieldRequirementType.DEFAULT,
                                                new FieldValueMetaData(TType.STRING)));
            put(_Fields.MAPPINGS,
                new FieldMetaData("mappings",
                                  TFieldRequirementType.DEFAULT,
                                  new MapMetaData(TType.MAP,
                                                  new FieldValueMetaData(TType.I64),
                                                  new MapMetaData(TType.MAP,
                                                                  new FieldValueMetaData(TType.STRING),
                                                                  new FieldValueMetaData(TType.I32)))));
            put(_Fields.INT_LIST,
                new FieldMetaData("intList",
                                  TFieldRequirementType.DEFAULT,
                                  new ListMetaData(TType.LIST, new FieldValueMetaData(TType.I16))));
            put(_Fields.STR_SET,
                new FieldMetaData("strSet",
                                  TFieldRequirementType.DEFAULT,
                                  new SetMetaData(TType.SET, new FieldValueMetaData(TType.STRING))));
        }
    });

    static {
        FieldMetaData.addStructMetaDataMap(MockMessage.class, metaDataMap);
    }

    public MockMessage() {}

    public MockMessage(String name,
                       Map<Long, Map<String, Integer>> mappings,
                       List<Short> intList,
                       Set<String> strSet) {
        this();
        this.name = name;
        this.mappings = mappings;
        this.intList = intList;
        this.strSet = strSet;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public MockMessage(MockMessage other) {
        if(other.isSetName()) {
            this.name = other.name;
        }
        if(other.isSetMappings()) {
            Map<Long, Map<String, Integer>> __this__mappings = new HashMap<Long, Map<String, Integer>>();
            for(Map.Entry<Long, Map<String, Integer>> other_element: other.mappings.entrySet()) {

                Long other_element_key = other_element.getKey();
                Map<String, Integer> other_element_value = other_element.getValue();

                Long __this__mappings_copy_key = other_element_key;

                Map<String, Integer> __this__mappings_copy_value = new HashMap<String, Integer>();
                for(Map.Entry<String, Integer> other_element_value_element: other_element_value.entrySet()) {

                    String other_element_value_element_key = other_element_value_element.getKey();
                    Integer other_element_value_element_value = other_element_value_element.getValue();

                    String __this__mappings_copy_value_copy_key = other_element_value_element_key;

                    Integer __this__mappings_copy_value_copy_value = other_element_value_element_value;

                    __this__mappings_copy_value.put(__this__mappings_copy_value_copy_key,
                                                    __this__mappings_copy_value_copy_value);
                }

                __this__mappings.put(__this__mappings_copy_key, __this__mappings_copy_value);
            }
            this.mappings = __this__mappings;
        }
        if(other.isSetIntList()) {
            List<Short> __this__intList = new ArrayList<Short>();
            for(Short other_element: other.intList) {
                __this__intList.add(other_element);
            }
            this.intList = __this__intList;
        }
        if(other.isSetStrSet()) {
            Set<String> __this__strSet = new HashSet<String>();
            for(String other_element: other.strSet) {
                __this__strSet.add(other_element);
            }
            this.strSet = __this__strSet;
        }
    }

    public MockMessage deepCopy() {
        return new MockMessage(this);
    }

    @Override
    @Deprecated
    public MockMessage clone() {
        return new MockMessage(this);
    }

    public String getName() {
        return this.name;
    }

    public MockMessage setName(String name) {
        this.name = name;
        return this;
    }

    public void unsetName() {
        this.name = null;
    }

    /**
     * Returns true if field name is set (has been asigned a value) and false
     * otherwise
     */
    public boolean isSetName() {
        return this.name != null;
    }

    public void setNameIsSet(boolean value) {
        if(!value) {
            this.name = null;
        }
    }

    public int getMappingsSize() {
        return (this.mappings == null) ? 0 : this.mappings.size();
    }

    public void putToMappings(long key, Map<String, Integer> val) {
        if(this.mappings == null) {
            this.mappings = new HashMap<Long, Map<String, Integer>>();
        }
        this.mappings.put(key, val);
    }

    public Map<Long, Map<String, Integer>> getMappings() {
        return this.mappings;
    }

    public MockMessage setMappings(Map<Long, Map<String, Integer>> mappings) {
        this.mappings = mappings;
        return this;
    }

    public void unsetMappings() {
        this.mappings = null;
    }

    /**
     * Returns true if field mappings is set (has been asigned a value) and
     * false otherwise
     */
    public boolean isSetMappings() {
        return this.mappings != null;
    }

    public void setMappingsIsSet(boolean value) {
        if(!value) {
            this.mappings = null;
        }
    }

    public int getIntListSize() {
        return (this.intList == null) ? 0 : this.intList.size();
    }

    public java.util.Iterator<Short> getIntListIterator() {
        return (this.intList == null) ? null : this.intList.iterator();
    }

    public void addToIntList(short elem) {
        if(this.intList == null) {
            this.intList = new ArrayList<Short>();
        }
        this.intList.add(elem);
    }

    public List<Short> getIntList() {
        return this.intList;
    }

    public MockMessage setIntList(List<Short> intList) {
        this.intList = intList;
        return this;
    }

    public void unsetIntList() {
        this.intList = null;
    }

    /**
     * Returns true if field intList is set (has been asigned a value) and false
     * otherwise
     */
    public boolean isSetIntList() {
        return this.intList != null;
    }

    public void setIntListIsSet(boolean value) {
        if(!value) {
            this.intList = null;
        }
    }

    public int getStrSetSize() {
        return (this.strSet == null) ? 0 : this.strSet.size();
    }

    public java.util.Iterator<String> getStrSetIterator() {
        return (this.strSet == null) ? null : this.strSet.iterator();
    }

    public void addToStrSet(String elem) {
        if(this.strSet == null) {
            this.strSet = new HashSet<String>();
        }
        this.strSet.add(elem);
    }

    public Set<String> getStrSet() {
        return this.strSet;
    }

    public MockMessage setStrSet(Set<String> strSet) {
        this.strSet = strSet;
        return this;
    }

    public void unsetStrSet() {
        this.strSet = null;
    }

    /**
     * Returns true if field strSet is set (has been asigned a value) and false
     * otherwise
     */
    public boolean isSetStrSet() {
        return this.strSet != null;
    }

    public void setStrSetIsSet(boolean value) {
        if(!value) {
            this.strSet = null;
        }
    }

    @SuppressWarnings("unchecked")
    public void setFieldValue(_Fields field, Object value) {
        switch(field) {
            case NAME:
                if(value == null) {
                    unsetName();
                } else {
                    setName((String) value);
                }
                break;

            case MAPPINGS:
                if(value == null) {
                    unsetMappings();
                } else {
                    setMappings((Map<Long, Map<String, Integer>>) value);
                }
                break;

            case INT_LIST:
                if(value == null) {
                    unsetIntList();
                } else {
                    setIntList((List<Short>) value);
                }
                break;

            case STR_SET:
                if(value == null) {
                    unsetStrSet();
                } else {
                    setStrSet((Set<String>) value);
                }
                break;

        }
    }

    public void setFieldValue(int fieldID, Object value) {
        setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
    }

    public Object getFieldValue(_Fields field) {
        switch(field) {
            case NAME:
                return getName();

            case MAPPINGS:
                return getMappings();

            case INT_LIST:
                return getIntList();

            case STR_SET:
                return getStrSet();

        }
        throw new IllegalStateException();
    }

    public Object getFieldValue(int fieldId) {
        return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been asigned a
     * value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        switch(field) {
            case NAME:
                return isSetName();
            case MAPPINGS:
                return isSetMappings();
            case INT_LIST:
                return isSetIntList();
            case STR_SET:
                return isSetStrSet();
        }
        throw new IllegalStateException();
    }

    public boolean isSet(int fieldID) {
        return isSet(_Fields.findByThriftIdOrThrow(fieldID));
    }

    @Override
    public boolean equals(Object that) {
        if(that == null)
            return false;
        if(that instanceof MockMessage)
            return this.equals((MockMessage) that);
        return false;
    }

    public boolean equals(MockMessage that) {
        if(that == null)
            return false;

        boolean this_present_name = true && this.isSetName();
        boolean that_present_name = true && that.isSetName();
        if(this_present_name || that_present_name) {
            if(!(this_present_name && that_present_name))
                return false;
            if(!this.name.equals(that.name))
                return false;
        }

        boolean this_present_mappings = true && this.isSetMappings();
        boolean that_present_mappings = true && that.isSetMappings();
        if(this_present_mappings || that_present_mappings) {
            if(!(this_present_mappings && that_present_mappings))
                return false;
            if(!this.mappings.equals(that.mappings))
                return false;
        }

        boolean this_present_intList = true && this.isSetIntList();
        boolean that_present_intList = true && that.isSetIntList();
        if(this_present_intList || that_present_intList) {
            if(!(this_present_intList && that_present_intList))
                return false;
            if(!this.intList.equals(that.intList))
                return false;
        }

        boolean this_present_strSet = true && this.isSetStrSet();
        boolean that_present_strSet = true && that.isSetStrSet();
        if(this_present_strSet || that_present_strSet) {
            if(!(this_present_strSet && that_present_strSet))
                return false;
            if(!this.strSet.equals(that.strSet))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public void read(TProtocol iprot) throws TException {
        TField field;
        iprot.readStructBegin();
        while(true) {
            field = iprot.readFieldBegin();
            if(field.type == TType.STOP) {
                break;
            }
            _Fields fieldId = _Fields.findByThriftId(field.id);
            if(fieldId == null) {
                TProtocolUtil.skip(iprot, field.type);
            } else {
                switch(fieldId) {
                    case NAME:
                        if(field.type == TType.STRING) {
                            this.name = iprot.readString();
                        } else {
                            TProtocolUtil.skip(iprot, field.type);
                        }
                        break;
                    case MAPPINGS:
                        if(field.type == TType.MAP) {
                            {
                                TMap _map0 = iprot.readMapBegin();
                                this.mappings = new HashMap<Long, Map<String, Integer>>(2 * _map0.size);
                                for(int _i1 = 0; _i1 < _map0.size; ++_i1) {
                                    long _key2;
                                    Map<String, Integer> _val3;
                                    _key2 = iprot.readI64();
                                    {
                                        TMap _map4 = iprot.readMapBegin();
                                        _val3 = new HashMap<String, Integer>(2 * _map4.size);
                                        for(int _i5 = 0; _i5 < _map4.size; ++_i5) {
                                            String _key6;
                                            int _val7;
                                            _key6 = iprot.readString();
                                            _val7 = iprot.readI32();
                                            _val3.put(_key6, _val7);
                                        }
                                        iprot.readMapEnd();
                                    }
                                    this.mappings.put(_key2, _val3);
                                }
                                iprot.readMapEnd();
                            }
                        } else {
                            TProtocolUtil.skip(iprot, field.type);
                        }
                        break;
                    case INT_LIST:
                        if(field.type == TType.LIST) {
                            {
                                TList _list8 = iprot.readListBegin();
                                this.intList = new ArrayList<Short>(_list8.size);
                                for(int _i9 = 0; _i9 < _list8.size; ++_i9) {
                                    short _elem10;
                                    _elem10 = iprot.readI16();
                                    this.intList.add(_elem10);
                                }
                                iprot.readListEnd();
                            }
                        } else {
                            TProtocolUtil.skip(iprot, field.type);
                        }
                        break;
                    case STR_SET:
                        if(field.type == TType.SET) {
                            {
                                TSet _set11 = iprot.readSetBegin();
                                this.strSet = new HashSet<String>(2 * _set11.size);
                                for(int _i12 = 0; _i12 < _set11.size; ++_i12) {
                                    String _elem13;
                                    _elem13 = iprot.readString();
                                    this.strSet.add(_elem13);
                                }
                                iprot.readSetEnd();
                            }
                        } else {
                            TProtocolUtil.skip(iprot, field.type);
                        }
                        break;
                }
                iprot.readFieldEnd();
            }
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked
        // in the validate method
        validate();
    }

    public void write(TProtocol oprot) throws TException {
        validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if(this.name != null) {
            oprot.writeFieldBegin(NAME_FIELD_DESC);
            oprot.writeString(this.name);
            oprot.writeFieldEnd();
        }
        if(this.mappings != null) {
            oprot.writeFieldBegin(MAPPINGS_FIELD_DESC);
            {
                oprot.writeMapBegin(new TMap(TType.I64, TType.MAP, this.mappings.size()));
                for(Map.Entry<Long, Map<String, Integer>> _iter14: this.mappings.entrySet()) {
                    oprot.writeI64(_iter14.getKey());
                    {
                        oprot.writeMapBegin(new TMap(TType.STRING, TType.I32, _iter14.getValue()
                                                                                     .size()));
                        for(Map.Entry<String, Integer> _iter15: _iter14.getValue().entrySet()) {
                            oprot.writeString(_iter15.getKey());
                            oprot.writeI32(_iter15.getValue());
                        }
                        oprot.writeMapEnd();
                    }
                }
                oprot.writeMapEnd();
            }
            oprot.writeFieldEnd();
        }
        if(this.intList != null) {
            oprot.writeFieldBegin(INT_LIST_FIELD_DESC);
            {
                oprot.writeListBegin(new TList(TType.I16, this.intList.size()));
                for(short _iter16: this.intList) {
                    oprot.writeI16(_iter16);
                }
                oprot.writeListEnd();
            }
            oprot.writeFieldEnd();
        }
        if(this.strSet != null) {
            oprot.writeFieldBegin(STR_SET_FIELD_DESC);
            {
                oprot.writeSetBegin(new TSet(TType.STRING, this.strSet.size()));
                for(String _iter17: this.strSet) {
                    oprot.writeString(_iter17);
                }
                oprot.writeSetEnd();
            }
            oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MockMessage(");
        boolean first = true;

        sb.append("name:");
        if(this.name == null) {
            sb.append("null");
        } else {
            sb.append(this.name);
        }
        first = false;
        if(!first)
            sb.append(", ");
        sb.append("mappings:");
        if(this.mappings == null) {
            sb.append("null");
        } else {
            sb.append(this.mappings);
        }
        first = false;
        if(!first)
            sb.append(", ");
        sb.append("intList:");
        if(this.intList == null) {
            sb.append("null");
        } else {
            sb.append(this.intList);
        }
        first = false;
        if(!first)
            sb.append(", ");
        sb.append("strSet:");
        if(this.strSet == null) {
            sb.append("null");
        } else {
            sb.append(this.strSet);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    @SuppressWarnings("unused")
    public void validate() throws TException {
    // check for required fields
    }

}
