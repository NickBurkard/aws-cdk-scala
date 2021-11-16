package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAppImageConfigProps {

  def apply(
    appImageConfigName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    kernelGatewayImageConfig: Option[software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps =
    (new software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps.Builder)
      .appImageConfigName(appImageConfigName)
      .tags(tags.map(_.asJava).orNull)
      .kernelGatewayImageConfig(kernelGatewayImageConfig.orNull)
      .build()
}
