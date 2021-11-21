package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceAccessPolicyProperty {

  def apply(
    resourceId: String,
    permission: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty.Builder)
      .resourceId(resourceId)
      .permission(permission.orNull)
      .build()
}
