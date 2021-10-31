package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PostgresEngineFeatures {

  def apply(
    s3Import: Option[Boolean] = None,
    s3Export: Option[Boolean] = None
  ): software.amazon.awscdk.services.rds.PostgresEngineFeatures =
    (new software.amazon.awscdk.services.rds.PostgresEngineFeatures.Builder)
      .s3Import(s3Import.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .s3Export(s3Export.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
