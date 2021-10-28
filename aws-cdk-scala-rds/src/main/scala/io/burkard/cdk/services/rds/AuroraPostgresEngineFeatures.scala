package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuroraPostgresEngineFeatures {

  def apply(
    s3Import: Option[Boolean] = None,
    s3Export: Option[Boolean] = None
  ): software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures =
    (new software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures.Builder)
      .s3Import(s3Import.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .s3Export(s3Export.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
