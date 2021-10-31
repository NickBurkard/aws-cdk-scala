package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GetContextValueResult {

  def apply(
    value: Option[AnyRef] = None
  ): software.amazon.awscdk.GetContextValueResult =
    (new software.amazon.awscdk.GetContextValueResult.Builder)
      .value(value.orNull)
      .build()
}
