package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KernelGatewayAppSettingsProperty {

  def apply(
    defaultResourceSpec: Option[software.amazon.awscdk.services.sagemaker.CfnUserProfile.ResourceSpecProperty] = None,
    customImages: Option[List[_]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnUserProfile.KernelGatewayAppSettingsProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnUserProfile.KernelGatewayAppSettingsProperty.Builder)
      .defaultResourceSpec(defaultResourceSpec.orNull)
      .customImages(customImages.map(_.asJava).orNull)
      .build()
}
