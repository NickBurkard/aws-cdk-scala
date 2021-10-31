package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncodingOptions {

  def apply(
    displayHint: Option[String] = None
  ): software.amazon.awscdk.EncodingOptions =
    (new software.amazon.awscdk.EncodingOptions.Builder)
      .displayHint(displayHint.orNull)
      .build()
}
