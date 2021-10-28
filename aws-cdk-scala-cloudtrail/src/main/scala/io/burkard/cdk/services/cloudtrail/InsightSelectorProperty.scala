package io.burkard.cdk.services.cloudtrail

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InsightSelectorProperty {

  def apply(
    insightType: Option[String] = None
  ): software.amazon.awscdk.services.cloudtrail.CfnTrail.InsightSelectorProperty =
    (new software.amazon.awscdk.services.cloudtrail.CfnTrail.InsightSelectorProperty.Builder)
      .insightType(insightType.orNull)
      .build()
}
