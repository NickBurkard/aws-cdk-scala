package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEndpoint {

  def apply(
    internalResourceId: String,
    deploymentConfig: Option[software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty] = None,
    retainAllVariantProperties: Option[Boolean] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    endpointConfigName: Option[String] = None,
    endpointName: Option[String] = None,
    excludeRetainedVariantProperties: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnEndpoint =
    software.amazon.awscdk.services.sagemaker.CfnEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .deploymentConfig(deploymentConfig.orNull)
      .retainAllVariantProperties(retainAllVariantProperties.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.map(_.asJava).orNull)
      .endpointConfigName(endpointConfigName.orNull)
      .endpointName(endpointName.orNull)
      .excludeRetainedVariantProperties(excludeRetainedVariantProperties.map(_.asJava).orNull)
      .build()
}
