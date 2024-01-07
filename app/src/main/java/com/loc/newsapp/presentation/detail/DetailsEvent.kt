package com.loc.newsapp.presentation.detail

import com.loc.newsapp.domain.model.Article

sealed class DetailsEvent {
    data class InsertDeleteArticle(val article: Article) : DetailsEvent()
    object RemoveSideEffect : DetailsEvent()
}