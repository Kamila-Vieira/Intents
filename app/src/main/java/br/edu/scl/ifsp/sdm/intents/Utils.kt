package br.edu.scl.ifsp.sdm.intents

object Utils {
        fun formatUrl(url: String): String = if (url.startsWith("https://")) url else "https://$url"
}

