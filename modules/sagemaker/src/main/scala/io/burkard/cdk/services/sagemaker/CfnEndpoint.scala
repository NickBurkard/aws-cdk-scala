package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEndpoint {

  def apply(
    internalResourceId: String,
    endpointConfigName: String,
    deploymentConfig: Option[software.amazon.awscdk.services.sagemaker.CfnEndpoint.DeploymentConfigProperty] = None,
    retainAllVariantProperties: Option[Boolean] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    endpointName: Option[String] = None,
    retainDeploymentConfig: Option[Boolean] = None,
    excludeRetainedVariantProperties: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnEndpoint =
    software.amazon.awscdk.services.sagemaker.CfnEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .endpointConfigName(endpointConfigName)
      .deploymentConfig(deploymentConfig.orNull)
      .retainAllVariantProperties(retainAllVariantProperties.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.map(_.asJava).orNull)
      .endpointName(endpointName.orNull)
      .retainDeploymentConfig(retainDeploymentConfig.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .excludeRetainedVariantProperties(excludeRetainedVariantProperties.map(_.asJava).orNull)
      .build()
}
