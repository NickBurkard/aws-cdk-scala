package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TextTransformationProperty {

  def apply(
    priority: Option[Number] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.TextTransformationProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.TextTransformationProperty.Builder)
      .priority(priority.orNull)
      .`type`(`type`.orNull)
      .build()
}
