/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.uikit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("UIKit")/*</annotations>*/
@Marshaler(/*<name>*/NSTextLayoutSection/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextLayoutSection/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NSTextLayoutSection toObject(Class<NSTextLayoutSection> cls, long handle, long flags) {
            NSDictionary<NSString, NSObject> o = (NSDictionary<NSString, NSObject>) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new NSTextLayoutSection(o);
        }
        @MarshalsPointer
        public static long toNative(NSTextLayoutSection o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<NSTextLayoutSection> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary<NSString, NSObject>> o = (NSArray<NSDictionary<NSString, NSObject>>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NSTextLayoutSection> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new NSTextLayoutSection(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NSTextLayoutSection> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary<NSString, NSObject>> array = new NSMutableArray<>();
            for (NSTextLayoutSection i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    NSTextLayoutSection(NSDictionary<NSString, NSObject> data) {
        super(data);
    }
    public NSTextLayoutSection() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(NSString key) {
        return data.containsKey(key);
    }
    public NSObject get(NSString key) {
        if (has(key)) {
            return data.get(key);
        }
        return null;
    }
    public NSTextLayoutSection set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    /**
     * @since Available in iOS 7.0 and later.
     */
    public NSTextLayoutOrientation getOrientation() {
        if (has(Keys.Orientation())) {
            NSNumber val = (NSNumber) get(Keys.Orientation());
            return NSTextLayoutOrientation.valueOf(val.longValue());
        }
        return null;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public NSTextLayoutSection setOrientation(NSTextLayoutOrientation orientation) {
        set(Keys.Orientation(), NSNumber.valueOf(orientation.value()));
        return this;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public NSRange getRange() {
        if (has(Keys.Range())) {
            NSValue val = (NSValue) get(Keys.Range());
            return val.rangeValue();
        }
        return null;
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public NSTextLayoutSection setRange(NSRange range) {
        set(Keys.Range(), NSValue.valueOf(range));
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("UIKit")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="NSTextLayoutSectionOrientation", optional=true)
        public static native NSString Orientation();
        /**
         * @since Available in iOS 7.0 and later.
         */
        @GlobalValue(symbol="NSTextLayoutSectionRange", optional=true)
        public static native NSString Range();
    }
    /*</keys>*/
}
