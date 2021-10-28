package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAppImageConfigProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    appImageConfigName: Option[String] = None,
    kernelGatewayImageConfig: Option[software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps =
    (new software.amazon.awscdk.services.sagemaker.CfnAppImageConfigProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .appImageConfigName(appImageConfigName.orNull)
      .kernelGatewayImageConfig(kernelGatewayImageConfig.orNull)
      .build()
}
