package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RecencyProperty {

  def apply(
    duration: Option[String] = None,
    recencyType: Option[String] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSegment.RecencyProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnSegment.RecencyProperty.Builder)
      .duration(duration.orNull)
      .recencyType(recencyType.orNull)
      .build()
}
