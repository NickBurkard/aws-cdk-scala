package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EncodingOptions {

  def apply(
    displayHint: Option[String] = None
  ): software.amazon.awscdk.EncodingOptions =
    (new software.amazon.awscdk.EncodingOptions.Builder)
      .displayHint(displayHint.orNull)
      .build()
}
