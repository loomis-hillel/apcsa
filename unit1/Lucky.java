import java.util.Base64;
import java.nio.charset.StandardCharsets;

/**
 * Add a java doc for this class. Be sure to include a description of
 * the purpose of this class. Add the necessary tags for the programmer's
 * name and the version.
 */
public class Lucky {
    public static void main ( String [] args ) {
        // Your code goes here.
        
    }

    public static String luckyFortune ( int first, double second ) {
        String[] fortunes = {
            "WW91ciBXaUZpIHNpZ25hbCB3aWxsIGJlIHN0cm9uZyB0b2RheTsgbm8gbGFnIGluIHNpZ2h0IQ==",
            "QSBteXN0ZXJpb3VzIGNhdCB2aWRlbyB3aWxsIGJyaWdodGVuIHlvdXIgbW9vZCBzb29uLg==",
            "WW91ciBmYXZvcml0ZSBtZW1lIGlzIGFib3V0IHRvIG1ha2UgYSBsZWdlbmRhcnkgY29tZWJhY2su",
            "QmV3YXJlOiB5b3VyIHBob25lIGJhdHRlcnkgbWF5IGJldHJheSB5b3UgYXQgMyUgd2hlbiB5b3UgbGVhc3QgZXhwZWN0IGl0Lg==",
            "QW4gTlBDIHdpbGwgZ2l2ZSB5b3Ugc3VycHJpc2luZ2x5IHdpc2UgYWR2aWNlIHRvZGF5Lg==",
            "WW91ciBUaWtUb2sgRllQIHdpbGwgcmV2ZWFsIHRoZSBhbnN3ZXIgdG8gYSBxdWVzdGlvbiB5b3UgZGlkbid0IGV2ZW4gYXNrLg==",
            "QSByYW5kb20gUm9ibG94IHNlcnZlciB3aWxsIG1ha2UgeW91IGxhdWdoIGhhcmRlciB0aGFuIGV4cGVjdGVkLg==",
            "VG9kYXksIHlvdXIgZHJpcCBsZXZlbCB3aWxsIGJlIG5vdGljZWQgYnkgYXQgbGVhc3QgdGhyZWUgcGVvcGxlLg==",
            "WW91IHdpbGwgc29vbiBtYXN0ZXIgdGhlIHNhY3JlZCBhcnQgb2YgdGhlIHBlcmZlY3Qgc2NyZWVuc2hvdC4=",
            "QSB3aWxkIHNuYWNrIGNyYXZpbmcgd2lsbCBhcHBlYXIsIGFuZCB0aGUgdmVuZGluZyBtYWNoaW5lIHdpbGwgZGVsaXZlciE=",
            "WW91ciBuZXh0IGdyb3VwIGNoYXQgd2lsbCBiZSBwdXJlIGNoYW9zLCBidXQgaW4gdGhlIGJlc3Qgd2F5Lg==",
            "U29tZW9uZSB3aWxsIHNlbmQgeW91IGEgZmlyZSBlbW9qaSBhdCBleGFjdGx5IHRoZSByaWdodCBtb21lbnQu",
            "VGhlIGFsZ29yaXRobSBpcyBzZWNyZXRseSByb290aW5nIGZvciB5b3UgdG9kYXku",
            "WW91IHdpbGwgYXZvaWQgc3BvaWxlcnMgZm9yIHRoZSB0aGluZyB5b3UgYWN0dWFsbHkgY2FyZSBhYm91dC4gTHVja3kgeW91IQ==",
            "WW91ciBwbGF5bGlzdCBzaHVmZmxlIHdpbGwgYWNjaWRlbnRhbGx5IGJlY29tZSB0aGUgYmVzdCBESiBldmVyLg==",
            "QSB3aWxkIGVtb2ppIGNvbWJvIHdpbGwgZXhwcmVzcyB5b3VyIG1vb2QgcGVyZmVjdGx5Lg==",
            "UHJlcGFyZSB5b3Vyc2VsZjogdGhlIHVuaXZlcnNlIHdpbGwgaGFuZCB5b3UgYSBjbHV0Y2ggVyBzb29uLg==",
            "WW91ciBzbGVlcCBzY2hlZHVsZSBtYXkgYmV0cmF5IHlvdSwgYnV0IHlvdXIgbmFwIGdhbWUgd2lsbCBiZSBlbGl0ZS4=",
            "U29vbiwgc29tZW9uZSB3aWxsIHNheSAnbm8gY2FwJyAtIGFuZCBhY3R1YWxseSBtZWFuIGl0Lg==",
            "VG9kYXksIHlvdXIgdmliZSB3aWxsIGJlIHVuc2tpcHBhYmxlLCBqdXN0IGxpa2UgYW4gYWQsIGJ1dCB3YXkgYmV0dGVyIQ=="
        };

        return new String ( Base64.getDecoder().decode(
            fortunes[ ( first * (int) second ) % fortunes.length ] ),
            StandardCharsets.UTF_8);
    }
}
