package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReplaceDefaultPolicyVersionParamsProperty {

  def apply(
    templateName: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty =
    (new software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty.Builder)
      .templateName(templateName.orNull)
      .build()
}
