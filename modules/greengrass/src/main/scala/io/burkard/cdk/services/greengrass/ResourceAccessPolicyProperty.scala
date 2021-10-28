package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceAccessPolicyProperty {

  def apply(
    resourceId: Option[String] = None,
    permission: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty =
    (new software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty.Builder)
      .resourceId(resourceId.orNull)
      .permission(permission.orNull)
      .build()
}