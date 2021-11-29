package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserSettingsProperty {

  def apply(
    kernelGatewayAppSettings: Option[software.amazon.awscdk.services.sagemaker.CfnUserProfile.KernelGatewayAppSettingsProperty] = None,
    sharingSettings: Option[software.amazon.awscdk.services.sagemaker.CfnUserProfile.SharingSettingsProperty] = None,
    executionRole: Option[String] = None,
    securityGroups: Option[List[String]] = None,
    jupyterServerAppSettings: Option[software.amazon.awscdk.services.sagemaker.CfnUserProfile.JupyterServerAppSettingsProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnUserProfile.UserSettingsProperty.Builder)
      .kernelGatewayAppSettings(kernelGatewayAppSettings.orNull)
      .sharingSettings(sharingSettings.orNull)
      .executionRole(executionRole.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .jupyterServerAppSettings(jupyterServerAppSettings.orNull)
      .build()
}
