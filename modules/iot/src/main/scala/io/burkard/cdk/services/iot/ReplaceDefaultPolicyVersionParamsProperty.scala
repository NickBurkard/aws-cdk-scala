package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReplaceDefaultPolicyVersionParamsProperty {

  def apply(
    templateName: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty =
    (new software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty.Builder)
      .templateName(templateName.orNull)
      .build()
}
