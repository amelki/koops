#!/usr/bin/env bash

export CUSTOM_KSCRIPT_NAME='koops'

export CUSTOM_KSCRIPT_PREAMBLE='
@file:DependsOn("com.codingue.koops:koops-core:1.0-SNAPSHOT")
@file:DependsOn("com.codingue.koops:koops-maven:1.0-SNAPSHOT")
@file:DependsOn("com.codingue.koops:koops-aws:1.0-SNAPSHOT")
'
exec kscript $@
