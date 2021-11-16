package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ModelBiasAppSpecificationProperty {

  def apply(
    imageUri: String,
    configUri: String,
    environment: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty.Builder)
      .imageUri(imageUri)
      .configUri(configUri)
      .environment(environment.map(_.asJava).orNull)
      .build()
}
