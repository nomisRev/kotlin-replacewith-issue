package io.github.nomisrev.origin

@Deprecated(
    "Moved to io.github.nomisrev.target package",
    ReplaceWith("example(f)", "io.github.nomisrev.target")
)
fun <A> example(f: () -> A): A = f()
