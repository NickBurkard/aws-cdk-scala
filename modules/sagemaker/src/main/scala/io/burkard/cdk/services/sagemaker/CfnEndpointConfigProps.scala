package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEndpointConfigProps {

  def apply(
    dataCaptureConfig: Option[software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.DataCaptureConfigProperty] = None,
    productionVariants: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    asyncInferenceConfig: Option[software.amazon.awscdk.services.sagemaker.CfnEndpointConfig.AsyncInferenceConfigProperty] = None,
    endpointConfigName: Option[String] = None,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps =
    (new software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps.Builder)
      .dataCaptureConfig(dataCaptureConfig.orNull)
      .productionVariants(productionVariants.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .asyncInferenceConfig(asyncInferenceConfig.orNull)
      .endpointConfigName(endpointConfigName.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
