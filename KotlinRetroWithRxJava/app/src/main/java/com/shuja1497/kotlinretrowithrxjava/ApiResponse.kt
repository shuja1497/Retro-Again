package com.shuja1497.kotlinretrowithrxjava

data class SearchInfo(val totalHits: Int)

data class Query(val searchInfo: SearchInfo)

data class Result(val query: Query)
