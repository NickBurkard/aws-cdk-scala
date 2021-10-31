package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGlobalClusterProps {

  def apply(
    globalClusterIdentifier: Option[String] = None,
    deletionProtection: Option[Boolean] = None,
    engineVersion: Option[String] = None,
    engine: Option[String] = None,
    sourceDbClusterIdentifier: Option[String] = None,
    storageEncrypted: Option[Boolean] = None
  ): software.amazon.awscdk.services.rds.CfnGlobalClusterProps =
    (new software.amazon.awscdk.services.rds.CfnGlobalClusterProps.Builder)
      .globalClusterIdentifier(globalClusterIdentifier.orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .engineVersion(engineVersion.orNull)
      .engine(engine.orNull)
      .sourceDbClusterIdentifier(sourceDbClusterIdentifier.orNull)
      .storageEncrypted(storageEncrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
