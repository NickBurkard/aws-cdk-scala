package io.burkard.cdk.services.greengrass

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SecretsManagerSecretResourceDataProperty {

  def apply(
    arn: Option[String] = None,
    additionalStagingLabelsToDownload: Option[List[String]] = None
  ): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty =
    (new software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty.Builder)
      .arn(arn.orNull)
      .additionalStagingLabelsToDownload(additionalStagingLabelsToDownload.map(_.asJava).orNull)
      .build()
}
