package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BehaviorProperty {

  def apply(
    recency: Option[software.amazon.awscdk.services.pinpoint.CfnSegment.RecencyProperty] = None
  ): software.amazon.awscdk.services.pinpoint.CfnSegment.BehaviorProperty =
    (new software.amazon.awscdk.services.pinpoint.CfnSegment.BehaviorProperty.Builder)
      .recency(recency.orNull)
      .build()
}
