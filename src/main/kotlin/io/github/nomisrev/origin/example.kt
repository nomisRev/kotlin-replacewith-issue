package io.github.nomisrev.origin

import arrow.continuations.Effect
import arrow.core.Either
import arrow.core.computations.EitherEffect
import arrow.core.computations.RestrictedEitherEffect
import arrow.core.right

@Deprecated(
    "Moved to io.github.nomisrev.target package",
    ReplaceWith("example(f)", "io.github.nomisrev.target.example")
)
fun <A> example(f: () -> A): A = f()

object either {
    @Deprecated(
        "Moved to io.github.nomisrev.target package",
        ReplaceWith("either.eager<E, A>(c)", "io.github.nomisrev.target.either")
    )
    public inline fun <E, A> eager(crossinline c: suspend RestrictedEitherEffect<E, *>.() -> A): Either<E, A> =
        Effect.restricted(eff = { RestrictedEitherEffect { it } }, f = c, just = { it.right() })

    @Deprecated(
        "Moved to io.github.nomisrev.target package",
        ReplaceWith("either(c)", "io.github.nomisrev.target.either")
    )
    suspend inline operator fun <E, A> invoke(crossinline c: suspend EitherEffect<E, *>.() -> A): Either<E, A> =
        arrow.core.computations.either.invoke(c)
}