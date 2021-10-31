package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KernelGatewayImageConfigProperty {

  def apply(
    kernelSpecs: Option[List[_]] = None,
    fileSystemConfig: Option[software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.FileSystemConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnAppImageConfig.KernelGatewayImageConfigProperty.Builder)
      .kernelSpecs(kernelSpecs.map(_.asJava).orNull)
      .fileSystemConfig(fileSystemConfig.orNull)
      .build()
}
