package com.shuja1497.kotlinretrowithrxjava

data class SearchInfo(val totalhits: Int)

data class Query(val searchinfo: SearchInfo)

data class Result(val query: Query)
