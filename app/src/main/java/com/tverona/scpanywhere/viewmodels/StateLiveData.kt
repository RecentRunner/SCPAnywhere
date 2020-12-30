package com.tverona.scpanywhere.viewmodels

import androidx.lifecycle.MutableLiveData
import com.tverona.scpanywhere.downloader.StateData

class StateLiveData<T> : MutableLiveData<StateData<T>>() {
    /**
     * Use this to put the Data on a UPDATE DataStatus
     */
    fun postUpdate(data: T) {
        postValue(StateData.update(data))
    }

    /**
     * Use this to put the Data on a ERROR DataStatus
     * @param throwable the error to be handled
     */
    fun postError(data: T?, throwable: Throwable?) {
        postValue(StateData.error(data, throwable))
    }

    /**
     * Use this to put the Data on a SUCCESS DataStatus
     * @param data
     */
    fun postSuccess(data: T) {
        postValue(StateData.success(data))
    }
}
