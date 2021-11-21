package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KernelGatewayAppSettingsProperty {

  def apply(
    defaultResourceSpec: Option[software.amazon.awscdk.services.sagemaker.CfnDomain.ResourceSpecProperty] = None,
    customImages: Option[List[_]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDomain.KernelGatewayAppSettingsProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDomain.KernelGatewayAppSettingsProperty.Builder)
      .defaultResourceSpec(defaultResourceSpec.orNull)
      .customImages(customImages.map(_.asJava).orNull)
      .build()
}
