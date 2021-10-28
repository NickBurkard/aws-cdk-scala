package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LazyStringValueOptions {

  def apply(
    displayHint: Option[String] = None
  ): software.amazon.awscdk.LazyStringValueOptions =
    (new software.amazon.awscdk.LazyStringValueOptions.Builder)
      .displayHint(displayHint.orNull)
      .build()
}
