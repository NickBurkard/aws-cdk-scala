package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecretValue {

  def apply(
    value: AnyRef,
    stackTrace: Option[Boolean] = None
  ): software.amazon.awscdk.SecretValue =
    software.amazon.awscdk.SecretValue.Builder
      .create(value)
      .stackTrace(stackTrace.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
