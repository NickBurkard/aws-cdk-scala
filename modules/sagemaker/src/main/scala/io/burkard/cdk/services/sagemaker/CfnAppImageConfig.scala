package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAppImageConfig {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    appImageConfigName: Option[String] = None,
    kernelGatewayImageConfig: Option[software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnAppImageConfig =
    software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .appImageConfigName(appImageConfigName.orNull)
      .kernelGatewayImageConfig(kernelGatewayImageConfig.orNull)
      .build()
}
