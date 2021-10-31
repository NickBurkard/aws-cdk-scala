package io.burkard.cdk.services.secretsmanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSecretProps {

  def apply(
    generateSecretString: Option[software.amazon.awscdk.services.secretsmanager.CfnSecret.GenerateSecretStringProperty] = None,
    replicaRegions: Option[List[_]] = None,
    name: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    secretString: Option[String] = None,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.secretsmanager.CfnSecretProps =
    (new software.amazon.awscdk.services.secretsmanager.CfnSecretProps.Builder)
      .generateSecretString(generateSecretString.orNull)
      .replicaRegions(replicaRegions.map(_.asJava).orNull)
      .name(name.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .secretString(secretString.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
