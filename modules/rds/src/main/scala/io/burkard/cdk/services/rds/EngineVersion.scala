package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EngineVersion {

  def apply(
    majorVersion: String,
    fullVersion: Option[String] = None
  ): software.amazon.awscdk.services.rds.EngineVersion =
    (new software.amazon.awscdk.services.rds.EngineVersion.Builder)
      .majorVersion(majorVersion)
      .fullVersion(fullVersion.orNull)
      .build()
}
