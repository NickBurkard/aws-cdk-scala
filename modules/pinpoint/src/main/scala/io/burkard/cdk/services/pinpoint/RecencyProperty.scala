package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RecencyProperty {

  def apply(
    duration: String,
    recencyType: String
  ): software.amazon.awscdk.services.pinpoint.CfnSegment.RecencyProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnSegment.RecencyProperty.Builder)
      .duration(duration)
      .recencyType(recencyType)
      .build()
}
