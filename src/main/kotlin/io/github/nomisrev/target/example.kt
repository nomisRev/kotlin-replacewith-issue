package io.github.nomisrev.target

import arrow.core.Either
import arrow.core.continuations.EagerEffectScope
import arrow.core.continuations.EffectScope

fun <A> example(f: () -> A): A = f()

object either {

    public inline fun <E, A> eager(crossinline c: suspend EagerEffectScope<E>.() -> A): Either<E, A> =
        arrow.core.continuations.either.eager(c)

    suspend inline operator fun <E, A> invoke(crossinline c: suspend EffectScope<E>.() -> A): Either<E, A> =
        arrow.core.continuations.either.invoke(c)
}