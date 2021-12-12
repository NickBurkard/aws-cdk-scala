package io.burkard.cdk.core.assertions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MatchCapture {

  def apply(
    capture: software.amazon.awscdk.assertions.Capture,
    value: AnyRef
  ): software.amazon.awscdk.assertions.MatchCapture =
    (new software.amazon.awscdk.assertions.MatchCapture.Builder)
      .capture(capture)
      .value(value)
      .build()
}
