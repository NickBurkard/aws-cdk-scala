package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
