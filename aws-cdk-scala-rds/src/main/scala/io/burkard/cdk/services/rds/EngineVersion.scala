package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EngineVersion {

  def apply(
    fullVersion: Option[String] = None,
    majorVersion: Option[String] = None
  ): software.amazon.awscdk.services.rds.EngineVersion =
    (new software.amazon.awscdk.services.rds.EngineVersion.Builder)
      .fullVersion(fullVersion.orNull)
      .majorVersion(majorVersion.orNull)
      .build()
}
