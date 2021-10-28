package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
