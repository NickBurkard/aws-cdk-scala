package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Intrinsic {

  def apply(
    value: AnyRef,
    stackTrace: Option[Boolean] = None
  ): software.amazon.awscdk.Intrinsic =
    software.amazon.awscdk.Intrinsic.Builder
      .create(value)
      .stackTrace(stackTrace.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
