package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ModelExplainabilityAppSpecificationProperty {

  def apply(
    imageUri: Option[String] = None,
    configUri: Option[String] = None,
    environment: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty.Builder)
      .imageUri(imageUri.orNull)
      .configUri(configUri.orNull)
      .environment(environment.map(_.asJava).orNull)
      .build()
}
