package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
