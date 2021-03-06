// Copyright 2018 MaidSafe.net limited.
//
// This SAFE Network Software is licensed to you under the MIT license
// <LICENSE-MIT or http://opensource.org/licenses/MIT> or the Modified
// BSD license <LICENSE-BSD or https://opensource.org/licenses/BSD-3-Clause>,
// at your option. This file may not be copied, modified, or distributed
// except according to those terms. Please review the Licences for the
// specific language governing permissions and limitations relating to use
// of the SAFE Network Software.
package net.maidsafe.api.model;

import net.maidsafe.safe_app.FfiResult;
import net.maidsafe.utils.Helper;

/***
 * Represents an errored authentication response
 */
public class DecodeError extends DecodeResult {
    private final Exception exception;

    /***
     * Initialises a DecodeError object
     * @param reqId The request ID
     * @param result The FfiResult
     */
    public DecodeError(final int reqId, final FfiResult result) {
        super(reqId);
        exception = Helper.ffiResultToException(result);
    }

    /***
     * Returns the exception
     * @return An Exception object
     */
    public Exception getException() {
        return exception;
    }
}
