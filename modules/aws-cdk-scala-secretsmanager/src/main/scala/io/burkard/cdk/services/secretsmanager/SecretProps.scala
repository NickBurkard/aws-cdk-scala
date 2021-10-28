package io.burkard.cdk.services.secretsmanager

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SecretProps {

  def apply(
    replicaRegions: Option[List[_ <: software.amazon.awscdk.services.secretsmanager.ReplicaRegion]] = None,
    description: Option[String] = None,
    secretName: Option[String] = None,
    generateSecretString: Option[software.amazon.awscdk.services.secretsmanager.SecretStringGenerator] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.services.secretsmanager.SecretProps =
    (new software.amazon.awscdk.services.secretsmanager.SecretProps.Builder)
      .replicaRegions(replicaRegions.map(_.asJava).orNull)
      .description(description.orNull)
      .secretName(secretName.orNull)
      .generateSecretString(generateSecretString.orNull)
      .encryptionKey(encryptionKey.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
