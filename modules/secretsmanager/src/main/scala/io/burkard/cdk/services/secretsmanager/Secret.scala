package io.burkard.cdk.services.secretsmanager

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Secret {

  def apply(
    internalResourceId: String,
    replicaRegions: Option[List[_ <: software.amazon.awscdk.services.secretsmanager.ReplicaRegion]] = None,
    description: Option[String] = None,
    secretName: Option[String] = None,
    generateSecretString: Option[software.amazon.awscdk.services.secretsmanager.SecretStringGenerator] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.secretsmanager.Secret =
    software.amazon.awscdk.services.secretsmanager.Secret.Builder
      .create(stackCtx, internalResourceId)
      .replicaRegions(replicaRegions.map(_.asJava).orNull)
      .description(description.orNull)
      .secretName(secretName.orNull)
      .generateSecretString(generateSecretString.orNull)
      .encryptionKey(encryptionKey.orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
