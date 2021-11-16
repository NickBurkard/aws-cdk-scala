package io.burkard.cdk.services.mediastore

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricPolicyRuleProperty {

  def apply(
    objectGroupName: String,
    objectGroup: String
  ): software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyRuleProperty =
    (new software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyRuleProperty.Builder)
      .objectGroupName(objectGroupName)
      .objectGroup(objectGroup)
      .build()
}
