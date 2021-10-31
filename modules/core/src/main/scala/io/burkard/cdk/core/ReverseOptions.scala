package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReverseOptions {

  def apply(
    failConcat: Option[Boolean] = None
  ): software.amazon.awscdk.ReverseOptions =
    (new software.amazon.awscdk.ReverseOptions.Builder)
      .failConcat(failConcat.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
