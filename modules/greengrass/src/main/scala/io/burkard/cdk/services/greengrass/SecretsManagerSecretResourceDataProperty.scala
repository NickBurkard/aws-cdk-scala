package io.burkard.cdk.services.greengrass

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecretsManagerSecretResourceDataProperty {

  def apply(
    arn: String,
    additionalStagingLabelsToDownload: Option[List[String]] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SecretsManagerSecretResourceDataProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SecretsManagerSecretResourceDataProperty.Builder)
      .arn(arn)
      .additionalStagingLabelsToDownload(additionalStagingLabelsToDownload.map(_.asJava).orNull)
      .build()
}
