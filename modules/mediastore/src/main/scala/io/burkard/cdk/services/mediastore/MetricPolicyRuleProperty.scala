package io.burkard.cdk.services.mediastore

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricPolicyRuleProperty {

  def apply(
    objectGroupName: Option[String] = None,
    objectGroup: Option[String] = None
  ): software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyRuleProperty =
    (new software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyRuleProperty.Builder)
      .objectGroupName(objectGroupName.orNull)
      .objectGroup(objectGroup.orNull)
      .build()
}
