package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TextTransformationProperty {

  def apply(
    priority: Option[Number] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.TextTransformationProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.TextTransformationProperty.Builder)
      .priority(priority.orNull)
      .`type`(`type`.orNull)
      .build()
}
