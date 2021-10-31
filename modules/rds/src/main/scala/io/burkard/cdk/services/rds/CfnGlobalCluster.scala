package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGlobalCluster {

  def apply(
    internalResourceId: String,
    globalClusterIdentifier: Option[String] = None,
    deletionProtection: Option[Boolean] = None,
    engineVersion: Option[String] = None,
    engine: Option[String] = None,
    sourceDbClusterIdentifier: Option[String] = None,
    storageEncrypted: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.CfnGlobalCluster =
    software.amazon.awscdk.services.rds.CfnGlobalCluster.Builder
      .create(stackCtx, internalResourceId)
      .globalClusterIdentifier(globalClusterIdentifier.orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .engineVersion(engineVersion.orNull)
      .engine(engine.orNull)
      .sourceDbClusterIdentifier(sourceDbClusterIdentifier.orNull)
      .storageEncrypted(storageEncrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
