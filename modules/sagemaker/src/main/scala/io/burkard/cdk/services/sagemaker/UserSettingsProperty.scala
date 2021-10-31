package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UserSettingsProperty {

  def apply(
    kernelGatewayAppSettings: Option[software.amazon.awscdk.services.sagemaker.CfnDomain.KernelGatewayAppSettingsProperty] = None,
    sharingSettings: Option[software.amazon.awscdk.services.sagemaker.CfnDomain.SharingSettingsProperty] = None,
    executionRole: Option[String] = None,
    securityGroups: Option[List[String]] = None,
    jupyterServerAppSettings: Option[software.amazon.awscdk.services.sagemaker.CfnDomain.JupyterServerAppSettingsProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDomain.UserSettingsProperty.Builder)
      .kernelGatewayAppSettings(kernelGatewayAppSettings.orNull)
      .sharingSettings(sharingSettings.orNull)
      .executionRole(executionRole.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .jupyterServerAppSettings(jupyterServerAppSettings.orNull)
      .build()
}
