package com.example.circlecut.ui.main
// Copyright (c) 2023, Circle Technologies, LLC. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0

data class ExecuteFormState(
    val endpoint: String? = null,
    val appId: String? = null,
    val userToken: String? = null,
    val encryptionKey: String? = null,
    val challengeId: String? = null,
    val isExecuteDataValid: Boolean = false,
    val isSetBiometricsPinInputDataValid: Boolean = false
)
